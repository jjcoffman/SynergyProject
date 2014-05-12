//Step 1: Use interfaces from java.sql package 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
  //static reference to itself
  private static SQLConnection instance = new SQLConnection();
  private static String URL = "jdbc:mysql://127.0.0.1/newDB";
  private static final String USER = "root";
  private static final String PASSWORD = "T01RMA72";
  private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
   
  //private constructor
  private SQLConnection() {
      try {
          //Step 2: Load MySQL Java driver
          Class.forName(DRIVER_CLASS);
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
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
  
  //this method changes the the url path
  public static void setPath(String s)
  {
	  URL = s;
  }
}