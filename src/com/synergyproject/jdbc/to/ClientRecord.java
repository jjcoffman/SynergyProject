package com.synergyproject.jdbc.to;

public class ClientRecord {
	private int C_ID;
	private String C_LastName;
	private String C_FirstName;
	
	public int getC_ID(){
		return C_ID;
	}
	
	public void setC_ID(int C_ID){
		this.C_ID = C_ID;
	}
	
	public String getC_LastName(){
		return C_LastName;
	}
	
	public void setC_LastName(String C_LastName){
		this.C_LastName = C_LastName;
	}
	
	public String getC_FirstName(){
		return C_FirstName;
	}
	
	public void setC_FirstName(String C_FirstName){
		this.C_FirstName = C_FirstName;
	}
	
	@Override
    public String toString() {
		return "Client [C_ID=" + C_ID + " , C_LastName=" + C_LastName + " , C_FirstName=" + C_FirstName + "]";
	}
}
