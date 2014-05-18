import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Component;
import java.awt.Font;

public class GroupNotes implements ActionListener {
	private JPanel GroupNotes;
	private JTextField monStartTime;
	private JTextField monEndTime;
	private JTextField monKOTopic;
	private JTextArea monKONote;
	private JTextField txtam;
	private JTextField txtpm;
	private JTextField monAMTopic;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField monPMTopic;
	private JTextField tueStartTime;
	private JTextField tueEndTime;
	private JTextField tueKOTopic;
	private JTextField txtam_1;
	private JTextField textField_22;
	private JTextField tueAMTopic;
	private JTextField textField_25;
	private JTextField textField_27;
	private JTextField tuePMTopic;
	private JTextField wedStartTime;
	private JTextField wedEndTime;
	private JTextField wedKOTopic;
	private JTextField txtam_2;
	private JTextField textField_37;
	private JTextField wedAMTopic;
	private JTextField textField_40;
	private JTextField textField_42;
	private JTextField wedPMTopic;
	private JTextField thuStartTime;
	private JTextField thuEndTime;
	private JTextField thuKOTopic;
	private JTextField textField_50;
	private JTextField textField_52;
	private JTextField thuAMTopic;
	private JTextField textField_55;
	private JTextField textField_57;
	private JTextField thuPMTopic;
	private JTextField friStartTime;
	private JTextField friEndTime;
	private JTextField friOKTopic;
	private JTextField textField_65;
	private JTextField textField_67;
	private JTextField friAMTopic;
	private JTextField textField_70;
	private JTextField textField_72;
	private JTextField friPMTopic;
	private JTextField satKOStartTime;
	private JTextField satKOEndTime;
	private JTextField satKOTopic;
	private JTextField textField_80;
	private JTextField textField_82;
	private JTextField satAMTopic;
	private JTextField sunStartTime;
	private JTextField sunEndTime;
	private JTextField sunTopic;
	
	private int CID;
	private String startDate;
	private Object[] data = new Object[100];
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void BuildPanel(int id, String date) 
	{
		TempRetrieveInfo test = new TempRetrieveInfo();
		CID = id;
		startDate = date;
		data = test.getGroupData(CID, startDate);
		GroupNotes = new JPanel();
		GroupNotes.setSize(665, 2200);
		GroupNotes.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Group Notes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 10, 625, 30);
		GroupNotes.add(lblNewLabel);
		
		monStartTime = new JTextField((String)data[4]);
		monStartTime.setHorizontalAlignment(SwingConstants.CENTER);
		monStartTime.setEditable(false);
		monStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		monStartTime.setBounds(180, 40, 100, 28);
		GroupNotes.add(monStartTime);
		monStartTime.setColumns(10);
		
		JLabel lblThursdayKickofftime = new JLabel("Monday Kick-Off/Time");
		lblThursdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayKickofftime.setBounds(20, 40, 160, 28);
		GroupNotes.add(lblThursdayKickofftime);
		
		JLabel lblAm = new JLabel("to");
		lblAm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAm.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAm.setBounds(270, 40, 50, 28);
		GroupNotes.add(lblAm);
		
		monEndTime = new JTextField((String)data[5]);
		monEndTime.setHorizontalAlignment(SwingConstants.CENTER);
		monEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		monEndTime.setEditable(false);
		monEndTime.setColumns(10);
		monEndTime.setBounds(320, 40, 100, 28);
		GroupNotes.add(monEndTime);
		
		JLabel lblmonKOTopic = new JLabel("   Topic:");
		lblmonKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblmonKOTopic.setBounds(410, 40, 70, 28);
		GroupNotes.add(lblmonKOTopic);
		
		monKOTopic = new JTextField((String)data[3]);
		monKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		monKOTopic.setEditable(false);
		monKOTopic.setColumns(10);
		monKOTopic.setBounds(480, 40, 170, 28);
		GroupNotes.add(monKOTopic);
		
		monKONote = new JTextArea((String)data[2]);
		monKONote.setFont(new Font("Verdana", Font.PLAIN, 13));
		monKONote.setLineWrap(true);
		monKONote.setWrapStyleWord(true);
		monKONote.setEditable(false);
		monKONote.setBounds(20, 80, 625, 70);
		GroupNotes.add(monKONote);
		
