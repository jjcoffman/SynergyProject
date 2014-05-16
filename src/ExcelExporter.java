import java.io.FileWriter;
import javax.swing.JTable;
import java.io.IOException;
import java.io.*;
import javax.swing.table.TableModel;
import javax.swing.table.AbstractTableModel;

public class ExcelExporter {
		public ExcelExporter() { }
		public void exportTable(JTable table, File file) throws IOException {
			TableModel model = table.getModel();
			FileWriter out = new FileWriter(file);
			for(int i=0; i < model.getColumnCount(); i++) {
		out.write(model.getColumnName(i) + "\t");
			}
			out.write("\n");

			for(int i=0; i< model.getRowCount(); i++) {
		for(int j=0; j < model.getColumnCount(); j++) {
			out.write(model.getValueAt(i,j).toString()+"\t");
			}
			out.write("\n");
		}

		out.close();
		System.out.println("write out to: " + file);
	}
}