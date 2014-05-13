import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class ExistingClient

{

	private JPanel panel;
	private JTable table;
	private JTable groupTable;
	private JTable IndividualTable;
	private MyTableModel existing;
	private int id;

	
	SQLRetrieveInfo test = new SQLRetrieveInfo();
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(904, 640);
		
		
		
		JLabel lblpanels = new JLabel("Existing Clients");
		lblpanels.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblpanels.setHorizontalAlignment(SwingConstants.CENTER);
		lblpanels.setRequestFocusEnabled(false);
		lblpanels.setBounds(20, 20, 356, 20);
		panel.add(lblpanels);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSelect.setBounds(20, 480, 160, 29);
		btnSelect.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{	Object test = table.getValueAt(table.getSelectedRow(),0);
				id = (int)test;
				System.out.println(id);
				}});
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
		//existing = new DefaultTableModel(data, columnNames);
		existing = new MyTableModel(data, columnNames);
		table = new JTable(existing);
		table.getModel().addTableModelListener(table);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		//table = new JTable(existing);
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		table.setGridColor(Color.LIGHT_GRAY);
		table.setFillsViewportHeight(true);
		table.getColumnModel().getColumn(0).setMinWidth(60);
		table.getColumnModel().getColumn(1).setMinWidth(320);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(20, 50, 380, 420);
		sp.setVisible(true);
		panel.add(sp);
		
		Object[][] data1 = getGroup();
		String[] columnNames1 = {"Week Of","Counselor"};
		groupTable = new JTable(data1, columnNames1);
		groupTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupTable.setGridColor(Color.LIGHT_GRAY);
		groupTable.setFillsViewportHeight(true);
		groupTable.getColumnModel().getColumn(0).setWidth(10);
		groupTable.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane spGroup = new JScrollPane(groupTable);
		spGroup.setBounds(660, 250, 200, 260);
		spGroup.setVisible(true);
		panel.add(spGroup);
		
		Object[][] data2 = getInd();
		String[] columnNames2 = {"Date","Counselor"};
		IndividualTable = new JTable(data2, columnNames2);
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
			{new ViewIndividualNote();}});
		btnViewInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewInd.setBounds(430, 520, 94, 29);
		panel.add(btnViewInd);
		
		JButton btnAddInd = new JButton("Add");
		btnAddInd.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{new AddIndividualNote(id);}
		});
		btnAddInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddInd.setBounds(540, 520, 94, 29);
		panel.add(btnAddInd);
		
		JButton btnViewGroup = new JButton("View");
		btnViewGroup.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{new GroupNotesForm();}
		});
		btnViewGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewGroup.setBounds(660, 520, 94, 29);
		panel.add(btnViewGroup);
		
		JButton btnAddGroup = new JButton("Add");
		btnAddGroup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{new newGroupNote();}
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
		panel.add(btnViewprintForms);
		
		JButton btnDischarge = new JButton("Discharge");
		btnDischarge.setForeground(Color.RED);
		btnDischarge.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnDischarge.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{ new DischargeScroll();
			}
		});
		btnDischarge.setBounds(240, 520, 160, 29);
		panel.add(btnDischarge);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnRefresh.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				Object[][] data = getExisting();
				existing.update(data);
				}
		});
		btnRefresh.setBounds(240, 480, 160, 29);
		panel.add(btnRefresh);
		
		JLabel lblCID = new JLabel("New label");
		lblCID.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCID.setBounds(570, 40, 200, 16);
		panel.add(lblCID);
		
		JLabel lblCName = new JLabel("New label");
		lblCName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCName.setBounds(570, 70, 200, 16);
		panel.add(lblCName);
		
		JLabel lblCPhone = new JLabel("New label");
		lblCPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCPhone.setBounds(570, 100, 200, 16);
		panel.add(lblCPhone);
		
		JLabel lblECName = new JLabel("New label");
		lblECName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblECName.setBounds(570, 140, 200, 16);
		panel.add(lblECName);
		
		JLabel lblECPhone = new JLabel("New label");
		lblECPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblECPhone.setBounds(570, 170, 200, 16);
		panel.add(lblECPhone);
		
		
		
		
		panel.setVisible(true);
		
	}
	//this gets the individual notes
	private Object[][] getInd() 
	{
		Object[][] data = {{"1/12/14","Bootstrap Bill"}};
		return data;
	}
	//this gets the group notes
	private Object[][] getGroup() 
	{
		Object[][] data = {{"1/12/14","Bootstrap Bill"}};
		return data;
	}

	//This will fill the object array with the data from the the existing users
	private Object[][] getExisting()
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
	/*private String getClientName(int id){
		try {
		return test.getName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
	private String getClientPhone(int id){
		try {
		return test.getName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
	private String getECName(int id){
		try {
		return test.getName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
	private String getECPhone(int id){
		try {
		return test.getName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}*/
	public JComponent getPanel()
	{
		return panel;
	}
}
