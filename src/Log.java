import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SpinnerListModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;


public class Log
{
	private JPanel Log;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	
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
		
		JLabel numOfSuccesses = new JLabel("Successful:");
		numOfSuccesses.setHorizontalAlignment(SwingConstants.RIGHT);
		numOfSuccesses.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfSuccesses.setBounds(10, 120, 290, 20);
		clinicTraffic.add(numOfSuccesses);
		
		JLabel numOfUnsuccesses = new JLabel("Unsuccessful:");
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
		
		JLabel numOfIntakes = new JLabel("30");
		numOfIntakes.setHorizontalAlignment(SwingConstants.LEFT);
		numOfIntakes.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfIntakes.setBounds(310, 40, 50, 20);
		clinicTraffic.add(numOfIntakes);
		
		JLabel label_19 = new JLabel("17");
		label_19.setHorizontalAlignment(SwingConstants.LEFT);
		label_19.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_19.setBounds(310, 80, 50, 20);
		clinicTraffic.add(label_19);
		
		JLabel label_20 = new JLabel("17");
		label_20.setHorizontalAlignment(SwingConstants.LEFT);
		label_20.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_20.setBounds(310, 120, 50, 20);
		clinicTraffic.add(label_20);
		
		JLabel label_21 = new JLabel("0");
		label_21.setHorizontalAlignment(SwingConstants.LEFT);
		label_21.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_21.setBounds(310, 160, 50, 20);
		clinicTraffic.add(label_21);
		
		JLabel label_22 = new JLabel("30");
		label_22.setHorizontalAlignment(SwingConstants.LEFT);
		label_22.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_22.setBounds(310, 200, 50, 20);
		clinicTraffic.add(label_22);
		
		JLabel label_23 = new JLabel("23");
		label_23.setHorizontalAlignment(SwingConstants.LEFT);
		label_23.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_23.setBounds(310, 240, 50, 20);
		clinicTraffic.add(label_23);
		
		JLabel label_24 = new JLabel("54");
		label_24.setHorizontalAlignment(SwingConstants.LEFT);
		label_24.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_24.setBounds(310, 280, 50, 20);
		clinicTraffic.add(label_24);
		
		JPanel age = new JPanel();
		demographics.addTab("Age", null, age, null);
		age.setLayout(null);
		
		JLabel label = new JLabel("18-25:\r\n");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Verdana", Font.PLAIN, 13));
		label.setBounds(10, 40, 290, 20);
		age.add(label);
		