		txtam = new JTextField();
		txtam.setHorizontalAlignment(SwingConstants.CENTER);
		txtam.setText("10:00AM");
		txtam.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtam.setEditable(false);
		txtam.setColumns(10);
		txtam.setBounds(180, 160, 100, 28);
		GroupNotes.add(txtam);
		
		JLabel lblMondayAm = new JLabel("Monday A.M.       Time");
		lblMondayAm.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMondayAm.setBounds(20, 160, 160, 28);
		GroupNotes.add(lblMondayAm);
		
		JLabel lblTo = new JLabel(" to");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo.setBounds(270, 160, 50, 28);
		GroupNotes.add(lblTo);
		
		txtpm = new JTextField();
		txtpm.setText("12:00PM");
		txtpm.setHorizontalAlignment(SwingConstants.CENTER);
		txtpm.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtpm.setEditable(false);
		txtpm.setColumns(10);
		txtpm.setBounds(320, 160, 100, 28);
		GroupNotes.add(txtpm);
		
		JLabel lblmonAmTopic = new JLabel("   Topic:");
		lblmonAmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblmonAmTopic.setBounds(410, 160, 70, 28);
		GroupNotes.add(lblmonAmTopic);
		
		monAMTopic = new JTextField((String)data[8]);
		monAMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		monAMTopic.setEditable(false);
		monAMTopic.setColumns(10);
		monAMTopic.setBounds(480, 160, 170, 28);
		GroupNotes.add(monAMTopic);
		
		JTextArea monAMNote = new JTextArea((String)data[7]);
		monAMNote.setWrapStyleWord(true);
		monAMNote.setLineWrap(true);
		monAMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		monAMNote.setEditable(false);
		monAMNote.setBounds(20, 199, 625, 70);
		GroupNotes.add(monAMNote);
		
		textField_10 = new JTextField();
		textField_10.setText("02:00PM");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(180, 280, 100, 28);
		GroupNotes.add(textField_10);
		
		JLabel lblMondayPmTime = new JLabel("Monday P.M.       Time");
		lblMondayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMondayPmTime.setBounds(20, 280, 160, 28);
		GroupNotes.add(lblMondayPmTime);
		
		JLabel lblPmTo = new JLabel(" to");
		lblPmTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPmTo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPmTo.setBounds(270, 280, 50, 28);
		GroupNotes.add(lblPmTo);
		
		textField_12 = new JTextField();
		textField_12.setText("04:00PM");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(320, 280, 100, 28);
		GroupNotes.add(textField_12);
		
		JLabel lblmonPmTopic = new JLabel("   Topic:");
		lblmonPmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblmonPmTopic.setBounds(410, 280, 70, 28);
		GroupNotes.add(lblmonPmTopic);
		
		monPMTopic = new JTextField((String)data[11]);
		monPMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		monPMTopic.setEditable(false);
		monPMTopic.setColumns(10);
		monPMTopic.setBounds(480, 280, 170, 28);
		GroupNotes.add(monPMTopic);
		
		JTextArea monPMNote = new JTextArea((String)data[10]);
		monPMNote.setWrapStyleWord(true);
		monPMNote.setLineWrap(true);
		monPMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		monPMNote.setEditable(false);
		monPMNote.setBounds(20, 320, 625, 70);
		GroupNotes.add(monPMNote);
		
		tueStartTime = new JTextField((String)data[15]);
		tueStartTime.setEditable(false);
		tueStartTime.setHorizontalAlignment(SwingConstants.CENTER);
		tueStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		tueStartTime.setColumns(10);
		tueStartTime.setBounds(180, 400, 100, 28);
		GroupNotes.add(tueStartTime);
		
		JLabel lblTuesdayKickofftime = new JLabel("Tuesday Kick-Off/Time");
		lblTuesdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTuesdayKickofftime.setBounds(20, 400, 160, 28);
		GroupNotes.add(lblTuesdayKickofftime);
		
		JLabel lblTo_1 = new JLabel(" to");
		lblTo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_1.setBounds(270, 400, 50, 28);
		GroupNotes.add(lblTo_1);
		
		tueEndTime = new JTextField((String)data[16]);
		tueEndTime.setHorizontalAlignment(SwingConstants.CENTER);
		tueEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		tueEndTime.setEditable(false);
		tueEndTime.setColumns(10);
		tueEndTime.setBounds(320, 400, 100, 28);
		GroupNotes.add(tueEndTime);
		
