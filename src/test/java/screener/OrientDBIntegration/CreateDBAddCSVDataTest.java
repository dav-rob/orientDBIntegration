package screener.OrientDBIntegration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

import com.entendior.screener.domain.Exchange;
import com.entendior.screener.domain.OHLC;
import com.entendior.screener.domain.PeriodEnum;
import com.entendior.screener.domain.Symbol;
import com.entendior.screener.util.Constants;
import com.entendior.screener.util.DateUtil;
import com.entendior.screener.util.Util;
import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

/**
 * Creates Exchange and other child objects in the object database,
 *   then loads the Exchange object with data obtained from the CSV files.
 *   
 * @author davidroberts
 *
 */
public class CreateDBAddCSVDataTest {
	
	Log LOG = LogFactory.getLog(CreateDBAddCSVDataTest.class);
	private OObjectDatabaseTx  db;
	private final static String P_LOCAL_URL_BASE = 
			  "plocal:" 
			  +"/Users/davidroberts/projects/orientdbSrc/releases/orientdb-community-1.7-rc1/databases/";
			  //+ "/Users/davidroberts/projects/orientdbSrc/releases/orientdb-community-1.6/databases/";
	private File lseDirectory;
	private File[] filesInDateOrder;
	private String exchangeCode;
	  
	@BeforeClass
	public void setup() {	
		LOG.info("before connect to DB test");
		  setupDBRegisterEntities();
		  LOG.info("before open files and sort");
		  openCSVAndSort();
		  LOG.info("before transaction start");
		  db.begin();
	  }
	
	@AfterClass
	public void cleanUp(){
		db.commit();
		db.close();
	}
	
	@Test
	public void createDBExchangeAddSymbolDataFromCSV() throws Exception {
		LOG.info("starting test");
		//Load the exchange object from the object database.
		Exchange exchange = createOrLoadDBExchange(this.exchangeCode);
		for (int i = 0; i < filesInDateOrder.length - 1; i++){
			File preceedingFile = filesInDateOrder[i];
			File fileToStore = filesInDateOrder[i+1];
			/*if (isHoliday(preceedingFile, fileToStore,  exchange)){
				LOG.info("The File Date [" + fileToStore.getName() + "] is a holiday.");
			} else {*/
				addOHLCtoDBfromCSV(fileToStore, exchange);
			//}
		}		
	}

