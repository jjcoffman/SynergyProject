package com.synergyproject.jdbc.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.synergyproject.jdbc.db.DbUtil;
import com.synergyproject.jdbc.db.JDBCMySQLConnection;
import com.synergyproject.jdbc.to.ClientRecord;

public class JDBCSQLDemo {
	public static void main(String[] args) { 

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the client id:");
	
	int clientID;
	try {
		clientID = Integer.parseInt(br.readLine());
		JDBCSQLDemo demo = new JDBCSQLDemo();
		ClientRecord client = demo.getClient(clientID);
		System.out.println(client);
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ClientRecord getClient(int clientID){
		ResultSet rs = null;
		Connection connection = null;
		Statement statement = null; 

		ClientRecord client = null;
		String query = "SELECT * FROM Client_Record WHERE C_ID=" + clientID;
		try { 
			connection = JDBCMySQLConnection.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			if (rs.next()) {
				client = new ClientRecord();
				client.setC_ID(rs.getInt("C_ID"));
				client.setC_LastName(rs.getString("C_LastName"));
				client.setC_FirstName(rs.getString("C_FirstName"));
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
		return client;
	}
}