		JLabel lbltueKOTopic = new JLabel("   Topic:");
		lbltueKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbltueKOTopic.setBounds(410, 400, 70, 28);
		GroupNotes.add(lbltueKOTopic);
		
		tueKOTopic = new JTextField((String)data[14]);
		tueKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		tueKOTopic.setEditable(false);
		tueKOTopic.setColumns(10);
		tueKOTopic.setBounds(480, 400, 170, 28);
		GroupNotes.add(tueKOTopic);
		
		JTextArea tueKONote = new JTextArea((String)data[13]);
		tueKONote.setWrapStyleWord(true);
		tueKONote.setLineWrap(true);
		tueKONote.setFont(new Font("Verdana", Font.PLAIN, 13));
		tueKONote.setEditable(false);
		tueKONote.setBounds(20, 440, 625, 70);
		GroupNotes.add(tueKONote);
		
		txtam_1 = new JTextField();
		txtam_1.setText("10:00AM");
		txtam_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtam_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtam_1.setEditable(false);
		txtam_1.setColumns(10);
		txtam_1.setBounds(180, 520, 100, 28);
		GroupNotes.add(txtam_1);
		
		JLabel lblTuesdayAmTime = new JLabel("Tuesday A.M.       Time");
		lblTuesdayAmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTuesdayAmTime.setBounds(20, 520, 160, 28);
		GroupNotes.add(lblTuesdayAmTime);
		
		JLabel lblTo_2 = new JLabel(" to");
		lblTo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_2.setBounds(270, 520, 50, 28);
		GroupNotes.add(lblTo_2);
		
		textField_22 = new JTextField();
		textField_22.setText("12:00PM");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(320, 520, 100, 28);
		GroupNotes.add(textField_22);
		
		JLabel lbltueAmTopic = new JLabel("   Topic:");
		lbltueAmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbltueAmTopic.setBounds(410, 520, 70, 28);
		GroupNotes.add(lbltueAmTopic);
		
		tueAMTopic = new JTextField((String)data[19]);
		tueAMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		tueAMTopic.setEditable(false);
		tueAMTopic.setColumns(10);
		tueAMTopic.setBounds(480, 520, 170, 28);
		GroupNotes.add(tueAMTopic);
		
		JTextArea tueAMNote = new JTextArea((String)data[18]);
		tueAMNote.setWrapStyleWord(true);
		tueAMNote.setLineWrap(true);
		tueAMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		tueAMNote.setEditable(false);
		tueAMNote.setBounds(20, 560, 625, 70);
		GroupNotes.add(tueAMNote);
		
		textField_25 = new JTextField();
		textField_25.setText("02:00PM");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(180, 640, 100, 28);
		GroupNotes.add(textField_25);
		
		JLabel lblTuesdayPmTime = new JLabel("Tuesday P.M.       Time");
		lblTuesdayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTuesdayPmTime.setBounds(20, 640, 160, 28);
		GroupNotes.add(lblTuesdayPmTime);
		
		JLabel lblTo_3 = new JLabel(" to");
		lblTo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_3.setBounds(270, 640, 50, 28);
		GroupNotes.add(lblTo_3);
		
		textField_27 = new JTextField();
		textField_27.setText("04:00PM");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(320, 640, 100, 28);
		GroupNotes.add(textField_27);
		
		JLabel lbltueKPmTopic = new JLabel("   Topic:");
		lbltueKPmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbltueKPmTopic.setBounds(410, 640, 70, 28);
		GroupNotes.add(lbltueKPmTopic);
		
		tuePMTopic = new JTextField((String)data[22]);
		tuePMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		tuePMTopic.setEditable(false);
		tuePMTopic.setColumns(10);
		tuePMTopic.setBounds(480, 640, 170, 28);
		GroupNotes.add(tuePMTopic);
		
		JTextArea tuePMNote = new JTextArea((String)data[21]);
		tuePMNote.setWrapStyleWord(true);
		tuePMNote.setLineWrap(true);
		tuePMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		tuePMNote.setEditable(false);
		tuePMNote.setBounds(20, 680, 625, 70);
		GroupNotes.add(tuePMNote);
		
