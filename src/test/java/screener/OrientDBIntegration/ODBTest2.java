package screener.OrientDBIntegration;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

@Test
public class ODBTest2 {
	
	  private OObjectDatabaseTx  db;
	  private final static String P_LOCAL_URL_BASE = 
			  "plocal:/Users/davidroberts/projects/orientdbSrc/releases/orientdb-community-1.6/databases/";
	  private final static String REMOTE_URL_BASE = 
			  "remote:localhost/";
	
	  @BeforeClass
	  public void createPLocalDB() {	  
		  db = new OObjectDatabaseTx(P_LOCAL_URL_BASE + "demo").open("admin", "admin");  
		  System.out.println("Database name = " + db.getName() );
		  System.out.println("Database exists = " + db.exists());
		  System.out.println("Database clusters = " +db.getClusters());
	  }
	  
	  @Test
	  public void test1(){
		  // create database if not exist already (log in as root ??)
		  // look up exchange from web service.
		  //check for existence of exchange and create, if necessary
		  // similarly for symbols
		  
	  }
	  
	  @Test
	  public void test2(){
		  
	  }

}
