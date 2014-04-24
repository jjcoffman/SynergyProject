import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.Box;


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
		
		JLabel startDate = new JLabel("Start date: ");
		startDate.setBounds(10, 11, 64, 50);
		Log.add(startDate);
		
		JLabel numOfintakes = new JLabel("End date: ");
		numOfintakes.setBounds(325, 11, 58, 50);
		Log.add(numOfintakes);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(20, 87, 864, 522);
		Log.add(tabbedPane);
		
		JTabbedPane demographics = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Demographics", null, demographics, null);
		
		JPanel clinicTraffic = new JPanel();
		demographics.addTab("Clinic traffic", null, clinicTraffic, null);
		clinicTraffic.setLayout(null);
		
		JLabel label_2 = new JLabel("Intakes:");
		label_2.setBounds(35, 11, 139, 14);
		clinicTraffic.add(label_2);
		
		JLabel numOfDischarges = new JLabel("Discharges:");
		numOfDischarges.setBounds(35, 36, 90, 14);
		clinicTraffic.add(numOfDischarges);
		
		JLabel numOfSuccesses = new JLabel("Successes:");
		numOfSuccesses.setBounds(35, 61, 112, 14);
		clinicTraffic.add(numOfSuccesses);
		
		JLabel numOfUnsuccesses = new JLabel("Unsuccesses:");
		numOfUnsuccesses.setBounds(35, 86, 90, 14);
		clinicTraffic.add(numOfUnsuccesses);
		
		JLabel numOfClientsServed = new JLabel("Total clients served:");
		numOfClientsServed.setBounds(35, 111, 139, 14);
		clinicTraffic.add(numOfClientsServed);
		
		JLabel meanDaysInTreatment = new JLabel("Mean days spent in treatment:");
		meanDaysInTreatment.setBounds(35, 136, 218, 14);
		clinicTraffic.add(meanDaysInTreatment);
		
		JLabel currentTotal = new JLabel("Current total:");
		currentTotal.setBounds(35, 161, 89, 14);
		clinicTraffic.add(currentTotal);
		
		JPanel age = new JPanel();
		demographics.addTab("Age", null, age, null);
		age.setLayout(null);
		
		JLabel label = new JLabel("18-25:\r\n");
		label.setBounds(35, 11, 100, 14);
		age.add(label);
		
		JLabel label_1 = new JLabel("26-35:");
		label_1.setBounds(35, 36, 46, 14);
		age.add(label_1);
		
		JLabel label_3 = new JLabel("36-45:");
		label_3.setBounds(35, 61, 46, 14);
		age.add(label_3);
		
		JLabel label_4 = new JLabel("46-55:");
		label_4.setBounds(35, 86, 46, 14);
		age.add(label_4);
		
		JLabel label_5 = new JLabel("56-65:");
		label_5.setBounds(35, 111, 46, 14);
		age.add(label_5);
		
		JLabel label_6 = new JLabel("66+:");
		label_6.setBounds(35, 136, 64, 14);
		age.add(label_6);
		
		JPanel race = new JPanel();
		demographics.addTab("Race", null, race, null);
		race.setLayout(null);
		
		JLabel label_7 = new JLabel("Asian:");
		label_7.setBounds(35, 11, 30, 14);
		race.add(label_7);
		
		JLabel label_8 = new JLabel("Black/African American:");
		label_8.setBounds(35, 36, 140, 14);
		race.add(label_8);
		
		JLabel label_9 = new JLabel("Hispanic/Latino:");
		label_9.setBounds(35, 61, 122, 14);
		race.add(label_9);
		
		JLabel label_10 = new JLabel("Native Hawaiian/Pacific  Islander:");
		label_10.setBounds(35, 86, 214, 14);
		race.add(label_10);
		
		JLabel label_11 = new JLabel("White:");
		label_11.setBounds(35, 111, 46, 14);
		race.add(label_11);
		
		JLabel label_12 = new JLabel("Two or more:");
		label_12.setBounds(35, 136, 90, 14);
		race.add(label_12);
		
		JLabel label_13 = new JLabel("Unknown or decline to state:");
		label_13.setBounds(35, 161, 180, 14);
		race.add(label_13);
		
		JPanel financial = new JPanel();
		demographics.addTab("Financial", null, financial, null);
		financial.setLayout(null);
		
		JLabel label_14 = new JLabel("Private:");
		label_14.setBounds(35, 11, 46, 14);
		financial.add(label_14);
		
		JLabel label_15 = new JLabel("Indigent:");
		label_15.setBounds(35, 36, 80, 14);
		financial.add(label_15);
		
		JLabel label_16 = new JLabel("Drug court:");
		label_16.setBounds(35, 61, 68, 14);
		financial.add(label_16);
		
		JLabel label_17 = new JLabel("AB109:\r\n");
		label_17.setBounds(35, 86, 46, 14);
		financial.add(label_17);
		
		JLabel label_18 = new JLabel("CPS:");
		label_18.setBounds(35, 111, 46, 14);
		financial.add(label_18);
		
		JPanel client_Log = new JPanel();
		tabbedPane.addTab("Client Log", null, client_Log, null);
		
		
		

		//add items such as buttons etc
		
		
		Log.setVisible(true);
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Log;
	}
}

	
		
