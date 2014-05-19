import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.Font;


//this class contains the most vital GUI component. it manages the overall navigation for the user. The goal is to limit the depth the 
//user must travel in a program to improve their experience and ease of use.
public class MainWindow
{
	private JPanel panel;
	private JPanel menu;
	private JPanel menu_1;
	private JPanel card;
	JButton btnLogs;
	JButton btnExisting;
	JButton btnIntake;
	JButton btnArchive;
	JButton btnExit;
	private int userid;
	private int access;
	CardLayout cl = new CardLayout();
	private JButton btnPreferences;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel(int id2, int admin2) //this class is an unnamed constructor and is perfect for manipulation of GUI objects
	{
		//here are the objects we use to navigate this window
		userid = id2;
		access = admin2;
		panel = new JPanel();
		panel.setRequestFocusEnabled(false);
		menu = new JPanel();
		card = new JPanel();
		
		//here we set the defaults for the main window 
		panel.setLayout(null);
		panel.setFocusable(false);
		panel.setFocusTraversalKeysEnabled(false);
		panel.setPreferredSize(new Dimension(904, 640));
		panel.setSize(1004, 730);
		
		//create the 1 layer deep panels
		ExistingClient ec = new ExistingClient();
		NewClient nc = new NewClient();
		Log log = new Log();
		Admin admin = new Admin();
		Preferences pref = new Preferences();

		//here we are building the card layout that is navigated by the menu
		card.setLayout(cl);
		card.setPreferredSize(new Dimension(904, 640));
		card.setSize(904, 650);
		card.setLocation(120, 80);
		
		nc.buildPanel(userid, access);
		JPanel n = (JPanel) nc.getPanel();
		card.add(n, "1");
		
		ec.buildPanel(userid, access);
		JPanel e = (JPanel) ec.getPanel();
		card.add(e, "2");
			
		log.buildPanel(userid, access);	//This builds the object
		JPanel l = (JPanel) log.getPanel(); //this creates a local version
		card.add(l, "3"); //this adds it to the current panel
		
		admin.buildPanel(userid, access);
		JPanel ad = (JPanel) admin.getPanel();
		card.add(ad, "4");
		
		pref.buildPanel();
		JPanel prefPane = (JPanel) pref.getPanel();
		card.add(prefPane, "5");
		
		panel.add(card);
		panel.setVisible(true);
		cl.show(card, "1");
		
		
		
		
		
		//here is the menu object that is used to navigate the card object and the various GUI objects
		menu_1 = new JPanel();
		menu_1.setBorder((Border) new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		menu_1.setLayout(null);
		menu_1.setSize(120, 640);
		btnExisting = new JButton("Existing");
		btnExisting.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnExisting.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{ cl.show(card, "2");}								//this shows the card based on user selection
		});
		btnExisting.setBounds(5, 145, 110, 70);
		menu_1.add(btnExisting);
		
		btnLogs = new JButton("Logs");
		btnLogs.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnLogs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{cl.show(card, "3");}
		});
		btnLogs.setBounds(5, 230, 110, 70);
		menu_1.add(btnLogs);
		
		btnIntake = new JButton("New");
		btnIntake.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnIntake.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{cl.show(card, "1");}								//this shows the card based on user selection
		});
		btnIntake.setBounds(5, 60, 110, 70);
		menu_1.add(btnIntake);
		
		btnArchive = new JButton("Admin");
		btnArchive.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnArchive.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{cl.show(card, "4");}
		});
		btnArchive.setBounds(5, 315, 110, 70);
		menu_1.add(btnArchive);
		
		btnExit = new JButton("Logout");
		btnExit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {System.exit(0);}//this exits the program
		});
		btnExit.setBounds(5, 485, 110, 70);
		menu_1.add(btnExit);
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBounds(0, 30, 120, 16);
		menu_1.add(lblMenu);
		panel.add(menu_1);
		menu_1.setLocation(0, 80);
		
		btnPreferences = new JButton("Setup");
		btnPreferences.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{cl.show(card, "5");}
		});
		btnPreferences.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnPreferences.setBounds(5, 400, 110, 70);
		menu_1.add(btnPreferences);

		if (access == 0){
			btnArchive.setVisible(false);
			btnPreferences.setVisible(false);
		}
		//and finally set it to visible
		panel.setVisible(true);
	}
	
	//this is used to return the panel as a component
	public JComponent getPanel()
	{
		return panel;
	}
	
	
}
