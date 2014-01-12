package screener.OrientDBIntegration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.entendior.screener.util.DateUtil;
import com.entendior.screener.util.Util;

import au.com.bytecode.opencsv.CSVReader;

public class CSVTest {
	//LSE0102
	String path = "";
	
	//@Test
	public void testFilePath(){
		Assert.assertNotNull(getClass().getResource("/LSE/LSE0102.csv"), "File not found");		
	}
	
	@Test 
	public void testCsvDirectoryPath() throws Exception{
		File csvClasspathDir = new File("/LSE");
		System.out.println("Dir /LSE exits = " + csvClasspathDir.exists());
		Assert.assertFalse(csvClasspathDir.exists());
		File csvProjectRelativeDir = new File("./src/test/resources/LSE/");
		System.out.println("Dir ./src/test/resources/LSE/ exits = " + csvProjectRelativeDir.exists());
		Assert.assertTrue(csvProjectRelativeDir.exists());
		File[] files = csvProjectRelativeDir.listFiles();
		
		Arrays.sort(files, Util.CP_FILES_BY_NAME_REVERSE);
		listFileNames(files);
		
		if(true)return;
		
		loadSymbolsFromCSV(files);
	}

	private void loadSymbolsFromCSV(File[] files) throws FileNotFoundException,
			IOException {
		FileReader fileReader = new FileReader(files[1]);
		CSVReader csvReader = new CSVReader(fileReader);
		String[] nextLine;
		while ((nextLine = csvReader.readNext()) != null) {
			// nextLine[] is an array of values from the line
			String eoddataSymbol = nextLine[0];
			String eoddataDateStr = nextLine[1];
			String eoddataOpen = nextLine[2];
			String eoddataHigh = nextLine[3];
			String eoddataLow = nextLine[4];
			String eoddataClose = nextLine[5];
			String eoddataVolume = nextLine[6];
			
			String msg = String.format("Symbol %s, Date %s, Open %s, High %s, Low %s, Close %s, Vol %s", 
					eoddataSymbol, eoddataDateStr, eoddataOpen, eoddataHigh, eoddataLow, eoddataClose, eoddataVolume);
			System.out.println(msg);
			
			DateTime jodaDate = DateUtil.FM_EODDATA_DAILY.parseDateTime(eoddataDateStr);
			Date jdkDate = jodaDate.toDate();
			System.out.println("Date Format = " + DateUtil.FM_INTRADAY.print(jodaDate));
			
		}
		
		csvReader.close();
	}

	private void listFileNames(File[] files) {
		for (File file: files){
			System.out.println(file.getName());
		}
		
	}

}
