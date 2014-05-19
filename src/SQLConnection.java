//Step 1: Use interfaces from java.sql package 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
  //static reference to itself
 
  private static String URL = "jdbc:mysql://127.0.0.1/newDB";
  private static String USER = "root";
  private static String PASSWORD = "T01RMA72";
  private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
  private static PathChange pathe = new PathChange();
  private static SQLConnection instance = new SQLConnection();
   
  //private constructor
  SQLConnection() 
  {
	 
      try {
          //Step 2: Load MySQL Java driver
          Class.forName(DRIVER_CLASS);
      } catch (ClassNotFoundException e) 
      {
          e.printStackTrace();
      }
      System.out.println();
      pathe.changePath(URL, USER, PASSWORD);
      URL = pathe.getPath();
      USER = pathe.getUser();
      PASSWORD = pathe.getPass();

  }
   
  private Connection createConnection() {

      Connection connection = null;
      try {
          //Step 3: Establish Java MySQL connection
          connection = DriverManager.getConnection(URL, USER, PASSWORD);
      } catch (SQLException e) {
          System.out.println("ERROR: Unable to Connect to Database.");
      }
      return connection;
  }   
   
  public static Connection getConnection() {
      return instance.createConnection();
  }
  
  //this method changes the the url path and passwords etc
  public Boolean setPath(Object[] o) throws IOException
  {
	  URL = (String) o[0];
	  USER = (String) o[1];
	  PASSWORD  = (String) o[2];
	  
	 Boolean succ = pathe.exportSQL(URL, USER, PASSWORD);
	return succ;
	  
  }
  
  //the returns the current path and passwords etc
  public Object[] getPath()
  {
	  Object[] ret = new Object[3];
	  ret[0] = URL;
	  ret[1] = USER;
	  ret[2] = PASSWORD;
	  return ret;
  }
  public String getPathOnly()
  {
	  return URL;
  }
  public String getUser()
  {
	  return USER;
  }
  public String getPass()
  {
	  return PASSWORD;
  }
}