		wedStartTime = new JTextField((String)data[26]);
		wedStartTime.setHorizontalAlignment(SwingConstants.CENTER);
		wedStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedStartTime.setEditable(false);
		wedStartTime.setColumns(10);
		wedStartTime.setBounds(180, 760, 100, 28);
		GroupNotes.add(wedStartTime);
		
		JLabel lblWednesdayKickofftime = new JLabel("Wednesday Kick-Off/Time");
		lblWednesdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWednesdayKickofftime.setBounds(20, 760, 160, 28);
		GroupNotes.add(lblWednesdayKickofftime);
		
		JLabel lblTo_4 = new JLabel(" to");
		lblTo_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_4.setBounds(270, 760, 50, 28);
		GroupNotes.add(lblTo_4);
		
		wedEndTime = new JTextField((String)data[27]);
		wedEndTime.setHorizontalAlignment(SwingConstants.CENTER);
		wedEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedEndTime.setEditable(false);
		wedEndTime.setColumns(10);
		wedEndTime.setBounds(320, 760, 100, 28);
		GroupNotes.add(wedEndTime);
		
		JLabel lblwedKOTopic = new JLabel("   Topic:");
		lblwedKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblwedKOTopic.setBounds(410, 760, 70, 28);
		GroupNotes.add(lblwedKOTopic);
		
		wedKOTopic = new JTextField((String)data[25]);
		wedKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedKOTopic.setEditable(false);
		wedKOTopic.setColumns(10);
		wedKOTopic.setBounds(480, 760, 170, 28);
		GroupNotes.add(wedKOTopic);
		
		JTextArea wedKONote = new JTextArea((String)data[24]);
		wedKONote.setWrapStyleWord(true);
		wedKONote.setLineWrap(true);
		wedKONote.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedKONote.setEditable(false);
		wedKONote.setBounds(20, 800, 625, 70);
		GroupNotes.add(wedKONote);
		
		txtam_2 = new JTextField();
		txtam_2.setText("10:00AM");
		txtam_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtam_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtam_2.setEditable(false);
		txtam_2.setColumns(10);
		txtam_2.setBounds(180, 880, 100, 28);
		GroupNotes.add(txtam_2);
		
		JLabel lblWednesdayAmTime = new JLabel("Wednesday A.M.  Time");
		lblWednesdayAmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWednesdayAmTime.setBounds(20, 880, 160, 28);
		GroupNotes.add(lblWednesdayAmTime);
		
		JLabel lblTo_5 = new JLabel(" to");
		lblTo_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_5.setBounds(270, 880, 50, 28);
		GroupNotes.add(lblTo_5);
		
		textField_37 = new JTextField();
		textField_37.setText("12:00PM");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(320, 880, 100, 28);
		GroupNotes.add(textField_37);
		
		JLabel lblwedAmTopic = new JLabel("   Topic:");
		lblwedAmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblwedAmTopic.setBounds(410, 880, 70, 28);
		GroupNotes.add(lblwedAmTopic);
		
		wedAMTopic = new JTextField((String)data[30]);
		wedAMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedAMTopic.setEditable(false);
		wedAMTopic.setColumns(10);
		wedAMTopic.setBounds(480, 880, 170, 28);
		GroupNotes.add(wedAMTopic);
		
		JTextArea wedAMNote = new JTextArea((String)data[29]);
		wedAMNote.setWrapStyleWord(true);
		wedAMNote.setLineWrap(true);
		wedAMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedAMNote.setEditable(false);
		wedAMNote.setBounds(20, 920, 625, 70);
		GroupNotes.add(wedAMNote);
		
		textField_40 = new JTextField();
		textField_40.setText("02:00PM");
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBounds(180, 1000, 100, 28);
		GroupNotes.add(textField_40);
		
		JLabel lblWednesdayPmTime = new JLabel("Wednesday P.M.  Time");
		lblWednesdayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWednesdayPmTime.setBounds(20, 1000, 160, 28);
		GroupNotes.add(lblWednesdayPmTime);
		
		JLabel lblTo_6 = new JLabel(" to");
		lblTo_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_6.setBounds(270, 1000, 50, 28);
		GroupNotes.add(lblTo_6);
		
		textField_42 = new JTextField();
		textField_42.setText("04:00PM");
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_42.setEditable(false);
		textField_42.setColumns(10);
		textField_42.setBounds(320, 1000, 100, 28);
		GroupNotes.add(textField_42);
		