	private boolean isHoliday(File preceedingFile, File fileToStore, Exchange exchange) throws IOException{
		String preceedingDateAsLong = createProcedingDateMapIfNecessary(preceedingFile, exchange);
		FileReader fileReader = new FileReader(fileToStore);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] oneDaysSymbolOHLC_CSVLine = csvReader.readNext();
		int count = 0;
		try {
			while (oneDaysSymbolOHLC_CSVLine != null && count < 200) {
				String eoddataSymbol = oneDaysSymbolOHLC_CSVLine[0];
				OHLC fileOHLC = createNewOHLC(oneDaysSymbolOHLC_CSVLine, eoddataSymbol);
				Symbol symbol = getCreateOrLoadDBSymbol(eoddataSymbol, exchange);
				Map<String, OHLC> dateMap = symbol.getDateMap();
				OHLC previousOHLC = dateMap.get(preceedingDateAsLong);
				if (!previousOHLC.equalsApartFromDate(fileOHLC)){
					return false;
				}
				oneDaysSymbolOHLC_CSVLine = csvReader.readNext();
				count++;
			}
		} finally {
			csvReader.close();
		}
		if (count > 200){
			return true;
		}
		// if there are less than 200 symbols on an exchange, we may have to do something else.
		return false;
	}

	private String createProcedingDateMapIfNecessary(File preceedingFile, Exchange exchange) throws FileNotFoundException, IOException {
		FileReader precedingFileReader = new FileReader(preceedingFile);
		CSVReader precedingCsvReader = new CSVReader(precedingFileReader);
		String[] precedingOneDaysSymbolOHLC_CSVLine = precedingCsvReader.readNext();
		String preceedingDateAsLong = null;
		try {
			if (precedingOneDaysSymbolOHLC_CSVLine != null ) {
				String preceedingEoddataSymbol = precedingOneDaysSymbolOHLC_CSVLine[0];
				Symbol preceedingSymbol = getCreateOrLoadDBSymbol(preceedingEoddataSymbol, exchange);
				OHLC precedingOHLC = createNewOHLC(precedingOneDaysSymbolOHLC_CSVLine, preceedingEoddataSymbol);
				Map<String, OHLC> precedingDateMap = preceedingSymbol.getDateMap();
				preceedingDateAsLong = "" +precedingOHLC.getDate().getTime();
				if (precedingDateMap.get(preceedingDateAsLong) == null){
					LOG.warn("No preceeding symbol date map found, this should only happen on the first date loaded from a list of dates");
					createPreceedingSymbolsDateMap(preceedingFile, exchange);
				}
			} else {
				LOG.error("Cannot find preceding file.");
			}
		} finally {
			precedingCsvReader.close();
		}
		return preceedingDateAsLong;
	}

	private void createPreceedingSymbolsDateMap(File preceedingFile, Exchange exchange) throws IOException {
		FileReader precedingFileReader = new FileReader(preceedingFile);
		CSVReader precedingCsvReader = new CSVReader(precedingFileReader);
		try {
			
			String[] precedingOneDaysSymbolOHLC_CSVLine = precedingCsvReader.readNext();
			while (precedingOneDaysSymbolOHLC_CSVLine != null ) {
				String preceedingEoddataSymbol = precedingOneDaysSymbolOHLC_CSVLine[0];
				Symbol preceedingSymbol = getCreateOrLoadDBSymbol(preceedingEoddataSymbol, exchange);
				OHLC precedingOHLC = createNewOHLC(precedingOneDaysSymbolOHLC_CSVLine, preceedingEoddataSymbol);
				Map<String, OHLC> precedingDateMap = preceedingSymbol.getDateMap();
				precedingDateMap.put("" + precedingOHLC.getDate().getTime(), precedingOHLC);
				db.save(preceedingSymbol);
				precedingOneDaysSymbolOHLC_CSVLine = precedingCsvReader.readNext();
			}
		} finally {
			precedingCsvReader.close();
		}
		
	}

	/** 
	 * Initial heuristic based on trading volume.
	 * TODO - a better heuristic would be to compare against the previous day's trading, and check for price 
	 *   changes, however what if this is the first day, with no trading history, - I think the answer to that
	 *   is that I can always choose which date to start on, so there is always a guarantee of a preceding
	 *   day.
	 *  
	 * @param file
	 * @param exchange
	 * @return
	 * @throws IOException
	 */
	private boolean isHoliday(File file, Exchange exchange) throws IOException {

		FileReader fileReader = new FileReader(file);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] oneDaysSymbolOHLC_CSVLine = csvReader.readNext();
		int count = 0;
		while (oneDaysSymbolOHLC_CSVLine != null && count < 200) {
			// this will throw an exception for FX
			String eoddataVolume = oneDaysSymbolOHLC_CSVLine[6];
			if (Integer.parseInt(eoddataVolume) > 0){
				return false;
			}
			count++;
		}
		if (count > 200){
			return true;
		}
		// if there are less than 200 symbols on an exchange, we may have to do something else.
		return false;
	}

	private Exchange createOrLoadDBExchange(String exchangeCode) {
		
		List<Exchange> exchanges = db.query(
			    new OSQLSynchQuery<Exchange>("select * from Exchange where code = ? "), exchangeCode);
		System.out.println("Number of " + exchangeCode + " existing = " + exchanges.size());
		
		Exchange exchange = null;
		if (exchanges.size() == 0){
			Exchange newExchange = new Exchange();
			newExchange.setCode(exchangeCode);
			newExchange = db.save(newExchange);
			logSavedObject(newExchange,"Exchange");
			exchange = newExchange;
		} else {
			exchange = exchanges.get(0);
			System.out.println(String.format("Existing exchange id[%s], code[%s] ",
					db.getIdentity(exchange), exchange.getCode()));
		}
		return exchange;
	}
	
	
	/**
	 * From one CSV file, for an exchange:
	 * 
	 * 
	 * 
	 * @param file
	 * @param exchange
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private void addOHLCtoDBfromCSV(File file, Exchange exchange) throws FileNotFoundException,
	IOException {
		FileReader fileReader = new FileReader(file);
		CSVReader csvReader = new CSVReader(fileReader);
		try {
			String[] oneDaysSymbolOHLC_CSVLine = csvReader.readNext();
			//while (oneDaysSymbolOHLC_CSVLine != null) {
				// the symbol is the first column of the CSV line.
				String eoddataSymbol = oneDaysSymbolOHLC_CSVLine[0];
				Symbol symbol = getCreateOrLoadDBSymbol(eoddataSymbol, exchange);
				//load the list of OHLC for the period being queried.
				Map<String, List<OHLC>> periodMap = symbol.getPeriodMap();
				List<OHLC> ohlcList = periodMap.get(PeriodEnum.ONE_DAY.toString());
				System.out.println("The size of the list is:  " + ohlcList.size());
				/*if (ohlcList.size() > 200){
					System.out.println("-- List too big, exiting.");
					return;
				}*/
				OHLC newOHLC = createNewOHLC(oneDaysSymbolOHLC_CSVLine, eoddataSymbol);	
				ohlcList.add(newOHLC);
				symbol.getDateMap().put("" + newOHLC.getDate().getTime(), newOHLC);
				db.save(symbol);
				oneDaysSymbolOHLC_CSVLine = csvReader.readNext();
			//}
		} finally {
			csvReader.close();
		}	

	}


	private void logSavedObject(Object object, String objectTypeDesc) {
		if (objectTypeDesc == null){
			objectTypeDesc = object.getClass().getName();
		}
		System.out.println(""+ objectTypeDesc + " saved with db id = " + db.getIdentity(object));
	}

	/**
	 * Loads ore creates a database Symbol Object for an Exchange.
	 * 
	 * @param eoddataSymbol
	 * @param exchange
	 * @return
	 */
	private Symbol getCreateOrLoadDBSymbol(String eoddataSymbol, Exchange exchange) {
		Map<String, Symbol> symbolsMap = exchange.getSymbols();
		Symbol symbol = symbolsMap.get(eoddataSymbol);
		if (symbol != null){
			System.out.println("Symbol exists[" + symbol.getCode() + "]");
		} else {
		   symbol = new Symbol();
		   symbol.setCode(eoddataSymbol);		
		   symbolsMap.put(eoddataSymbol, symbol);
		   db.save(exchange);
		   System.out.println("New symbol created[" + symbol.getCode()+ "]");
		}
		return symbol;
	}

	/**
	 * Creates a new OHLC database object.
	 * 
	 * @param nextLine
	 * @param eoddataSymbol
	 * @return
	 */
	private OHLC createNewOHLC(String[] nextLine, String eoddataSymbol) {
		String eoddataDateStr = nextLine[1];
		String eoddataOpen = nextLine[2];
		String eoddataHigh = nextLine[3];
		String eoddataLow = nextLine[4];
		String eoddataClose = nextLine[5];
		String eoddataVolume = nextLine[6];
		DateTime jodaDate = DateUtil.FM_EODDATA_DAILY.parseDateTime(eoddataDateStr);
		Date jdkDate = jodaDate.toDate();
		System.out.println("Date Format = " + DateUtil.FM_INTRADAY.print(jodaDate));
		OHLC newOHLC = new OHLC();
		newOHLC.setClose(Double.parseDouble(eoddataClose));
		newOHLC.setDate(jdkDate);
		newOHLC.setDateString(eoddataDateStr);
		newOHLC.setHigh(Double.parseDouble(eoddataHigh));
		newOHLC.setLow(Double.parseDouble(eoddataLow));
		newOHLC.setOpen(Double.parseDouble(eoddataOpen));
		newOHLC.setVolume(Long.parseLong(eoddataVolume));
		
		String msg = String.format("Symbol %s, Date %s, Open %s, High %s, Low %s, Close %s, Vol %s", 
				eoddataSymbol, eoddataDateStr, eoddataOpen, eoddataHigh, eoddataLow, eoddataClose, eoddataVolume);
		System.out.println(msg);
		return newOHLC;
	}

	private void openCSVAndSort() {
	  lseDirectory = new File("./src/test/resources/LSE/");
	  System.out.println("Dir ./src/test/resources/LSE/ exits = " + lseDirectory.exists());
	  Assert.assertTrue(lseDirectory.exists());
	  filesInDateOrder = lseDirectory.listFiles();
	  Arrays.sort(filesInDateOrder, Util.CP_FILES_BY_NAME);
	  String mostRecentFileName = filesInDateOrder[0].getName();
	  System.out.println("Most recent file is: " + mostRecentFileName);
	  int exchangeDividerIndex = mostRecentFileName.indexOf("_");
	  exchangeCode = mostRecentFileName.substring(0, exchangeDividerIndex);
	  System.out.println("Exchange [" + exchangeCode + "]");
	  int fileEndingIndex = mostRecentFileName.lastIndexOf(".");
	  String fileDateStr = mostRecentFileName.substring(exchangeDividerIndex + 1, fileEndingIndex);
	  System.out.println("File Date String[" + fileDateStr + "]");
	}

	/**
	 * Create or open the "screener" database.
	 * Optionally, delete the current database and recreate it.
	 */
	private void setupDBRegisterEntities() {
		db = new OObjectDatabaseTx(P_LOCAL_URL_BASE + "screener");
		  System.out.println("Database name = " + db.getName() );
		  System.out.println("Database exists = " + db.exists());
		  if (!db.exists()){
			  db.create();
		  } else {
			  db.open("admin", "admin");
			  LOG.warn("Dropping Existing Database [" + db.getName() + "]");
			  db.drop();
			  LOG.info("Creating New Database [" + db.getName() + "]");
			  db.create();
		  }
		  
		  System.out.println("Database clusters = " +db.getClusters());
		  for (String clusterName: db.getClusterNames()){
			  System.out.println("cluster name = " + clusterName);
		  }
		  db.getEntityManager().registerEntityClasses("com.entendior.screener.domain");
	}
	
	

}
