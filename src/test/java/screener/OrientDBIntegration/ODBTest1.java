package screener.OrientDBIntegration;

import org.testng.annotations.Test;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

@Test
public class ODBTest1 {
	
  private OObjectDatabaseTx  db;
  private final static String P_LOCAL_URL_BASE = 
		  "plocal:/Users/davidroberts/projects/orientdbSrc/releases/orientdb-community-1.6/databases/";
  private final static String REMOTE_URL_BASE = 
		  "remote:localhost/";

  @Test
  public void testRemote() { 
	  db = new OObjectDatabaseTx (REMOTE_URL_BASE + "demo").open("admin", "admin");
	  System.out.println("Database name = " + db.getName() );
	  System.out.println("Database exists = " + db.exists());
	  System.out.println("Database clusters = " +db.getClusters());
	  if (false){
		  db.create();
	  }
	  
  }

  @Test//(dependsOnMethods = "testRemote")
  public void testLocal() {	  
	  db = new OObjectDatabaseTx(P_LOCAL_URL_BASE + "demo").open("admin", "admin");  
	  System.out.println("Database name = " + db.getName() );
	  System.out.println("Database exists = " + db.exists());
	  System.out.println("Database clusters = " +db.getClusters());
  }
}