		JLabel lblwedPmTopic = new JLabel("   Topic:");
		lblwedPmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblwedPmTopic.setBounds(410, 1000, 70, 28);
		GroupNotes.add(lblwedPmTopic);
		
		wedPMTopic = new JTextField((String)data[33]);
		wedPMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedPMTopic.setEditable(false);
		wedPMTopic.setColumns(10);
		wedPMTopic.setBounds(480, 1000, 170, 28);
		GroupNotes.add(wedPMTopic);
		
		JTextArea wedPMNote = new JTextArea((String)data[32]);
		wedPMNote.setWrapStyleWord(true);
		wedPMNote.setLineWrap(true);
		wedPMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		wedPMNote.setEditable(false);
		wedPMNote.setBounds(20, 1040, 625, 70);
		GroupNotes.add(wedPMNote);
		
		thuStartTime = new JTextField((String)data[37]);
		thuStartTime.setHorizontalAlignment(SwingConstants.CENTER);
		thuStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuStartTime.setEditable(false);
		thuStartTime.setColumns(10);
		thuStartTime.setBounds(180, 1120, 100, 28);
		GroupNotes.add(thuStartTime);
		
		JLabel lblThursdayKickofftime_1 = new JLabel("Thursday Kick-Off/Time");
		lblThursdayKickofftime_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayKickofftime_1.setBounds(20, 1120, 160, 28);
		GroupNotes.add(lblThursdayKickofftime_1);
		
		JLabel lblTo_7 = new JLabel(" to");
		lblTo_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_7.setBounds(270, 1120, 50, 28);
		GroupNotes.add(lblTo_7);
		
		thuEndTime = new JTextField((String)data[38]);
		thuEndTime.setHorizontalAlignment(SwingConstants.CENTER);
		thuEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuEndTime.setEditable(false);
		thuEndTime.setColumns(10);
		thuEndTime.setBounds(320, 1120, 100, 28);
		GroupNotes.add(thuEndTime);
		
		JLabel lblthuKOTopic = new JLabel("   Topic:");
		lblthuKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblthuKOTopic.setBounds(410, 1120, 70, 28);
		GroupNotes.add(lblthuKOTopic);
		
		thuKOTopic = new JTextField((String)data[36]);
		thuKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuKOTopic.setEditable(false);
		thuKOTopic.setColumns(10);
		thuKOTopic.setBounds(480, 1120, 170, 28);
		GroupNotes.add(thuKOTopic);
		
		JTextArea thuKONote = new JTextArea((String)data[35]);
		thuKONote.setWrapStyleWord(true);
		thuKONote.setLineWrap(true);
		thuKONote.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuKONote.setEditable(false);
		thuKONote.setBounds(20, 1160, 625, 70);
		GroupNotes.add(thuKONote);
		
		textField_50 = new JTextField();
		textField_50.setText("10:00AM");
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_50.setEditable(false);
		textField_50.setColumns(10);
		textField_50.setBounds(180, 1240, 100, 28);
		GroupNotes.add(textField_50);
		
		JLabel lblThursdayamTime = new JLabel("Thursday A.M.      Time");
		lblThursdayamTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayamTime.setBounds(20, 1240, 160, 28);
		GroupNotes.add(lblThursdayamTime);
		
		JLabel lblTo_8 = new JLabel(" to");
		lblTo_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_8.setBounds(270, 1240, 50, 28);
		GroupNotes.add(lblTo_8);
		
		textField_52 = new JTextField();
		textField_52.setText("12:00PM");
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_52.setEditable(false);
		textField_52.setColumns(10);
		textField_52.setBounds(320, 1240, 100, 28);
		GroupNotes.add(textField_52);
		
		JLabel lblthuAmTopic = new JLabel("   Topic:");
		lblthuAmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblthuAmTopic.setBounds(410, 1240, 70, 28);
		GroupNotes.add(lblthuAmTopic);
		
		thuAMTopic = new JTextField((String)data[41]);
		thuAMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuAMTopic.setEditable(false);
		thuAMTopic.setColumns(10);
		thuAMTopic.setBounds(480, 1240, 170, 28);
		GroupNotes.add(thuAMTopic);
		
