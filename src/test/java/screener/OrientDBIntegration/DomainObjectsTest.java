package screener.OrientDBIntegration;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.entendior.screener.domain.Exchange;
import com.entendior.screener.domain.OHLC;
import com.entendior.screener.domain.PeriodEnum;
import com.entendior.screener.domain.Symbol;
import com.orientechnologies.orient.core.id.ORID;
import com.orientechnologies.orient.object.db.OObjectDatabasePool;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

public class DomainObjectsTest {

	private final static String P_LOCAL_URL_BASE = 
			  "plocal:/Users/davidroberts/projects/orientdbSrc/releases/orientdb-community-1.6/databases/screener";
	
	@Test
	public void testSavingFullObjectStack() throws Exception {
		
		OObjectDatabaseTx database;
		ORID rid;
		Exchange loadedExchange = null;
		database = OObjectDatabasePool.global().acquire(P_LOCAL_URL_BASE, "admin", "admin");
		try {
			
			database.getEntityManager().registerEntityClasses("com.entendior.screener.domain");
			Assert.assertTrue(database.exists());
			/**
			 * Test an exchange saved survives close and re-open of database
			 */
			Exchange newExchange = new Exchange();
			newExchange.setCode("TestExchange");
			newExchange = database.save(newExchange);
			rid = database.getIdentity(newExchange);
			database.close();
			database = OObjectDatabasePool.global().acquire(P_LOCAL_URL_BASE, "admin", "admin");
			loadedExchange = database.load(rid);
			Assert.assertEquals(loadedExchange.getCode(), "TestExchange");
			/**
			 * Test that a symbol saved to a Map, where the exchange object is then saved (not the symbol),
			 *   is saved because it is part of a child map belonging to the exchange.
			 */
			Map<String, Symbol> symbolsMap = loadedExchange.getSymbols();
			Symbol symbol = new Symbol();
			symbol.setName("BARC");
			//symbol = database.save(symbol);
			symbolsMap.put("BARC", symbol);
			database.save(loadedExchange);
			database.close();
			database = OObjectDatabasePool.global().acquire(P_LOCAL_URL_BASE, "admin", "admin");
			loadedExchange = database.load(rid);
			Map<String, Symbol> loadedSymbolsMap = loadedExchange.getSymbols();
			Symbol loadedSymbol = loadedSymbolsMap.get("BARC");
			Assert.assertNotNull(loadedSymbol);
			Assert.assertEquals(loadedSymbol.getName(), "BARC");
			/**
			 * Test that the symbol from this test run is different from the symbol from the previous
			 *   test run.
			 */
			String symbolRidStr = database.getIdentity(loadedSymbol).toString();
			System.out.println("Symbol rid = " + symbolRidStr);
			String oldSymbolRIDStr = "#18:7768";
			Assert.assertFalse(symbolRidStr.equals(oldSymbolRIDStr));
			/**
			 * Test that a ticker saved to a list in the periodMap is persisted between
			 *   open and close of the database.
			 */
			Map<String, List<OHLC>> periodMap = loadedSymbol.getPeriodMap();
			List<OHLC> ohlcList = periodMap.get(PeriodEnum.ONE_DAY.toString());
			OHLC ticker1 = new OHLC(1.2, 1.2, 1.2, 1.2);
			ohlcList.add(ticker1);
			database.save(loadedSymbol);
			ORID tickerRID = database.getIdentity(ticker1);
			// the ticker does not have a RID yet, but it is saved.
			Assert.assertEquals(tickerRID.getClusterId(), -1);
			database.close();
			database = OObjectDatabasePool.global().acquire(P_LOCAL_URL_BASE, "admin", "admin");
			loadedExchange = database.load(rid);
			loadedSymbolsMap = loadedExchange.getSymbols();
			loadedSymbol = loadedSymbolsMap.get("BARC");
			Map<String, List<OHLC>> loadedPeriodMap = loadedSymbol.getPeriodMap();
			List<OHLC> loadedOhlcList = periodMap.get(PeriodEnum.ONE_DAY.toString());
			OHLC loadedTicker = loadedOhlcList.get(0);
			Assert.assertNotNull(loadedTicker);
			Assert.assertEquals(loadedTicker.getClose(), 1.2);
		} finally {
			database.delete(loadedExchange);		    
		}
	    
		loadedExchange = database.load(rid);
	    Assert.assertNull(loadedExchange);
	    database.close();
	    
	}
	
	
	
}
