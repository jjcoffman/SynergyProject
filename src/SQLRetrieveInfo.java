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
		Object[] results = new Object[297];
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


	//this is filling the data for the newClient class for phone interviews without intake interview
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

	//this method is for pulling data for the client discharge form
	public Object[] getClientDischarge(String s)
	{
		Object[] results = new Object[90];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Client_Record WHERE C_ID = " + "\"" + s + "\"";  
		
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			int i = 0;
			while(rs.next())
			{
				
				results[i] = (rs.getString("C_FirstName")); i++;
				results[i] = (rs.getString("C_LastName")); i++;
				results[i] = (rs.getString("C_ID")); i++;
				results[i] = (rs.getString("C_AdmitDate")); i++;
				
				query = "SELECT * FROM ARC_Info WHERE C_ID = "+ s;
				rs = statement.executeQuery(query);
				results[i] = (rs.getString("ARC_Name")); i++;
				
			}
			System.out.println("Number of fields for continue intake " + i);

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

	//this is filling the data for the newClient class for phone interviews without intake interview
	public Object[] getPendingClient(String s)
	{
		Object[] results = new Object[90];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Phone_Intake WHERE C_PrimPhone = " + "\"" + s + "\"";  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			int i = 0;
			while(rs.next()){
				results[i] = (rs.getString("C_LastName")); i++;
				results[i] = (rs.getString("C_FirstName")); i++; 

				results[i] = (rs.getString("C_MI")); i++;
				results[i] = (rs.getString("C_Gender")); i++;
				results[i] = (rs.getString("C_PrimPhone")); i++;
				results[i] = (rs.getString("C_SecondPhone")); i++;
				results[i] = (rs.getString("C_DOB")); i++;
				results[i] = (rs.getString("C_SSN")); i++;
				results[i] = (rs.getString("C_Address")); i++;
				results[i] = (rs.getString("C_City")); i++;
				results[i] = (rs.getString("C_State")); i++;
				results[i] = (rs.getString("C_ZIP")); i++;
				results[i] = (rs.getString("C_County")); i++;
				results[i] = (rs.getString("C_CONumYears")); i++;
				results[i] = (rs.getString("C_Vet")); i++;
				results[i] = (rs.getString("C_DLNum")); i++;
				results[i] = (rs.getString("C_DLState")); i++;
				results[i] = (rs.getString("C_IntakeDate")); i++;
				
				query = "SELECT * FROM EMC_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
				rs = statement.executeQuery(query);

				results[i] = (rs.getString("EMC_LName")); i++;
				results[i] = (rs.getString("EMC_FName")); i++;
				results[i] = (rs.getString("EMC_Relation")); i++;
				results[i] = (rs.getString("EMC_PrimPhone")); i++;
				results[i] = (rs.getString("EMC_SecondPhone")); i++;
				results[i] = (rs.getString("EMC_Address")); i++;
				results[i] = (rs.getString("EMC_City")); i++;
				results[i] = (rs.getString("EMC_State")); i++;
				results[i] = (rs.getString("EMC_ZIP")); i++;
				
				query = "SELECT * FROM ARC_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
				rs = statement.executeQuery(query);
				results[i] = (rs.getString("ARC_Name")); i++;
				results[i] = (rs.getString("ARC_ContactLN")); i++;
				results[i] = (rs.getString("ARC_ContactFN")); i++;
				results[i] = (rs.getString("ARC_County")); i++;
				results[i] = (rs.getString("ARC_Phone")); i++;
				results[i] = (rs.getString("ARC_Cell")); i++;
				results[i] = (rs.getString("ARC_Address")); i++;
				results[i] = (rs.getString("ARC_City")); i++;
				results[i] = (rs.getString("ARC_State")); i++;
				results[i] = (rs.getString("ARC_ZIP")); i++;

				query = "SELECT * FROM LEG_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
				rs = statement.executeQuery(query);
				results[i] = (rs.getString("LEG_JPLast30")); i++;
				results[i] = (rs.getString("LEG_JPWhy")); i++;
				results[i] = (rs.getString("LEG_OName")); i++;
				results[i] = (rs.getString("LEG_Address")); i++;
				results[i] = (rs.getString("LEG_City")); i++;
				results[i] = (rs.getString("LEG_State")); i++;
				results[i] = (rs.getString("LEG_ZIP")); i++;
				results[i] = (rs.getString("LEG_Phone")); i++;

				query = "SELECT * FROM HEALTH_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
				rs = statement.executeQuery(query);

				results[i] = (rs.getString("PHYS_Hospital")); i++;
				results[i] = (rs.getString("PHYS_HospWhy")); i++;
				results[i] = (rs.getString("MENT_Hospital")); i++;
				results[i] = (rs.getString("MENT_HospWhy")); i++;
				results[i] = (rs.getString("IV_Use")); i++;
				results[i] = (rs.getString("PRIOR_TPlan")); i++;
				results[i] = (rs.getString("How_Many")); i++;
				results[i] = (rs.getString("WhereANDWhen"));  

				query = "SELECT * FROM SUB_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
				rs = statement.executeQuery(query);

				results[i] = (rs.getString("SUB1_Name")); i++;
				results[i] = (rs.getString("SUB1_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB1_AmountUsed")); i++;
				results[i] = (rs.getString("Sub1_Method")); i++;
				results[i] = (rs.getString("SUB2_Name")); i++;
				results[i] = (rs.getString("SUB2_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB2_AmountUsed")); i++;
				results[i] = (rs.getString("Sub2_Method")); i++;
				results[i] = (rs.getString("SUB3_Name")); i++;
				results[i] = (rs.getString("SUB3_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB3_AmountUsed")); i++;
				results[i] = (rs.getString("Sub3_Method")); i++;

			}
			System.out.println("Number of fields for continue intake " + i);

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


	public Object[] getUSERSRows(int rowNum, int numRows){
		Object[] results = new Object[4];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM USERS limit " + rowNum + "," + numRows;  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				results[0] = "default";
				results[1] = (rs.getString("USER_FNAME"));
				results[2] = (rs.getString("USER_LNAME"));
				String access = rs.getString("ADMIN_ACCESS");
				if (access.equals("1")){
					results[3] = "yes";
				}
				else
					results[3] = "no";
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
