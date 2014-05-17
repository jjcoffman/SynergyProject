import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

import java.awt.event.MouseAdapter;



public class Discharge
{
	SQLRetrieveInfo dBase = new SQLRetrieveInfo();
	private static final long serialVersionUID = 1L;
	private JPanel Discharge;
	private JTextField txtDischargeDate;
	private JTextField txtTreatment;
	private JTextField txtGoal1;
	private JTextField txtGoal2;
	private JTextField txtGoal3;
	private JTextField txtGoal4;
	private JTextField txtGoal5;
	private JTextField txtGoal6;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private JTextField txtDrug;
	private JTextField txtCrim;
	private JTextField txtContactDate;
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
	private JLabel lblPatientName;
	private JLabel lblClientId;
	private Font text = new Font("Verdana", Font.PLAIN, 13);
	private JLabel lblAdmittanceDate;
	private JLabel lblContactName;
	private JLabel lblMmddyyyy;
	private JRadioButton chckbxY;
	private JRadioButton chckbxN;
	private JRadioButton chckbxSuccessfulCompletion;
	private JRadioButton chckbxDisciplinaryruleViolation;
	private JRadioButton chckbxNeedReferralFor;
	private JRadioButton chckbxDroppedOut;
	private JRadioButton chckbxHealthComplications;
	private JRadioButton chckbxFailToProgress;
	private JRadioButton chckbxLeftAgainstStaff;
	private JRadioButton chckbxIncarcerated;
	private JRadioButton chckbxDeathOfClient;
	private JRadioButton chckbxGood;
	private JRadioButton chckbxFair;
	private JRadioButton chckbxPoor;
	private JRadioButton radY1;
	private JRadioButton radY2;
	private JRadioButton radY3;
	private JRadioButton radY4;
	private JRadioButton radY5;
	private JRadioButton radY6;
	private JRadioButton radN1;
	private JRadioButton radN2;
	private JRadioButton radN3;
	private JRadioButton radN4;
	private JRadioButton radnN5;
	private JRadioButton radN6;
	private JCheckBox chckbxCurrentDrugUsage;
	private JCheckBox chckbxCriminalInvolvement;
	private JCheckBox chckbxPersonagencyNotified;
	private MyTableModel passed;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildGUI(int s, final MyTableModel table)
	{
		passed = table;
		Discharge = new JPanel();
		Discharge.setSize(665, 1250);
		Discharge.setLayout(null);
		
		lblPatientName = new JLabel("Patient Name");
		lblPatientName.setBounds(21, 27, 195, 16);
		lblPatientName.setFont(text);
		Discharge.add(lblPatientName);
		
		lblClientId = new JLabel("Client ID");
		lblClientId.setBounds(228, 27, 173, 16);
		lblClientId.setFont(text);
		Discharge.add(lblClientId);
		
		JLabel lblPresent = new JLabel("Present?");
		lblPresent.setBounds(458, 27, 61, 16);
		lblPresent.setFont(text);
		Discharge.add(lblPresent);
		
		chckbxY = new JRadioButton("Y");
		chckbxY.setFont(text);
		buttonGroup.add(chckbxY);
		chckbxY.setBounds(515, 20, 40, 23);
		Discharge.add(chckbxY);
		
		chckbxN = new JRadioButton("N");
		chckbxN.setFont(text);
		buttonGroup.add(chckbxN);
		chckbxN.setBounds(561, 20, 61, 23);
		Discharge.add(chckbxN);
		
		lblAdmittanceDate = new JLabel("Admittance Date");
		lblAdmittanceDate.setFont(text);
		lblAdmittanceDate.setBounds(21, 55, 152, 16);
		Discharge.add(lblAdmittanceDate);
		
		lblMmddyyyy = new JLabel("MM/DD/YYYY");
		lblMmddyyyy.setFont(text);
		lblMmddyyyy.setBounds(232, 55, 94, 16);
		Discharge.add(lblMmddyyyy);
		
		JLabel lblDischargeDate = new JLabel("Discharge Date:");
		lblDischargeDate.setFont(text);
		lblDischargeDate.setBounds(366, 55, 123, 16);
		Discharge.add(lblDischargeDate);
		
		txtDischargeDate = new JTextField();
		txtDischargeDate.setFont(text);
		txtDischargeDate.setBounds(501, 51, 134, 28);
		Discharge.add(txtDischargeDate);
		txtDischargeDate.setColumns(10);
		
		JLabel lblReasonForDischarge = new JLabel("Reason for Discharge");
		lblReasonForDischarge.setHorizontalAlignment(SwingConstants.CENTER);
		lblReasonForDischarge.setFont(text);
		lblReasonForDischarge.setBounds(250, 85, 164, 16);
		Discharge.add(lblReasonForDischarge);
		
		chckbxSuccessfulCompletion = new JRadioButton("Successful Completion");
		chckbxSuccessfulCompletion.setFont(text);
		buttonGroup_1.add(chckbxSuccessfulCompletion);
		chckbxSuccessfulCompletion.setBounds(19, 113, 237, 23);
		Discharge.add(chckbxSuccessfulCompletion);
		
		chckbxDisciplinaryruleViolation = new JRadioButton("Disciplinary/Rule Violation");
		chckbxDisciplinaryruleViolation.setFont(text);
		buttonGroup_1.add(chckbxDisciplinaryruleViolation);
		chckbxDisciplinaryruleViolation.setBounds(19, 148, 211, 23);
		Discharge.add(chckbxDisciplinaryruleViolation);
		
		chckbxNeedReferralFor = new JRadioButton("Need Referral for add. care");
		chckbxNeedReferralFor.setFont(text);
		buttonGroup_1.add(chckbxNeedReferralFor);
		chckbxNeedReferralFor.setBounds(19, 183, 254, 23);
		Discharge.add(chckbxNeedReferralFor);
		
		chckbxDroppedOut = new JRadioButton("Dropped Out");
		chckbxDroppedOut.setFont(text);
		buttonGroup_1.add(chckbxDroppedOut);
		chckbxDroppedOut.setBounds(261, 113, 128, 23);
		Discharge.add(chckbxDroppedOut);
		
		chckbxHealthComplications = new JRadioButton("Health Complications");
		chckbxHealthComplications.setFont(text);
		buttonGroup_1.add(chckbxHealthComplications);
		chckbxHealthComplications.setBounds(261, 148, 183, 23);
		Discharge.add(chckbxHealthComplications);
		
		chckbxFailToProgress = new JRadioButton("Fail to Progress");
		chckbxFailToProgress.setFont(text);
		buttonGroup_1.add(chckbxFailToProgress);
		chckbxFailToProgress.setBounds(261, 183, 145, 23);
		Discharge.add(chckbxFailToProgress);
		
		chckbxLeftAgainstStaff = new JRadioButton("Left against staff advice");
		chckbxLeftAgainstStaff.setFont(text);
		buttonGroup_1.add(chckbxLeftAgainstStaff);
		chckbxLeftAgainstStaff.setBounds(443, 113, 216, 23);
		Discharge.add(chckbxLeftAgainstStaff);
		
		chckbxIncarcerated = new JRadioButton("Incarcerated");
		chckbxIncarcerated.setFont(text);
		buttonGroup_1.add(chckbxIncarcerated);
		chckbxIncarcerated.setBounds(443, 148, 128, 23);
		Discharge.add(chckbxIncarcerated);
		
		chckbxDeathOfClient = new JRadioButton("Death of client");
		chckbxDeathOfClient.setFont(text);
		buttonGroup_1.add(chckbxDeathOfClient);
		chckbxDeathOfClient.setBounds(443, 183, 164, 23);
		Discharge.add(chckbxDeathOfClient);
		
		JLabel lblPrognosis = new JLabel("Prognosis:");
		lblPrognosis.setFont(text);
		lblPrognosis.setBounds(191, 226, 71, 16);
		Discharge.add(lblPrognosis);
		
		chckbxGood = new JRadioButton("Good");
		chckbxGood.setFont(text);
		buttonGroup_2.add(chckbxGood);
		chckbxGood.setBounds(263, 222, 71, 23);
		Discharge.add(chckbxGood);
		
		chckbxFair = new JRadioButton("Fair");
		chckbxFair.setFont(text);
		buttonGroup_2.add(chckbxFair);
		chckbxFair.setBounds(332, 222, 61, 23);
		Discharge.add(chckbxFair);
		
		chckbxPoor = new JRadioButton("Poor");
		chckbxPoor.setFont(text);
		buttonGroup_2.add(chckbxPoor);
		chckbxPoor.setBounds(393, 222, 67, 23);
		Discharge.add(chckbxPoor);
		
		JLabel lblTreatmentSummary = new JLabel("Treatment Summary");
		lblTreatmentSummary.setFont(text);
		lblTreatmentSummary.setBounds(21, 257, 152, 16);
		Discharge.add(lblTreatmentSummary);
		
		txtTreatment = new JTextField();
		txtTreatment.setFont(text);
		txtTreatment.setBounds(21, 292, 606, 109);
		Discharge.add(txtTreatment);
		txtTreatment.setColumns(10);
		
		JLabel lblTreatmentPlanGoals = new JLabel("Treatment Plan Goals");
		lblTreatmentPlanGoals.setFont(text);
		lblTreatmentPlanGoals.setBounds(21, 413, 152, 16);
		Discharge.add(lblTreatmentPlanGoals);
		
		JLabel label_1 = new JLabel("1.");
		label_1.setFont(text);
		label_1.setBounds(31, 447, 21, 16);
		Discharge.add(label_1);
		
		JLabel label_2 = new JLabel("2.");
		label_2.setFont(text);
		label_2.setBounds(31, 480, 21, 16);
		Discharge.add(label_2);
		
		JLabel label_3 = new JLabel("3.");
		label_3.setFont(text);
		label_3.setBounds(31, 513, 21, 16);
		Discharge.add(label_3);
		
		JLabel label_4 = new JLabel("4.");
		label_4.setBounds(32, 546, 21, 16);
		Discharge.add(label_4);
		
		JLabel label_5 = new JLabel("5.");
		label_5.setFont(text);
		label_5.setBounds(31, 579, 21, 16);
		Discharge.add(label_5);
		
		JLabel label_6 = new JLabel("6.");
		label_6.setFont(text);
		label_6.setBounds(31, 612, 21, 16);
		Discharge.add(label_6);
		
		txtGoal1 = new JTextField();
		txtGoal1.setFont(text);
		txtGoal1.setBounds(49, 441, 352, 28);
		Discharge.add(txtGoal1);
		txtGoal1.setColumns(10);
		
		txtGoal2 = new JTextField();
		txtGoal2.setColumns(10);
		txtGoal2.setFont(text);
		txtGoal2.setBounds(49, 474, 352, 28);
		Discharge.add(txtGoal2);
		
		txtGoal3 = new JTextField();
		txtGoal3.setFont(text);
		txtGoal3.setColumns(10);
		txtGoal3.setBounds(49, 507, 352, 28);
		Discharge.add(txtGoal3);
		
		txtGoal4 = new JTextField();
		txtGoal4.setFont(text);
		txtGoal4.setColumns(10);
		txtGoal4.setBounds(49, 540, 352, 28);
		Discharge.add(txtGoal4);
		
		txtGoal5 = new JTextField();
		txtGoal5.setColumns(10);
		txtGoal5.setFont(text);
		txtGoal5.setBounds(49, 573, 352, 28);
		Discharge.add(txtGoal5);
		
		txtGoal6 = new JTextField();
		txtGoal6.setColumns(10);
		txtGoal6.setFont(text);
		txtGoal6.setBounds(49, 606, 352, 28);
		Discharge.add(txtGoal6);
		
		JLabel lblGoalsMet = new JLabel("Goals Met:");
		lblGoalsMet.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoalsMet.setBounds(458, 413, 97, 16);
		lblGoalsMet.setFont(text);
		Discharge.add(lblGoalsMet);
		
		radY1 = new JRadioButton("Y");
		buttonGroup_3.add(radY1);
		radY1.setFont(text);
		radY1.setBounds(456, 443, 47, 23);
		Discharge.add(radY1);
		
		radY2 = new JRadioButton("Y");
		radY2.setFont(text);
		buttonGroup_4.add(radY2);
		radY2.setBounds(456, 476, 47, 23);
		Discharge.add(radY2);
		
		radY3 = new JRadioButton("Y");
		radY3.setFont(text);
		buttonGroup_5.add(radY3);
		radY3.setBounds(456, 509, 47, 23);
		Discharge.add(radY3);
		
		radY4 = new JRadioButton("Y");
		radY4.setFont(text);
		buttonGroup_6.add(radY4);
		radY4.setBounds(456, 542, 47, 23);
		Discharge.add(radY4);
		
		radY5 = new JRadioButton("Y");
		radY5.setFont(text);
		buttonGroup_7.add(radY5);
		radY5.setBounds(456, 575, 47, 23);
		Discharge.add(radY5);
		
		radY6 = new JRadioButton("Y");
		radY6.setFont(text);
		buttonGroup_8.add(radY6);
		radY6.setBounds(456, 608, 47, 23);
		Discharge.add(radY6);
		
		radN1 = new JRadioButton("N");
		radN1.setFont(text);
		buttonGroup_3.add(radN1);
		radN1.setBounds(518, 443, 47, 23);
		Discharge.add(radN1);
		
		radN2 = new JRadioButton("N");
		radN2.setFont(text);
		buttonGroup_4.add(radN2);
		radN2.setBounds(518, 476, 47, 23);
		Discharge.add(radN2);
		
		radN3 = new JRadioButton("N");
		radN3.setFont(text);
		buttonGroup_5.add(radN3);
		radN3.setBounds(518, 509, 47, 23);
		Discharge.add(radN3);
		
		radN4 = new JRadioButton("N");
		radN4.setFont(text);
		buttonGroup_6.add(radN4);
		radN4.setBounds(518, 542, 47, 23);
		Discharge.add(radN4);
		
		radnN5 = new JRadioButton("N");
		radnN5.setFont(text);
		buttonGroup_7.add(radnN5);
		radnN5.setBounds(518, 575, 47, 23);
		Discharge.add(radnN5);
		
		radN6 = new JRadioButton("N");
		radN6.setFont(text);
		buttonGroup_8.add(radN6);
		radN6.setBounds(518, 608, 47, 23);
		Discharge.add(radN6);

		chckbxCurrentDrugUsage = new JCheckBox("Current Drug Usage:");
		chckbxCurrentDrugUsage.setFont(text);
		chckbxCurrentDrugUsage.setBounds(21, 656, 176, 23);
		Discharge.add(chckbxCurrentDrugUsage);
		
		txtDrug = new JTextField();
		txtDrug.setFont(text);
		txtDrug.setBounds(231, 654, 391, 28);
		Discharge.add(txtDrug);
		txtDrug.setColumns(10);
		
		chckbxCriminalInvolvement = new JCheckBox("Criminal Involvement");
		chckbxCriminalInvolvement.setFont(text);
		chckbxCriminalInvolvement.setBounds(21, 691, 176, 23);
		Discharge.add(chckbxCriminalInvolvement);
		
		txtCrim = new JTextField();
		txtCrim.setFont(text);
		txtCrim.setBounds(231, 688, 391, 28);
		Discharge.add(txtCrim);
		txtCrim.setColumns(10);
		
		chckbxPersonagencyNotified = new JCheckBox("Person/Agency Notified");
		chckbxPersonagencyNotified.setFont(text);
		chckbxPersonagencyNotified.setBounds(21, 725, 192, 23);
		Discharge.add(chckbxPersonagencyNotified);

		
		
		txtContactDate = new JTextField();
		txtContactDate.setColumns(10);
		txtContactDate.setFont(text);
		txtContactDate.setBounds(458, 723, 164, 28);
		Discharge.add(txtContactDate);
		
		JLabel lblContactDate = new JLabel("Contact Date");
		lblContactDate.setFont(text);
		lblContactDate.setBounds(366, 728, 94, 16);
		Discharge.add(lblContactDate);
		
		JLabel lblAxis = new JLabel("AXIS 1:");
		lblAxis.setFont(text);
		lblAxis.setBounds(59, 800, 61, 16);
		Discharge.add(lblAxis);
		
		txtAxis1 = new JTextField();
		txtAxis1.setFont(text);
		txtAxis1.setBounds(163, 788, 163, 28);
		Discharge.add(txtAxis1);
		txtAxis1.setColumns(10);
		
		JLabel lblAxis_2 = new JLabel("AXIS 2:");
		lblAxis_2.setFont(text);
		lblAxis_2.setBounds(59, 831, 61, 16);
		Discharge.add(lblAxis_2);
		
		txtAxis2 = new JTextField();
		txtAxis2.setFont(text);
		txtAxis2.setColumns(10);
		txtAxis2.setBounds(163, 820, 163, 28);
		Discharge.add(txtAxis2);
		
		JLabel lblAxis_3 = new JLabel("AXIS 3:");
		lblAxis_3.setFont(text);
		lblAxis_3.setBounds(59, 862, 61, 16);
		Discharge.add(lblAxis_3);
		
		txtAxis3 = new JTextField();
		txtAxis3.setColumns(10);
		txtAxis3.setFont(text);
		txtAxis3.setBounds(163, 852, 163, 28);
		Discharge.add(txtAxis3);
		
		JLabel lblAxis_4 = new JLabel("AXIS 4:");
		lblAxis_4.setFont(text);
		lblAxis_4.setBounds(59, 893, 61, 16);
		Discharge.add(lblAxis_4);
		
		txtAxis4 = new JTextField();
		txtAxis4.setFont(text);
		txtAxis4.setColumns(10);
		txtAxis4.setBounds(163, 884, 163, 28);
		Discharge.add(txtAxis4);
		
		JLabel lblAxis_5 = new JLabel("AXIS 5/GAF Score:");
		lblAxis_5.setFont(text);
		lblAxis_5.setBounds(31, 924, 120, 16);
		Discharge.add(lblAxis_5);
		
		txtAxis5 = new JTextField();
		txtAxis5.setColumns(10);
		txtAxis5.setFont(text);
		txtAxis5.setBounds(163, 916, 163, 28);
		Discharge.add(txtAxis5);
		
		txtAxisPost1 = new JTextField();
		txtAxisPost1.setColumns(10);
		txtAxisPost1.setFont(text);
		txtAxisPost1.setBounds(408, 784, 163, 28);
		Discharge.add(txtAxisPost1);
		
		txtAxisPost2 = new JTextField();
		txtAxisPost2.setColumns(10);
		txtAxisPost2.setFont(text);
		txtAxisPost2.setBounds(408, 816, 163, 28);
		Discharge.add(txtAxisPost2);
		
		txtAxisPost3 = new JTextField();
		txtAxisPost3.setColumns(10);
		txtAxisPost3.setFont(text);
		txtAxisPost3.setBounds(408, 848, 163, 28);
		Discharge.add(txtAxisPost3);
		
		txtAxisPost4 = new JTextField();
		txtAxisPost4.setColumns(10);
		txtAxisPost4.setFont(text);
		txtAxisPost4.setBounds(408, 880, 163, 28);
		Discharge.add(txtAxisPost4);
		
		txtAxisPost5 = new JTextField();
		txtAxisPost5.setColumns(10);
		txtAxisPost5.setFont(text);
		txtAxisPost5.setBounds(408, 912, 163, 28);
		Discharge.add(txtAxisPost5);
		
		JLabel lblAtIntake = new JLabel("At Intake");
		lblAtIntake.setBounds(212, 760, 61, 16);
		lblAtIntake.setFont(text);
		Discharge.add(lblAtIntake);
		
		JLabel lblAtDischarge = new JLabel("At Discharge");
		lblAtDischarge.setBounds(444, 756, 94, 16);
		lblAtDischarge.setFont(text);
		Discharge.add(lblAtDischarge);
		
		JLabel lblTransitionalPlanAnd = new JLabel("Transitional Plan and Counselor Recommendations");
		lblTransitionalPlanAnd.setBounds(21, 952, 468, 16);
		lblTransitionalPlanAnd.setFont(text);
		Discharge.add(lblTransitionalPlanAnd);
		
		txtTransPlans = new JTextField();
		txtTransPlans.setBounds(21, 977, 613, 66);
		txtTransPlans.setFont(text);
		Discharge.add(txtTransPlans);
		txtTransPlans.setColumns(10);
		
		JLabel lblRecommendationClientShould = new JLabel("Recommendation Client should return:");
		lblRecommendationClientShould.setFont(text);
		lblRecommendationClientShould.setBounds(22, 1069, 322, 16);
		Discharge.add(lblRecommendationClientShould);
		
		txtRecommendation = new JTextField();
		txtRecommendation.setFont(text);
		txtRecommendation.setBounds(22, 1097, 613, 28);
		Discharge.add(txtRecommendation);
		txtRecommendation.setColumns(10);
		
		JLabel lblClientsComments = new JLabel("Clients Comments upon discharge");
		lblClientsComments.setBounds(22, 1137, 269, 16);
		lblClientsComments.setFont(text);
		Discharge.add(lblClientsComments);
		
		txtClientComment = new JTextField();
		txtClientComment.setBounds(22, 1165, 613, 28);
		txtClientComment.setFont(text);
		Discharge.add(txtClientComment);
		txtClientComment.setColumns(10);
		
		btnCompleteDischarge = new JButton("Complete Discharge");
		btnCompleteDischarge.setBounds(464, 1200, 171, 29);
		btnCompleteDischarge.setFont(text);
		btnCompleteDischarge.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{ sendData(passed);}
		});
		Discharge.add(btnCompleteDischarge);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(text);
		btnCancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{ DischargeScroll.closeWindow();}
		});
		btnCancel.setBounds(22, 1200, 117, 29);

		Discharge.add(btnCancel);
		
		lblContactName = new JLabel("Contact Name");
		lblContactName.setFont(text);
		lblContactName.setBounds(228, 728, 106, 16);
		Discharge.add(lblContactName);	
		importData(s);
		
	}
	
	private void importData(int s)
	{
		Object[] data = new Object[90];
		data = dBase.getClientDischarge(s);
		int i = 0;
		
		try 
		{
			lblPatientName.setText("Client: " + (String) data[i++] + " " + (String) data[i++]);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			lblPatientName.setText(""); i++;
		}
		try 
		{
			lblClientId.setText("ID: " + (String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			lblClientId.setText(""); i++;
		}
		try 
		{
			lblMmddyyyy.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			lblMmddyyyy.setText(""); i++;
		}
		try 
		{
			lblContactName.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			lblContactName.setText(""); i++;
		}
	}
	
	private void sendData(MyTableModel table) 
	{
		Object[] data;
		boolean cont = validateInput();
		if(cont == true)
		{
			data = new Object[95];
			int i = 0;
			data[i] = lblClientId.getText();i++; 
			
			
			if(chckbxSuccessfulCompletion.isSelected())
			{
				data[1] = "Successful Program Completion";
				data[2] = 1;
			}
			else if(chckbxDisciplinaryruleViolation.isSelected())
			{
				data[1] = "Disciplinary/Rule Violation";
				data[2] = 0;
			}
			else if(chckbxNeedReferralFor.isSelected())
			{
				data[1] = "Refer. for Additional Care";
				data[2] = 0;
			}
			else if(chckbxDroppedOut.isSelected())
			{
				data[1] = "Dropped Out";
				data[2] = 0;
			}
			else if(chckbxHealthComplications.isSelected())
			{
				data[1] = "Health Complications";
				data[2] = 0;
			}
			else if(chckbxFailToProgress.isSelected())
			{
				data[1] = "Failed to Progress";
				data[2] = 0;
			}
			else if(chckbxLeftAgainstStaff.isSelected())
			{
				data[1] = "Left Against Staff Recommendation";
				data[2] = 0;
			}
			else if(chckbxIncarcerated.isSelected())
			{
				data[1] = "Incarcerated";
				data[2] = 0;
			}
			else if(chckbxDeathOfClient.isSelected())
			{
				data[1] = "Death of Client";
				data[2] = 0;
			}
			i = 3; //update for the next values
			
			if(chckbxGood.isSelected())
			{
				data[i] = "Good";i++;
			}
			else if(chckbxFair.isSelected())
			{
				data[i] = "Fair";i++;
			}
			else if(chckbxPoor.isSelected())
			{
				data[i] = "Poor";i++;
			}
			else
				data[i] = "NONE";i++;
			
			data[i] = txtTreatment.getText();i++;
			data[i] = txtGoal1.getText();i++;
			if(radY1.isSelected()){
				data[i] = 1;i++;}
			else{
				data[i] = 1;i++;}
			data[i] = txtGoal2.getText();i++;
			if(radY2.isSelected()){
				data[i] = 1;i++;}
			else{
				data[i] = 1;i++;}	
			data[i] = txtGoal3.getText();i++;
			if(radY3.isSelected()){
				data[i] = 1;i++;}
			else{
				data[i] = 1;i++;}	
			data[i] = txtGoal4.getText();i++;
			if(radY4.isSelected()){
				data[i] = 1;i++;}
			else{
				data[i] = 1;i++;}	
			data[i] = txtGoal5.getText();i++;
			if(radY5.isSelected()){
				data[i] = 1;i++;}
			else{
				data[i] = 1;i++;}	
			data[i] = txtGoal6.getText();i++;
			if(radY6.isSelected()){
				data[i] = 1;i++;}
			else{
				data[i] = 1;i++;}	
			
			if(chckbxCurrentDrugUsage.isSelected())
			{
				data[i] = 1;i++;
			}
			else
			{data[i] = 0;i++;}
			data[i] = txtDrug.getText();i++;
			
			if(chckbxCriminalInvolvement.isSelected())
			{
				data[i] = 1;i++;
			}
			else
			{data[i] = 0;i++;}
			data[i] = txtCrim.getText();i++;
			
			if(chckbxPersonagencyNotified.isSelected())
			{
				data[i] = 1;i++;
			}
			else
			{data[i] = 0;i++;}
			data[i] = txtContactDate.getText();i++; //17
			
			data[i] = txtAxis1.getText();i++;
			data[i] = txtAxis2.getText();i++;
			data[i] = txtAxis3.getText();i++;
			data[i] = txtAxis4.getText();i++;
			data[i] = txtAxis5.getText();i++;
			
			data[i] = txtAxisPost1.getText();i++;
			data[i] = txtAxisPost2.getText();i++;
			data[i] = txtAxisPost3.getText();i++;
			data[i] = txtAxisPost4.getText();i++;
			data[i] = txtAxisPost5.getText();i++; //27
			
			data[i] = txtTransPlans.getText();i++;
			data[i] = txtRecommendation.getText();i++;
			data[i] = txtClientComment.getText();i++;
			
			data[i] = txtDischargeDate.getText(); //31 starting from 0
			 

		new FinancialsDischarge(data, passed);
		Object[][] tData = getExisting();
		table.update(tData);
		
		
		
		DischargeScroll.closeWindow();
		}
	}	

	private boolean validateInput() 
	{
		Boolean valid = true;
		
		if(!txtDischargeDate.getText().matches("\\d{2}\\/\\d{2}\\/\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "Middle initial must be 1 letter only");
		}
		if(!txtContactDate.getText().matches("\\d{2}\\/\\d{2}\\/\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "Middle initial must be 1 letter only");
		}
		return valid;
	}

	public JComponent getPanel()
	{
		return Discharge;
	}
	//This will fill the object array with the data from the the existing users
		public Object[][] getExisting()
		{
			//Object[][] data = {{12342,"Clint Eastwood"},{23423,"Will Clark"},{34454,"Barry Bonds"},{34552,"Derek Jeter"}};
			//return data;
			try {
				int size = dBase.getSize("Client_Record");
			
			Object[][] data = new Object[size][2];
			for (int i = 1; i <= size; i++){
				data[i-1] = dBase.getRows(i - 1, 1);
			}
			System.out.println("rows in client_record: " + dBase.getSize("Client_Record"));
			return data;
			}
			catch(NullPointerException e) {
				System.out.println("No database connected!");
				Object[][] data = {{"No database", "Connected"}};
				return data;
			} 
		}
}
