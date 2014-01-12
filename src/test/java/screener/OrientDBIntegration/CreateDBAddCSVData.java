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

public class CreateDBAddCSVData {
	
	private OObjectDatabaseTx  db;
	private final static String P_LOCAL_URL_BASE = 
			  "plocal:/Users/davidroberts/projects/orientdbSrc/releases/orientdb-community-1.6/databases/";
	private File lseDirectory;
	private File[] filesInDateOrder;
	private String exchangeCode;
	  
	@BeforeClass
	public void setup() {	  
		  setupDBRegisterEntities();
		  openCSVAndSort();
	  }
	
	@AfterClass
	public void cleanUp(){
		db.commit();
		db.close();
	}
	
	@Test
	public void test1() throws Exception{
		
		Exchange exchange = createOrLoadExchange(this.exchangeCode);
		
		for (File file: this.filesInDateOrder){
			loadDailySymbolsFromCSV(file, exchange);
			return;
		}		
	}

	private Exchange createOrLoadExchange(String exchangeCode) {
		
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
	
	private void loadDailySymbolsFromCSV(File file, Exchange exchange) throws FileNotFoundException,
	IOException {
		FileReader fileReader = new FileReader(file);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] nextLine;
		while ((nextLine = csvReader.readNext()) != null) {
			String eoddataSymbol = nextLine[0];

			
			Symbol symbol = getCreateOrLoadSymbol(eoddataSymbol, exchange);
			List<OHLC> list = symbol.getPeriodMap().get(PeriodEnum.ONE_DAY.toString());
			/*OHLC first = fixedSizePeriodList.getFirst();
			OHLC last = fixedSizePeriodList.getLast();*/
			OHLC newOHLC = createNewOHLC(nextLine, eoddataSymbol);	
			newOHLC = db.save(newOHLC);
			logSavedObject(newOHLC, " new tick ");
			list.add(newOHLC);
			db.save(symbol);
		}	
		
		csvReader.close();
	}


	private void logSavedObject(Object object, String objectTypeDesc) {
		if (objectTypeDesc == null){
			objectTypeDesc = object.getClass().getName();
		}
		System.out.println(""+ objectTypeDesc + " saved with db id = " + db.getIdentity(object));
	}

	private Symbol getCreateOrLoadSymbol(String eoddataSymbol, Exchange exchange) {
		Map<String, Symbol> symbolsMap = exchange.getSymbols();
		Symbol symbol = symbolsMap.get(eoddataSymbol);
		if (symbol != null){
			System.out.println("Symbol exists[" + symbol.getCode() + "]");
		} else {
		   symbol = new Symbol();
		   symbol.setCode(eoddataSymbol);		
		   symbol = db.save(symbol);
		   System.out.println("New symbol created with db id[" + db.getIdentity(symbol) + "]");
		   symbolsMap.put(eoddataSymbol, symbol);
		   db.save(symbolsMap);
		}
		return symbol;
	}

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
	  Arrays.sort(filesInDateOrder, Util.CP_FILES_BY_NAME_REVERSE);
	  String mostRecentFileName = filesInDateOrder[0].getName();
	  System.out.println("Most recent file is: " + mostRecentFileName);
	  int exchangeDividerIndex = mostRecentFileName.indexOf("_");
	  exchangeCode = mostRecentFileName.substring(0, exchangeDividerIndex);
	  System.out.println("Exchange [" + exchangeCode + "]");
	  int fileEndingIndex = mostRecentFileName.lastIndexOf(".");
	  String fileDateStr = mostRecentFileName.substring(exchangeDividerIndex + 1, fileEndingIndex);
	  System.out.println("File Date String[" + fileDateStr + "]");
	}

	private void setupDBRegisterEntities() {
		db = new OObjectDatabaseTx(P_LOCAL_URL_BASE + "screener");
		  System.out.println("Database name = " + db.getName() );
		  System.out.println("Database exists = " + db.exists());
		  if (!db.exists()){
			  db.create();
		  } else {
			  db.open("admin", "admin");
			  //db.drop();
			  //db.create();
		  }
		  
		  System.out.println("Database clusters = " +db.getClusters());
		  for (String clusterName: db.getClusterNames()){
			  System.out.println(clusterName);
		  }
		  db.getEntityManager().registerEntityClasses("com.entendior.screener.domain");
	}
	
	

}
