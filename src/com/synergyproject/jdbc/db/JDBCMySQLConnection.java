package com.synergyproject.jdbc.db;

//Step 1: Use interfaces from java.sql package 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCMySQLConnection {
  //static reference to itself
  private static JDBCMySQLConnection instance = new JDBCMySQLConnection();
  private static String URL = "jdbc:mysql://localhost/synergy";
  private static final String USER = "root";
  private static final String PASSWORD = "T01RMA72";
  private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
   
  //private constructor
  private JDBCMySQLConnection() {
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