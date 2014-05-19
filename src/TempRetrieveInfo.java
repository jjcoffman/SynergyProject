import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TempRetrieveInfo {

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Date date = new Date();
	Calendar c = Calendar.getInstance();
	private ResultSet rs1;
	// Returns array of strings for given column name
	public Object[] getColumn(String s){
		Object[] results = new Object[1000];
		return results;
	}

	public Object[] getArchiveRows(int rowNum, int numRows){
		Object[] results = new Object[11];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		int i = 0;
		String clientID = "";
		String query = "SELECT * FROM Archived_Records limit " + rowNum + "," + numRows;  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) 
			{
				
				//"Name", "ID #", "Intake Date", "Exit Date", "# of Days", "DOB", "Age", "Gender", "Funder", "County", "S/U"
				try {
					results[i] = "";
					if(!rs.getString("C_FirstName").equals(null) || !rs.getString("C_LastName").equals(null))
					results[i] = (rs.getString("C_FirstName") + " " + rs.getString("C_LastName")); i++;
				} catch (Exception e2) {
					results[i] = "";i++;
				}
				
				try {results[i] = "";
				if(!rs.getString("C_ID").equals(null))
					results[i] = (rs.getString("C_ID"));
					clientID = (String) results[i];
					i++;
				} catch (Exception e2) {
					results[i] = "";
					clientID = (String) results[i];
					i++;
				}
				
				String strAdmit;
				try {
					results[i] = "";
					if(!rs.getString("C_AdmitDate").equals(null))
						results[i] = (rs.getString("C_AdmitDate"));
						
				} catch (Exception e2) {
					results[i] = "";
				}
				strAdmit = (String) results[i];
				i++;
				
				
				String strDischarge;
				try {
					results[i] = "";
					if(!rs.getString("C_DischargeDate").equals(null))
					results[i] = (rs.getString("C_DischargeDate"));
					if(results[i].equals(null))
						results[i] = "";
				} catch (Exception e2) {
					results[i] = "";
				}
				strDischarge = (String) results[i];i++;
				
				
				
				
				Calendar cal1 = new GregorianCalendar();
				Calendar cal2 = new GregorianCalendar();
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
				Date date = new Date();
				try {
					date = sdf.parse(strAdmit);
				} catch (ParseException e) {
					
				}
				cal1.setTime(date);
				try {
					date = sdf.parse(strDischarge);
				} catch (ParseException e) {
					
				}
				cal2.setTime(date);
				try {
					results[i] = daysBetween(cal1.getTime(),cal2.getTime());i++;
				} catch (Exception e2) {
					results[i] = "";i++;
				}
				
				String strDOB;
				try {
					results[i] = "";
					if(!rs.getString("C_DOB").equals(null))
					results[i] = (rs.getString("C_DOB"));
				} catch (Exception e2) {
					results[i] = "";
				}
				strDOB = (String) results[i];i++;
				
				Calendar cal3 = new GregorianCalendar();
				Date date1 = new Date();
				try {
					date1 = sdf.parse(strDOB);
				} catch (ParseException e) 
				{
					
				}
				Date date2 = new Date();
				try 
				{
					date2 = sdf.parse(sdf.format(date2));
				} catch (ParseException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					int intAgeDays = daysBetween(date1,date2);
					intAgeDays = intAgeDays/365;
					results[i] = intAgeDays; 
							i++;
				} catch (Exception e2) 
				{
					results[i] = 0; 
					i++;
				}
				
				
				try {
					results[i] = "";
					if(!rs.getString("C_Gender").equals(null))
					results[i] = (rs.getString("C_Gender"));i++;
				} catch (Exception e1) {
					results[i] = "";i++;
				}
				results[i] = "RICH";
				try {
					
					if(!rs.getString("C_Funder").equals(null))
					results[i] = (rs.getString("C_Funder"));i++;
				} catch (Exception e1) {
					results[i] = "RICH";i++;
				}
				
				
				
				
				
				
				
				try {
					results[i] = "";
					if(!rs.getString("C_County").equals(null))
					results[i] = (rs.getString("C_County"));i++;
				} catch (Exception e) {
					results[i] = "ERROR";i++;
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		try { 
			query = "SELECT * FROM Client_Discharge WHERE C_ID = " + Integer.valueOf(clientID);
			rs1 = statement.executeQuery(query);
			while (rs.next()) 
			{
				//"Name", "ID #", "Intake Date", "Exit Date", "# of Days", "DOB", "Age", "Gender", "Race", "Funder", "County", "S/U"
				String succ = "";
				try {
					
					if(!rs.getString("DIS_Success").equals(null)){
						if(rs1.getInt("DIS_Success")==0)
							succ = "Fail";
						else
							succ = "Success";}
				} catch (Exception e) 
				{
					succ = "";
				}	
				results[i] = succ;
				
			}
		} 
		catch (SQLException e) 
		{
			results[i] = "ERROR";
			//e.printStackTrace();
		} 
		finally 
		{
			if (connection != null) 
			{
				results[i] = "ERROR";
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		for(int f = 0; f < results.length; f++)
			System.out.println(results[f]);
		return results;
	}
	
	
	private int daysBetween(Date time, Date time2) 
	{
		return (int)( (time2.getTime() - time.getTime()) / (1000 * 60 * 60 * 24));
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
	public Object[] getClientDischarge(int s)
	{
		Object[] results = new Object[90];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		int i = 0;
		String query = "SELECT * FROM Client_Record WHERE C_ID = " + s;  

		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			while(rs.next())
			{

				results[i] = (rs.getString("C_FirstName")); i++;
				results[i] = (rs.getString("C_LastName")); i++;
				results[i] = (rs.getString("C_ID")); i++;
				results[i] = (rs.getString("C_AdmitDate")); i++;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					//e.printStackTrace();
				}
			}
		}
		System.out.println("Number of fields for continue intake " + i);
		try
		{
			query = "SELECT * FROM ARC_Info WHERE C_ID = "+ s;
			rs = statement.executeQuery(query);
			results[i] = "";
			while(rs.next())
			{
				if(!rs.getString("ARC_Name").equals(null))
					results[i] = (rs.getString("ARC_Name")); i++;
			}
		} 
		catch (SQLException e) 
		{
			//e.printStackTrace();
		} 
		finally 
		{
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					//e.printStackTrace();
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
		int i = 0;
		String query = "SELECT * FROM Phone_Intake WHERE C_PrimPhone = " + "\"" + s + "\"";  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

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

		try { 
			query = "SELECT * FROM EMC_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("EMC_LName")); i++;
				results[i] = (rs.getString("EMC_FName")); i++;
				results[i] = (rs.getString("EMC_Relation")); i++;
				results[i] = (rs.getString("EMC_PrimPhone")); i++;
				results[i] = (rs.getString("EMC_SecondPhone")); i++;
				results[i] = (rs.getString("EMC_Address")); i++;
				results[i] = (rs.getString("EMC_City")); i++;
				results[i] = (rs.getString("EMC_State")); i++;
				results[i] = (rs.getString("EMC_ZIP")); i++;
			} }catch (SQLException e) {
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

		try{
			query = "SELECT * FROM ARC_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
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
			} }catch (SQLException e) {
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

		try{
			query = "SELECT * FROM LEG_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("LEG_JPLast30")); i++;
				results[i] = (rs.getString("LEG_JPWhy")); i++;
				results[i] = (rs.getString("LEG_OName")); i++;
				results[i] = (rs.getString("LEG_Address")); i++;
				results[i] = (rs.getString("LEG_City")); i++;
				results[i] = (rs.getString("LEG_State")); i++;
				results[i] = (rs.getString("LEG_ZIP")); i++;
				results[i] = (rs.getString("LEG_Phone")); i++;
			} }catch (SQLException e) {
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

		try{
			query = "SELECT * FROM HEALTH_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("PHYS_Hospital")); i++;
				results[i] = (rs.getString("PHYS_HospWhy")); i++;
				results[i] = (rs.getString("MENT_Hospital")); i++;
				results[i] = (rs.getString("MENT_HospWhy")); i++;
				results[i] = (rs.getString("IV_Use")); i++;
				results[i] = (rs.getString("PRIOR_TPlan")); i++;
				results[i] = (rs.getString("How_Many")); i++;
				results[i] = (rs.getString("WhereANDWhen"));  
			} }catch (SQLException e) {
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

		try{
			query = "SELECT * FROM SUB_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
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
			try{
				query = "SELECT * FROM ASAM WHERE C_PrimPhone = " + "\"" + s + "\"";
				rs = statement.executeQuery(query);
				while(rs.next()){
					results[i] = (rs.getString("Med1_Diag")); i++;
					results[i] = (rs.getString("Med1_Name")); i++;
					results[i] = (rs.getString("Med1_Dosage")); i++;
					results[i] = (rs.getString("Med2_Diag")); i++;
					results[i] = (rs.getString("Med2_Name")); i++;
					results[i] = (rs.getString("Med2_Dosage")); i++;
					results[i] = (rs.getString("Med3_Diag")); i++;
					results[i] = (rs.getString("Med3_Name")); i++;
					results[i] = (rs.getString("Med3_Dosage")); i++;
				} }catch (SQLException e) {
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

	public Object[] getArchiveInfo(int rowNum, int numRows){
		Object[] results = new Object[2];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Archived_Records limit " + rowNum + "," + numRows;  
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
				results[0] = (rs.getInt("USER_ID"));
				results[1] = (rs.getString("USERNAME"));
				results[2] = (rs.getString("USER_FNAME") + " " + rs.getString("USER_LNAME"));
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

		} catch (SQLException e) 
		{
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
	
	public String getIndNote(int id, String date){
		String result = null;
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM IND_NOTES WHERE C_ID = " + id + " AND NoteDate = " + "\"" + date + "\"";
		System.out.println(query);
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				result = rs.getString("Note");
			}

		} catch (SQLException e) 
		{
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
		System.out.println("Got Note: " + result);
		return result;
	}
	
	public Object[] getGroupData(int id, String date){
		Object[] data = new Object[100];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM GRP_NOTES WHERE C_ID = " + id + " AND Start_Date = " + "\"" + date + "\"";
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				data[0] = rs.getString("Start_Date");
				data[1] = rs.getString("End_Date");
				
				data[2] = rs.getString("MON_KO");
				data[3] = rs.getString("MONKO_Topic");
				data[4] = rs.getString("MONKO_StartTime");
				data[5] = rs.getString("MONKO_EndTime");
				data[6] = rs.getString("MONKO_Counselor");
				data[7] = rs.getString("MON_AM");
				data[8] = rs.getString("MONAM_Topic");
				data[9] = rs.getString("MONAM_Counselor");
				data[10] = rs.getString("MON_PM");
				data[11] = rs.getString("MONPM_Topic");
				data[12] = rs.getString("MONPM_Counselor");
				
				data[13] = rs.getString("TUES_KO");
				data[14] = rs.getString("TUESKO_Topic");
				data[15] = rs.getString("TUESKO_StartTime");
				data[16] = rs.getString("TUESKO_EndTime");
				data[17] = rs.getString("TUESKO_Counselor");
				data[18] = rs.getString("TUES_AM");
				data[19] = rs.getString("TUESAM_Topic");
				data[20] = rs.getString("TUESAM_Counselor");
				data[21] = rs.getString("TUES_PM");
				data[22] = rs.getString("TUESPM_Topic");
				data[23] = rs.getString("TUESPM_Counselor");
				
				data[24] = rs.getString("WED_KO");
				data[25] = rs.getString("WEDKO_Topic");
				data[26] = rs.getString("WEDKO_StartTime");
				data[27] = rs.getString("WEDKO_EndTime");
				data[28] = rs.getString("WEDKO_Counselor");
				data[29] = rs.getString("WED_AM");
				data[30] = rs.getString("WEDAM_Topic");
				data[31] = rs.getString("WEDAM_Counselor");
				data[32] = rs.getString("WED_PM");
				data[33] = rs.getString("WEDPM_Topic");
				data[34] = rs.getString("WEDPM_Counselor");
				
				data[35] = rs.getString("THURS_KO");
				data[36] = rs.getString("THURSKO_Topic");
				data[37] = rs.getString("THURSKO_StartTime");
				data[38] = rs.getString("THURSKO_EndTime");
				data[39] = rs.getString("THURSKO_Counselor");
				data[40] = rs.getString("THURS_AM");
				data[41] = rs.getString("THURSAM_Topic");
				data[42] = rs.getString("THURSAM_Counselor");
				data[43] = rs.getString("THURS_PM");
				data[44] = rs.getString("THURSPM_Topic");
				data[45] = rs.getString("THURSPM_Counselor");
				
				data[46] = rs.getString("FRI_KO");
				data[47] = rs.getString("FRIKO_Topic");
				data[48] = rs.getString("FRIKO_StartTime");
				data[49] = rs.getString("FRIKO_EndTime");
				data[50] = rs.getString("FRIKO_Counselor");
				data[51] = rs.getString("FRI_AM");
				data[52] = rs.getString("FRIAM_Topic");
				data[53] = rs.getString("FRIAM_Counselor");
				data[54] = rs.getString("FRI_PM");
				data[55] = rs.getString("FRIPM_Topic");
				data[56] = rs.getString("FRIPM_Counselor");
				
				data[57] = rs.getString("SAT_KO");
				data[58] = rs.getString("SATKO_Topic");
				data[59] = rs.getString("SATKO_StartTime");
				data[60] = rs.getString("SATKO_EndTime");
				data[61] = rs.getString("SATKO_Counselor");
				data[62] = rs.getString("SAT_AM");
				data[63] = rs.getString("SATAM_Topic");
				data[64] = rs.getString("SATAM_Counselor");
				
				data[65] = rs.getString("SUN");
				data[66] = rs.getString("SUN_Topic");
				data[67] = rs.getString("SUN_Counselor");
				data[68] = rs.getString("SUN_StartTime");
				data[69] = rs.getString("SUN_EndTime");
			}

		} catch (SQLException e) 
		{
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
	
	public int getLastID()
	{
		int result = 0;
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		try{
			result = getSize("Last_ID");
			if(result == 0)
				result = 1;
		}
		catch(Exception e)
		{
			result = 1;
		}
		
		String query = "SELECT * FROM Last_ID WHERE C_ID = " + result;
		System.out.println(query);
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				try{
				result = (int) rs.getInt("C_ID");}
				catch(Exception e)
				{
					result = 1;
				}
			}

		} catch (SQLException e) 
		{
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
		System.out.println("Got ID: " + result);
		return result;
	}

	public int getlastPhone() 
	{
		int result = 0;
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		int size = getSize("Phone_Intake");
		String query = "SELECT * FROM  WHERE Phone_Intake limit = " + size;
		System.out.println(query);
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				try{
				result = (int) rs.getInt("C_ID");}
				catch(Exception e)
				{
					result = 1;
				}
				
						
			}

		} catch (SQLException e) 
		{
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
		System.out.println("Got ID: " + result);
		return result;
	}
	
	public String getArcPhone(int id){
		String phone = null;
		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Archived_Records WHERE C_ID = " + id;
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
	
	public String getArcName(int id){
		String name = null;
		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Archived_Records WHERE C_ID = " + id;
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
	
	public Object[] getUserInfo(int id){
		Object[] data = new Object[5];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM USERS WHERE USER_ID = " + id;  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				data[0] = rs.getString("USERNAME");
				data[1] = rs.getString("USER_FNAME");
				data[2] = rs.getString("USER_LNAME");
				data[3] = rs.getInt("ADMIN_ACCESS");
				data[4] = rs.getString("USER_PASS");
				
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
		return data;
	}
	
	public int permissionLevel(int id){
		int result = 0;
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM USERS WHERE USER_ID = " + id;  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				result = rs.getInt("ADMIN_ACCESS");
				
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
	
	public int getUserID(String user){
		int result = -1;
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM USERS WHERE USERNAME = '" + user + "'";  
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while (rs.next()) {
				result = rs.getInt("USER_ID");
				
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
	
	public int matchUser(String name, String password){
		int result = 0;
		Connection connection = null;
		Statement statement = null; 
		try { 
			ResultSet rs = null;
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			String query = "SELECT EXISTS(SELECT 1 FROM USERS WHERE USERNAME = '" + name + "' AND USER_PASS = '" + password + "')";
			rs = statement.executeQuery(query);
			while(rs.next()){
				result = rs.getInt("EXISTS(SELECT 1 FROM USERS WHERE USERNAME = '" + name + "' AND USER_PASS = '" + password + "')");
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
		return result;
	}
	
	public int userExists(String name){
		int result = 0;
		Connection connection = null;
		Statement statement = null; 
		try { 
			ResultSet rs = null;
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			String query = "SELECT EXISTS(SELECT 1 FROM USERS WHERE USERNAME = '" + name + "')";
			rs = statement.executeQuery(query);
			while(rs.next()){
				result = rs.getInt("EXISTS(SELECT 1 FROM USERS WHERE USERNAME = '" + name + "')");
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
		return result;
	}
}
