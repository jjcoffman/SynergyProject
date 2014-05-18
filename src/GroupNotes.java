import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Component;
import java.awt.Font;

public class GroupNotes implements ActionListener {
	private JPanel GroupNotes;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField txtam;
	private JTextField txtpm;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_19;
	private JTextField txtam_1;
	private JTextField textField_22;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_27;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_32;
	private JTextField textField_34;
	private JTextField txtam_2;
	private JTextField textField_37;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_42;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_47;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_52;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_57;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_62;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_67;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_72;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_77;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_82;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_87;
	private JTextField textField_89;
	
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
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setBounds(180, 40, 100, 28);
		GroupNotes.add(textField);
		textField.setColumns(10);
		
		JLabel lblThursdayKickofftime = new JLabel("Monday Kick-Off/Time");
		lblThursdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayKickofftime.setBounds(20, 40, 160, 28);
		GroupNotes.add(lblThursdayKickofftime);
		
		JLabel lblAm = new JLabel("to");
		lblAm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAm.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAm.setBounds(270, 40, 50, 28);
		GroupNotes.add(lblAm);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(320, 40, 100, 28);
		GroupNotes.add(textField_2);
		
		JLabel lblmonKOTopic = new JLabel("   Topic:");
		lblmonKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblmonKOTopic.setBounds(410, 40, 70, 28);
		GroupNotes.add(lblmonKOTopic);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(480, 40, 170, 28);
		GroupNotes.add(textField_4);
		
		JTextArea txtrTestTestTest = new JTextArea();
		txtrTestTestTest.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtrTestTestTest.setLineWrap(true);
		txtrTestTestTest.setWrapStyleWord(true);
		txtrTestTestTest.setEditable(false);
		txtrTestTestTest.setBounds(20, 80, 625, 70);
		GroupNotes.add(txtrTestTestTest);
		
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
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(480, 160, 170, 28);
		GroupNotes.add(textField_9);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea.setEditable(false);
		textArea.setBounds(20, 199, 625, 70);
		GroupNotes.add(textArea);
		
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
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(480, 280, 170, 28);
		GroupNotes.add(textField_14);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_1.setEditable(false);
		textArea_1.setBounds(20, 320, 625, 70);
		GroupNotes.add(textArea_1);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_15.setColumns(10);
		textField_15.setBounds(180, 400, 100, 28);
		GroupNotes.add(textField_15);
		
		JLabel lblTuesdayKickofftime = new JLabel("Tuesday Kick-Off/Time");
		lblTuesdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTuesdayKickofftime.setBounds(20, 400, 160, 28);
		GroupNotes.add(lblTuesdayKickofftime);
		
		JLabel lblTo_1 = new JLabel(" to");
		lblTo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_1.setBounds(270, 400, 50, 28);
		GroupNotes.add(lblTo_1);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(320, 400, 100, 28);
		GroupNotes.add(textField_17);
		
		JLabel lbltueKOTopic = new JLabel("   Topic:");
		lbltueKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lbltueKOTopic.setBounds(410, 400, 70, 28);
		GroupNotes.add(lbltueKOTopic);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(480, 400, 170, 28);
		GroupNotes.add(textField_19);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setWrapStyleWord(true);
		textArea_2.setLineWrap(true);
		textArea_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_2.setEditable(false);
		textArea_2.setBounds(20, 440, 625, 70);
		GroupNotes.add(textArea_2);
		
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
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_24.setEditable(false);
		textField_24.setColumns(10);
		textField_24.setBounds(480, 520, 170, 28);
		GroupNotes.add(textField_24);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setWrapStyleWord(true);
		textArea_3.setLineWrap(true);
		textArea_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_3.setEditable(false);
		textArea_3.setBounds(20, 560, 625, 70);
		GroupNotes.add(textArea_3);
		
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
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(480, 640, 170, 28);
		GroupNotes.add(textField_29);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setWrapStyleWord(true);
		textArea_4.setLineWrap(true);
		textArea_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_4.setEditable(false);
		textArea_4.setBounds(20, 680, 625, 70);
		GroupNotes.add(textArea_4);
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(180, 760, 100, 28);
		GroupNotes.add(textField_30);
		
		JLabel lblWednesdayKickofftime = new JLabel("Wednesday Kick-Off/Time");
		lblWednesdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWednesdayKickofftime.setBounds(20, 760, 160, 28);
		GroupNotes.add(lblWednesdayKickofftime);
		
		JLabel lblTo_4 = new JLabel(" to");
		lblTo_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_4.setBounds(270, 760, 50, 28);
		GroupNotes.add(lblTo_4);
		
		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(320, 760, 100, 28);
		GroupNotes.add(textField_32);
		
		JLabel lblwedKOTopic = new JLabel("   Topic:");
		lblwedKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblwedKOTopic.setBounds(410, 760, 70, 28);
		GroupNotes.add(lblwedKOTopic);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(480, 760, 170, 28);
		GroupNotes.add(textField_34);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setWrapStyleWord(true);
		textArea_5.setLineWrap(true);
		textArea_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_5.setEditable(false);
		textArea_5.setBounds(20, 800, 625, 70);
		GroupNotes.add(textArea_5);
		
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
		
