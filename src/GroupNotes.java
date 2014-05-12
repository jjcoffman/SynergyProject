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
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void BuildPanel() 
	{
		GroupNotes = new JPanel();
		GroupNotes.setSize(665, 1605);
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
		textArea.setBounds(20, 200, 625, 70);
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
	}
	
	public JComponent getPanel(){
		return GroupNotes;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