		JTextArea thuAMNote = new JTextArea((String)data[40]);
		thuAMNote.setWrapStyleWord(true);
		thuAMNote.setLineWrap(true);
		thuAMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuAMNote.setEditable(false);
		thuAMNote.setBounds(20, 1280, 625, 70);
		GroupNotes.add(thuAMNote);
		
		textField_55 = new JTextField();
		textField_55.setText("02:00PM");
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_55.setEditable(false);
		textField_55.setColumns(10);
		textField_55.setBounds(180, 1360, 100, 28);
		GroupNotes.add(textField_55);
		
		JLabel lblThursdayPmTime = new JLabel("Thursday P.M.      Time");
		lblThursdayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayPmTime.setBounds(20, 1360, 160, 28);
		GroupNotes.add(lblThursdayPmTime);
		
		JLabel lblTo_9 = new JLabel(" to");
		lblTo_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_9.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_9.setBounds(270, 1360, 50, 28);
		GroupNotes.add(lblTo_9);
		
		textField_57 = new JTextField();
		textField_57.setText("04:00PM");
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_57.setEditable(false);
		textField_57.setColumns(10);
		textField_57.setBounds(320, 1360, 100, 28);
		GroupNotes.add(textField_57);
		
		JLabel lblthuPMTopic = new JLabel("   Topic:");
		lblthuPMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblthuPMTopic.setBounds(410, 1360, 70, 28);
		GroupNotes.add(lblthuPMTopic);
		
		thuPMTopic = new JTextField((String)data[44]);
		thuPMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuPMTopic.setEditable(false);
		thuPMTopic.setColumns(10);
		thuPMTopic.setBounds(480, 1360, 170, 28);
		GroupNotes.add(thuPMTopic);
		
		JTextArea thuPMNote = new JTextArea((String)data[43]);
		thuPMNote.setWrapStyleWord(true);
		thuPMNote.setLineWrap(true);
		thuPMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		thuPMNote.setEditable(false);
		thuPMNote.setBounds(20, 1400, 625, 70);
		GroupNotes.add(thuPMNote);
		
		friStartTime = new JTextField((String)data[48]);
		friStartTime.setHorizontalAlignment(SwingConstants.CENTER);
		friStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		friStartTime.setEditable(false);
		friStartTime.setColumns(10);
		friStartTime.setBounds(180, 1480, 100, 28);
		GroupNotes.add(friStartTime);
		
		JLabel label_1 = new JLabel("Friday   Kick-Off/Time");
		label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_1.setBounds(20, 1480, 160, 28);
		GroupNotes.add(label_1);
		
		JLabel lblTo_10 = new JLabel(" to");
		lblTo_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_10.setBounds(270, 1480, 50, 28);
		GroupNotes.add(lblTo_10);
		
		friEndTime = new JTextField((String)data[49]);
		friEndTime.setHorizontalAlignment(SwingConstants.CENTER);
		friEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		friEndTime.setEditable(false);
		friEndTime.setColumns(10);
		friEndTime.setBounds(320, 1480, 100, 28);
		GroupNotes.add(friEndTime);
		
		JLabel lblfriKOTopic = new JLabel("   Topic:");
		lblfriKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblfriKOTopic.setBounds(410, 1480, 70, 28);
		GroupNotes.add(lblfriKOTopic);
		
		friOKTopic = new JTextField((String)data[47]);
		friOKTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		friOKTopic.setEditable(false);
		friOKTopic.setColumns(10);
		friOKTopic.setBounds(480, 1480, 170, 28);
		GroupNotes.add(friOKTopic);
		
		JTextArea friOKNote = new JTextArea((String)data[46]);
		friOKNote.setWrapStyleWord(true);
		friOKNote.setLineWrap(true);
		friOKNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		friOKNote.setEditable(false);
		friOKNote.setBounds(20, 1520, 625, 70);
		GroupNotes.add(friOKNote);
		
		textField_65 = new JTextField();
		textField_65.setText("10:00AM");
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		textField_65.setBounds(180, 1600, 100, 28);
		GroupNotes.add(textField_65);
		
		JLabel label_44 = new JLabel("Friday A.M.        Time");
		label_44.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_44.setBounds(20, 1600, 160, 28);
		GroupNotes.add(label_44);
		
		JLabel lblTo_11 = new JLabel(" to");
		lblTo_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_11.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_11.setBounds(275, 1600, 50, 28);
		GroupNotes.add(lblTo_11);
		