		textField_39 = new JTextField();
		textField_39.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_39.setEditable(false);
		textField_39.setColumns(10);
		textField_39.setBounds(480, 880, 170, 28);
		GroupNotes.add(textField_39);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setWrapStyleWord(true);
		textArea_6.setLineWrap(true);
		textArea_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_6.setEditable(false);
		textArea_6.setBounds(20, 920, 625, 70);
		GroupNotes.add(textArea_6);
		
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
		
		textField_44 = new JTextField();
		textField_44.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		textField_44.setBounds(480, 1000, 170, 28);
		GroupNotes.add(textField_44);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setWrapStyleWord(true);
		textArea_7.setLineWrap(true);
		textArea_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_7.setEditable(false);
		textArea_7.setBounds(20, 1040, 625, 70);
		GroupNotes.add(textArea_7);
		
		textField_45 = new JTextField();
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_45.setEditable(false);
		textField_45.setColumns(10);
		textField_45.setBounds(180, 1120, 100, 28);
		GroupNotes.add(textField_45);
		
		JLabel lblThursdayKickofftime_1 = new JLabel("Thursday Kick-Off/Time");
		lblThursdayKickofftime_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayKickofftime_1.setBounds(20, 1120, 160, 28);
		GroupNotes.add(lblThursdayKickofftime_1);
		
		JLabel lblTo_7 = new JLabel(" to");
		lblTo_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_7.setBounds(270, 1120, 50, 28);
		GroupNotes.add(lblTo_7);
		
		textField_47 = new JTextField();
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_47.setEditable(false);
		textField_47.setColumns(10);
		textField_47.setBounds(320, 1120, 100, 28);
		GroupNotes.add(textField_47);
		
		JLabel lblthuKOTopic = new JLabel("   Topic:");
		lblthuKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblthuKOTopic.setBounds(410, 1120, 70, 28);
		GroupNotes.add(lblthuKOTopic);
		
		textField_49 = new JTextField();
		textField_49.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_49.setEditable(false);
		textField_49.setColumns(10);
		textField_49.setBounds(480, 1120, 170, 28);
		GroupNotes.add(textField_49);
		
		JTextArea textArea_8 = new JTextArea();
		textArea_8.setWrapStyleWord(true);
		textArea_8.setLineWrap(true);
		textArea_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_8.setEditable(false);
		textArea_8.setBounds(20, 1160, 625, 70);
		GroupNotes.add(textArea_8);
		
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
		
		textField_54 = new JTextField();
		textField_54.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_54.setEditable(false);
		textField_54.setColumns(10);
		textField_54.setBounds(480, 1240, 170, 28);
		GroupNotes.add(textField_54);
		
		JTextArea textArea_9 = new JTextArea();
		textArea_9.setWrapStyleWord(true);
		textArea_9.setLineWrap(true);
		textArea_9.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_9.setEditable(false);
		textArea_9.setBounds(20, 1280, 625, 70);
		GroupNotes.add(textArea_9);
		
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
		
		textField_59 = new JTextField();
		textField_59.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_59.setEditable(false);
		textField_59.setColumns(10);
		textField_59.setBounds(480, 1360, 170, 28);
		GroupNotes.add(textField_59);
		
		JTextArea textArea_10 = new JTextArea();
		textArea_10.setWrapStyleWord(true);
		textArea_10.setLineWrap(true);
		textArea_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_10.setEditable(false);
		textArea_10.setBounds(20, 1400, 625, 70);
		GroupNotes.add(textArea_10);
		
		textField_60 = new JTextField();
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_60.setEditable(false);
		textField_60.setColumns(10);
		textField_60.setBounds(180, 1480, 100, 28);
		GroupNotes.add(textField_60);
		
		JLabel label_1 = new JLabel("Friday   Kick-Off/Time");
		label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_1.setBounds(20, 1480, 160, 28);
		GroupNotes.add(label_1);
		
		JLabel lblTo_10 = new JLabel(" to");
		lblTo_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_10.setBounds(270, 1480, 50, 28);
		GroupNotes.add(lblTo_10);
		
		textField_62 = new JTextField();
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		textField_62.setBounds(320, 1480, 100, 28);
		GroupNotes.add(textField_62);
		
		JLabel lblfriKOTopic = new JLabel("   Topic:");
		lblfriKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblfriKOTopic.setBounds(410, 1480, 70, 28);
		GroupNotes.add(lblfriKOTopic);
		
		textField_64 = new JTextField();
		textField_64.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_64.setEditable(false);
		textField_64.setColumns(10);
		textField_64.setBounds(480, 1480, 170, 28);
		GroupNotes.add(textField_64);
		
		JTextArea textArea_11 = new JTextArea();
		textArea_11.setWrapStyleWord(true);
		textArea_11.setLineWrap(true);
		textArea_11.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_11.setEditable(false);
		textArea_11.setBounds(20, 1520, 625, 70);
		GroupNotes.add(textArea_11);
		
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
		
