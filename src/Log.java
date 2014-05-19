import java.awt.Font;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Log
{
	private JPanel Log;
	private JTable table;
	private JTable table_2;
	private MyTableModel existing;
	SQLRetrieveInfo test = new SQLRetrieveInfo();
	SQLSetInfo test2 = new SQLSetInfo();
	private JTextField txtStart;
	private JTextField txtEnd;
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Date date = new Date();
	protected Date dateStart;
	protected Date dateEnd;
	private int tableSize;
	private Object[][] data;
	private JLabel lblIntakes;
	private JLabel lblDischarge;
	private JLabel lblSuccessful;
	private JLabel lblUnsuccessful;
	private JLabel lblClientsServed;
	private JLabel lblAvgDays;
	private JLabel lblCurrentTotal;
	private JLabel lbl18to25;
	private JLabel lbl26to35;
	private JLabel lbl46to55;
	private JLabel lbl56to65;
	private JLabel lbl66up;
	private JLabel lbl36to45;
	private JLabel lblPrivate;
	private JLabel lblIndigent;
	private JLabel lblDrugCourt;
	private JLabel lblAB109;
	private JLabel lblCPS;
	private int userid;
	private int access;
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	/**							
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel(int id2, int admin2)  //NOT A CONSTRUCTOR!
	{
		userid = id2;
		access = admin2;
		Log = new JPanel();
		Log.setSize(904,640);
		Log.setLayout(null);

		JLabel startDate = new JLabel("Start date: ");
		startDate.setFont(new Font("Verdana", Font.PLAIN, 13));
		startDate.setBounds(38, 11, 114, 50);
		Log.add(startDate);

		txtStart = new JTextField();
		txtStart.setBounds(126, 23, 134, 28);
		txtStart.setFont(new Font("Verdana", Font.PLAIN, 13));
		Log.add(txtStart);
		txtStart.setColumns(10);

		JLabel numOfintakes = new JLabel("End date: ");
		numOfintakes.setFont(new Font("Verdana", Font.PLAIN, 13));
		numOfintakes.setBounds(363, 11, 114, 50);
		Log.add(numOfintakes);



		txtEnd = new JTextField();
		txtEnd.setBounds(438, 23, 134, 28);
		txtEnd.setFont(new Font("Verdana", Font.PLAIN, 13));
		Log.add(txtEnd);
		txtEnd.setColumns(10);


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

		lblIntakes = new JLabel("30");
		lblIntakes.setHorizontalAlignment(SwingConstants.LEFT);
		lblIntakes.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblIntakes.setBounds(310, 40, 50, 20);
		clinicTraffic.add(lblIntakes);

		lblDischarge = new JLabel("17");
		lblDischarge.setHorizontalAlignment(SwingConstants.LEFT);
		lblDischarge.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDischarge.setBounds(310, 80, 50, 20);
		clinicTraffic.add(lblDischarge);

		lblSuccessful = new JLabel("17");
		lblSuccessful.setHorizontalAlignment(SwingConstants.LEFT);
		lblSuccessful.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSuccessful.setBounds(310, 120, 50, 20);
		clinicTraffic.add(lblSuccessful);

		lblUnsuccessful = new JLabel("0");
		lblUnsuccessful.setHorizontalAlignment(SwingConstants.LEFT);
		lblUnsuccessful.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblUnsuccessful.setBounds(310, 160, 50, 20);
		clinicTraffic.add(lblUnsuccessful);

		lblClientsServed = new JLabel("30");
		lblClientsServed.setHorizontalAlignment(SwingConstants.LEFT);
		lblClientsServed.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblClientsServed.setBounds(310, 200, 50, 20);
		clinicTraffic.add(lblClientsServed);

		lblAvgDays = new JLabel("23");
		lblAvgDays.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvgDays.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAvgDays.setBounds(310, 240, 50, 20);
		clinicTraffic.add(lblAvgDays);

		lblCurrentTotal = new JLabel("54");
		lblCurrentTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblCurrentTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCurrentTotal.setBounds(310, 280, 50, 20);
		clinicTraffic.add(lblCurrentTotal);

		JPanel age = new JPanel();
		demographics.addTab("Age", null, age, null);
		age.setLayout(null);

		JLabel label_0 = new JLabel("18-25:");
		label_0.setHorizontalAlignment(SwingConstants.RIGHT);
		label_0.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_0.setBounds(132, 40, 168, 20);
		age.add(label_0);

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

		lbl18to25 = new JLabel("51");
		lbl18to25.setHorizontalAlignment(SwingConstants.LEFT);
		lbl18to25.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbl18to25.setBounds(310, 40, 30, 20);
		age.add(lbl18to25);

		lbl26to35 = new JLabel("51");
		lbl26to35.setHorizontalAlignment(SwingConstants.LEFT);
		lbl26to35.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbl26to35.setBounds(310, 80, 30, 20);
		age.add(lbl26to35);

		lbl36to45 = new JLabel("51");
		lbl36to45.setHorizontalAlignment(SwingConstants.LEFT);
		lbl36to45.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbl36to45.setBounds(310, 120, 30, 20);
		age.add(lbl36to45);

		lbl46to55 = new JLabel("51");
		lbl46to55.setHorizontalAlignment(SwingConstants.LEFT);
		lbl46to55.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbl46to55.setBounds(310, 160, 30, 20);
		age.add(lbl46to55);

		lbl56to65 = new JLabel("51");
		lbl56to65.setHorizontalAlignment(SwingConstants.LEFT);
		lbl56to65.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbl56to65.setBounds(310, 200, 30, 20);
		age.add(lbl56to65);

		lbl66up = new JLabel("51");
		lbl66up.setHorizontalAlignment(SwingConstants.LEFT);
		lbl66up.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbl66up.setBounds(310, 240, 30, 20);
		age.add(lbl66up);



		//where Race was added, but removed due to never being captured

		

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

		lblPrivate = new JLabel("72");
		lblPrivate.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPrivate.setBounds(310, 40, 30, 20);
		financial.add(lblPrivate);

		lblIndigent = new JLabel("72");
		lblIndigent.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblIndigent.setBounds(310, 80, 30, 20);
		financial.add(lblIndigent);

		lblDrugCourt = new JLabel("72");
		lblDrugCourt.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDrugCourt.setBounds(310, 120, 30, 20);
		financial.add(lblDrugCourt);

		lblAB109 = new JLabel("72");
		lblAB109.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAB109.setBounds(310, 160, 30, 20);
		financial.add(lblAB109);

		lblCPS = new JLabel("72");
		lblCPS.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCPS.setBounds(310, 200, 30, 20);
		financial.add(lblCPS);

		JPanel client_Log = new JPanel();
		tabbedPane.addTab("Client Log", null, client_Log, null);
		client_Log.setLayout(null);

		JLabel sortBy = new JLabel("Sort By:");
		sortBy.setFont(new Font("Verdana", Font.PLAIN, 13));
		sortBy.setHorizontalAlignment(SwingConstants.RIGHT);
		sortBy.setVisible(false);
		sortBy.setBounds(25, 25, 70, 20);
		client_Log.add(sortBy);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Verdana", Font.PLAIN, 11));
		spinner.setModel(new SpinnerListModel(new String[] {"Name", "ID #", "Intake Date", "Exit Date", "# of Days ", "DOB", "Age", "Gender", "Race", "Funder", "Counter", "S/U"}));
		spinner.setBounds(105, 25, 94, 20);
		spinner.setVisible(false);
		client_Log.add(spinner);

		JButton btnSubmit = new JButton("Submit");

		//this checks to ensure that the format entered matches the date format required
		btnSubmit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				updateTable();


			}



		});
		btnSubmit.setBounds(663, 24, 117, 29);
		Log.add(btnSubmit);



		data = getExisting();
		String[] columnNames = {"Name", "ID #", "Intake Date", "Exit Date", "# of Days", "DOB", "Age", "Gender", "Funder", "County", "S/U"};
		existing = new MyTableModel(data, columnNames);
		table_2 = new JTable(existing);
		table_2.getModel().addTableModelListener(table);
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		table_2.setGridColor(Color.LIGHT_GRAY);
		table_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table_2.getColumnModel().getColumn(0).setMinWidth(100);
		table_2.getColumnModel().getColumn(1).setMaxWidth(50);
		table_2.getColumnModel().getColumn(2).setMinWidth(80);
		table_2.getColumnModel().getColumn(3).setMinWidth(80);
		table_2.getColumnModel().getColumn(4).setMaxWidth(60);
		table_2.getColumnModel().getColumn(5).setMinWidth(80);
		table_2.getColumnModel().getColumn(6).setMaxWidth(30);
		table_2.getColumnModel().getColumn(7).setMaxWidth(50);
		table_2.getColumnModel().getColumn(8).setMinWidth(50);
		table_2.getColumnModel().getColumn(9).setMinWidth(50);
		table_2.getColumnModel().getColumn(10).setMinWidth(50);
		
		table_2.setFillsViewportHeight(true);
		JScrollPane sp = new JScrollPane(table_2);
		sp.setBounds(16, 20, 800, 450);
		sp.setVisible(true);
		client_Log.add(sp);



		demographicsUpdate(data, tableSize);



		//add items such as buttons etc


		Log.setVisible(true);
	}

	protected void updateTable() 
	{
		int deletedRows = 0;
		if(txtStart.getText().equals("") && txtEnd.getText().equals(""))
		{
			data = getExisting();
			existing.update(data);
			
			demographicsUpdate(data, tableSize);
			
		}
		else
		{

			Calendar cal1 = new GregorianCalendar();
			Calendar cal2 = new GregorianCalendar();
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Date date = null;
			Date date2 = null;
			try {
				date = sdf.parse(txtStart.getText());
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			cal1.setTime(date);
			try {
				date2 = sdf.parse(txtEnd.getText());
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
			cal2.setTime(date2);

			for(int i = 0; i < tableSize-deletedRows; i++)
			{
				Date comp = null;
				Date comp2 = null;
				try {
					comp = sdf.parse(data[i][2].toString());
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				try {
					comp2 = sdf.parse(data[i][3].toString());
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				int q = i;
				//comp is the intake date
				if(daysBetween(cal2.getTime(),comp) > 0)
				{
					for( ; q < tableSize-1; q++)
					{
						data[q][0] = data[q+1][0];
						data[q][1] = data[q+1][1];
						data[q][2] = data[q+1][2];
						data[q][3] = data[q+1][3];
						data[q][4] = data[q+1][4];
						data[q][5] = data[q+1][5];
						data[q][6] = data[q+1][6];
						data[q][7] = data[q+1][7];
						data[q][8] = data[q+1][8];
						data[q][9] = data[q+1][9];
						data[q][10] = data[q+1][10];
					}
					deletedRows++;
				}
				//comp2 is the discharge date
				
				else if(daysBetween(cal1.getTime(),comp2) < 0)
				{
					for( ; q < tableSize-1; q++)
					{
						data[q][0] = data[q+1][0];
						data[q][1] = data[q+1][1];
						data[q][2] = data[q+1][2];
						data[q][3] = data[q+1][3];
						data[q][4] = data[q+1][4];
						data[q][5] = data[q+1][5];
						data[q][6] = data[q+1][6];
						data[q][7] = data[q+1][7];
						data[q][8] = data[q+1][8];
						data[q][9] = data[q+1][9];
						data[q][10] = data[q+1][10];						
					}
					deletedRows++;
				}
			}
			deletedRows = tableSize - deletedRows;
			Object[][] newData = new Object[deletedRows][11];
			for(int r = 0; r < deletedRows;r++)
			{
				newData[r][0] = data[r][0];
				newData[r][1] = data[r][1];
				newData[r][2] = data[r][2];
				newData[r][3] = data[r][3];
				newData[r][4] = data[r][4];
				newData[r][5] = data[r][5];
				newData[r][6] = data[r][6];
				newData[r][7] = data[r][7];
				newData[r][8] = data[r][8];
				newData[r][9] = data[r][9];
				newData[r][10] = data[r][10];
			}
			existing.update(newData);
			demographicsUpdate(newData, deletedRows);
		}
		
	}

	protected void demographicsUpdate(Object[][] d, int size) 
	{
		
		//"Name", "ID #", "Intake Date", "Exit Date", "# of Days", "DOB", "Age", "Gender", "Funder", "County", "S/U"
		int intakes = 0;
		int discharge = 0;
		int success = 0;
		int unsuccess = 0;
		int avgDays = 0;
		int currentTotal = 0;
		int to25 = 0;
		int to35 = 0;
		int to45 = 0;
		int to55 = 0;
		int to65 = 0;
		int plus = 0;
		int priv = 0;
		int indigent = 0;
		int drugCourt = 0;
		int ab109 = 0;
		int cps = 0;
		
		lblClientsServed.setText(String.valueOf(size)); 
		for(int i = 0; i < size; i++)
		{
			//intakes will have to be archive + current + pending
			try
			{
			if(!(d[i][3] == ""))
				discharge++;
			if((d[i][10].equals("Success")))
				success++;
			else if((d[i][10].equals("Fail")))
				unsuccess++;
			int x = (int) d[i][4];
			avgDays = avgDays + x;
			if((Integer)d[i][6] < 25)
				to25++;
			else if((Integer)d[i][6] < 35)
				to35++;
			else if((Integer)d[i][6] < 45)
				to45++;
			else if((Integer)d[i][6] < 55)
				to55++;
			else if((Integer)d[i][6] < 65)
				to65++;
			else
				plus++;
			currentTotal = intakes;
			
			if(String.valueOf(d[i][8]).equals("Private"))
				priv++;
			else if(String.valueOf(d[i][8]).equals("Indigent"))
				indigent++;
			else if(String.valueOf(d[i][8]).equals("DrugCourt"))
				drugCourt++;
			else if(String.valueOf(d[i][8]).equals("AB109"))
				ab109++;
			else if(String.valueOf(d[i][8]).equals("CPS"))
				cps++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ARRAY SIZE ERROR");
			}
			
		}
		
		try 
		{
			intakes = size + test.getSize("Phone_Intake") + test.getSize("Client_Record");
		System.out.println("rows in Phone_Intake: " + test.getSize("Phone_Intake"));
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!!!!");
		}
		
		
		if(size != 0)
			avgDays = avgDays/size;
		else
			avgDays = 0;
		lblIntakes.setText(String.valueOf(intakes));
		lblDischarge.setText(String.valueOf(discharge));
		lblSuccessful.setText(String.valueOf(success));
		lblUnsuccessful.setText(String.valueOf(unsuccess));
		lblAvgDays.setText(String.valueOf(avgDays));
		lblCurrentTotal.setText(String.valueOf(currentTotal));
		lbl18to25.setText(String.valueOf(to25));
		lbl26to35.setText(String.valueOf(to35));
		lbl36to45.setText(String.valueOf(to45));
		lbl46to55.setText(String.valueOf(to55));
		lbl56to65.setText(String.valueOf(to65));
		lbl66up.setText(String.valueOf(plus));
		lblPrivate.setText(String.valueOf(priv));
		lblIndigent.setText(String.valueOf(indigent));
		lblAB109.setText(String.valueOf(ab109));
		lblDrugCourt.setText(String.valueOf(drugCourt));
		lblCPS.setText(String.valueOf(cps));
		
		//
	}
	
	//days between returns
	private int daysBetween(Date time, Date time2) 
	{
		return (int)( (time2.getTime() - time.getTime()) / (1000 * 60 * 60 * 24));
	}



	private Object[][] getExisting()
	{
		//"Name", "ID #", "Intake Date", "Exit Date", "# of Days", "DOB", "Age", "Gender", "Funder", "County", "S/U"
		try {
			tableSize = test.getSize("Archived_Records");
			System.out.println("Archive Records Size: " + tableSize);
			Object[][] data = new Object[tableSize][11];
			for (int i = 0; i < tableSize; i++)
			{
				Object[] results1 = test.getArchiveRows(i, 1);
				data[i][0] = results1[0];
				data[i][1] = results1[1];
				data[i][2] = results1[2];
				data[i][3] = results1[3];
				data[i][4] = results1[4];
				data[i][5] = results1[5];
				data[i][6] = results1[6];
				data[i][7] = results1[7];
				data[i][8] = results1[8];
				data[i][9] = results1[9];
				data[i][10] = results1[10];
			}
			System.out.println("rows in Archived_Records: " + test.getSize("Archived_Records"));
			return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No Data", 0, "", "", 0, "", 0, "", "", "", ""}};
			tableSize = 1;
			return data;
		} 
	}

	public JComponent getPanel() //RETURNS A JCOMPONENT OBJECT, NOT A JPANEL
	{
		return Log;
	}
}