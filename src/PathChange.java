import javax.swing.JOptionPane;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathChange 
{
		private String macPath= System.getProperty ("user.home") + "/Documents/SQLPath.txt";
		private String winPath = "SQLPath.txt";
		private String path = "";
		private String user = "";
		private String pass = "";
		private SQLConnection conn;
		private static String URL = "jdbc:mysql://127.0.0.1/newDB"; //defaults values for starting the program
		  private static String USER = "root";
		  private static String PASSWORD = "T01RMA72";
		private boolean success = false;
		
		public PathChange() 
		{
			
		}
		
		//this overloaded Constructor sets the paths based on what could be the never modified default
		public PathChange(String path1, String user1, String pass1)
		{
			path = path1;
			user = user1;
			pass = pass1;
			Object[] obj = new Object[3];
			try {
				obj = importSQL();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		public boolean exportSQL(String path1, String username, String password) throws IOException
		{
			
			//here we get the filesystem type based on the OS that the software is running on
			 java.nio.file.FileSystem fs = FileSystems.getDefault();
				Path fp = null;
				File file = null;
			 if (fs.toString().contains("MacOSXFileSystem")){
					fp = fs.getPath(macPath);
					file = new File(macPath);}
				else{
					fp = fs.getPath(winPath);
					file = new File(winPath);}
			try
			{
				if (!file.exists()) {
					file.createNewFile();
				}
				//here we create a buffered stream writer to write the string to new lines in the file
				OutputStream out = new BufferedOutputStream(Files.newOutputStream(fp));
				BufferedWriter write = new BufferedWriter(new OutputStreamWriter(out));
				
				//and simply write the text with a new line in between it
				write.write(path1);
				write.newLine();
				write.write(username);
				write.newLine();
				write.write(password);
				write.close();
			}
			 catch(Exception NoSuchFileException)
			 {
		        JOptionPane.showMessageDialog(null, "The Database Location File does not exist! Please contact your System Admin");
		        return false;
		     }
			//here we return a boolean value stating whether or not updating the filepath worked or not.
			return true;
	}
		public Object[] importSQL() throws IOException
		{
			//here we declare our split and delimiters for reading the files
			String path = "";
			String user = "";
			String pass = "";
			Object[] sqlInfo = new Object[3];
					//Here we fill the array with values
					//1. path
					//2. user
					//3. password
					//4. success/fail
					Path fp = null;
					File file = null;

					//here we read the data from the correct file to pass as an array to the sql connection page
					java.nio.file.FileSystem fs = FileSystems.getDefault();
					if (fs.toString().contains("MacOSXFileSystem")){
						fp = fs.getPath(macPath);
						file = new File(macPath);}

					else{
						fp = fs.getPath(winPath);
						file = new File(winPath);}

					//this checks for the files existence, if none this is the first instance the program has been ran and creates one
					if (!file.exists()) {
						file.createNewFile();
						conn = new SQLConnection();
						exportSQL(URL, USER, PASSWORD);
					}
					
					
					
					try {
						int step = 0;
						InputStream input = new BufferedInputStream(
								Files.newInputStream(fp));
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(input));

						//here we read each line and return the info as an array of strings in a generic object array
						if (step == 0) {
							path = reader.readLine();
							sqlInfo[0] = path;
							System.out.println();
							step++;
						}
						if (step == 1) {
							user = reader.readLine();
							sqlInfo[1] = user;
							step++;
						}
						if (step == 2) {
							pass = reader.readLine();
							sqlInfo[2] = pass;
							step++;
						}
					} catch (Exception e) {
						System.out.println("error in PathChange getting the correct path");
					}

			return sqlInfo; 
	}
		
		public boolean changePath(String path1, String user1, String pass1)
		{
			String old = path;
			new PathChange(path1, user1, pass1);
			if(old.equals(path))
				return false;
			return true;
			
		}
}