		textField_69 = new JTextField();
		textField_69.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_69.setEditable(false);
		textField_69.setColumns(10);
		textField_69.setBounds(475, 1600, 170, 28);
		GroupNotes.add(textField_69);
		
		JTextArea textArea_12 = new JTextArea();
		textArea_12.setWrapStyleWord(true);
		textArea_12.setLineWrap(true);
		textArea_12.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_12.setEditable(false);
		textArea_12.setBounds(20, 1640, 625, 70);
		GroupNotes.add(textArea_12);
		
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
		
		textField_74 = new JTextField();
		textField_74.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_74.setEditable(false);
		textField_74.setColumns(10);
		textField_74.setBounds(480, 1720, 170, 28);
		GroupNotes.add(textField_74);
		
		JTextArea textArea_13 = new JTextArea();
		textArea_13.setWrapStyleWord(true);
		textArea_13.setLineWrap(true);
		textArea_13.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_13.setEditable(false);
		textArea_13.setBounds(20, 1760, 625, 70);
		GroupNotes.add(textArea_13);
		
		textField_75 = new JTextField();
		textField_75.setHorizontalAlignment(SwingConstants.CENTER);
		textField_75.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_75.setEditable(false);
		textField_75.setColumns(10);
		textField_75.setBounds(180, 1840, 100, 28);
		GroupNotes.add(textField_75);
		
		JLabel label_58 = new JLabel("Saturday Kick-Off/Time");
		label_58.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_58.setBounds(20, 1840, 160, 28);
		GroupNotes.add(label_58);
		
		JLabel lblTo_13 = new JLabel(" to");
		lblTo_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo_13.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTo_13.setBounds(270, 1840, 50, 28);
		GroupNotes.add(lblTo_13);
		
		textField_77 = new JTextField();
		textField_77.setHorizontalAlignment(SwingConstants.CENTER);
		textField_77.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_77.setEditable(false);
		textField_77.setColumns(10);
		textField_77.setBounds(320, 1840, 100, 28);
		GroupNotes.add(textField_77);
		
		JLabel lblsatKOTopic = new JLabel("   Topic:");
		lblsatKOTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblsatKOTopic.setBounds(410, 1840, 70, 28);
		GroupNotes.add(lblsatKOTopic);
		
		textField_79 = new JTextField();
		textField_79.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_79.setEditable(false);
		textField_79.setColumns(10);
		textField_79.setBounds(480, 1840, 170, 28);
		GroupNotes.add(textField_79);
		
		JTextArea textArea_14 = new JTextArea();
		textArea_14.setWrapStyleWord(true);
		textArea_14.setLineWrap(true);
		textArea_14.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_14.setEditable(false);
		textArea_14.setBounds(20, 1880, 625, 70);
		GroupNotes.add(textArea_14);
		
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
		
		textField_84 = new JTextField();
		textField_84.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_84.setEditable(false);
		textField_84.setColumns(10);
		textField_84.setBounds(480, 1960, 170, 28);
		GroupNotes.add(textField_84);
		
		JTextArea textArea_15 = new JTextArea();
		textArea_15.setWrapStyleWord(true);
		textArea_15.setLineWrap(true);
		textArea_15.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_15.setEditable(false);
		textArea_15.setBounds(20, 2000, 625, 70);
		GroupNotes.add(textArea_15);
		
		textField_85 = new JTextField();
		textField_85.setHorizontalAlignment(SwingConstants.CENTER);
		textField_85.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_85.setEditable(false);
		textField_85.setColumns(10);
		textField_85.setBounds(180, 2080, 100, 28);
		GroupNotes.add(textField_85);
		
		JLabel label_68 = new JLabel("Sunday              Time");
		label_68.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_68.setBounds(20, 2080, 160, 28);
		GroupNotes.add(label_68);
		
		JLabel label_70 = new JLabel("to");
		label_70.setHorizontalAlignment(SwingConstants.CENTER);
		label_70.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_70.setBounds(270, 2080, 50, 28);
		GroupNotes.add(label_70);
		
		textField_87 = new JTextField();
		textField_87.setHorizontalAlignment(SwingConstants.CENTER);
		textField_87.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_87.setEditable(false);
		textField_87.setColumns(10);
		textField_87.setBounds(320, 2080, 100, 28);
		GroupNotes.add(textField_87);
		
		JLabel lblsunTopic = new JLabel("   Topic:");
		lblsunTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblsunTopic.setBounds(410, 2080, 70, 28);
		GroupNotes.add(lblsunTopic);
		
		textField_89 = new JTextField();
		textField_89.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_89.setEditable(false);
		textField_89.setColumns(10);
		textField_89.setBounds(480, 2080, 170, 28);
		GroupNotes.add(textField_89);
		
		JTextArea textArea_16 = new JTextArea();
		textArea_16.setWrapStyleWord(true);
		textArea_16.setLineWrap(true);
		textArea_16.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_16.setEditable(false);
		textArea_16.setBounds(20, 2120, 625, 70);
		GroupNotes.add(textArea_16);
	}
	
	public JComponent getPanel(){
		return GroupNotes;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