		textField_67 = new JTextField();
		textField_67.setText("12:00PM");
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_67.setEditable(false);
		textField_67.setColumns(10);
		textField_67.setBounds(320, 1600, 100, 28);
		GroupNotes.add(textField_67);
		
		JLabel lblfriAmTopic = new JLabel("   Topic:");
		lblfriAmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblfriAmTopic.setBounds(410, 1600, 70, 28);
		GroupNotes.add(lblfriAmTopic);
		
		friAMTopic = new JTextField((String)data[52]);
		friAMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		friAMTopic.setEditable(false);
		friAMTopic.setColumns(10);
		friAMTopic.setBounds(480, 1600, 170, 28);
		GroupNotes.add(friAMTopic);
		
		JTextArea friAMNote = new JTextArea((String)data[51]);
		friAMNote.setWrapStyleWord(true);
		friAMNote.setLineWrap(true);
		friAMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		friAMNote.setEditable(false);
		friAMNote.setBounds(20, 1640, 625, 70);
		GroupNotes.add(friAMNote);
		
		textField_70 = new JTextField();
		textField_70.setText("02:00PM");
		textField_70.setHorizontalAlignment(SwingConstants.CENTER);
		textField_70.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_70.setEditable(false);
		textField_70.setColumns(10);
		textField_70.setBounds(180, 1720, 100, 28);
		GroupNotes.add(textField_70);
		
		JLabel label_53 = new JLabel("Friday P.M.        Time");
		label_53.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_53.setBounds(20, 1720, 160, 28);
		GroupNotes.add(label_53);
		
		JLabel lblTo_12 = new JLabel(" to");
		lblTo_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_12.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_12.setBounds(270, 1720, 50, 28);
		GroupNotes.add(lblTo_12);
		
		textField_72 = new JTextField();
		textField_72.setText("04:00PM");
		textField_72.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_72.setEditable(false);
		textField_72.setColumns(10);
		textField_72.setBounds(320, 1720, 100, 28);
		GroupNotes.add(textField_72);
		
		JLabel lblfriPmTopic = new JLabel("   Topic:");
		lblfriPmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblfriPmTopic.setBounds(410, 1720, 70, 28);
		GroupNotes.add(lblfriPmTopic);
		
		friPMTopic = new JTextField((String)data[55]);
		friPMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		friPMTopic.setEditable(false);
		friPMTopic.setColumns(10);
		friPMTopic.setBounds(480, 1720, 170, 28);
		GroupNotes.add(friPMTopic);
		
		JTextArea friPMNote = new JTextArea((String)data[54]);
		friPMNote.setWrapStyleWord(true);
		friPMNote.setLineWrap(true);
		friPMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		friPMNote.setEditable(false);
		friPMNote.setBounds(20, 1760, 625, 70);
		GroupNotes.add(friPMNote);
		
		satKOStartTime = new JTextField((String)data[59]);
		satKOStartTime.setHorizontalAlignment(SwingConstants.CENTER);
		satKOStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		satKOStartTime.setEditable(false);
		satKOStartTime.setColumns(10);
		satKOStartTime.setBounds(180, 1840, 100, 28);
		GroupNotes.add(satKOStartTime);
		
		JLabel label_58 = new JLabel("Saturday Kick-Off/Time");
		label_58.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_58.setBounds(20, 1840, 160, 28);
		GroupNotes.add(label_58);
		
		JLabel lblTo_13 = new JLabel(" to");
		lblTo_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_13.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_13.setBounds(270, 1840, 50, 28);
		GroupNotes.add(lblTo_13);
		
		satKOEndTime = new JTextField((String)data[60]);
		satKOEndTime.setHorizontalAlignment(SwingConstants.CENTER);
		satKOEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		satKOEndTime.setEditable(false);
		satKOEndTime.setColumns(10);
		satKOEndTime.setBounds(320, 1840, 100, 28);
		GroupNotes.add(satKOEndTime);
		
		JLabel lblsatKOTopic = new JLabel("   Topic:");
		lblsatKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblsatKOTopic.setBounds(410, 1840, 70, 28);
		GroupNotes.add(lblsatKOTopic);
		
