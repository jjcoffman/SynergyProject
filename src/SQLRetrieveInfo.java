import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLRetrieveInfo {
	
	// Returns array of strings for given column name
	public Object[] getColumn(String s){
		Object[] results = new Object[1000];
		return results;
	}
	
	// Returns array of strings for given Client Id
	public Object[] getRows(int rowNum, int numRows){
		Object[] results = new Object[2];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Client_Record limit " + rowNum + "," + numRows;  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				results[0] = (rs.getInt("C_ID"));
				results[1] = (rs.getString("C_FirstName") + " " + rs.getString("C_LastName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(results[0] + " " + results[1]);
		return results;
	}
	
	public Object[] getPendingRows(int rowNum, int numRows){
		Object[] results = new Object[3];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Phone_Intake limit " + rowNum + "," + numRows;  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				results[1] = (rs.getString("C_PrimPhone"));
				results[0] = (rs.getString("C_FirstName") + " " + rs.getString("C_LastName"));
				results[2] = (rs.getString("C_IntakeDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(results[0] + " " + results[1]);
		return results;
	}
	
	// Returns number of rows in given database
	public int getSize(String s) {
		int result = 0;
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT COUNT(*) FROM " + s;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				result = rs.getInt("COUNT(*)");
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
