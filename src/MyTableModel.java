import javax.swing.event.*;
import javax.swing.table.TableModel;
import javax.swing.table.AbstractTableModel;

class MyTableModel extends AbstractTableModel implements TableModelListener{
    private String[] columnNames;//same as before...
    private Object[][] data;//same as before...
    
    public MyTableModel(Object[][] d, String[] c){
    	columnNames = c;
    	data = d;
    	
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
        System.out.println("test");

        // Do something with the data...
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2) {
            return false;
        } else {
            return true;
        }
    }
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
    public void update(Object[][] d){
    	data = d;
    	fireTableDataChanged();
    }
}