		satKOTopic = new JTextField((String)data[58]);
		satKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		satKOTopic.setEditable(false);
		satKOTopic.setColumns(10);
		satKOTopic.setBounds(480, 1840, 170, 28);
		GroupNotes.add(satKOTopic);
		
		JTextArea satKONote = new JTextArea((String)data[57]);
		satKONote.setWrapStyleWord(true);
		satKONote.setLineWrap(true);
		satKONote.setFont(new Font("Verdana", Font.PLAIN, 13));
		satKONote.setEditable(false);
		satKONote.setBounds(20, 1880, 625, 70);
		GroupNotes.add(satKONote);
		
		textField_80 = new JTextField();
		textField_80.setText("10:00AM");
		textField_80.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_80.setEditable(false);
		textField_80.setColumns(10);
		textField_80.setBounds(180, 1960, 100, 28);
		GroupNotes.add(textField_80);
		
		JLabel label_63 = new JLabel("Saturday A.M.     Time");
		label_63.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_63.setBounds(20, 1960, 160, 28);
		GroupNotes.add(label_63);
		
		JLabel lblTo_14 = new JLabel(" to");
		lblTo_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_14.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_14.setBounds(270, 1960, 50, 28);
		GroupNotes.add(lblTo_14);
		
		textField_82 = new JTextField();
		textField_82.setText("12:00PM");
		textField_82.setHorizontalAlignment(SwingConstants.CENTER);
		textField_82.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_82.setEditable(false);
		textField_82.setColumns(10);
		textField_82.setBounds(320, 1960, 100, 28);
		GroupNotes.add(textField_82);
		
		JLabel lblsatAmTopic = new JLabel("   Topic:");
		lblsatAmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblsatAmTopic.setBounds(410, 1960, 70, 28);
		GroupNotes.add(lblsatAmTopic);
		
		satAMTopic = new JTextField((String)data[63]);
		satAMTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		satAMTopic.setEditable(false);
		satAMTopic.setColumns(10);
		satAMTopic.setBounds(480, 1960, 170, 28);
		GroupNotes.add(satAMTopic);
		
		JTextArea satAMNote = new JTextArea((String)data[62]);
		satAMNote.setWrapStyleWord(true);
		satAMNote.setLineWrap(true);
		satAMNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		satAMNote.setEditable(false);
		satAMNote.setBounds(20, 2000, 625, 70);
		GroupNotes.add(satAMNote);
		
		sunStartTime = new JTextField((String)data[68]);
		sunStartTime.setHorizontalAlignment(SwingConstants.CENTER);
		sunStartTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		sunStartTime.setEditable(false);
		sunStartTime.setColumns(10);
		sunStartTime.setBounds(180, 2080, 100, 28);
		GroupNotes.add(sunStartTime);
		
		JLabel label_68 = new JLabel("Sunday              Time");
		label_68.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_68.setBounds(20, 2080, 160, 28);
		GroupNotes.add(label_68);
		
		JLabel label_70 = new JLabel("to");
		label_70.setHorizontalAlignment(SwingConstants.CENTER);
		label_70.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_70.setBounds(270, 2080, 50, 28);
		GroupNotes.add(label_70);
		
		sunEndTime = new JTextField((String)data[69]);
		sunEndTime.setHorizontalAlignment(SwingConstants.CENTER);
		sunEndTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		sunEndTime.setEditable(false);
		sunEndTime.setColumns(10);
		sunEndTime.setBounds(320, 2080, 100, 28);
		GroupNotes.add(sunEndTime);
		
		JLabel lblsunTopic = new JLabel("   Topic:");
		lblsunTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblsunTopic.setBounds(410, 2080, 70, 28);
		GroupNotes.add(lblsunTopic);
		
		sunTopic = new JTextField((String)data[66]);
		sunTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		sunTopic.setEditable(false);
		sunTopic.setColumns(10);
		sunTopic.setBounds(480, 2080, 170, 28);
		GroupNotes.add(sunTopic);
		
		JTextArea sunNote = new JTextArea((String)data[65]);
		sunNote.setWrapStyleWord(true);
		sunNote.setLineWrap(true);
		sunNote.setFont(new Font("Verdana", Font.PLAIN, 13));
		sunNote.setEditable(false);
		sunNote.setBounds(20, 2120, 625, 70);
		GroupNotes.add(sunNote);
	}
	
	public JComponent getPanel(){
		return GroupNotes;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
