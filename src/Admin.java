import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Admin
{
	private JPanel Admin;
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	/**							
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()  //NOT A CONSTRUCTOR!
	{
		Admin = new JPanel();
		Admin.setSize(904,640);
		Admin.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 20, 864, 600);
		Admin.add(tabbedPane);
		
		JPanel ManageUsers = new JPanel();
		Object[][] data = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
		String[] columnNames = {"ID #", "First Name", "Last Name", "Admin Access"};
		ManageUsers.setLayout(null);
		JTable table = new JTable(data, columnNames);
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		table.setGridColor(Color.LIGHT_GRAY);
		table.setFillsViewportHeight(true);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setFont(new Font("Verdana", Font.PLAIN, 13));
		scroll.setSize(800, 400);
		scroll.setLocation(6, 60);
		ManageUsers.add(scroll);
		tabbedPane.addTab("Manage Users", null, ManageUsers, null);
		
		JButton btnEditSelectedUser = new JButton("Edit Selected User");
		btnEditSelectedUser.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnEditSelectedUser.setBounds(160, 470, 200, 29);
		ManageUsers.add(btnEditSelectedUser);
		
		JButton btnAddNewUser = new JButton("Add New User");
		btnAddNewUser.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddNewUser.setBounds(440, 470, 200, 29);
		ManageUsers.add(btnAddNewUser);
		
		JLabel lblCurrentUsers = new JLabel("Current Users");
		lblCurrentUsers.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentUsers.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCurrentUsers.setBounds(300, 32, 200, 16);
		ManageUsers.add(lblCurrentUsers);
		
		JPanel Archive = new JPanel();

		JLabel lblpanels = new JLabel("Existing Clients");
		lblpanels.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblpanels.setHorizontalAlignment(SwingConstants.CENTER);
		lblpanels.setRequestFocusEnabled(false);
		lblpanels.setBounds(31, 58, 356, 16);
		Archive.add(lblpanels);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSelect.setBounds(150, 465, 117, 29);
		Archive.add(btnSelect);
		
		JLabel lblClientName = new JLabel("Client Name:");
		lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientName.setBounds(441, 86, 143, 16);
		Archive.add(lblClientName);
		
		JLabel lblClientId = new JLabel("Client ID:");
		lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientId.setBounds(441, 58, 143, 16);
		Archive.add(lblClientId);
		
		JLabel lblEmergencyContact = new JLabel("Emergency Contact:");
		lblEmergencyContact.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyContact.setBounds(441, 163, 143, 16);
		Archive.add(lblEmergencyContact);
		
		JLabel lblEmergencyPhone = new JLabel("Emergency Phone:");
		lblEmergencyPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyPhone.setBounds(441, 191, 143, 16);
		Archive.add(lblEmergencyPhone);
		
		JLabel lblClientPhone = new JLabel("Client Phone:");
		lblClientPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientPhone.setBounds(441, 114, 143, 16);
		Archive.add(lblClientPhone);
		tabbedPane.addTab("Archive", null, Archive, null);
		Archive.setLayout(null);
		Object[][] data3 = getExisting();
		String[] columnNames3 = {"Client ID","Client Name"};
		table = new JTable(data3, columnNames3);
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		table.setGridColor(Color.LIGHT_GRAY);
		table.setFillsViewportHeight(true);
		table.getColumnModel().getColumn(0).setWidth(10);
		table.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(31, 86, 356, 367);
		sp.setVisible(true);
		Archive.add(sp);
		
		Object[][] data1 = getGroup();
		String[] columnNames1 = {"Date","Counselor"};
		JTable groupTable = new JTable(data1, columnNames1);
		groupTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupTable.setGridColor(Color.LIGHT_GRAY);
		groupTable.setFillsViewportHeight(true);
		groupTable.getColumnModel().getColumn(0).setWidth(10);
		groupTable.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane spGroup = new JScrollPane(groupTable);
		spGroup.setBounds(662, 271, 190, 234);
		spGroup.setVisible(true);
		Archive.add(spGroup);
		
		Object[][] data2 = getInd();
		String[] columnNames2 = {"Date","Counselor"};
		JTable IndividualTable = new JTable(data2, columnNames2);
		IndividualTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		IndividualTable.setGridColor(Color.LIGHT_GRAY);
		IndividualTable.setFillsViewportHeight(true);
		IndividualTable.getColumnModel().getColumn(0).setWidth(10);
		IndividualTable.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane spInd = new JScrollPane(IndividualTable);
		spInd.setBounds(441, 271, 190, 234);
		spInd.setVisible(true);
		Archive.add(spInd);
		
		JButton btnViewInd = new JButton("View");
		btnViewInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewInd.setBounds(441, 510, 94, 29);
		Archive.add(btnViewInd);
		
		JButton btnAddInd = new JButton("Add");
		btnAddInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddInd.setBounds(537, 510, 94, 29);
		Archive.add(btnAddInd);
		
		JButton btnViewGroup = new JButton("View");
		btnViewGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewGroup.setBounds(662, 510, 94, 29);
		Archive.add(btnViewGroup);
		
		JButton btnAddGroup = new JButton("Add");
		btnAddGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddGroup.setBounds(757, 510, 94, 29);
		Archive.add(btnAddGroup);
		
		JLabel lblIndividualNotes = new JLabel("Individual Notes");
		lblIndividualNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblIndividualNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndividualNotes.setBounds(441, 243, 190, 16);
		Archive.add(lblIndividualNotes);
		
		JLabel lblGroupNotes = new JLabel("Group Notes");
		lblGroupNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblGroupNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupNotes.setBounds(662, 243, 190, 16);
		Archive.add(lblGroupNotes);
		
		JButton btnViewprintForms = new JButton("View/Print Forms");
		btnViewprintForms.setBounds(64, 510, 160, 29);
		Archive.add(btnViewprintForms);
		
		JButton btnDischarge = new JButton("Discharge");
		btnDischarge.setBounds(236, 510, 117, 29);
		Archive.add(btnDischarge);

		//add items such as buttons etc
		
		
		Admin.setVisible(true);
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Admin;
	}
	
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
}

		//past this into a class the panel that contains this panel, if you are unsure don't do anything with this!!!!!!!!
		//Admin pane = new Admin(); //this creates a new object	
		//pane.buildPanel();	//This builds the object
		//JComponent p = pane.getPanel(); //this creates a local version
		//panel.add(p); //this adds it to the current panel