import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLSetInfo {
	public String getName(int id){
		String name = null;
		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Client_Record WHERE C_ID = " + id;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				name = (rs.getString("C_FirstName") + " " + rs.getString("C_LastName"));
				System.out.println("got name");
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
		
		return name;
	}
	
	public String getPhone(int id){
		String phone = null;
		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Client_Record WHERE C_ID = " + id;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				phone = rs.getString("C_PrimPhone");
				System.out.println("got phone");
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
		
		return phone;
	}
	
	public String getECName(int id){
		String ecName = null;
		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM EMC_Info WHERE C_ID = " + id;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				ecName = (rs.getString("EMC_FName") + " " + rs.getString("EMC_LName"));
				System.out.println("got phone");
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
		
		return ecName;
	}
	
	public String getECPhone(int id){
		String ecPhone = null;
		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM EMC_Info WHERE C_ID = " + id;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				ecPhone = rs.getString("EMC_PrimPhone");
				System.out.println("got phone");
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
		
		return ecPhone;
	}
	
	public int getIndSize(String s, int id) {
		int result = 0;
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT COUNT(*) FROM " + s + " Where C_ID = " + id;
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
	
	public Object[][] getIndRows(int size, int id) {
		Object data[][] = new Object[size][2];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM IND_NOTES Where C_ID = " + id;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				for (int i = 0; i < size; i++) {
					data[i][0] = rs.getString("NoteDate");
					data[i][1] = rs.getString("Counselor");
				}
			}
		} 
		catch (SQLException e) {
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
		return data;
	}
	
}
