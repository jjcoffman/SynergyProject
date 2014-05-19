import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class ExistingClient

{

	private JPanel panel;
	private JTable table;
	private JTable groupTable;
	private JTable IndividualTable;
	private MyTableModel existing;
	private MyTableModel individual;
	private MyTableModel group;
	private int id;
	private int userid;
	private int access;
	private String selectedDate = "";
	private JLabel lblCID;
	private JLabel lblCName;
	private JLabel lblCPhone;
	private JLabel lblECName;
	private JLabel lblECPhone;

	
	SQLRetrieveInfo test = new SQLRetrieveInfo();
	SQLSetInfo test2 = new SQLSetInfo();
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel(int id2, int admin2)
	{
		userid = id2;
		access = admin2;
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(904, 640);
		
		
		
		JLabel lblpanels = new JLabel("Existing Clients");
		lblpanels.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblpanels.setHorizontalAlignment(SwingConstants.CENTER);
		lblpanels.setRequestFocusEnabled(false);
		lblpanels.setBounds(20, 20, 356, 20);
		panel.add(lblpanels);
		
		JButton btnSelect = new JButton("Refresh");
		btnSelect.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSelect.setBounds(20, 480, 160, 29);
		btnSelect.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{	
				Object[][] data = getExisting();
				existing.update(data);
			}
		});
		panel.add(btnSelect);
		
		JLabel lblClientName = new JLabel("Client Name:");
		lblClientName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientName.setBounds(420, 70, 140, 16);
		panel.add(lblClientName);
		
		JLabel lblClientId = new JLabel("Client ID:");
		lblClientId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientId.setBounds(420, 40, 140, 16);
		panel.add(lblClientId);
		
		JLabel lblEmergencyContact = new JLabel("Emergency Contact:");
		lblEmergencyContact.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmergencyContact.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyContact.setBounds(420, 140, 140, 16);
		panel.add(lblEmergencyContact);
		
		JLabel lblEmergencyPhone = new JLabel("Emergency Phone:");
		lblEmergencyPhone.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmergencyPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyPhone.setBounds(420, 170, 140, 16);
		panel.add(lblEmergencyPhone);
		
		JLabel lblClientPhone = new JLabel("Client Phone:");
		lblClientPhone.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClientPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientPhone.setBounds(420, 100, 140, 16);
		panel.add(lblClientPhone);
		
		Object[][] data = getExisting();
		String[] columnNames = {"Client ID","Client Name"};
		existing = new MyTableModel(data, columnNames);
		table = new JTable(existing);
		table.getModel().addTableModelListener(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		table.setGridColor(Color.LIGHT_GRAY);
		table.setFillsViewportHeight(true);
		table.getColumnModel().getColumn(0).setMinWidth(60);
		table.getColumnModel().getColumn(1).setMinWidth(320);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{	
				if(table.getSelectedRow() != -1)
				{
					Object test = table.getValueAt(table.getSelectedRow(),0);
					id = (int)test;
					lblCID.setText(String.valueOf(id));
					lblCName.setText(getClientName(id));
					lblCPhone.setText(getClientPhone(id));
					lblECName.setText(getECName(id));
					lblECPhone.setText(getECPhone(id));
					Object[][] data = getInd(id);
					individual.update(data);
					Object[][] data2 = getGroup(id);
					group.update(data2);
					System.out.println(id);
					System.out.println("Ind Note Count: " +test2.getIndSize("IND_Notes", id));
				}
			}
		});
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(20, 50, 380, 420);
		sp.setVisible(true);
		panel.add(sp);
		
		Object[][] data1 = getGroup(id);
		String[] columnNames1 = {"Week Of","Counselor"};
		group = new MyTableModel(data1, columnNames1);
		groupTable = new JTable(group);
		groupTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupTable.setGridColor(Color.LIGHT_GRAY);
		groupTable.setFillsViewportHeight(true);
		groupTable.getColumnModel().getColumn(0).setWidth(10);
		groupTable.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane spGroup = new JScrollPane(groupTable);
		spGroup.setBounds(660, 250, 200, 260);
		spGroup.setVisible(true);
		panel.add(spGroup);
		
		Object[][] data2 = getInd(id);
		String[] columnNames2 = {"Date","Counselor"};
		individual = new MyTableModel(data2, columnNames2);
		IndividualTable = new JTable(individual);
		IndividualTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		IndividualTable.setGridColor(Color.LIGHT_GRAY);
		IndividualTable.setFillsViewportHeight(true);
		IndividualTable.getColumnModel().getColumn(0).setWidth(10);
		IndividualTable.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane spInd = new JScrollPane(IndividualTable);
		spInd.setBounds(430, 250, 200, 260);
		spInd.setVisible(true);
		panel.add(spInd);
		
		JButton btnViewInd = new JButton("View");
		btnViewInd.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				selectedDate = (String)individual.getValueAt(IndividualTable.getSelectedRow(),0);
				new ViewIndividualNote(id, selectedDate);
				}
			});
		btnViewInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewInd.setBounds(430, 520, 94, 29);
		panel.add(btnViewInd);
		
		JButton btnAddInd = new JButton("Add");
		btnAddInd.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{new AddIndividualNote(id, individual, userid);}
		});
		btnAddInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddInd.setBounds(540, 520, 94, 29);
		panel.add(btnAddInd);
		
		JButton btnViewGroup = new JButton("View");
		btnViewGroup.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				selectedDate = (String)group.getValueAt(groupTable.getSelectedRow(),0);
				new GroupNotesForm(id, selectedDate);}
		});
		btnViewGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewGroup.setBounds(660, 520, 94, 29);
		panel.add(btnViewGroup);
		
		JButton btnAddGroup = new JButton("Add");
		btnAddGroup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{new newGroupNote(id, group, userid);}
		});
		btnAddGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddGroup.setBounds(770, 520, 94, 29);
		panel.add(btnAddGroup);
		
		JLabel lblIndividualNotes = new JLabel("Individual Notes");
		lblIndividualNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblIndividualNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndividualNotes.setBounds(430, 220, 200, 16);
		panel.add(lblIndividualNotes);
		
		JLabel lblGroupNotes = new JLabel("Group Notes");
		lblGroupNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblGroupNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupNotes.setBounds(660, 220, 190, 16);
		panel.add(lblGroupNotes);
		
		JButton btnViewprintForms = new JButton("View/Print Forms");
		btnViewprintForms.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewprintForms.setBounds(20, 520, 160, 29);
		btnViewprintForms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				new Print("Client_Record", String.valueOf(id));
				}
		});
		panel.add(btnViewprintForms);
		
		JButton btnDischarge = new JButton("Discharge");
		btnDischarge.setForeground(Color.RED);
		btnDischarge.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnDischarge.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{ 
				if(id == 0)
					JOptionPane.showMessageDialog(null, "Please select a client first");
				else
					new DischargeScroll(id, group);
			}
		});
		btnDischarge.setBounds(240, 520, 160, 29);
		panel.add(btnDischarge);
		
		JButton btnRefresh = new JButton("Export Table");
		btnRefresh.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnRefresh.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				
				try {
					ExcelExporter export = new ExcelExporter();
					export.exportTable(table, new File("CurrentTable.xls"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/*Object[][] data = getExisting();
				existing.update(data);*/
				}
		});
		btnRefresh.setBounds(240, 480, 160, 29);
		panel.add(btnRefresh);
		
		lblCID = new JLabel();
		lblCID.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCID.setBounds(570, 40, 200, 16);
		panel.add(lblCID);
		
		lblCName = new JLabel();
		lblCName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCName.setBounds(570, 70, 200, 16);
		panel.add(lblCName);
		
		lblCPhone = new JLabel();
		lblCPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCPhone.setBounds(570, 100, 200, 16);
		panel.add(lblCPhone);
		
		lblECName = new JLabel();
		lblECName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblECName.setBounds(570, 140, 200, 16);
		panel.add(lblECName);
		
		lblECPhone = new JLabel();
		lblECPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblECPhone.setBounds(570, 170, 200, 16);
		panel.add(lblECPhone);
		
		
		
		
		panel.setVisible(true);
		
	}

	//this gets the individual notes
	private Object[][] getInd(int id) {
		//Object[][] data = {{"1/12/14","Bootstrap Bill"}};
		//System.out.println("Ind Note Count: " +test2.getIndSize("IND_Notes", id));
		//return data;
		try {
			int size = test2.getIndSize("IND_NOTES", id);
			Object[][] data = new Object[size][2];
			data= test2.getIndRows(size, id);
			return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No database", "Connected"}};
			return data;
		}	
	}
	
	//this gets the group notes
	private Object[][] getGroup(int id) {
		//Object[][] data = {{"1/12/14","Bootstrap Bill"}};
		//return data;
		try {
			int size = test2.getGroupSize("GRP_NOTES", id);
			Object[][] data = new Object[size][2];
			data= test2.getGroupRows(size, id);
			return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No database", "Connected"}};
			return data;
		}	
	}

	//This will fill the object array with the data from the the existing users
	public Object[][] getExisting()
	{
		//Object[][] data = {{12342,"Clint Eastwood"},{23423,"Will Clark"},{34454,"Barry Bonds"},{34552,"Derek Jeter"}};
		//return data;
		try {
			int size = test.getSize("Client_Record");
		
		Object[][] data = new Object[size][2];
		for (int i = 1; i <= size; i++){
			data[i-1] = test.getRows(i - 1, 1);
		}
		System.out.println("rows in client_record: " + test.getSize("Client_Record"));
		return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No database", "Connected"}};
			return data;
		} 
	}
	private String getClientName(int id){
		try {
		return test2.getName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
	private String getClientPhone(int id){
		try {
		return test2.getPhone(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
	private String getECName(int id){
		try {
		return test2.getECName(id);
		}
		catch(NullPointerException e) {
			return "N/A";
		}
	}
	private String getECPhone(int id){
		try {
		return test2.getECPhone(id);
		}
		catch(NullPointerException e) {
			return "N/A";
		}
	}
	public JComponent getPanel()
	{
		return panel;
	}
	
}
