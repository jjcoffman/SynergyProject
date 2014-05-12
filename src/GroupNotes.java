import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Component;
import java.awt.Font;

public class GroupNotes implements ActionListener {
	private JPanel GroupNotes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JTextField textField_84;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void BuildPanel() 
	{
		GroupNotes = new JPanel();
		GroupNotes.setSize(665, 2400);
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
		textField.setBounds(180, 40, 40, 28);
		GroupNotes.add(textField);
		textField.setColumns(10);
		
		JLabel lblThursdayKickofftime = new JLabel("Monday Kick-Off/Time");
		lblThursdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayKickofftime.setBounds(20, 40, 160, 28);
		GroupNotes.add(lblThursdayKickofftime);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(220, 40, 10, 28);
		GroupNotes.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(230, 40, 40, 28);
		GroupNotes.add(textField_1);
		
		JLabel lblAm = new JLabel("AM to");
		lblAm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAm.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAm.setBounds(270, 40, 50, 28);
		GroupNotes.add(lblAm);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(320, 40, 40, 28);
		GroupNotes.add(textField_2);
		
		JLabel label = new JLabel(":");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 13));
		label.setBounds(360, 40, 10, 28);
		GroupNotes.add(label);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(370, 40, 40, 28);
		GroupNotes.add(textField_3);
		
		JLabel lblTopic = new JLabel("AM Topic:");
		lblTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTopic.setBounds(410, 40, 70, 28);
		GroupNotes.add(lblTopic);
		
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
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("10");
		textField_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(180, 160, 40, 28);
		GroupNotes.add(textField_5);
		
		JLabel lblMondayAm = new JLabel("Monday A.M.       Time");
		lblMondayAm.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMondayAm.setBounds(20, 160, 160, 28);
		GroupNotes.add(lblMondayAm);
		
		JLabel label_2 = new JLabel(":");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_2.setBounds(220, 160, 10, 28);
		GroupNotes.add(label_2);
		
		textField_6 = new JTextField();
		textField_6.setText("00");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(230, 160, 40, 28);
		GroupNotes.add(textField_6);
		
		JLabel label_3 = new JLabel("AM to");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_3.setBounds(270, 160, 50, 28);
		GroupNotes.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setText("12");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(320, 160, 40, 28);
		GroupNotes.add(textField_7);
		
		JLabel label_4 = new JLabel(":");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_4.setBounds(360, 160, 10, 28);
		GroupNotes.add(label_4);
		
		textField_8 = new JTextField();
		textField_8.setText("00");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(370, 160, 40, 28);
		GroupNotes.add(textField_8);
		
		JLabel lblPmTopic = new JLabel("PM Topic:");
		lblPmTopic.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPmTopic.setBounds(410, 160, 70, 28);
		GroupNotes.add(lblPmTopic);
		
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
		textField_10.setText("2");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(180, 280, 40, 28);
		GroupNotes.add(textField_10);
		
		JLabel lblMondayPmTime = new JLabel("Monday P.M.       Time");
		lblMondayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMondayPmTime.setBounds(20, 280, 160, 28);
		GroupNotes.add(lblMondayPmTime);
		
		JLabel label_5 = new JLabel(":");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_5.setBounds(220, 280, 10, 28);
		GroupNotes.add(label_5);
		
		textField_11 = new JTextField();
		textField_11.setText("00");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(230, 280, 40, 28);
		GroupNotes.add(textField_11);
		
		JLabel lblPmTo = new JLabel("PM to");
		lblPmTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPmTo.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPmTo.setBounds(270, 280, 50, 28);
		GroupNotes.add(lblPmTo);
		
		textField_12 = new JTextField();
		textField_12.setText("4");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(320, 280, 40, 28);
		GroupNotes.add(textField_12);
		
		JLabel label_7 = new JLabel(":");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_7.setBounds(360, 280, 10, 28);
		GroupNotes.add(label_7);
		
		textField_13 = new JTextField();
		textField_13.setText("00");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(370, 280, 40, 28);
		GroupNotes.add(textField_13);
		
		JLabel label_8 = new JLabel("PM Topic:");
		label_8.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_8.setBounds(410, 280, 70, 28);
		GroupNotes.add(label_8);
		
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
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(180, 400, 40, 28);
		GroupNotes.add(textField_15);
		
		JLabel lblTuesdayKickofftime = new JLabel("Tuesday Kick-Off/Time");
		lblTuesdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTuesdayKickofftime.setBounds(20, 400, 160, 28);
		GroupNotes.add(lblTuesdayKickofftime);
		
		JLabel label_6 = new JLabel(":");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_6.setBounds(220, 400, 10, 28);
		GroupNotes.add(label_6);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(230, 400, 40, 28);
		GroupNotes.add(textField_16);
		
		JLabel label_9 = new JLabel("AM to");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_9.setBounds(270, 400, 50, 28);
		GroupNotes.add(label_9);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(320, 400, 40, 28);
		GroupNotes.add(textField_17);
		
		JLabel label_10 = new JLabel(":");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_10.setBounds(360, 400, 10, 28);
		GroupNotes.add(label_10);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(370, 400, 40, 28);
		GroupNotes.add(textField_18);
		
		JLabel label_11 = new JLabel("AM Topic:");
		label_11.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_11.setBounds(410, 400, 70, 28);
		GroupNotes.add(label_11);
		
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
		
		textField_20 = new JTextField();
		textField_20.setText("10");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(180, 520, 40, 28);
		GroupNotes.add(textField_20);
		
		JLabel lblTuesdayAmTime = new JLabel("Tuesday A.M.       Time");
		lblTuesdayAmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTuesdayAmTime.setBounds(20, 520, 160, 28);
		GroupNotes.add(lblTuesdayAmTime);
		
		JLabel label_13 = new JLabel(":");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_13.setBounds(220, 520, 10, 28);
		GroupNotes.add(label_13);
		
		textField_21 = new JTextField();
		textField_21.setText("00");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(230, 520, 40, 28);
		GroupNotes.add(textField_21);
		
		JLabel label_14 = new JLabel("AM to");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_14.setBounds(270, 520, 50, 28);
		GroupNotes.add(label_14);
		
		textField_22 = new JTextField();
		textField_22.setText("12");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(320, 520, 40, 28);
		GroupNotes.add(textField_22);
		
		JLabel label_15 = new JLabel(":");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_15.setBounds(360, 520, 10, 28);
		GroupNotes.add(label_15);
		
		textField_23 = new JTextField();
		textField_23.setText("00");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(370, 520, 40, 28);
		GroupNotes.add(textField_23);
		
		JLabel label_16 = new JLabel("PM Topic:");
		label_16.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_16.setBounds(410, 520, 70, 28);
		GroupNotes.add(label_16);
		
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
		textField_25.setText("2");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(180, 640, 40, 28);
		GroupNotes.add(textField_25);
		
		JLabel lblTuesdayPmTime = new JLabel("Tuesday P.M.       Time");
		lblTuesdayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTuesdayPmTime.setBounds(20, 640, 160, 28);
		GroupNotes.add(lblTuesdayPmTime);
		
		JLabel label_18 = new JLabel(":");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_18.setBounds(220, 640, 10, 28);
		GroupNotes.add(label_18);
		
		textField_26 = new JTextField();
		textField_26.setText("00");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(230, 640, 40, 28);
		GroupNotes.add(textField_26);
		
		JLabel label_19 = new JLabel("PM to");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_19.setBounds(270, 640, 50, 28);
		GroupNotes.add(label_19);
		
		textField_27 = new JTextField();
		textField_27.setText("4");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(320, 640, 40, 28);
		GroupNotes.add(textField_27);
		
		JLabel label_20 = new JLabel(":");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_20.setBounds(360, 640, 10, 28);
		GroupNotes.add(label_20);
		
		textField_28 = new JTextField();
		textField_28.setText("00");
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(370, 640, 40, 28);
		GroupNotes.add(textField_28);
		
		JLabel label_21 = new JLabel("PM Topic:");
		label_21.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_21.setBounds(410, 640, 70, 28);
		GroupNotes.add(label_21);
		
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
		textField_30.setBounds(180, 760, 40, 28);
		GroupNotes.add(textField_30);
		
		JLabel lblWednesdayKickofftime = new JLabel("Wednesday Kick-Off/Time");
		lblWednesdayKickofftime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWednesdayKickofftime.setBounds(20, 760, 160, 28);
		GroupNotes.add(lblWednesdayKickofftime);
		
		JLabel label_12 = new JLabel(":");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_12.setBounds(220, 760, 10, 28);
		GroupNotes.add(label_12);
		
		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(230, 760, 40, 28);
		GroupNotes.add(textField_31);
		
		JLabel label_17 = new JLabel("AM to");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_17.setBounds(270, 760, 50, 28);
		GroupNotes.add(label_17);
		
		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(320, 760, 40, 28);
		GroupNotes.add(textField_32);
		
		JLabel label_22 = new JLabel(":");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_22.setBounds(360, 760, 10, 28);
		GroupNotes.add(label_22);
		
		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(370, 760, 40, 28);
		GroupNotes.add(textField_33);
		
		JLabel label_23 = new JLabel("AM Topic:");
		label_23.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_23.setBounds(410, 760, 70, 28);
		GroupNotes.add(label_23);
		
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
		
		textField_35 = new JTextField();
		textField_35.setText("10");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(180, 880, 40, 28);
		GroupNotes.add(textField_35);
		
		JLabel lblWednesdayAmTime = new JLabel("Wednesday A.M.  Time");
		lblWednesdayAmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWednesdayAmTime.setBounds(20, 880, 160, 28);
		GroupNotes.add(lblWednesdayAmTime);
		
		JLabel label_25 = new JLabel(":");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_25.setBounds(220, 880, 10, 28);
		GroupNotes.add(label_25);
		
		textField_36 = new JTextField();
		textField_36.setText("00");
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(230, 880, 40, 28);
		GroupNotes.add(textField_36);
		
		JLabel label_26 = new JLabel("AM to");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_26.setBounds(270, 880, 50, 28);
		GroupNotes.add(label_26);
		
		textField_37 = new JTextField();
		textField_37.setText("12");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(320, 880, 40, 28);
		GroupNotes.add(textField_37);
		
		JLabel label_27 = new JLabel(":");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_27.setBounds(360, 880, 10, 28);
		GroupNotes.add(label_27);
		
		textField_38 = new JTextField();
		textField_38.setText("00");
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(370, 880, 40, 28);
		GroupNotes.add(textField_38);
		
		JLabel label_28 = new JLabel("PM Topic:");
		label_28.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_28.setBounds(410, 880, 70, 28);
		GroupNotes.add(label_28);
		
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
		textField_40.setText("2");
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBounds(180, 1000, 40, 28);
		GroupNotes.add(textField_40);
		
		JLabel lblWednesdayPmTime = new JLabel("Wednesday P.M.  Time");
		lblWednesdayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblWednesdayPmTime.setBounds(20, 1000, 160, 28);
		GroupNotes.add(lblWednesdayPmTime);
		
		JLabel label_30 = new JLabel(":");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_30.setBounds(220, 1000, 10, 28);
		GroupNotes.add(label_30);
		
		textField_41 = new JTextField();
		textField_41.setText("00");
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_41.setEditable(false);
		textField_41.setColumns(10);
		textField_41.setBounds(230, 1000, 40, 28);
		GroupNotes.add(textField_41);
		
		JLabel label_31 = new JLabel("PM to");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_31.setBounds(270, 1000, 50, 28);
		GroupNotes.add(label_31);
		
		textField_42 = new JTextField();
		textField_42.setText("4");
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_42.setEditable(false);
		textField_42.setColumns(10);
		textField_42.setBounds(320, 1000, 40, 28);
		GroupNotes.add(textField_42);
		
		JLabel label_32 = new JLabel(":");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_32.setBounds(360, 1000, 10, 28);
		GroupNotes.add(label_32);
		
		textField_43 = new JTextField();
		textField_43.setText("00");
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_43.setEditable(false);
		textField_43.setColumns(10);
		textField_43.setBounds(370, 1000, 40, 28);
		GroupNotes.add(textField_43);
		
		JLabel label_33 = new JLabel("PM Topic:");
		label_33.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_33.setBounds(410, 1000, 70, 28);
		GroupNotes.add(label_33);
		
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
		textField_45.setBounds(180, 1120, 40, 28);
		GroupNotes.add(textField_45);
		
		JLabel lblThursdayKickofftime_1 = new JLabel("Thursday Kick-Off/Time");
		lblThursdayKickofftime_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayKickofftime_1.setBounds(20, 1120, 160, 28);
		GroupNotes.add(lblThursdayKickofftime_1);
		
		JLabel label_35 = new JLabel(":");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_35.setBounds(220, 1120, 10, 28);
		GroupNotes.add(label_35);
		
		textField_46 = new JTextField();
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_46.setEditable(false);
		textField_46.setColumns(10);
		textField_46.setBounds(230, 1120, 40, 28);
		GroupNotes.add(textField_46);
		
		JLabel label_36 = new JLabel("AM to");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_36.setBounds(270, 1120, 50, 28);
		GroupNotes.add(label_36);
		
		textField_47 = new JTextField();
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_47.setEditable(false);
		textField_47.setColumns(10);
		textField_47.setBounds(320, 1120, 40, 28);
		GroupNotes.add(textField_47);
		
		JLabel label_37 = new JLabel(":");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_37.setBounds(360, 1120, 10, 28);
		GroupNotes.add(label_37);
		
		textField_48 = new JTextField();
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_48.setEditable(false);
		textField_48.setColumns(10);
		textField_48.setBounds(370, 1120, 40, 28);
		GroupNotes.add(textField_48);
		
		JLabel label_38 = new JLabel("AM Topic:");
		label_38.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_38.setBounds(410, 1120, 70, 28);
		GroupNotes.add(label_38);
		
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
		textField_50.setText("10");
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_50.setEditable(false);
		textField_50.setColumns(10);
		textField_50.setBounds(180, 1240, 40, 28);
		GroupNotes.add(textField_50);
		
		JLabel lblThursdayamTime = new JLabel("Thursday A.M.      Time");
		lblThursdayamTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayamTime.setBounds(20, 1240, 160, 28);
		GroupNotes.add(lblThursdayamTime);
		
		JLabel label_40 = new JLabel(":");
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_40.setBounds(220, 1240, 10, 28);
		GroupNotes.add(label_40);
		
		textField_51 = new JTextField();
		textField_51.setText("00");
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_51.setEditable(false);
		textField_51.setColumns(10);
		textField_51.setBounds(230, 1240, 40, 28);
		GroupNotes.add(textField_51);
		
		JLabel label_41 = new JLabel("AM to");
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_41.setBounds(270, 1240, 50, 28);
		GroupNotes.add(label_41);
		
		textField_52 = new JTextField();
		textField_52.setText("12");
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_52.setEditable(false);
		textField_52.setColumns(10);
		textField_52.setBounds(320, 1240, 40, 28);
		GroupNotes.add(textField_52);
		
		JLabel label_42 = new JLabel(":");
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		label_42.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_42.setBounds(360, 1240, 10, 28);
		GroupNotes.add(label_42);
		
		textField_53 = new JTextField();
		textField_53.setText("00");
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_53.setEditable(false);
		textField_53.setColumns(10);
		textField_53.setBounds(370, 1240, 40, 28);
		GroupNotes.add(textField_53);
		
		JLabel label_43 = new JLabel("PM Topic:");
		label_43.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_43.setBounds(410, 1240, 70, 28);
		GroupNotes.add(label_43);
		
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
		textField_55.setText("2");
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_55.setEditable(false);
		textField_55.setColumns(10);
		textField_55.setBounds(180, 1360, 40, 28);
		GroupNotes.add(textField_55);
		
		JLabel lblThursdayPmTime = new JLabel("Thursday P.M.      Time");
		lblThursdayPmTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblThursdayPmTime.setBounds(20, 1360, 160, 28);
		GroupNotes.add(lblThursdayPmTime);
		
		JLabel label_45 = new JLabel(":");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_45.setBounds(220, 1360, 10, 28);
		GroupNotes.add(label_45);
		
		textField_56 = new JTextField();
		textField_56.setText("00");
		textField_56.setHorizontalAlignment(SwingConstants.CENTER);
		textField_56.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_56.setEditable(false);
		textField_56.setColumns(10);
		textField_56.setBounds(230, 1360, 40, 28);
		GroupNotes.add(textField_56);
		
		JLabel label_46 = new JLabel("PM to");
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		label_46.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_46.setBounds(270, 1360, 50, 28);
		GroupNotes.add(label_46);
		
		textField_57 = new JTextField();
		textField_57.setText("4");
		textField_57.setHorizontalAlignment(SwingConstants.CENTER);
		textField_57.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_57.setEditable(false);
		textField_57.setColumns(10);
		textField_57.setBounds(320, 1360, 40, 28);
		GroupNotes.add(textField_57);
		
		JLabel label_47 = new JLabel(":");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		label_47.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_47.setBounds(360, 1360, 10, 28);
		GroupNotes.add(label_47);
		
		textField_58 = new JTextField();
		textField_58.setText("00");
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_58.setEditable(false);
		textField_58.setColumns(10);
		textField_58.setBounds(370, 1360, 40, 28);
		GroupNotes.add(textField_58);
		
		JLabel label_48 = new JLabel("PM Topic:");
		label_48.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_48.setBounds(410, 1360, 70, 28);
		GroupNotes.add(label_48);
		
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
		textField_60.setBounds(180, 1480, 40, 28);
		GroupNotes.add(textField_60);
		
		JLabel label_1 = new JLabel("Friday   Kick-Off/Time");
		label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_1.setBounds(20, 1480, 160, 28);
		GroupNotes.add(label_1);
		
		JLabel label_24 = new JLabel(":");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_24.setBounds(220, 1480, 10, 28);
		GroupNotes.add(label_24);
		
		textField_61 = new JTextField();
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_61.setEditable(false);
		textField_61.setColumns(10);
		textField_61.setBounds(230, 1480, 40, 28);
		GroupNotes.add(textField_61);
		
		JLabel label_29 = new JLabel("AM to");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_29.setBounds(270, 1480, 50, 28);
		GroupNotes.add(label_29);
		
		textField_62 = new JTextField();
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		textField_62.setBounds(320, 1480, 40, 28);
		GroupNotes.add(textField_62);
		
		JLabel label_34 = new JLabel(":");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_34.setBounds(360, 1480, 10, 28);
		GroupNotes.add(label_34);
		
		textField_63 = new JTextField();
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_63.setEditable(false);
		textField_63.setColumns(10);
		textField_63.setBounds(370, 1480, 40, 28);
		GroupNotes.add(textField_63);
		
		JLabel label_39 = new JLabel("AM Topic:");
		label_39.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_39.setBounds(410, 1480, 70, 28);
		GroupNotes.add(label_39);
		
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
		textField_65.setText("10");
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_65.setEditable(false);
		textField_65.setColumns(10);
		textField_65.setBounds(180, 1600, 40, 28);
		GroupNotes.add(textField_65);
		
		JLabel label_44 = new JLabel("Friday A.M.        Time");
		label_44.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_44.setBounds(20, 1600, 160, 28);
		GroupNotes.add(label_44);
		
		JLabel label_49 = new JLabel(":");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_49.setBounds(220, 1600, 10, 28);
		GroupNotes.add(label_49);
		
		textField_66 = new JTextField();
		textField_66.setText("00");
		textField_66.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_66.setEditable(false);
		textField_66.setColumns(10);
		textField_66.setBounds(230, 1600, 40, 28);
		GroupNotes.add(textField_66);
		
		JLabel label_50 = new JLabel("AM to");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_50.setBounds(275, 1600, 50, 28);
		GroupNotes.add(label_50);
		
		textField_67 = new JTextField();
		textField_67.setText("12");
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_67.setEditable(false);
		textField_67.setColumns(10);
		textField_67.setBounds(320, 1600, 40, 28);
		GroupNotes.add(textField_67);
		
		JLabel label_51 = new JLabel(":");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_51.setBounds(355, 1600, 10, 28);
		GroupNotes.add(label_51);
		
		textField_68 = new JTextField();
		textField_68.setText("00");
		textField_68.setHorizontalAlignment(SwingConstants.CENTER);
		textField_68.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_68.setEditable(false);
		textField_68.setColumns(10);
		textField_68.setBounds(370, 1600, 40, 28);
		GroupNotes.add(textField_68);
		
		JLabel label_52 = new JLabel("PM Topic:");
		label_52.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_52.setBounds(410, 1600, 70, 28);
		GroupNotes.add(label_52);
		
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
		textField_70.setText("2");
		textField_70.setHorizontalAlignment(SwingConstants.CENTER);
		textField_70.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_70.setEditable(false);
		textField_70.setColumns(10);
		textField_70.setBounds(180, 1720, 40, 28);
		GroupNotes.add(textField_70);
		
		JLabel label_53 = new JLabel("Friday P.M.        Time");
		label_53.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_53.setBounds(20, 1720, 160, 28);
		GroupNotes.add(label_53);
		
		JLabel label_54 = new JLabel(":");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_54.setBounds(220, 1720, 10, 28);
		GroupNotes.add(label_54);
		
		textField_71 = new JTextField();
		textField_71.setText("00");
		textField_71.setHorizontalAlignment(SwingConstants.CENTER);
		textField_71.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_71.setEditable(false);
		textField_71.setColumns(10);
		textField_71.setBounds(230, 1720, 40, 28);
		GroupNotes.add(textField_71);
		
		JLabel label_55 = new JLabel("PM to");
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_55.setBounds(270, 1720, 50, 28);
		GroupNotes.add(label_55);
		
		textField_72 = new JTextField();
		textField_72.setText("4");
		textField_72.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_72.setEditable(false);
		textField_72.setColumns(10);
		textField_72.setBounds(320, 1720, 40, 28);
		GroupNotes.add(textField_72);
		
		JLabel label_56 = new JLabel(":");
		label_56.setHorizontalAlignment(SwingConstants.CENTER);
		label_56.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_56.setBounds(355, 1720, 10, 28);
		GroupNotes.add(label_56);
		
		textField_73 = new JTextField();
		textField_73.setText("00");
		textField_73.setHorizontalAlignment(SwingConstants.CENTER);
		textField_73.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_73.setEditable(false);
		textField_73.setColumns(10);
		textField_73.setBounds(370, 1720, 40, 28);
		GroupNotes.add(textField_73);
		
		JLabel label_57 = new JLabel("PM Topic:");
		label_57.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_57.setBounds(410, 1720, 70, 28);
		GroupNotes.add(label_57);
		
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
		textField_75.setBounds(180, 1840, 40, 28);
		GroupNotes.add(textField_75);
		
		JLabel label_58 = new JLabel("Saturday Kick-Off/Time");
		label_58.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_58.setBounds(20, 1840, 160, 28);
		GroupNotes.add(label_58);
		
		JLabel label_59 = new JLabel(":");
		label_59.setHorizontalAlignment(SwingConstants.CENTER);
		label_59.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_59.setBounds(220, 1840, 10, 28);
		GroupNotes.add(label_59);
		
		textField_76 = new JTextField();
		textField_76.setHorizontalAlignment(SwingConstants.CENTER);
		textField_76.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_76.setEditable(false);
		textField_76.setColumns(10);
		textField_76.setBounds(230, 1840, 40, 28);
		GroupNotes.add(textField_76);
		
		JLabel label_60 = new JLabel("AM to");
		label_60.setHorizontalAlignment(SwingConstants.CENTER);
		label_60.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_60.setBounds(270, 1840, 50, 28);
		GroupNotes.add(label_60);
		
		textField_77 = new JTextField();
		textField_77.setHorizontalAlignment(SwingConstants.CENTER);
		textField_77.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_77.setEditable(false);
		textField_77.setColumns(10);
		textField_77.setBounds(320, 1840, 40, 28);
		GroupNotes.add(textField_77);
		
		JLabel label_61 = new JLabel(":");
		label_61.setHorizontalAlignment(SwingConstants.CENTER);
		label_61.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_61.setBounds(360, 1840, 10, 28);
		GroupNotes.add(label_61);
		
		textField_78 = new JTextField();
		textField_78.setHorizontalAlignment(SwingConstants.CENTER);
		textField_78.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_78.setEditable(false);
		textField_78.setColumns(10);
		textField_78.setBounds(370, 1840, 40, 28);
		GroupNotes.add(textField_78);
		
		JLabel label_62 = new JLabel("AM Topic:");
		label_62.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_62.setBounds(410, 1840, 70, 28);
		GroupNotes.add(label_62);
		
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
		textField_80.setText("10");
		textField_80.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_80.setEditable(false);
		textField_80.setColumns(10);
		textField_80.setBounds(180, 1960, 40, 28);
		GroupNotes.add(textField_80);
		
		JLabel label_63 = new JLabel("Saturday A.M.     Time");
		label_63.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_63.setBounds(20, 1960, 160, 28);
		GroupNotes.add(label_63);
		
		JLabel label_64 = new JLabel(":");
		label_64.setHorizontalAlignment(SwingConstants.CENTER);
		label_64.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_64.setBounds(220, 1960, 10, 28);
		GroupNotes.add(label_64);
		
		textField_81 = new JTextField();
		textField_81.setText("00");
		textField_81.setHorizontalAlignment(SwingConstants.CENTER);
		textField_81.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_81.setEditable(false);
		textField_81.setColumns(10);
		textField_81.setBounds(230, 1960, 40, 28);
		GroupNotes.add(textField_81);
		
		JLabel label_65 = new JLabel("AM to");
		label_65.setHorizontalAlignment(SwingConstants.CENTER);
		label_65.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_65.setBounds(270, 1960, 50, 28);
		GroupNotes.add(label_65);
		
		textField_82 = new JTextField();
		textField_82.setText("12");
		textField_82.setHorizontalAlignment(SwingConstants.CENTER);
		textField_82.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_82.setEditable(false);
		textField_82.setColumns(10);
		textField_82.setBounds(320, 1960, 40, 28);
		GroupNotes.add(textField_82);
		
		JLabel label_66 = new JLabel(":");
		label_66.setHorizontalAlignment(SwingConstants.CENTER);
		label_66.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_66.setBounds(360, 1960, 10, 28);
		GroupNotes.add(label_66);
		
		textField_83 = new JTextField();
		textField_83.setText("00");
		textField_83.setHorizontalAlignment(SwingConstants.CENTER);
		textField_83.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_83.setEditable(false);
		textField_83.setColumns(10);
		textField_83.setBounds(370, 1960, 40, 28);
		GroupNotes.add(textField_83);
		
		JLabel label_67 = new JLabel("PM Topic:");
		label_67.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_67.setBounds(410, 1960, 70, 28);
		GroupNotes.add(label_67);
		
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
		textField_85.setBounds(180, 2080, 40, 28);
		GroupNotes.add(textField_85);
		
		JLabel label_68 = new JLabel("Sunday              Time");
		label_68.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_68.setBounds(20, 2080, 160, 28);
		GroupNotes.add(label_68);
		
		JLabel label_69 = new JLabel(":");
		label_69.setHorizontalAlignment(SwingConstants.CENTER);
		label_69.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_69.setBounds(220, 2080, 10, 28);
		GroupNotes.add(label_69);
		
		textField_86 = new JTextField();
		textField_86.setHorizontalAlignment(SwingConstants.CENTER);
		textField_86.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_86.setEditable(false);
		textField_86.setColumns(10);
		textField_86.setBounds(230, 2080, 40, 28);
		GroupNotes.add(textField_86);
		
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
		textField_87.setBounds(320, 2080, 40, 28);
		GroupNotes.add(textField_87);
		
		JLabel label_71 = new JLabel(":");
		label_71.setHorizontalAlignment(SwingConstants.CENTER);
		label_71.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_71.setBounds(360, 2080, 10, 28);
		GroupNotes.add(label_71);
		
		textField_88 = new JTextField();
		textField_88.setHorizontalAlignment(SwingConstants.CENTER);
		textField_88.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_88.setEditable(false);
		textField_88.setColumns(10);
		textField_88.setBounds(370, 2080, 40, 28);
		GroupNotes.add(textField_88);
		
		JLabel label_72 = new JLabel("   Topic:");
		label_72.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_72.setBounds(410, 2080, 70, 28);
		GroupNotes.add(label_72);
		
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
		
		textField_90 = new JTextField();
		textField_90.setHorizontalAlignment(SwingConstants.CENTER);
		textField_90.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_90.setEditable(false);
		textField_90.setColumns(10);
		textField_90.setBounds(180, 2200, 40, 28);
		GroupNotes.add(textField_90);
		
		JLabel lblDay = new JLabel("Day:");
		lblDay.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDay.setBounds(20, 2200, 40, 28);
		GroupNotes.add(lblDay);
		
		JLabel label_74 = new JLabel(":");
		label_74.setHorizontalAlignment(SwingConstants.CENTER);
		label_74.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_74.setBounds(220, 2200, 10, 28);
		GroupNotes.add(label_74);
		
		textField_91 = new JTextField();
		textField_91.setHorizontalAlignment(SwingConstants.CENTER);
		textField_91.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_91.setEditable(false);
		textField_91.setColumns(10);
		textField_91.setBounds(230, 2200, 40, 28);
		GroupNotes.add(textField_91);
		
		JLabel label_75 = new JLabel("to");
		label_75.setHorizontalAlignment(SwingConstants.CENTER);
		label_75.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_75.setBounds(270, 2200, 50, 28);
		GroupNotes.add(label_75);
		
		textField_92 = new JTextField();
		textField_92.setHorizontalAlignment(SwingConstants.CENTER);
		textField_92.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_92.setEditable(false);
		textField_92.setColumns(10);
		textField_92.setBounds(320, 2200, 40, 28);
		GroupNotes.add(textField_92);
		
		JLabel label_76 = new JLabel(":");
		label_76.setHorizontalAlignment(SwingConstants.CENTER);
		label_76.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_76.setBounds(360, 2200, 10, 28);
		GroupNotes.add(label_76);
		
		textField_93 = new JTextField();
		textField_93.setHorizontalAlignment(SwingConstants.CENTER);
		textField_93.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_93.setEditable(false);
		textField_93.setColumns(10);
		textField_93.setBounds(370, 2200, 40, 28);
		GroupNotes.add(textField_93);
		
		JLabel label_77 = new JLabel("   Topic:");
		label_77.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_77.setBounds(410, 2200, 70, 28);
		GroupNotes.add(label_77);
		
		textField_94 = new JTextField();
		textField_94.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_94.setEditable(false);
		textField_94.setColumns(10);
		textField_94.setBounds(480, 2200, 170, 28);
		GroupNotes.add(textField_94);
		
		JTextArea textArea_17 = new JTextArea();
		textArea_17.setWrapStyleWord(true);
		textArea_17.setLineWrap(true);
		textArea_17.setFont(new Font("Verdana", Font.PLAIN, 13));
		textArea_17.setEditable(false);
		textArea_17.setBounds(20, 2240, 625, 70);
		GroupNotes.add(textArea_17);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTime.setBounds(140, 2200, 40, 28);
		GroupNotes.add(lblTime);
		
		textField_95 = new JTextField();
		textField_95.setHorizontalAlignment(SwingConstants.CENTER);
		textField_95.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_95.setEditable(false);
		textField_95.setColumns(10);
		textField_95.setBounds(60, 2200, 80, 28);
		GroupNotes.add(textField_95);
	}
	
	public JComponent getPanel(){
		return GroupNotes;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
