
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Template
{
	private JPanel Template;
	
	
	
	
	
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	/**							
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()  //NOT A CONSTRUCTOR!
	{
		Template = new JPanel();
		Template.setSize(904,640);
		Template.setLayout(null);
		

		//add items such as buttons etc
		
		
		Template.setVisible(true);
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Template;
	}

	
}


		//past this into a class the panel that contains this panel, if you are unsure don't do anything with this!!!!!!!!
		//Template pane = new Template(); //this creates a new object	
		//pane.buildPanel();	//This builds the object
		//JComponent p = pane.getPanel(); //this creates a local version
		//panel.add(p); //this adds it to the current panel