import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Discharge implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPanel Discharge;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JButton btnContinue;
	private JButton btnBack;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildGUI()
	{
		Discharge = new JPanel();
		Discharge.setSize(665, 905);
		Discharge.setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setBounds(21, 27, 84, 16);
		Discharge.add(lblPatientName);
		
		JLabel lblClientId = new JLabel("Client ID");
		lblClientId.setBounds(228, 27, 61, 16);
		Discharge.add(lblClientId);
		
		JLabel lblPresent = new JLabel("Present?");
		lblPresent.setBounds(442, 27, 61, 16);
		Discharge.add(lblPresent);
		
		JRadioButton chckbxY = new JRadioButton("Y");
		buttonGroup.add(chckbxY);
		chckbxY.setBounds(496, 27, 40, 23);
		Discharge.add(chckbxY);
		
		JRadioButton chckbxN = new JRadioButton("N");
		buttonGroup.add(chckbxN);
		chckbxN.setBounds(542, 27, 61, 23);
		Discharge.add(chckbxN);
		
		JLabel lblAdmittanceDate = new JLabel("Admittance Date");
		lblAdmittanceDate.setBounds(21, 55, 105, 16);
		Discharge.add(lblAdmittanceDate);
		
		JLabel lblMmddyyyy = new JLabel("MM/DD/YYYY");
		lblMmddyyyy.setBounds(138, 55, 94, 16);
		Discharge.add(lblMmddyyyy);
		
		JLabel lblDischargeDate = new JLabel("Discharge Date:");
		lblDischargeDate.setBounds(391, 57, 105, 16);
		Discharge.add(lblDischargeDate);
		
		textField = new JTextField();
		textField.setBounds(501, 51, 134, 28);
		Discharge.add(textField);
		textField.setColumns(10);
		
		JLabel lblReasonForDischarge = new JLabel("Reason for DIscharge");
		lblReasonForDischarge.setBounds(262, 85, 139, 16);
		Discharge.add(lblReasonForDischarge);
		
		JCheckBox chckbxSuccessfulCompletion = new JCheckBox("Successful Completion");
		chckbxSuccessfulCompletion.setBounds(6, 187, 178, 23);
		Discharge.add(chckbxSuccessfulCompletion);
		
		JCheckBox chckbxDisciplinaryruleViolation = new JCheckBox("Disciplinary/Rule Violation");
		chckbxDisciplinaryruleViolation.setBounds(6, 222, 211, 23);
		Discharge.add(chckbxDisciplinaryruleViolation);
		
		JCheckBox chckbxNeedReferralFor = new JCheckBox("Need Referral for additional care");
		chckbxNeedReferralFor.setBounds(6, 257, 237, 23);
		Discharge.add(chckbxNeedReferralFor);
		
		JCheckBox chckbxDroppedOut = new JCheckBox("Dropped Out");
		chckbxDroppedOut.setBounds(248, 187, 128, 23);
		Discharge.add(chckbxDroppedOut);
		
		JCheckBox chckbxHealthComplications = new JCheckBox("Health Complications");
		chckbxHealthComplications.setBounds(248, 222, 183, 23);
		Discharge.add(chckbxHealthComplications);
		
		JCheckBox chckbxFailToProgress = new JCheckBox("Fail to Progress");
		chckbxFailToProgress.setBounds(248, 257, 145, 23);
		Discharge.add(chckbxFailToProgress);
		
		JCheckBox chckbxLeftAgainstStaff = new JCheckBox("Left against staff advice");
		chckbxLeftAgainstStaff.setBounds(430, 187, 192, 23);
		Discharge.add(chckbxLeftAgainstStaff);
		
		JCheckBox chckbxIncarcerated = new JCheckBox("Incarcerated");
		chckbxIncarcerated.setBounds(430, 222, 128, 23);
		Discharge.add(chckbxIncarcerated);
		
		JCheckBox chckbxDeathOfClient = new JCheckBox("Death of client");
		chckbxDeathOfClient.setBounds(430, 257, 128, 23);
		Discharge.add(chckbxDeathOfClient);
		
		JLabel lblPrognosis = new JLabel("Prognosis:");
		lblPrognosis.setBounds(146, 307, 71, 16);
		Discharge.add(lblPrognosis);
		
		JCheckBox chckbxGood = new JCheckBox("Good");
		chckbxGood.setBounds(218, 303, 71, 23);
		Discharge.add(chckbxGood);
		
		JCheckBox chckbxFair = new JCheckBox("Fair");
		chckbxFair.setBounds(287, 303, 61, 23);
		Discharge.add(chckbxFair);
		
		JCheckBox chckbxPoor = new JCheckBox("Poor");
		chckbxPoor.setBounds(348, 303, 67, 23);
		Discharge.add(chckbxPoor);
		
		JLabel lblTreatmentSummary = new JLabel("Treatment Summary");
		lblTreatmentSummary.setBounds(32, 359, 152, 16);
		Discharge.add(lblTreatmentSummary);
		
		textField_1 = new JTextField();
		textField_1.setBounds(29, 387, 606, 109);
		Discharge.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTreatmentPlanGoals = new JLabel("Treatment Plan Goals");
		lblTreatmentPlanGoals.setBounds(32, 508, 152, 16);
		Discharge.add(lblTreatmentPlanGoals);
		
		JLabel label_1 = new JLabel("1.");
		label_1.setBounds(32, 537, 21, 16);
		Discharge.add(label_1);
		
		JLabel label_2 = new JLabel("2.");
		label_2.setBounds(32, 570, 21, 16);
		Discharge.add(label_2);
		
		JLabel label_3 = new JLabel("3.");
		label_3.setBounds(32, 603, 21, 16);
		Discharge.add(label_3);
		
		JLabel label_4 = new JLabel("4.");
		label_4.setBounds(33, 636, 21, 16);
		Discharge.add(label_4);
		
		JLabel label_5 = new JLabel("5.");
		label_5.setBounds(32, 669, 21, 16);
		Discharge.add(label_5);
		
		JLabel label_6 = new JLabel("6.");
		label_6.setBounds(32, 702, 21, 16);
		Discharge.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(50, 531, 352, 28);
		Discharge.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(50, 564, 352, 28);
		Discharge.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(50, 597, 352, 28);
		Discharge.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(50, 630, 352, 28);
		Discharge.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(50, 663, 352, 28);
		Discharge.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(50, 696, 352, 28);
		Discharge.add(textField_7);
		
		JLabel lblGoalsMet = new JLabel("Goals Met:");
		lblGoalsMet.setBounds(474, 508, 71, 16);
		Discharge.add(lblGoalsMet);
		
		JCheckBox checkBox = new JCheckBox("Y");
		checkBox.setBounds(463, 530, 40, 23);
		Discharge.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("N");
		checkBox_1.setBounds(509, 530, 61, 23);
		Discharge.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Y");
		checkBox_2.setBounds(463, 564, 40, 23);
		Discharge.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("N");
		checkBox_3.setBounds(509, 564, 61, 23);
		Discharge.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("Y");
		checkBox_4.setBounds(463, 596, 40, 23);
		Discharge.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("N");
		checkBox_5.setBounds(509, 596, 61, 23);
		Discharge.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("Y");
		checkBox_6.setBounds(463, 629, 40, 23);
		Discharge.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("N");
		checkBox_7.setBounds(509, 629, 61, 23);
		Discharge.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("Y");
		checkBox_8.setBounds(463, 663, 40, 23);
		Discharge.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("N");
		checkBox_9.setBounds(509, 663, 61, 23);
		Discharge.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("Y");
		checkBox_10.setBounds(463, 695, 40, 23);
		Discharge.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("N");
		checkBox_11.setBounds(509, 695, 61, 23);
		Discharge.add(checkBox_11);
		
		btnContinue = new JButton("Continue");
		btnContinue.setBounds(274, 735, 117, 29);
		btnContinue.addActionListener(this);
		Discharge.add(btnContinue);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(6, 735, 117, 29);
		btnBack.addActionListener(this);
		Discharge.add(btnBack);
		
		Discharge.setVisible(true);
	}
	public JComponent getPanel()
	{
		return Discharge;
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnContinue)
		{
			//Discharge.dispose();
			//new Discharge2();
		}
		else if(e.getSource()==btnBack)
		{
			//Discharge.dispose();
		}
		
	}
}
