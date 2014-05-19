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
	private MyTableModel users;
	private MyTableModel clients;
	private MyTableModel individual;
	private MyTableModel group;
	private JTable usersTable;
	private JTable individualTable;
	private JTable groupTable;
	private JTable clientsTable;
	private JLabel lblCID;
	private JLabel lblCName;
	private JLabel lblCPhone;
	private JLabel lblECName;
	private JLabel lblECPhone;
	private int id;
	private String selectedDate = "";
	
	SQLRetrieveInfo test = new SQLRetrieveInfo();
	SQLSetInfo test2 = new SQLSetInfo();
	TempRetrieveInfo test3 = new TempRetrieveInfo();
	
	
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
		Object[][] data = getUsers();//{{1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
		String[] columnNames = {"ID #", "UserName", "Name", "Admin Access"};
		ManageUsers.setLayout(null);
		users = new MyTableModel(data, columnNames);
		usersTable = new JTable(users);
		usersTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		usersTable.setGridColor(Color.LIGHT_GRAY);
		usersTable.setFillsViewportHeight(true);
		usersTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{	
				if(usersTable.getSelectedRow() != -1)
				{
					Object test = users.getValueAt(usersTable.getSelectedRow(),0);
					id = (int)test;
					System.out.println("user id: " + id);
					//System.out.println(id);
					//System.out.println("Ind Note Count: " +test2.getIndSize("IND_Notes", id));
				}
			}
		});
		JScrollPane scroll = new JScrollPane(usersTable);
		scroll.setFont(new Font("Verdana", Font.PLAIN, 13));
		scroll.setSize(800, 400);
		scroll.setLocation(6, 60);
		ManageUsers.add(scroll);
		tabbedPane.addTab("Manage Users", null, ManageUsers, null);
		
		JButton btnEditSelectedUser = new JButton("Edit Selected User");
		btnEditSelectedUser.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { new EditUser(id, users);
			}
		});
		btnEditSelectedUser.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnEditSelectedUser.setBounds(160, 470, 200, 29);
		ManageUsers.add(btnEditSelectedUser);
		
		JButton btnAddNewUser = new JButton("Add New User");
		btnAddNewUser.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnAddNewUser.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { new NewUser(users);
			}
		});
		btnAddNewUser.setBounds(440, 470, 200, 29);
		ManageUsers.add(btnAddNewUser);
		
		JLabel lblCurrentUsers = new JLabel("Current Users");
		lblCurrentUsers.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentUsers.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCurrentUsers.setBounds(300, 32, 200, 16);
		ManageUsers.add(lblCurrentUsers);
		
		JPanel Archive = new JPanel();

		JLabel lblpanels = new JLabel("Archived Clients");
		lblpanels.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblpanels.setHorizontalAlignment(SwingConstants.CENTER);
		lblpanels.setRequestFocusEnabled(false);
		lblpanels.setBounds(20, 20, 360, 16);
		Archive.add(lblpanels);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnRefresh.setBounds(20, 420, 160, 29);
		Archive.add(btnRefresh);
		btnRefresh.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e) 
			{	
				Object[][] data = getExisting();
				clients.update(data);
			}
		});
		
		JLabel lblClientName = new JLabel("Client Name:");
		lblClientName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClientName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientName.setBounds(400, 70, 140, 16);
		Archive.add(lblClientName);
		
		JLabel lblClientId = new JLabel("Client ID:");
		lblClientId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClientId.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientId.setBounds(400, 40, 140, 16);
		Archive.add(lblClientId);
		
		JLabel lblEmergencyContact = new JLabel("Emergency Contact:");
		lblEmergencyContact.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmergencyContact.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyContact.setBounds(400, 140, 140, 16);
		Archive.add(lblEmergencyContact);
		
		JLabel lblEmergencyPhone = new JLabel("Emergency Phone:");
		lblEmergencyPhone.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmergencyPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyPhone.setBounds(400, 170, 140, 16);
		Archive.add(lblEmergencyPhone);
		
		JLabel lblClientPhone = new JLabel("Client Phone:");
		lblClientPhone.setHorizontalAlignment(SwingConstants.TRAILING);
		lblClientPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientPhone.setBounds(400, 100, 140, 16);
		Archive.add(lblClientPhone);
		tabbedPane.addTab("Archive", null, Archive, null);
		Archive.setLayout(null);
		Object[][] data3 = getExisting();
		String[] columnNames3 = {"Client ID","Client Name"};
		clients = new MyTableModel(data3, columnNames3);
		clientsTable = new JTable(clients);
		clientsTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		clientsTable.setGridColor(Color.LIGHT_GRAY);
		clientsTable.setFillsViewportHeight(true);
		clientsTable.getColumnModel().getColumn(0).setWidth(10);
		clientsTable.getColumnModel().getColumn(1).setWidth(40);
		clientsTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{	
				if(clientsTable.getSelectedRow() != -1)
				{
					Object test = clientsTable.getValueAt(clientsTable.getSelectedRow(),0);
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
					//System.out.println(id);
					//System.out.println("Ind Note Count: " +test2.getIndSize("IND_Notes", id));
				}
			}
		});
		JScrollPane sp = new JScrollPane(clientsTable);
		sp.setBounds(20, 50, 360, 360);
		sp.setVisible(true);
		Archive.add(sp);
		
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
		spGroup.setBounds(620, 270, 200, 220);
		spGroup.setVisible(true);
		Archive.add(spGroup);
		
		Object[][] data2 = getInd(id);
		String[] columnNames2 = {"Date","Counselor"};
		individual = new MyTableModel(data2, columnNames2);
		individualTable = new JTable(individual);
		individualTable.setFont(new Font("Verdana", Font.PLAIN, 13));
		individualTable.setGridColor(Color.LIGHT_GRAY);
		individualTable.setFillsViewportHeight(true);
		individualTable.getColumnModel().getColumn(0).setWidth(10);
		individualTable.getColumnModel().getColumn(1).setWidth(40);
		JScrollPane spInd = new JScrollPane(individualTable);
		spInd.setBounds(400, 270, 200, 220);
		spInd.setVisible(true);
		Archive.add(spInd);
		
		JButton btnViewInd = new JButton("View");
		btnViewInd.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				selectedDate = (String)individual.getValueAt(individualTable.getSelectedRow(),0);
				new ViewArcIndividualNote(id, selectedDate);
			}
		});
		btnViewInd.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewInd.setBounds(450, 500, 100, 29);
		Archive.add(btnViewInd);
		
		JButton btnViewGroup = new JButton("View");
		btnViewGroup.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{new viewGroupNote();}});
		btnViewGroup.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnViewGroup.setBounds(670, 500, 100, 29);
		Archive.add(btnViewGroup);
		
		JLabel lblIndividualNotes = new JLabel("Individual Notes");
		lblIndividualNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblIndividualNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndividualNotes.setBounds(400, 240, 200, 16);
		Archive.add(lblIndividualNotes);
		
		JLabel lblGroupNotes = new JLabel("Group Notes");
		lblGroupNotes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblGroupNotes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGroupNotes.setBounds(620, 240, 200, 16);
		Archive.add(lblGroupNotes);
		
		JButton btnViewprintForms = new JButton("View/Print Forms");
		btnViewprintForms.setBounds(220, 420, 160, 29);
		Archive.add(btnViewprintForms);
		
		//JButton btnDischarge = new JButton("Search");
		//btnDischarge.setBounds(220, 420, 160, 29);
		//Archive.add(btnDischarge);
		
		lblCID = new JLabel();
		lblCID.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCID.setBounds(550, 40, 200, 16);
		Archive.add(lblCID);
		
		lblCName = new JLabel();
		lblCName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCName.setBounds(550, 70, 200, 16);
		Archive.add(lblCName);
		
		lblCPhone = new JLabel();
		lblCPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCPhone.setBounds(550, 100, 200, 16);
		Archive.add(lblCPhone);
		
		lblECName = new JLabel();
		lblECName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblECName.setBounds(550, 140, 200, 16);
		Archive.add(lblECName);
		
		lblECPhone = new JLabel();
		lblECPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblECPhone.setBounds(550, 170, 200, 16);
		Archive.add(lblECPhone);

		//add items such as buttons etc
		
		
		Admin.setVisible(true);
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Admin;
	}

	//This will fill the object array with the data from the the existing users
	private Object[][] getExisting() 
	{
		//Object[][] data = {{12342,"Clint Eastwood"},{23423,"Will Clark"},{34454,"Barry Bonds"},{34552,"Derek Jeter"}};
		//return data;
		try {
			int size = test3.getSize("Archived_Records");
		
		Object[][] data = new Object[size][2];
		for (int i = 1; i <= size; i++){
			data[i-1] = test3.getArchiveInfo(i - 1, 1);
		}
		System.out.println("rows in Archived_Records: " + test3.getSize("USERS"));
		return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No", "data", "base", "Connected"}};
			return data;
		}
	}
	private Object[][] getUsers()
	{
		//Object[][] data = {{12342,"users1", "Clint Eastwood", "no"}};
		//return data;
		try {
			int size = test3.getSize("USERS");
		
		Object[][] data = new Object[size][4];
		for (int i = 1; i <= size; i++){
			data[i-1] = test3.getUSERSRows(i - 1, 1);
		}
		System.out.println("rows in USERS: " + test3.getSize("USERS"));
		return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No", "data", "base", "Connected"}};
			return data;
		}
	}
	
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
	
	private String getClientName(int id){
		try {
		return test3.getArcName(id);
		}
		catch(NullPointerException e) {
			return "";
		}
	}
	private String getClientPhone(int id){
		try {
		return test3.getArcPhone(id);
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
	
}

		//past this into a class the panel that contains this panel, if you are unsure don't do anything with this!!!!!!!!
		//Admin pane = new Admin(); //this creates a new object	
		//pane.buildPanel();	//This builds the object
		//JComponent p = pane.getPanel(); //this creates a local version
		//panel.add(p); //this adds it to the current panel