		JLabel label_1 = new JLabel("26-35:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_1.setBounds(10, 80, 290, 20);
		age.add(label_1);
		
		JLabel label_3 = new JLabel("36-45:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_3.setBounds(10, 120, 290, 20);
		age.add(label_3);
		
		JLabel label_4 = new JLabel("46-55:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_4.setBounds(10, 160, 290, 20);
		age.add(label_4);
		
		JLabel label_5 = new JLabel("56-65:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_5.setBounds(10, 200, 290, 20);
		age.add(label_5);
		
		JLabel label_6 = new JLabel("66+:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_6.setBounds(10, 240, 290, 20);
		age.add(label_6);
		
		JLabel label_25 = new JLabel("51");
		label_25.setHorizontalAlignment(SwingConstants.LEFT);
		label_25.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_25.setBounds(310, 40, 30, 20);
		age.add(label_25);
		
		JLabel label_26 = new JLabel("51");
		label_26.setHorizontalAlignment(SwingConstants.LEFT);
		label_26.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_26.setBounds(310, 80, 30, 20);
		age.add(label_26);
		
		JLabel label_27 = new JLabel("51");
		label_27.setHorizontalAlignment(SwingConstants.LEFT);
		label_27.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_27.setBounds(310, 120, 30, 20);
		age.add(label_27);
		
		JLabel label_28 = new JLabel("51");
		label_28.setHorizontalAlignment(SwingConstants.LEFT);
		label_28.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_28.setBounds(310, 160, 30, 20);
		age.add(label_28);
		
		JLabel label_29 = new JLabel("51");
		label_29.setHorizontalAlignment(SwingConstants.LEFT);
		label_29.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_29.setBounds(310, 200, 30, 20);
		age.add(label_29);
		
		JLabel label_30 = new JLabel("51");
		label_30.setHorizontalAlignment(SwingConstants.LEFT);
		label_30.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_30.setBounds(310, 240, 30, 20);
		age.add(label_30);
		
		
		
		
		
		JPanel race = new JPanel();
		demographics.addTab("Race", null, race, null);
		race.setLayout(null);
		
		JLabel label_7 = new JLabel("Asian:");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_7.setBounds(10, 40, 290, 20);
		race.add(label_7);
		
		JLabel label_8 = new JLabel("Black/African American:");
		label_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(10, 80, 290, 20);
		race.add(label_8);
		
		JLabel label_9 = new JLabel("Hispanic/Latino:");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_9.setBounds(10, 120, 290, 20);
		race.add(label_9);
		
		JLabel label_10 = new JLabel("Native Hawaiian/Pacific  Islander:");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_10.setBounds(10, 160, 290, 20);
		race.add(label_10);
		
		JLabel label_11 = new JLabel("White:");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_11.setBounds(10, 200, 290, 20);
		race.add(label_11);
		
		JLabel label_12 = new JLabel("Two or more:");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_12.setBounds(10, 240, 290, 20);
		race.add(label_12);
		
		JLabel label_13 = new JLabel("Unknown or decline to state:");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_13.setBounds(10, 280, 290, 20);
		race.add(label_13);
		
		JLabel label_31 = new JLabel("72");
		label_31.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_31.setBounds(310, 40, 30, 20);
		race.add(label_31);
		
		JLabel label_32 = new JLabel("72");
		label_32.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_32.setBounds(310, 280, 30, 20);
		race.add(label_32);
		
		JLabel label_33 = new JLabel("72");
		label_33.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_33.setBounds(310, 240, 30, 20);
		race.add(label_33);
		
		JLabel label_34 = new JLabel("72");
		label_34.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_34.setBounds(310, 200, 30, 20);
		race.add(label_34);
		
		JLabel label_35 = new JLabel("72");
		label_35.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_35.setBounds(310, 80, 30, 20);
		race.add(label_35);
		
		JLabel label_36 = new JLabel("72");
		label_36.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_36.setBounds(310, 120, 30, 20);
		race.add(label_36);
		
		JLabel label_37 = new JLabel("72");
		label_37.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_37.setBounds(310, 160, 30, 20);
		race.add(label_37);
		
		JPanel financial = new JPanel();
		demographics.addTab("Financial", null, financial, null);
		financial.setLayout(null);
		
		JLabel label_14 = new JLabel("Private:");
		label_14.setHorizontalAlignment(SwingConstants.RIGHT);
		label_14.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_14.setBounds(10, 40, 290, 20);
		financial.add(label_14);
		
		JLabel label_15 = new JLabel("Indigent:");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_15.setBounds(10, 80, 290, 20);
		financial.add(label_15);
		
		JLabel label_16 = new JLabel("Drug court:");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_16.setBounds(10, 120, 290, 20);
		financial.add(label_16);
		
		JLabel label_17 = new JLabel("AB109:");
		label_17.setHorizontalAlignment(SwingConstants.RIGHT);
		label_17.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_17.setBounds(10, 160, 290, 20);
		financial.add(label_17);
		
		JLabel label_18 = new JLabel("CPS:");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_18.setBounds(10, 200, 290, 20);
		financial.add(label_18);
		
		JLabel label_38 = new JLabel("72");
		label_38.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_38.setBounds(310, 40, 30, 20);
		financial.add(label_38);
		
		JLabel label_39 = new JLabel("72");
		label_39.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_39.setBounds(310, 80, 30, 20);
		financial.add(label_39);
		
		JLabel label_40 = new JLabel("72");
		label_40.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_40.setBounds(310, 120, 30, 20);
		financial.add(label_40);
		
		JLabel label_41 = new JLabel("72");
		label_41.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_41.setBounds(310, 160, 30, 20);
		financial.add(label_41);
		
		JLabel label_42 = new JLabel("72");
		label_42.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_42.setBounds(310, 200, 30, 20);
		financial.add(label_42);
		
		JPanel client_Log = new JPanel();
		tabbedPane.addTab("Client Log", null, client_Log, null);
		client_Log.setLayout(null);
		
		JLabel sortBy = new JLabel("Sort By:");
		sortBy.setFont(new Font("Verdana", Font.PLAIN, 13));
		sortBy.setHorizontalAlignment(SwingConstants.RIGHT);
		sortBy.setBounds(25, 25, 70, 20);
		client_Log.add(sortBy);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Verdana", Font.PLAIN, 11));
		spinner.setModel(new SpinnerListModel(new String[] {"Name", "ID #", "Intake Date", "Exit Date", "# of Days ", "DOB", "Age", "Gender", "Race", "Funder", "Counter", "S/U"}));
		spinner.setBounds(105, 25, 94, 20);
		client_Log.add(spinner);
		
		
		table_2 = new JTable();
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Name", "ID #", "Intake Date", "Exit Date", "# of Days", "DOB", "Age", "Gender", "Race", "Funder", "County", "S/U"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.setBounds(16, 109, 720, 352);
		client_Log.add(table_2);
		
		JLabel label_43 = new JLabel("Name");
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setFont(new Font("Verdana", Font.PLAIN, 10));
		label_43.setBounds(16, 84, 60, 14);
		client_Log.add(label_43);
		
		JLabel label_44 = new JLabel("ID#");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("Verdana", Font.PLAIN, 10));
		label_44.setBounds(76, 84, 60, 14);
		client_Log.add(label_44);
		
		JLabel lblIntakendate = new JLabel("Intake");
		lblIntakendate.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntakendate.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblIntakendate.setBounds(139, 84, 60, 14);
		client_Log.add(lblIntakendate);
		
		JLabel lblIntake = new JLabel("Exit");
		lblIntake.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntake.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblIntake.setBounds(196, 84, 60, 14);
		client_Log.add(lblIntake);
		
		JLabel lblOfDays = new JLabel("# of");
		lblOfDays.setHorizontalAlignment(SwingConstants.CENTER);
		lblOfDays.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblOfDays.setBounds(256, 84, 60, 14);
		client_Log.add(lblOfDays);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblDob.setBounds(316, 84, 60, 14);
		client_Log.add(lblDob);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblAge.setBounds(376, 84, 60, 14);
		client_Log.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblGender.setBounds(436, 84, 60, 14);
		client_Log.add(lblGender);
		
		JLabel lblRace = new JLabel("Race");
		lblRace.setHorizontalAlignment(SwingConstants.CENTER);
		lblRace.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblRace.setBounds(496, 84, 60, 14);
		client_Log.add(lblRace);
		
		JLabel lblFunder = new JLabel("Funder");
		lblFunder.setHorizontalAlignment(SwingConstants.CENTER);
		lblFunder.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblFunder.setBounds(556, 84, 60, 14);
		client_Log.add(lblFunder);
		
		JLabel lblCounty = new JLabel("County");
		lblCounty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCounty.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblCounty.setBounds(616, 84, 60, 14);
		client_Log.add(lblCounty);
		
		JLabel lblSu = new JLabel("S/U");
		lblSu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSu.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblSu.setBounds(676, 84, 60, 14);
		client_Log.add(lblSu);
		
		JLabel lblDate = new JLabel("date");
		lblDate.setVerticalAlignment(SwingConstants.TOP);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblDate.setBounds(139, 96, 60, 14);
		client_Log.add(lblDate);
		
		JLabel lblDate_1 = new JLabel("date");
		lblDate_1.setVerticalAlignment(SwingConstants.TOP);
		lblDate_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblDate_1.setBounds(196, 96, 60, 14);
		client_Log.add(lblDate_1);
		
		JLabel lblDays = new JLabel("days");
		lblDays.setVerticalAlignment(SwingConstants.TOP);
		lblDays.setHorizontalAlignment(SwingConstants.CENTER);
		lblDays.setFont(new Font("Verdana", Font.PLAIN, 10));
		lblDays.setBounds(256, 96, 60, 14);
		client_Log.add(lblDays);
		
		
		

		//add items such as buttons etc
		
		
		Log.setVisible(true);
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Log;
	}
}