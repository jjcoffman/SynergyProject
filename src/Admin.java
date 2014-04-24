import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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
		tabbedPane.addTab("Manage Users", null, ManageUsers, null);
		
		JPanel Archive = new JPanel();
		tabbedPane.addTab("Archive", null, Archive, null);
		

		//add items such as buttons etc
		
		
		Admin.setVisible(true);
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Admin;
	}
}

		//past this into a class the panel that contains this panel, if you are unsure don't do anything with this!!!!!!!!
		//Admin pane = new Admin(); //this creates a new object	
		//pane.buildPanel();	//This builds the object
		//JComponent p = pane.getPanel(); //this creates a local version
		//panel.add(p); //this adds it to the current panel