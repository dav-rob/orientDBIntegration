package screener.OrientDBIntegration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import com.eoddata.ws.Data.DATAFORMAT;
import com.eoddata.ws.Data.DataLocator;
import com.eoddata.ws.Data.DataSoap;
import com.eoddata.ws.Data.EXCHANGE;
import com.eoddata.ws.Data.LOGINRESPONSE;
import com.eoddata.ws.Data.QUOTE;
import com.eoddata.ws.Data.RESPONSE;
import com.eoddata.ws.Data.SYMBOL;

public class DataLocatorTest {
	
	private Log LOG = LogFactory.getLog(DataLocatorTest.class);

	@Test
	public void test() throws Exception{
		DataLocator webServiceLocator = new DataLocator();
		DataSoap dataService = webServiceLocator.getDataSoap();
		LOGINRESPONSE loginResponse = dataService.login("dave_r", "dlr139dd");
		LOG.info("Login Message[" + loginResponse.getMessage() + "]");
		String token = loginResponse.getToken();
		String membertship = dataService.membership(token).getMEMBERSHIP();
		System.out.println("Membership = " + membertship);
		System.out.print("\n\n");
		
		
		RESPONSE exchangesResponse = dataService.exchangeList(token);
		EXCHANGE[] exchanges = exchangesResponse.getEXCHANGES();
		for (EXCHANGE exchange: exchanges){
			String exchDesc = String.format("Exchange: %s, code[%s], country[%s]", 
					exchange.getName() , exchange.getCode(), exchange.getCountry());
			System.out.println(exchDesc);
		}
		
		RESPONSE quotesResp = dataService.quoteListByDatePeriod(token, "LSE", "20131011", "h");
		
		writeQuotes(quotesResp, "Exchange Day");
		
		if(true) return;
		
		String startDate = "20120101";
		quotesResp = dataService.symbolHistory(token, "LSE", "BARC", startDate );
		
		writeQuotes(quotesResp, "Symbol History");
		
		
		
		System.out.println("\n\n");
		
		 DATAFORMAT[] formats = dataService.dataFormats(token).getDATAFORMATS();
		 for (DATAFORMAT format: formats){
			 String formatDesc = String.format("Format: %s, code[%s]", 
					 format.getName(), format.getCode());
			 System.out.println(formatDesc);
		 }
		 
		 System.out.println("\n\n");
		 
		 SYMBOL[] symbols = dataService.symbolList(token, "LSE").getSYMBOLS();
		 System.out.println("Number of symbols = " + symbols.length);
		 System.out.println("-----------------------------");
		 for (SYMBOL symbol : symbols){
			 String desc = String.format("Symbol Code %s, name[%s]", symbol.getCode(), symbol.getName() );
			 System.out.println(desc);
			 
		 }
		 
		 //dataService.sy
		 
		 
	}

	private void writeQuotes(RESPONSE quotesResp, String desc, Boolean... doPrint) {
		QUOTE[] quotes = quotesResp.getQUOTES();
		if (quotes == null){
			System.out.println("NULL !!!!! Quotes.");
			System.out.println("Message = " + quotesResp.getMessage());
			return;
		}
		System.out.println("Number of quotes for " + desc + " = " + quotes.length);
		System.out.println("---------------------------------------------------------------------");
		if (quotes.length > 100 && (doPrint == null || doPrint.length == 0)){
			return;
		}
		for(QUOTE quote: quotes){
			DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
			String date = df.format(quote.getDateTime().getTime());
			String quoteDetails = String.format("Symbol[%s], Date[%s], open[%s], high[%s], low[%s], close[%s]", 
					quote.getSymbol(),date, quote.getOpen(), quote.getHigh(), quote.getLow(), quote.getClose());
			System.out.println(quoteDetails);
		}
	}

}
