import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTable;


public class ExistingClient

{

	private JPanel panel;
	private JTable table;
	private JTable groupTable;
	private JTable IndividualTable;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public void buildPanel()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(904, 640);
		
		
		
		JLabel lblpanels = new JLabel("Existing Clients");
		lblpanels.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblpanels.setHorizontalAlignment(SwingConstants.CENTER);
		lblpanels.setRequestFocusEnabled(false);
		lblpanels.setBounds(64, 123, 356, 16);
		panel.add(lblpanels);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSelect.setBounds(304, 510, 117, 29);
		panel.add(btnSelect);
		
		JLabel lblClientName = new JLabel("Client Name:");
		lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientName.setBounds(474, 123, 143, 16);
		panel.add(lblClientName);
		
		JLabel lblClientId = new JLabel("Client ID:");
		lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientId.setBounds(742, 123, 143, 16);
		panel.add(lblClientId);
		
		JLabel lblEmergencyContact = new JLabel("Emergency Contact:");
		lblEmergencyContact.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyContact.setBounds(474, 226, 143, 16);
		panel.add(lblEmergencyContact);
		
		JLabel lblEmergencyPhone = new JLabel("Emergency Phone:");
		lblEmergencyPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyPhone.setBounds(474, 254, 143, 16);
		panel.add(lblEmergencyPhone);
		
		JLabel lblClientPhone = new JLabel("Client Phone:");
		lblClientPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientPhone.setBounds(474, 151, 143, 16);
		panel.add(lblClientPhone);
		
		
		Object[][] data = getExisting();
		String[] columnNames = {"Client ID","Client Name"};
		table = new JTable(data, columnNames);
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		table.setGridColor(Color.LIGHT_GRAY);
		table.setFillsViewportHeight(true);
		table.getColumnModel().getColumn(0).setWidth(10);
		table.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(64, 150, 356, 355);
		sp.setVisible(true);
		panel.add(sp);
		
		Object[][] data1 = getGroup();
		String[] columnNames1 = {"Date","Counselor"};
		groupTable = new JTable(data1, columnNames1);
		groupTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupTable.setGridColor(Color.LIGHT_GRAY);
		groupTable.setFillsViewportHeight(true);
		groupTable.getColumnModel().getColumn(0).setWidth(10);
		groupTable.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane spGroup = new JScrollPane(groupTable);
		spGroup.setBounds(695, 320, 190, 185);
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
		spInd.setBounds(474, 320, 190, 185);
		spInd.setVisible(true);
		panel.add(spInd);
		
		JButton btnViewInd = new JButton("View");
		btnViewInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewInd.setBounds(474, 510, 94, 29);
		panel.add(btnViewInd);
		
		JButton btnAddInd = new JButton("Add");
		btnAddInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddInd.setBounds(570, 510, 94, 29);
		panel.add(btnAddInd);
		
		JButton btnViewGroup = new JButton("View");
		btnViewGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewGroup.setBounds(695, 510, 94, 29);
		panel.add(btnViewGroup);
		
		JButton btnAddGroup = new JButton("Add");
		btnAddGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddGroup.setBounds(790, 510, 94, 29);
		panel.add(btnAddGroup);
		
		JLabel lblIndividualNotes = new JLabel("Individual Notes");
		lblIndividualNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblIndividualNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndividualNotes.setBounds(474, 301, 190, 16);
		panel.add(lblIndividualNotes);
		
		JLabel lblGroupNotes = new JLabel("Group Notes");
		lblGroupNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblGroupNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupNotes.setBounds(695, 301, 190, 16);
		panel.add(lblGroupNotes);
		
		
		
		
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
		Object[][] data = {{12342,"Clint Eastwood"},{23423,"Will Clark"},{34454,"Barry Bonds"},{34552,"Derek Jeter"}};
		return data;
	}
	public JComponent getPanel()
	{
		return panel;
	}
}
