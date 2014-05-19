import java.io.FileWriter;
import javax.swing.JTable;
import java.io.IOException;
import java.io.*;

public class PathChange 
{
		private File file = new File("SQLPath.xls");
		public PathChange() 
		{
			
		}
		public void exportSQL(String path, String username, String password) throws IOException
		{
			FileWriter out = new FileWriter(file);
			
			out.write(path);
			out.write("\n");
			out.write(username);
			out.write("\n");
			out.write(password);
			
			out.close();
			
			System.out.println("write out to: " + file);
	}
		public Object[] importSQL() throws IOException
		{
			FileWriter out = new FileWriter(file);
			
			Object[] sql = new Object[3];
			
			//out.write(path);
			out.write("\n");
			//out.write(username);
			out.write("\n");
			//out.write(password);
			
			out.close();
			
			System.out.println("write out to: " + file);
			return sql;
	}
}