import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;


public class Log
{
	private JPanel Log;
	private JTable table;
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	/**							
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()  //NOT A CONSTRUCTOR!
	{
		Log = new JPanel();
		Log.setSize(904,640);
		Log.setLayout(null);
		
		JLabel label = new JLabel("Start date: ");
		label.setBounds(66, 56, 200, 50);
		Log.add(label);
		
		
		

		//add items such as buttons etc
		
		
		Log.setVisible(true);
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Log;
	}

}

	
		
