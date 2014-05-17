import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TempSetInfo {
	SQLRetrieveInfo test = new SQLRetrieveInfo();

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
				try
				{
				ecName = (rs.getString("EMC_FName") + " " + rs.getString("EMC_LName"));
				System.out.println("got phone");
				}
				catch(Exception e)
				{
				ecName = (rs.getString("EMC_Name"));
				}
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
	
	public int getGroupSize(String s, int id){
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
			int i = 0;
			while(rs.next()){
					data[i][0] = rs.getString("NoteDate");
					data[i][1] = rs.getString("Counselor");
					i++;
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
	
	public Object[][] getGroupRows(int size, int id) {
		Object data[][] = new Object[size][2];
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		String query = "SELECT * FROM GRP_NOTES Where C_ID = " + id;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			int i = 0;
			while(rs.next()){
					data[i][0] = rs.getString("Start_Date");
					data[i][1] = rs.getString("MONKO_Counselor");
					i++;
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
	
	//This is for individual Notes
	public void sendIndInfo(Object[] data){
		Connection connection = null;
		Statement statement = null; 
		int id = (int)data[1];
		//String id = String.valueOf(data[1]);
		String weekStart = (String)data[2];
		String weekEnd = (String)data[3];
		String dateOf = (String)data[4];
		String counselor = (String)data[5];
		String note = (String)data[10];
		String start = (String)data[6];
		String end = (String)data[8];
		int amorpm1 = (int)data[7];
		int amorpm2 = (int)(data[9]);
		int signature = 0;

		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			String query = "INSERT INTO IND_NOTES (C_ID, WeekStart, WeekEnd, NoteDate, Counselor, Note, StartTime, EndTime, ST_AMPM, ET_AMPM, Signature) " + "VALUES (" + id + ", \"" + weekStart + "\", \"" + weekEnd + "\", \"" + dateOf + "\", \"" + counselor + "\", \"" + note + "\", \"" + start + "\", \"" + end + "\", " + amorpm1 + ", " + amorpm2 + ", " + signature + ")";
			System.out.println(query);
			statement.executeUpdate(query);
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
	}

	public void sendGroupInfo(Object[] data){
		//0: Client Id, 1: Week Of, 2: day, 3: session, 4: startTime, 5: startAMPM, 6: endTime, 7: endAMPM, 8: note
		Connection connection = null;
		Statement statement = null; 
		String weekOf = (String)data[1];
		int exists = -1;
		try { 
			ResultSet rs = null;
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			String query = "SELECT EXISTS(SELECT 1 FROM GRP_NOTES WHERE Start_Date = \"" + weekOf + "\")";
			System.out.println(query);
			rs = statement.executeQuery(query);
			while(rs.next()){
				exists = rs.getInt("EXISTS(SELECT 1 FROM GRP_NOTES WHERE Start_Date = \"" + weekOf + "\")");
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
		System.out.println("Group found: " + exists);
		if (exists == 1) {
			
		}
		else {
			Connection connection1 = null;
			Statement statement1 = null;
			int id = (int)data[0];
			// already have data[1] in weekOf
			String day = (String)data[2];
			String session = (String)data[3];
			String startTime = (String)data[4] + (String)data[5];
			String endTime = (String)data[6] + (String)data[7];
			String note = (String)data[8];
			String query;
			if (day.equals("Monday")){
				if (session.equals("KickOff")){
					//System.out.println("MONDAY KICKOFF");
					query = "INSERT INTO GRP_NOTES (C_ID, Start_Date, MON_KO, MONKO_StartTime, MONKO_EndTime) " + "VALUES ()";
				}
				else if(session.equals("AM")){
					//System.out.println("MONDAY AM");
				}
				else {
					//System.out.println("MONDAY PM");
				}
			}

		}
	}
	
	public void sendNewInfo(Object[] newData, int j) 
	{
		Connection connection = null;
		Statement statement = null; 
		int i = 0;
		String first = (String) newData[i]; i++;
		String middle = (String) newData[i]; i++;
		String last = (String) newData[i]; i++;
		String dOB = (String) newData[i]; i++;
		int vet = (int) newData[i]; i++;
		String address = (String) newData[i]; i++;
		String city = (String) newData[i]; i++;
		String state = (String) newData[i]; i++;
		int zip = Integer.valueOf((String) newData[i]); i++;
		String county = (String) newData[i]; i++;
		int years = Integer.valueOf((String) newData[i]); i++;
		String phone  = (String) newData[i]; i++;
		String secPhone = (String) newData[i]; i++;
		String social = (String) newData[i]; i++;
		String dL = (String) newData[i]; i++;
		String dLState = (String) newData[i]; i++;
		String marital = (String) newData[i]; i++;
		String spouse = (String) newData[i]; i++;
		String eName = (String) newData[i]; i++;
		String eRelation = (String) newData[i]; i++;
		String ePhone = (String) newData[i]; i++;
		String eSecondary = (String) newData[i]; i++;
		String eAddress = (String) newData[i]; i++;
		String eCity = (String) newData[i]; i++;
		String eState = (String) newData[i]; i++;
		int eZip = Integer.valueOf((String) newData[i]); i++;
		String aName = (String) newData[i]; i++;
		String aContact = (String) newData[i]; i++;
		String aCounty = (String) newData[i]; i++;
		String aPhone = (String) newData[i]; i++;
		String aAddress = (String) newData[i]; i++;
		String aCity = (String) newData[i]; i++;
		String aState = (String) newData[i]; i++;
		String aZip  = (String) newData[i]; i++;
		String aCell = (String) newData[i]; i++;
		int jail30 = (int) newData[i]; i++;
		int prob = (int) newData[i]; i++;
		String probWhy = (String) newData[i]; i++;
		String oName = (String) newData[i]; i++;
		String oAddress = (String) newData[i]; i++;
		String oPhone = (String) newData[i]; i++;
		int intPHosp = (int) newData[i]; i++;
		String strPHosp = (String) newData[i]; i++;
		int intMHosp  = (int) newData[i]; i++;
		String strMHosp = (String) newData[i]; i++;
		String subs1 = (String) newData[i]; i++;
		String subs1Date = (String) newData[i]; i++;
		String subs1Freq = (String) newData[i]; i++;
		String subs1Amount = (String) newData[i]; i++;
		String subs1Meth = (String) newData[i]; i++;
		String subs2 = (String) newData[i]; i++;
		String subs2Date = (String) newData[i]; i++;
		String subs2Freq = (String) newData[i]; i++;
		String subs2Amount = (String) newData[i]; i++;
		String subs2Meth = (String) newData[i]; i++;
		String subs3 = (String) newData[i]; i++;
		String subs3Date = (String) newData[i]; i++;
		String subs3Freq = (String) newData[i]; i++;
		String subs3Amount = (String) newData[i]; i++;
		String subs3Meth = (String) newData[i]; i++;
		int ivUse = (int) newData[i]; i++;
		String ivMany = (String) newData[i]; i++;
		int tPlan = (int) newData[i]; i++;
		String where = (String) newData[i]; i++;
		int asam1 = (int) newData[i]; i++;
		String act1 = (String) newData[i]; i++;
		int asam2 = (int) newData[i]; i++;
		String act2 = (String) newData[i]; i++;
		int asam3 = (int) newData[i]; i++;
		String act3 = (String) newData[i]; i++;
		int asam4 = (int) newData[i]; i++;
		String act4 = (String) newData[i]; i++;
		int condition = (int) newData[i]; i++;
		String condDesc = (String) newData[i]; i++;
		String diag1 = (String) newData[i]; i++;
		String med1 = (String) newData[i]; i++;
		String dose1 = (String) newData[i]; i++;
		String diag2 = (String) newData[i]; i++;
		String med2 = (String) newData[i]; i++;
		String dose2 = (String) newData[i]; i++;
		String diag3 = (String) newData[i]; i++;
		String med3 = (String) newData[i]; i++;
		String dose3 = (String) newData[i]; i++;
		int sexCrime = (int) newData[i]; i++;
		int arson = (int) newData[i]; i++;
		String intakeDate = (String) newData[i]; i++;
		String dsm = (String) newData[i]; i++;
		String counselor = (String) newData[i]; i++;
		String fund = (String) newData[i]; i++;
		String other = (String) newData[i]; i++;
		String fCounty = (String) newData[i]; i++;
		String privateCharges = (String) newData[i]; i++;
		String fStartDate = (String) newData[i]; i++;
		String fEndDate = (String) newData[i]; i++;
		int signature = 0;
		int ID = 0;
		String query = "";
		if(j == 1)
			ID = test.getLastID();
			
		
		if(j == 1)
		{
			try { 
				connection = SQLConnection.getConnection();
				statement = connection.createStatement();
				query = "INSERT INTO Client_Record (C_ID, C_FirstName, C_MI, C_LastName, C_DOB, C_Vet, C_Address, C_City, C_State, C_ZIP, C_County, "
						+ "C_CONumYears, C_PrimPhone, C_SecondPhone, C_SSN, C_DLNum, C_DLState, C_MaritalStatus, C_SpouseName, C_Intake_Date, C_Gender, "
						+ "C_Signature, C_Funder, C_FCounty, C_DSMIVCode, C_PrimCounselor, C_PayMethod, C_PrivateCharges, C_AuthStartDate, C_AuthEndDate) " + 
						"VALUES ("+  ID + ", \""+ first + "\", \"" + middle + "\", \"" + last + "\", \"" + dOB + 
						"\", " + vet + ", \"" + address + "\", \"" + city + "\", \"" + state + "\", " + zip + ", \"" + county + "\", " + years + 
						", \"" + phone + "\", \"" + secPhone + "\", \"" + social + "\", \"" + dL + "\", \"" + dLState + "\", \"" + marital + 
						"\", \"" + spouse + "\", \"" + intakeDate + "\", \"" + "M" + "\", " + signature + ", \"" + fund + "\", \"" + fCounty + 
						"\", \"" + dsm + "\", \"" + counselor + "\", \"" + other + "\", \"" + privateCharges + "\", \"" + fStartDate + "\", \"" + fEndDate + "\")";
				System.out.println(query);
				statement.executeUpdate(query);
			} 
			catch (SQLException e) {
				System.out.println("Error sending data to Client_Record");
			} finally {
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						System.out.println("Error Connecting to Client_Record");
					}
				}
			}
			updateID(ID);
			
		}
		else if(j == 0)
		{
			try { 
				connection = SQLConnection.getConnection();
				statement = connection.createStatement();
				query = "INSERT INTO Phone_Intake (C_FirstName, C_MI, C_LastName, C_DOB, C_Vet, C_Address, C_City, C_State, C_ZIP, C_County, "
						+ "C_CONumYears, C_PrimPhone, C_SecondPhone, C_SSN, C_DLNum, C_DLState, C_MaritalStatus, C_SpouseName, C_IntakeDate, C_Gender, "
						+ "C_Signature) " + 
						"VALUES (\""+ first + "\", \"" + middle + "\", \"" + last + "\", \"" + dOB + 
						"\", " + vet + ", \"" + address + "\", \"" + city + "\", \"" + state + "\", " + zip + ", \"" + county + "\", " + years + 
						", \"" + phone + "\", \"" + secPhone + "\", \"" + social + "\", \"" + dL + "\", \"" + dLState + "\", \"" + marital + 
						"\", \"" + spouse + "\", \"" + intakeDate + "\", \"" + "M" + "\", " + signature + ")";
				System.out.println(query);
				statement.executeUpdate(query);
			} 
			catch (SQLException e) {
				System.out.println("Error sending data to Client_Record");
			} finally {
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						System.out.println("Error Connecting to Client_Record");
					}
				}
			}
		}
		
		
		
		if(j == 1)
		{
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				deleteRow("ARC_Info", phone);
				query = "INSERT INTO ARC_Info (C_ID, C_PrimPhone, ARC_Name, ARC_ContactName, ARC_County, ARC_Phone, ARC_Cell, ARC_Address, ARC_City, ARC_State, ARC_ZIP) " + 
						"VALUES ("+ ID + ", \"" + phone + "\", \"" + aName + "\", \"" + aContact + "\", \"" + aCounty + 
						"\", \"" + aPhone + "\", \"" + aCell + "\", \"" + aAddress + "\", \""+ aCity + "\", \"" + aState + "\", \"" + aZip + "\")";

			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to ARC_Info");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to ARC_Info");
				}
			}
		}
		}
		else if(j == 0)
		{
			
			try { 
				connection = SQLConnection.getConnection();
				statement = connection.createStatement();
					query = "INSERT INTO ARC_Info (C_ID, C_PrimPhone, ARC_Name, ARC_ContactName, ARC_County, ARC_Phone, ARC_Cell, ARC_Address, ARC_City, ARC_State, ARC_ZIP) " + 
							"VALUES ("+ 0 + ", \"" + phone + "\", \"" + aName + "\", \"" + aContact + "\", \"" + aCounty + 
							"\", \"" + aPhone + "\", \"" + aCell + "\", \"" + aAddress + "\", \""+ aCity + "\", \"" + aState + "\", \"" + aZip + "\")";

				System.out.println(query);
				statement.executeUpdate(query);
			} 
			catch (SQLException e) {
				System.out.println("Error sending data to ARC_Info");
			} finally {
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						System.out.println("Error Connecting to ARC_Info");
					}
				}
			}
		}

		if(j == 1)
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				deleteRow("EMC_Info", phone);
				query = "INSERT INTO EMC_Info (C_ID, C_PrimPhone, EMC_Name, EMC_Relation, EMC_PrimPhone, EMC_SecondPhone, EMC_Address, EMC_City, EMC_State, EMC_ZIP) " + 
						"VALUES ("+  ID + ", \"" + phone + "\", \"" + eName + "\", \"" + eRelation + "\", \"" + ePhone + 
						"\", \"" + eSecondary + "\", \"" + eAddress + "\", \"" + eCity + "\", \"" + eState + "\", \"" + eZip + "\")";
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to EMC_Info");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to EMC_Info");
				}
			}
		}
		else if(j == 0)
			try { 
				connection = SQLConnection.getConnection();
				statement = connection.createStatement();
					query = "INSERT INTO EMC_Info (C_ID, C_PrimPhone, EMC_Name, EMC_Relation, EMC_PrimPhone, EMC_SecondPhone, EMC_Address, EMC_City, EMC_State, EMC_ZIP) " + 
							"VALUES ("+ 0 + ", \"" + phone + "\", \"" + eName + "\", \"" + eRelation + "\", \"" + ePhone + 
							"\", \"" + eSecondary + "\", \"" + eAddress + "\", \"" + eCity + "\", \"" + eState + "\", \"" + eZip + "\")";
				System.out.println(query);
				statement.executeUpdate(query);
			} 
			catch (SQLException e) {
				System.out.println("Error sending data to EMC_Info");
			} finally {
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						System.out.println("Error Connecting to EMC_Info");
					}
				}
			}
		if(j==1)
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				deleteRow("SUB_Info", phone);
			query = "INSERT INTO SUB_Info (C_ID, C_PrimPhone, SUB1_Name, SUB1_DateLastUsed, SUB1_AmountUsed, SUB1_Frequency, SUB1_Method, "
					+ "SUB2_Name, SUB2_DateLastUsed, SUB2_AmountUsed, SUB2_Frequency, SUB2_Method, "
					+ "SUB3_Name, SUB3_DateLastUsed, SUB3_AmountUsed, SUB3_Frequency, SUB3_Method) " + 
					"VALUES ("+  ID + ", \"" + phone + "\", \"" 
					+ subs1 + "\", \"" + subs1Date + "\", \"" + subs1Amount + "\", \"" + subs1Freq + "\", \"" + subs1Meth + "\", \""
					+ subs2 + "\", \"" + subs2Date + "\", \"" + subs2Amount + "\", \"" + subs2Freq + "\", \"" + subs2Meth + "\", \""
					+ subs3 + "\", \"" + subs3Date + "\", \"" + subs3Amount + "\", \"" + subs3Freq + "\", \"" + subs3Meth + "\")";
			
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to SUB_Info");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to SUB_Info");
				}
			}
		}

		else if(j==0)
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				query = "INSERT INTO SUB_Info (C_ID, C_PrimPhone, SUB1_Name, SUB1_DateLastUsed, SUB1_AmountUsed, SUB1_Frequency, SUB1_Method, "
						+ "SUB2_Name, SUB2_DateLastUsed, SUB2_AmountUsed, SUB2_Frequency, SUB2_Method, "
						+ "SUB3_Name, SUB3_DateLastUsed, SUB3_AmountUsed, SUB3_Frequency, SUB3_Method) " + 
						"VALUES (" + 0 + ", \"" + phone + "\", \"" 
						+ subs1 + "\", \"" + subs1Date + "\", \"" + subs1Amount + "\", \"" + subs1Freq + "\", \"" + subs1Meth + "\", \""
						+ subs2 + "\", \"" + subs2Date + "\", \"" + subs2Amount + "\", \"" + subs2Freq + "\", \"" + subs2Meth + "\", \""
						+ subs3 + "\", \"" + subs3Date + "\", \"" + subs3Amount + "\", \"" + subs3Freq + "\", \"" + subs3Meth + "\")";
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to SUB_Info");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to SUB_Info");
				}
			}
		}
		if(j==1)
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				deleteRow("ASAM", phone);
				query = "INSERT INTO ASAM (C_ID, C_PrimPhone, ASAM1, ASAM1_Actions, ASAM2, ASAM2_Actions, ASAM3, "
						+ "ASAM3_Actions, ASAM4, ASAM4_Actions, PhysLimits, PhysLimits_Actions, "
						+ "Med1_Diag, Med1_Name, Med1_Dosage, "
						+ "Med2_Diag, Med2_Name, Med2_Dosage, "
						+ "Med3_Diag, Med3_Name, Med3_Dosage) " + 
						"VALUES ("+  ID + ", \"" + phone + "\", " + asam1 + ", \"" + act1 + "\", " + asam2 + ", \"" + act2 + "\", " + asam3 + ", \""
						+ act3 + "\", " + asam4 + ", \"" + act4 + "\", " + condition + ", \"" + condDesc + "\", \"" + diag1 + "\", \""
						+ med1 + "\", \"" + dose1 + "\", \"" + diag2 + "\", \"" + med2 + "\", \"" + dose2 + "\""
						+ ", \"" + diag3 + "\", \"" + med3 + "\", \"" + dose3 + "\")";
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to ASAM");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to ASAM");
				}
			}
		}
		if(j==0)
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				query = "INSERT INTO ASAM (C_ID, C_PrimPhone, ASAM1, ASAM1_Actions, ASAM2, ASAM2_Actions, ASAM3, "
						+ "ASAM3_Actions, ASAM4, ASAM4_Actions, PhysLimits, PhysLimits_Actions, "
						+ "Med1_Diag, Med1_Name, Med1_Dosage, "
						+ "Med2_Diag, Med2_Name, Med2_Dosage, "
						+ "Med3_Diag, Med3_Name, Med3_Dosage) " + 
						"VALUES (" + 0 + ", \"" + phone + "\", " + asam1 + ", \"" + act1 + "\", " + asam2 + ", \"" + act2 + "\", " + asam3 + ", \""
						+ act3 + "\", " + asam4 + ", \"" + act4 + "\", " + condition + ", \"" + condDesc + "\", \"" + diag1 + "\", \""
						+ med1 + "\", \"" + dose1 + "\", \"" + diag2 + "\", \"" + med2 + "\", \"" + dose2 + "\""
						+ ", \"" + diag3 + "\", \"" + med3 + "\", \"" + dose3 + "\")";
				
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to ASAM");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to ASAM");
				}
			}
		}
		
		if(j==1)
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				deleteRow("HEALTH_INFO", phone);
				query = "INSERT INTO HEALTH_Info (C_ID, C_PrimPhone, PHYS_Hospital, PHYS_HospWhy, MENT_Hospital, MENT_HospWhy, IV_Use, "
						+ "PRIOR_TPlan, How_Many, WhereANDWhen) " + 
						"VALUES ("+  ID + ", \"" + phone + "\", " + intPHosp + ", \"" + strPHosp + "\", " + intMHosp + ", \"" + strMHosp + "\", " + ivUse + ", "
						+ tPlan + ", \"" + ivMany + "\", \"" + where + "\")";

			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to HEALTH_Info");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to HEALTH_Info");
				}
			}
		}
		if(j==0)
			try { 
				connection = SQLConnection.getConnection();
				statement = connection.createStatement();

					query = "INSERT INTO HEALTH_Info (C_ID, C_PrimPhone, PHYS_Hospital, PHYS_HospWhy, MENT_Hospital, MENT_HospWhy, IV_Use, "
							+ "PRIOR_TPlan, How_Many, WhereANDWhen) " + 
							"VALUES ("+0+", \"" + phone + "\", " + intPHosp + ", \"" + strPHosp + "\", " + intMHosp + ", \"" + strMHosp + "\", " + ivUse + ", "
							+ tPlan + ", \"" + ivMany + "\", \"" + where + "\")";
				System.out.println(query);
				statement.executeUpdate(query);
			} 
			catch (SQLException e) {
				System.out.println("Error sending data to HEALTH_Info");
			} finally {
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						System.out.println("Error Connecting to HEALTH_Info");
					}
				}
			}
		if(j==1)
				try { 
					connection = SQLConnection.getConnection();
					statement = connection.createStatement();
						deleteRow("Leg_Info", phone);
					query = "INSERT INTO LEG_Info (C_ID, C_PrimPhone, LEG_JPLast30, LEG_JPWhy, LEG_OName, LEG_Address, LEG_Phone) " + 
							"VALUES ("+  ID + ", \"" + phone + "\", " + jail30 + ", \"" + probWhy + "\", \"" + oName + "\", \"" + oAddress + "\", \"" + oPhone + "\")";

					System.out.println(query);
					statement.executeUpdate(query);
				} 
				catch (SQLException e) {
					System.out.println("Error sending data to LEG_Info");
				} finally {
					if (connection != null) {
						try {
							connection.close();
						} catch (SQLException e) {
							System.out.println("Error Connecting to LEG_Info");
						}
					}
				}
		if(j==0)
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
				query = "INSERT INTO LEG_Info (C_ID, C_PrimPhone, LEG_JPLast30, LEG_JPWhy, LEG_OName, LEG_Address, LEG_Phone) " + 
						"VALUES ("+0+", \"" + phone + "\", " + jail30 + ", \"" + probWhy + "\", \"" + oName + "\", \"" + oAddress + "\", \"" + oPhone + "\")";
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error sending data to LEG_Info");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to LEG_Info");
				}
			}
		}		
	}
	
	public static void updateID(int ID)
	{
		Connection connection = null;
		Statement statement = null; 
		int old = ID;
		if(old != 1)
			ID++;
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			String query = " UPDATE Last_ID SET C_ID = "+ ID +" WHERE C_ID = " + old +";)";
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error Updating ID ");
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to Last_ID during id update");
				}
			}
		}
		
	}
		
	public static void deleteRow(String table, String s) 
	{
		Connection connection = null;
		Statement statement = null; 
		
		try { 
			connection = SQLConnection.getConnection();
			statement = connection.createStatement();
			String query = "DELETE FROM "+ table + " WHERE C_PrimPhone = " + "\"" + s +"\")";
			System.out.println(query);
			statement.executeUpdate(query);
		} 
		catch (SQLException e) {
			System.out.println("Error Deleting from " + table);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.out.println("Error Connecting to " + table);
				}
			}
		}
		
	}
	
}
