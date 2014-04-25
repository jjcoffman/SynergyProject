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
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txtDrugUsage;
	private JTextField txtCriminal;
	private JTextField txtAxis1;
	private JTextField txtAxis2;
	private JTextField txtAxis3;
	private JTextField txtAxis4;
	private JTextField txtAxis5;
	private JTextField txtAxisPost1;
	private JTextField txtAxisPost2;
	private JTextField txtAxisPost3;
	private JTextField txtAxisPost4;
	private JTextField txtAxisPost5;
	private JTextField txtTransPlans;
	private JTextField txtRecommendation;
	private JTextField txtClientComment;
	private JButton btnCancel;
	private JButton btnCompleteDischarge;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildGUI()
	{
		Discharge = new JPanel();
		Discharge.setSize(665, 1250);
		Discharge.setLayout(null);
		
		JLabel lblPatientName = new JLabel("Patient Name");
		lblPatientName.setBounds(21, 27, 84, 16);
		Discharge.add(lblPatientName);
		
		JLabel lblClientId = new JLabel("Client ID");
		lblClientId.setBounds(228, 27, 61, 16);
		Discharge.add(lblClientId);
		
		JLabel lblPresent = new JLabel("Present?");
		lblPresent.setBounds(458, 27, 61, 16);
		Discharge.add(lblPresent);
		
		JRadioButton chckbxY = new JRadioButton("Y");
		buttonGroup.add(chckbxY);
		chckbxY.setBounds(515, 20, 40, 23);
		Discharge.add(chckbxY);
		
		JRadioButton chckbxN = new JRadioButton("N");
		buttonGroup.add(chckbxN);
		chckbxN.setBounds(561, 20, 61, 23);
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
		
		JRadioButton chckbxSuccessfulCompletion = new JRadioButton("Successful Completion");
		buttonGroup_1.add(chckbxSuccessfulCompletion);
		chckbxSuccessfulCompletion.setBounds(19, 113, 178, 23);
		Discharge.add(chckbxSuccessfulCompletion);
		
		JRadioButton chckbxDisciplinaryruleViolation = new JRadioButton("Disciplinary/Rule Violation");
		buttonGroup_1.add(chckbxDisciplinaryruleViolation);
		chckbxDisciplinaryruleViolation.setBounds(19, 148, 211, 23);
		Discharge.add(chckbxDisciplinaryruleViolation);
		
		JRadioButton chckbxNeedReferralFor = new JRadioButton("Need Referral for additional care");
		buttonGroup_1.add(chckbxNeedReferralFor);
		chckbxNeedReferralFor.setBounds(19, 183, 237, 23);
		Discharge.add(chckbxNeedReferralFor);
		
		JRadioButton chckbxDroppedOut = new JRadioButton("Dropped Out");
		buttonGroup_1.add(chckbxDroppedOut);
		chckbxDroppedOut.setBounds(261, 113, 128, 23);
		Discharge.add(chckbxDroppedOut);
		
		JRadioButton chckbxHealthComplications = new JRadioButton("Health Complications");
		buttonGroup_1.add(chckbxHealthComplications);
		chckbxHealthComplications.setBounds(261, 148, 183, 23);
		Discharge.add(chckbxHealthComplications);
		
		JRadioButton chckbxFailToProgress = new JRadioButton("Fail to Progress");
		buttonGroup_1.add(chckbxFailToProgress);
		chckbxFailToProgress.setBounds(261, 183, 145, 23);
		Discharge.add(chckbxFailToProgress);
		
		JRadioButton chckbxLeftAgainstStaff = new JRadioButton("Left against staff advice");
		buttonGroup_1.add(chckbxLeftAgainstStaff);
		chckbxLeftAgainstStaff.setBounds(443, 113, 192, 23);
		Discharge.add(chckbxLeftAgainstStaff);
		
		JRadioButton chckbxIncarcerated = new JRadioButton("Incarcerated");
		buttonGroup_1.add(chckbxIncarcerated);
		chckbxIncarcerated.setBounds(443, 148, 128, 23);
		Discharge.add(chckbxIncarcerated);
		
		JRadioButton chckbxDeathOfClient = new JRadioButton("Death of client");
		buttonGroup_1.add(chckbxDeathOfClient);
		chckbxDeathOfClient.setBounds(443, 183, 128, 23);
		Discharge.add(chckbxDeathOfClient);
		
		JLabel lblPrognosis = new JLabel("Prognosis:");
		lblPrognosis.setBounds(191, 226, 71, 16);
		Discharge.add(lblPrognosis);
		
		JRadioButton chckbxGood = new JRadioButton("Good");
		buttonGroup_2.add(chckbxGood);
		chckbxGood.setBounds(263, 222, 71, 23);
		Discharge.add(chckbxGood);
		
		JRadioButton chckbxFair = new JRadioButton("Fair");
		buttonGroup_2.add(chckbxFair);
		chckbxFair.setBounds(332, 222, 61, 23);
		Discharge.add(chckbxFair);
		
		JRadioButton chckbxPoor = new JRadioButton("Poor");
		buttonGroup_2.add(chckbxPoor);
		chckbxPoor.setBounds(393, 222, 67, 23);
		Discharge.add(chckbxPoor);
		
		JLabel lblTreatmentSummary = new JLabel("Treatment Summary");
		lblTreatmentSummary.setBounds(21, 257, 152, 16);
		Discharge.add(lblTreatmentSummary);
		
		textField_1 = new JTextField();
		textField_1.setBounds(21, 292, 606, 109);
		Discharge.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTreatmentPlanGoals = new JLabel("Treatment Plan Goals");
		lblTreatmentPlanGoals.setBounds(21, 413, 152, 16);
		Discharge.add(lblTreatmentPlanGoals);
		
		JLabel label_1 = new JLabel("1.");
		label_1.setBounds(31, 447, 21, 16);
		Discharge.add(label_1);
		
		JLabel label_2 = new JLabel("2.");
		label_2.setBounds(31, 480, 21, 16);
		Discharge.add(label_2);
		
		JLabel label_3 = new JLabel("3.");
		label_3.setBounds(31, 513, 21, 16);
		Discharge.add(label_3);
		
		JLabel label_4 = new JLabel("4.");
		label_4.setBounds(32, 546, 21, 16);
		Discharge.add(label_4);
		
		JLabel label_5 = new JLabel("5.");
		label_5.setBounds(31, 579, 21, 16);
		Discharge.add(label_5);
		
		JLabel label_6 = new JLabel("6.");
		label_6.setBounds(31, 612, 21, 16);
		Discharge.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(49, 441, 352, 28);
		Discharge.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(49, 474, 352, 28);
		Discharge.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(49, 507, 352, 28);
		Discharge.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(49, 540, 352, 28);
		Discharge.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(49, 573, 352, 28);
		Discharge.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(49, 606, 352, 28);
		Discharge.add(textField_7);
		
		JLabel lblGoalsMet = new JLabel("Goals Met:");
		lblGoalsMet.setBounds(518, 413, 71, 16);
		Discharge.add(lblGoalsMet);
		
		JRadioButton rdbtnY = new JRadioButton("Y");
		buttonGroup_3.add(rdbtnY);
		rdbtnY.setBounds(456, 443, 47, 23);
		Discharge.add(rdbtnY);
		
		JRadioButton radioButton = new JRadioButton("Y");
		buttonGroup_4.add(radioButton);
		radioButton.setBounds(456, 476, 47, 23);
		Discharge.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Y");
		buttonGroup_5.add(radioButton_1);
		radioButton_1.setBounds(456, 509, 47, 23);
		Discharge.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Y");
		buttonGroup_6.add(radioButton_2);
		radioButton_2.setBounds(456, 542, 47, 23);
		Discharge.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Y");
		buttonGroup_7.add(radioButton_3);
		radioButton_3.setBounds(456, 575, 47, 23);
		Discharge.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Y");
		buttonGroup_8.add(radioButton_4);
		radioButton_4.setBounds(456, 608, 47, 23);
		Discharge.add(radioButton_4);
		
		JRadioButton rdbtnN = new JRadioButton("N");
		buttonGroup_3.add(rdbtnN);
		rdbtnN.setBounds(518, 443, 47, 23);
		Discharge.add(rdbtnN);
		
		JRadioButton radioButton_5 = new JRadioButton("N");
		buttonGroup_4.add(radioButton_5);
		radioButton_5.setBounds(518, 476, 47, 23);
		Discharge.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("N");
		buttonGroup_5.add(radioButton_6);
		radioButton_6.setBounds(518, 509, 47, 23);
		Discharge.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("N");
		buttonGroup_6.add(radioButton_7);
		radioButton_7.setBounds(518, 542, 47, 23);
		Discharge.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("N");
		buttonGroup_7.add(radioButton_8);
		radioButton_8.setBounds(518, 575, 47, 23);
		Discharge.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("N");
		buttonGroup_8.add(radioButton_9);
		radioButton_9.setBounds(518, 608, 47, 23);
		Discharge.add(radioButton_9);
		
		JCheckBox chckbxCurrentDrugUsage = new JCheckBox("Current Drug Usage:");
		chckbxCurrentDrugUsage.setBounds(21, 656, 176, 23);
		Discharge.add(chckbxCurrentDrugUsage);
		
		textField_8 = new JTextField();
		textField_8.setBounds(231, 654, 391, 28);
		Discharge.add(textField_8);
		textField_8.setColumns(10);
		
		JCheckBox chckbxCriminalInvolvement = new JCheckBox("Criminal Involvement");
		chckbxCriminalInvolvement.setBounds(21, 691, 176, 23);
		Discharge.add(chckbxCriminalInvolvement);
		
		textField_9 = new JTextField();
		textField_9.setBounds(231, 688, 391, 28);
		Discharge.add(textField_9);
		textField_9.setColumns(10);
		
		JCheckBox chckbxPersonagencyNotified = new JCheckBox("Person/Agency Notified");
		chckbxPersonagencyNotified.setBounds(21, 725, 192, 23);
		Discharge.add(chckbxPersonagencyNotified);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(458, 723, 164, 28);
		Discharge.add(textField_10);
		
		JLabel lblContactDate = new JLabel("Contact Date");
		lblContactDate.setBounds(366, 728, 94, 16);
		Discharge.add(lblContactDate);
		
		JLabel lblAxis = new JLabel("AXIS 1:");
		lblAxis.setBounds(59, 800, 61, 16);
		Discharge.add(lblAxis);
		
		txtAxis1 = new JTextField();
		txtAxis1.setBounds(163, 788, 163, 28);
		Discharge.add(txtAxis1);
		txtAxis1.setColumns(10);
		
		JLabel lblAxis_2 = new JLabel("AXIS 2:");
		lblAxis_2.setBounds(59, 831, 61, 16);
		Discharge.add(lblAxis_2);
		
		txtAxis2 = new JTextField();
		txtAxis2.setColumns(10);
		txtAxis2.setBounds(163, 820, 163, 28);
		Discharge.add(txtAxis2);
		
		JLabel lblAxis_3 = new JLabel("AXIS 3:");
		lblAxis_3.setBounds(59, 862, 61, 16);
		Discharge.add(lblAxis_3);
		
		txtAxis3 = new JTextField();
		txtAxis3.setColumns(10);
		txtAxis3.setBounds(163, 852, 163, 28);
		Discharge.add(txtAxis3);
		
		JLabel lblAxis_4 = new JLabel("AXIS 4:");
		lblAxis_4.setBounds(59, 893, 61, 16);
		Discharge.add(lblAxis_4);
		
		txtAxis4 = new JTextField();
		txtAxis4.setColumns(10);
		txtAxis4.setBounds(163, 884, 163, 28);
		Discharge.add(txtAxis4);
		
		JLabel lblAxis_5 = new JLabel("AXIS 5/GAF Score:");
		lblAxis_5.setBounds(31, 924, 120, 16);
		Discharge.add(lblAxis_5);
		
		txtAxis5 = new JTextField();
		txtAxis5.setColumns(10);
		txtAxis5.setBounds(163, 916, 163, 28);
		Discharge.add(txtAxis5);
		
		txtAxisPost1 = new JTextField();
		txtAxisPost1.setColumns(10);
		txtAxisPost1.setBounds(408, 784, 163, 28);
		Discharge.add(txtAxisPost1);
		
		txtAxisPost2 = new JTextField();
		txtAxisPost2.setColumns(10);
		txtAxisPost2.setBounds(408, 816, 163, 28);
		Discharge.add(txtAxisPost2);
		
		txtAxisPost3 = new JTextField();
		txtAxisPost3.setColumns(10);
		txtAxisPost3.setBounds(408, 848, 163, 28);
		Discharge.add(txtAxisPost3);
		
		txtAxisPost4 = new JTextField();
		txtAxisPost4.setColumns(10);
		txtAxisPost4.setBounds(408, 880, 163, 28);
		Discharge.add(txtAxisPost4);
		
		txtAxisPost5 = new JTextField();
		txtAxisPost5.setColumns(10);
		txtAxisPost5.setBounds(408, 912, 163, 28);
		Discharge.add(txtAxisPost5);
		
		JLabel lblAtIntake = new JLabel("At Intake");
		lblAtIntake.setBounds(212, 760, 61, 16);
		Discharge.add(lblAtIntake);
		
		JLabel lblAtDischarge = new JLabel("At Discharge");
		lblAtDischarge.setBounds(444, 756, 94, 16);
		Discharge.add(lblAtDischarge);
		
		JLabel lblTransitionalPlanAnd = new JLabel("Transitional Plan and Counselor Recommendations");
		lblTransitionalPlanAnd.setBounds(21, 952, 337, 16);
		Discharge.add(lblTransitionalPlanAnd);
		
		txtTransPlans = new JTextField();
		txtTransPlans.setBounds(21, 977, 613, 66);
		Discharge.add(txtTransPlans);
		txtTransPlans.setColumns(10);
		
		JLabel lblRecommendationClientShould = new JLabel("Recommendation Client should return:");
		lblRecommendationClientShould.setBounds(22, 1069, 322, 16);
		Discharge.add(lblRecommendationClientShould);
		
		txtRecommendation = new JTextField();
		txtRecommendation.setBounds(22, 1097, 613, 28);
		Discharge.add(txtRecommendation);
		txtRecommendation.setColumns(10);
		
		JLabel lblClientsComments = new JLabel("Clients Comments upon discharge");
		lblClientsComments.setBounds(22, 1137, 269, 16);
		Discharge.add(lblClientsComments);
		
		txtClientComment = new JTextField();
		txtClientComment.setBounds(22, 1165, 613, 28);
		Discharge.add(txtClientComment);
		txtClientComment.setColumns(10);
		
		btnCompleteDischarge = new JButton("Complete Discharge");
		btnCompleteDischarge.setBounds(464, 1200, 171, 29);
		Discharge.add(btnCompleteDischarge);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(22, 1200, 117, 29);
		Discharge.add(btnCancel);
		
		JLabel lblContactName = new JLabel("Contact Name");
		lblContactName.setBounds(228, 728, 106, 16);
		Discharge.add(lblContactName);
		
		
		
		
		
	}
	public JComponent getPanel()
	{
		return Discharge;
	}
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
