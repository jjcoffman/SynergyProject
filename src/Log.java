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
import javax.swing.SwingConstants;
import java.awt.Font;


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
		startDate.setFont(new Font("Verdana", Font.PLAIN, 13));
		startDate.setBounds(20, 11, 114, 50);
		Log.add(startDate);
		
		JLabel numOfintakes = new JLabel("End date: ");
		numOfintakes.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfintakes.setBounds(325, 11, 114, 50);
		Log.add(numOfintakes);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Verdana", Font.PLAIN, 13));
		tabbedPane.setBounds(20, 87, 864, 522);
		Log.add(tabbedPane);
		
		JTabbedPane demographics = new JTabbedPane(JTabbedPane.TOP);
		demographics.setFont(new Font("Verdana", Font.PLAIN, 13));
		tabbedPane.addTab("Demographics", null, demographics, null);
		
		JPanel clinicTraffic = new JPanel();
		demographics.addTab("Clinic traffic", null, clinicTraffic, null);
		clinicTraffic.setLayout(null);
		
		JLabel label_2 = new JLabel("Intakes:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_2.setBounds(10, 40, 290, 20);
		clinicTraffic.add(label_2);
		
		JLabel numOfDischarges = new JLabel("Discharges:");
		numOfDischarges.setHorizontalAlignment(SwingConstants.RIGHT);
		numOfDischarges.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfDischarges.setBounds(10, 80, 290, 20);
		clinicTraffic.add(numOfDischarges);
		
		JLabel numOfSuccesses = new JLabel("Successes:");
		numOfSuccesses.setHorizontalAlignment(SwingConstants.RIGHT);
		numOfSuccesses.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfSuccesses.setBounds(10, 120, 290, 20);
		clinicTraffic.add(numOfSuccesses);
		
		JLabel numOfUnsuccesses = new JLabel("Unsuccesses:");
		numOfUnsuccesses.setHorizontalAlignment(SwingConstants.RIGHT);
		numOfUnsuccesses.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfUnsuccesses.setBounds(10, 160, 290, 20);
		clinicTraffic.add(numOfUnsuccesses);
		
		JLabel numOfClientsServed = new JLabel("Total clients served:");
		numOfClientsServed.setHorizontalAlignment(SwingConstants.RIGHT);
		numOfClientsServed.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfClientsServed.setBounds(10, 200, 290, 20);
		clinicTraffic.add(numOfClientsServed);
		
		JLabel meanDaysInTreatment = new JLabel("Mean days spent in treatment:");
		meanDaysInTreatment.setHorizontalAlignment(SwingConstants.RIGHT);
		meanDaysInTreatment.setFont(new Font("Verdana", Font.PLAIN, 13));
		meanDaysInTreatment.setBounds(10, 240, 290, 20);
		clinicTraffic.add(meanDaysInTreatment);
		
		JLabel currentTotal = new JLabel("Current total:");
		currentTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		currentTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
		currentTotal.setBounds(10, 280, 290, 20);
		clinicTraffic.add(currentTotal);
		
		JPanel age = new JPanel();
		demographics.addTab("Age", null, age, null);
		age.setLayout(null);
		
		JLabel label = new JLabel("18-25:\r\n");
		label.setFont(new Font("Verdana", Font.PLAIN, 13));
		label.setBounds(35, 11, 100, 14);
		age.add(label);
		
		JLabel label_1 = new JLabel("26-35:");
		label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_1.setBounds(35, 36, 46, 14);
		age.add(label_1);
		
		JLabel label_3 = new JLabel("36-45:");
		label_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_3.setBounds(35, 61, 46, 14);
		age.add(label_3);
		
		JLabel label_4 = new JLabel("46-55:");
		label_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_4.setBounds(35, 86, 46, 14);
		age.add(label_4);
		
		JLabel label_5 = new JLabel("56-65:");
		label_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_5.setBounds(35, 111, 46, 14);
		age.add(label_5);
		
		JLabel label_6 = new JLabel("66+:");
		label_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_6.setBounds(35, 136, 64, 14);
		age.add(label_6);
		
		JPanel race = new JPanel();
		demographics.addTab("Race", null, race, null);
		race.setLayout(null);
		
		JLabel label_7 = new JLabel("Asian:");
		label_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_7.setBounds(35, 11, 200, 14);
		race.add(label_7);
		
		JLabel label_8 = new JLabel("Black/African American:");
		label_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setBounds(35, 36, 200, 14);
		race.add(label_8);
		
		JLabel label_9 = new JLabel("Hispanic/Latino:");
		label_9.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_9.setBounds(35, 61, 200, 14);
		race.add(label_9);
		
		JLabel label_10 = new JLabel("Native Hawaiian/Pacific  Islander:");
		label_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_10.setBounds(35, 86, 250, 14);
		race.add(label_10);
		
		JLabel label_11 = new JLabel("White:");
		label_11.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_11.setBounds(35, 111, 200, 14);
		race.add(label_11);
		
		JLabel label_12 = new JLabel("Two or more:");
		label_12.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_12.setBounds(35, 136, 200, 14);
		race.add(label_12);
		
		JLabel label_13 = new JLabel("Unknown or decline to state:");
		label_13.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_13.setBounds(35, 161, 250, 14);
		race.add(label_13);
		
		JPanel financial = new JPanel();
		demographics.addTab("Financial", null, financial, null);
		financial.setLayout(null);
		
		JLabel label_14 = new JLabel("Private:");
		label_14.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_14.setBounds(35, 11, 250, 14);
		financial.add(label_14);
		
		JLabel label_15 = new JLabel("Indigent:");
		label_15.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_15.setBounds(35, 36, 250, 14);
		financial.add(label_15);
		
		JLabel label_16 = new JLabel("Drug court:");
		label_16.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_16.setBounds(35, 61, 250, 14);
		financial.add(label_16);
		
		JLabel label_17 = new JLabel("AB109:\r\n");
		label_17.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_17.setBounds(35, 86, 250, 14);
		financial.add(label_17);
		
		JLabel label_18 = new JLabel("CPS:");
		label_18.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_18.setBounds(35, 111, 250, 14);
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

	
		
