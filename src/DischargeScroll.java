import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DischargeScroll
{
	private Discharge DischargeS;
	private JFrame window;
	private JScrollPane spInd;
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	/**							
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()  //NOT A CONSTRUCTOR!
	{
		DischargeS = new Discharge();
		DischargeS.buildGUI();
		JPanel d = (JPanel) DischargeS.getPanel();
		spInd = new JScrollPane(d);
		spInd.setBounds(441, 271, 190, 234);
		spInd.setVisible(true);
		
		

		//add items such as buttons etc
		
	}

	public DischargeScroll()
	{
		window = new JFrame("Discharge");
		window.add(spInd);
		window.pack();
		window.setVisible(true);
	}

}

		//past this into a class the panel that contains this panel, if you are unsure don't do anything with this!!!!!!!!
		//DischargeScroll pane = new DischargeScroll(); //this creates a new object	
		//pane.buildPanel();	//This builds the object
		//JComponent p = pane.getPanel(); //this creates a local version
		//panel.add(p); //this adds it to the current panel

