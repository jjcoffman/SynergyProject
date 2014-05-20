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

public class SQLRetrieveInfo {

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Date date = new Date();
	Calendar c = Calendar.getInstance();
	private ResultSet rs1;
	// Returns array of strings for given column name
	public Object[] getColumn(String s){
		Object[] results = new Object[1000];
		return results;
	}

	
	public Object[] getDischarge(int id)
	{
		Object[] data = new Object[33];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		int i = 0;
		String query = "SELECT * FROM Client_Discharge WHERE C_ID = " + id ;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next())
			{
				data[i++] = rs.getString("DIS_DSMIVCode");
				data[i++] = rs.getString("DIS_PayNotes");
				data[i++] = rs.getString("DIS_PAContactDate");
				data[i++] = rs.getString("DIS_PrimCounselor");
				data[i++] = rs.getString("DIS_TGoal1");
				data[i++] = rs.getString("DIS_TGoal2");
				data[i++] = rs.getString("DIS_TGoal3");
				data[i++] = rs.getString("DIS_TGoal4");
				data[i++] = rs.getString("DIS_TGoal5");
				data[i++] = rs.getString("DIS_TGoal6");
				data[i++] = rs.getString("DIS_TGoal1Met");
				data[i++] = rs.getString("DIS_TGoal2Met");
				data[i++] = rs.getString("DIS_TGoal3Met");
				data[i++] = rs.getString("DIS_TGoal4Met");
				data[i++] = rs.getString("DIS_TGoal5Met");
				data[i++] = rs.getString("DIS_TGoal6Met");
				data[i++] = rs.getString("DIS_TRMTSummary");
				data[i++] = rs.getString("DIS_CDUseText");
				data[i++] = rs.getString("DIS_CriminalTxt");
				data[i++] = rs.getString("IN_AXIS1");
				data[i++] = rs.getString("IN_AXIS2");
				data[i++] = rs.getString("IN_AXIS3");
				data[i++] = rs.getString("IN_AXIS4");
				data[i++] = rs.getString("IN_AXIS5GAF");
				data[i++] = rs.getString("DIS_AXIS1");
				data[i++] = rs.getString("DIS_AXIS2");
				data[i++] = rs.getString("DIS_AXIS3");
				data[i++] = rs.getString("DIS_AXIS4");
				data[i++] = rs.getString("DIS_AXIS5GAF");
				data[i++] = rs.getString("DIS_CounselorRec");
				data[i++] = rs.getString("DIS_ReturnRec");
				data[i++] = rs.getString("DIS_ClientComment");

		
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
	
	public Object[] getASAMPrint(int id)
	{
		Object[] data = new Object[16];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		int i = 0;
		String query = "SELECT * FROM ASAM WHERE C_ID = " + id ;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next())
			{

				data[i++] = rs.getString("ASAM1_Actions");
				data[i++] = rs.getString("ASAM2_Actions");
				data[i++] = rs.getString("ASAM3_Actions");
				data[i++] = rs.getString("ASAM4_Actions");
				data[i++] = rs.getString("PhysLimits_Actions");

		
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
				results[i] = (rs.getInt("C_Vet")); i++;
				results[i] = (rs.getString("C_DLNum")); i++;
				results[i] = (rs.getString("C_DLState")); i++;
				results[i] = (rs.getString("C_MaritalStatus")); i++;
				results[i] = (rs.getString("C_SpouseName")); i++;
				results[i] = (rs.getString("C_IntakeDate")); i++; //19
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 

		try { 
			query = "SELECT * FROM EMC_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("EMC_Name")); i++;
				results[i] = (rs.getString("EMC_Relation")); i++;
				results[i] = (rs.getString("EMC_PrimPhone")); i++;
				results[i] = (rs.getString("EMC_SecondPhone")); i++;
				results[i] = (rs.getString("EMC_Address")); i++;
				results[i] = (rs.getString("EMC_City")); i++;
				results[i] = (rs.getString("EMC_State")); i++;
				results[i] = (rs.getString("EMC_ZIP")); i++; //27
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM ARC_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("ARC_Name")); i++;
				results[i] = (rs.getString("ARC_ContactName")); i++;
				results[i] = (rs.getString("ARC_County")); i++;
				results[i] = (rs.getString("ARC_Phone")); i++;
				results[i] = (rs.getString("ARC_Cell")); i++;
				results[i] = (rs.getString("ARC_Address")); i++;
				results[i] = (rs.getString("ARC_City")); i++;
				results[i] = (rs.getString("ARC_State")); i++;
				results[i] = (rs.getString("ARC_ZIP")); i++; //36
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM LEG_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getInt("LEG_JPLast30")); i++;
				results[i] = (rs.getString("LEG_JPWhy")); i++;
				results[i] = (rs.getString("LEG_OName")); i++;
				results[i] = (rs.getString("LEG_Address")); i++;
				results[i] = (rs.getString("LEG_Phone")); i++;
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM HEALTH_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getInt("PHYS_Hospital")); i++;
				results[i] = (rs.getString("PHYS_HospWhy")); i++;
				results[i] = (rs.getInt("MENT_Hospital")); i++;
				results[i] = (rs.getString("MENT_HospWhy")); i++;
				results[i] = (rs.getInt("IV_Use")); i++;
				results[i] = (rs.getInt("PRIOR_TPlan")); i++;
				results[i] = (rs.getString("How_Many")); i++;
				results[i] = (rs.getString("WhereANDWhen")); i++;
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM SUB_Info WHERE C_PrimPhone = " + "\"" + s + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("SUB1_Name")); i++;
				results[i] = (rs.getString("SUB1_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB1_AmountUsed")); i++;
				results[i] = (rs.getString("SUB1_Frequency")); i++;
				results[i] = (rs.getString("SUB1_Method")); i++;
				results[i] = (rs.getString("SUB2_Name")); i++;
				results[i] = (rs.getString("SUB2_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB2_AmountUsed")); i++;
				results[i] = (rs.getString("SUB2_Frequency")); i++;
				results[i] = (rs.getString("SUB2_Method")); i++;
				results[i] = (rs.getString("SUB3_Name")); i++;
				results[i] = (rs.getString("SUB3_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB3_AmountUsed")); i++;
				results[i] = (rs.getString("SUB3_Frequency")); i++;
				results[i] = (rs.getString("SUB3_Method")); i++;

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

	//this is for getting the clients stuff for their paperwork at archive or at existing
	public Object[] getPaperworkInfo(String tableName, String ID)
	{
		
		Object[] results = new Object[90];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 
		int i = 0;
		String query = "SELECT * FROM "+tableName+" WHERE C_ID = " + "\"" + ID + "\"";  
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
				results[i] = (rs.getInt("C_Vet")); i++;
				results[i] = (rs.getString("C_DLNum")); i++;
				results[i] = (rs.getString("C_DLState")); i++;
				results[i] = (rs.getString("C_MaritalStatus")); i++;
				results[i] = (rs.getString("C_SpouseName")); i++;
				results[i] = (rs.getString("C_AdmitDate")); i++; //19
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 

		try { 
			query = "SELECT * FROM EMC_Info WHERE C_ID = " + "\"" + ID + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("EMC_Name")); i++;
				results[i] = (rs.getString("EMC_Relation")); i++;
				results[i] = (rs.getString("EMC_PrimPhone")); i++;
				results[i] = (rs.getString("EMC_SecondPhone")); i++;
				results[i] = (rs.getString("EMC_Address")); i++;
				results[i] = (rs.getString("EMC_City")); i++;
				results[i] = (rs.getString("EMC_State")); i++;
				results[i] = (rs.getString("EMC_ZIP")); i++; //27
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM ARC_Info WHERE C_ID = " + "\"" + ID + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("ARC_Name")); i++;
				results[i] = (rs.getString("ARC_ContactName")); i++;
				results[i] = (rs.getString("ARC_County")); i++;
				results[i] = (rs.getString("ARC_Phone")); i++;
				results[i] = (rs.getString("ARC_Cell")); i++;
				results[i] = (rs.getString("ARC_Address")); i++;
				results[i] = (rs.getString("ARC_City")); i++;
				results[i] = (rs.getString("ARC_State")); i++;
				results[i] = (rs.getString("ARC_ZIP")); i++; //36
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM LEG_Info WHERE C_ID = " + "\"" + ID + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getInt("LEG_JPLast30")); i++;
				results[i] = (rs.getString("LEG_JPWhy")); i++;
				results[i] = (rs.getString("LEG_OName")); i++;
				results[i] = (rs.getString("LEG_Address")); i++;
				results[i] = (rs.getString("LEG_Phone")); i++;
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM HEALTH_Info WHERE C_ID = " + "\"" + ID + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getInt("PHYS_Hospital")); i++;
				results[i] = (rs.getString("PHYS_HospWhy")); i++;
				results[i] = (rs.getInt("MENT_Hospital")); i++;
				results[i] = (rs.getString("MENT_HospWhy")); i++;
				results[i] = (rs.getInt("IV_Use")); i++;
				results[i] = (rs.getInt("PRIOR_TPlan")); i++;
				results[i] = (rs.getString("How_Many")); i++;
				results[i] = (rs.getString("WhereANDWhen")); i++;
			} }catch (SQLException e) {
				e.printStackTrace();
			} 

		try{
			query = "SELECT * FROM SUB_Info WHERE C_ID = " + "\"" + ID + "\"";
			rs = statement.executeQuery(query);
			while(rs.next()){
				results[i] = (rs.getString("SUB1_Name")); i++;
				results[i] = (rs.getString("SUB1_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB1_AmountUsed")); i++;
				results[i] = (rs.getString("SUB1_Frequency")); i++;
				results[i] = (rs.getString("SUB1_Method")); i++;
				results[i] = (rs.getString("SUB2_Name")); i++;
				results[i] = (rs.getString("SUB2_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB2_AmountUsed")); i++;
				results[i] = (rs.getString("SUB2_Frequency")); i++;
				results[i] = (rs.getString("SUB2_Method")); i++;
				results[i] = (rs.getString("SUB3_Name")); i++;
				results[i] = (rs.getString("SUB3_DateLastUsed")); i++;
				results[i] = (rs.getString("SUB3_AmountUsed")); i++;
				results[i] = (rs.getString("SUB3_Frequency")); i++;
				results[i] = (rs.getString("SUB3_Method")); i++;

			}
			try{
				query = "SELECT * FROM ASAM WHERE C_ID = " + "\"" + ID + "\"";
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
				} 




			System.out.println("Number of fields for printing is " + i);

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
	
	public void sendGroupNote(Object[] data){
		//0: Client Id, 1: Week Of, 2: day, 3: session, 4: startTime, 5: startAMPM, 6: endTime, 7: endAMPM, 8: note
		if (((String)data[2]).equals("Monday")) {
			
		}
		
	}



	public String getFunder(int intClientID) 
	{
		String funder = null;
		
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM Client_Record WHERE C_ID = " + intClientID;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			while(rs.next()){
				funder = rs.getString("C_Funder");
				System.out.println("got funder");
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
		
		return funder;
	}

}
