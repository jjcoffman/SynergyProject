import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Discharge2
{
	private static final long serialVersionUID = 1L;
	private JPanel Discharge2;
	private JTextField txtDrugUsage;
	private JTextField txtCriminal;
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
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void buildPanel()
	{
		Discharge2 = new JPanel();
		Discharge2.setSize(665, 620);
		Discharge2.setLayout(null);
		Discharge2.setLayout(null);
		
		JCheckBox chckbxCurrentDrugUsage = new JCheckBox("Current Drug Usage:");
		chckbxCurrentDrugUsage.setBounds(18, 26, 160, 23);
		Discharge2.add(chckbxCurrentDrugUsage);
		
		txtDrugUsage = new JTextField();
		txtDrugUsage.setBounds(246, 24, 385, 28);
		Discharge2.add(txtDrugUsage);
		txtDrugUsage.setColumns(10);
		
		JCheckBox chckbxCurrentCriminalInvolvement = new JCheckBox("Current Criminal Involvement:");
		chckbxCurrentCriminalInvolvement.setBounds(18, 66, 221, 23);
		Discharge2.add(chckbxCurrentCriminalInvolvement);
		
		txtCriminal = new JTextField();
		txtCriminal.setColumns(10);
		txtCriminal.setBounds(246, 64, 385, 28);
		Discharge2.add(txtCriminal);
		
		JCheckBox chckbxPersonagencyNotified = new JCheckBox("Person/Agency Notified");
		chckbxPersonagencyNotified.setBounds(18, 112, 187, 23);
		Discharge2.add(chckbxPersonagencyNotified);
		
		JLabel lblContactName = new JLabel("Contact Name");
		lblContactName.setBounds(246, 116, 94, 16);
		Discharge2.add(lblContactName);
		
		JLabel lblContactDate = new JLabel("Contact Date:");
		lblContactDate.setBounds(393, 116, 91, 16);
		Discharge2.add(lblContactDate);
		
		txtContactDate = new JTextField();
		txtContactDate.setBounds(496, 110, 134, 28);
		Discharge2.add(txtContactDate);
		txtContactDate.setColumns(10);
		
		JLabel lblAxis = new JLabel("AXIS 1:");
		lblAxis.setBounds(73, 188, 61, 16);
		Discharge2.add(lblAxis);
		
		txtAxis1 = new JTextField();
		txtAxis1.setBounds(177, 176, 163, 28);
		Discharge2.add(txtAxis1);
		txtAxis1.setColumns(10);
		
		JLabel lblAxis_2 = new JLabel("AXIS 2:");
		lblAxis_2.setBounds(73, 219, 61, 16);
		Discharge2.add(lblAxis_2);
		
		txtAxis2 = new JTextField();
		txtAxis2.setColumns(10);
		txtAxis2.setBounds(177, 208, 163, 28);
		Discharge2.add(txtAxis2);
		
		JLabel lblAxis_3 = new JLabel("AXIS 3:");
		lblAxis_3.setBounds(73, 250, 61, 16);
		Discharge2.add(lblAxis_3);
		
		txtAxis3 = new JTextField();
		txtAxis3.setColumns(10);
		txtAxis3.setBounds(177, 240, 163, 28);
		Discharge2.add(txtAxis3);
		
		JLabel lblAxis_4 = new JLabel("AXIS 4:");
		lblAxis_4.setBounds(73, 281, 61, 16);
		Discharge2.add(lblAxis_4);
		
		txtAxis4 = new JTextField();
		txtAxis4.setColumns(10);
		txtAxis4.setBounds(177, 272, 163, 28);
		Discharge2.add(txtAxis4);
		
		JLabel lblAxis_5 = new JLabel("AXIS 5/GAF Score:");
		lblAxis_5.setBounds(45, 312, 120, 16);
		Discharge2.add(lblAxis_5);
		
		txtAxis5 = new JTextField();
		txtAxis5.setColumns(10);
		txtAxis5.setBounds(177, 304, 163, 28);
		Discharge2.add(txtAxis5);
		
		txtAxisPost1 = new JTextField();
		txtAxisPost1.setColumns(10);
		txtAxisPost1.setBounds(437, 176, 163, 28);
		Discharge2.add(txtAxisPost1);
		
		txtAxisPost2 = new JTextField();
		txtAxisPost2.setColumns(10);
		txtAxisPost2.setBounds(437, 208, 163, 28);
		Discharge2.add(txtAxisPost2);
		
		txtAxisPost3 = new JTextField();
		txtAxisPost3.setColumns(10);
		txtAxisPost3.setBounds(437, 240, 163, 28);
		Discharge2.add(txtAxisPost3);
		
		txtAxisPost4 = new JTextField();
		txtAxisPost4.setColumns(10);
		txtAxisPost4.setBounds(437, 272, 163, 28);
		Discharge2.add(txtAxisPost4);
		
		txtAxisPost5 = new JTextField();
		txtAxisPost5.setColumns(10);
		txtAxisPost5.setBounds(437, 304, 163, 28);
		Discharge2.add(txtAxisPost5);
		
		JLabel lblAtIntake = new JLabel("At Intake");
		lblAtIntake.setBounds(226, 148, 61, 16);
		Discharge2.add(lblAtIntake);
		
		JLabel lblAtDischarge = new JLabel("At Discharge");
		lblAtDischarge.setBounds(473, 148, 94, 16);
		Discharge2.add(lblAtDischarge);
		
		JLabel lblTransitionalPlanAnd = new JLabel("Transitional Plan and Counselor Recommendations");
		lblTransitionalPlanAnd.setBounds(18, 344, 337, 16);
		Discharge2.add(lblTransitionalPlanAnd);
		
		txtTransPlans = new JTextField();
		txtTransPlans.setBounds(18, 369, 613, 66);
		Discharge2.add(txtTransPlans);
		txtTransPlans.setColumns(10);
		
		JLabel lblRecommendationClientShould = new JLabel("Recommendation Client should return:");
		lblRecommendationClientShould.setBounds(18, 447, 322, 16);
		Discharge2.add(lblRecommendationClientShould);
		
		txtRecommendation = new JTextField();
		txtRecommendation.setBounds(18, 475, 613, 28);
		Discharge2.add(txtRecommendation);
		txtRecommendation.setColumns(10);
		
		JLabel lblClientsComments = new JLabel("Clients Comments upon discharge");
		lblClientsComments.setBounds(18, 515, 269, 16);
		Discharge2.add(lblClientsComments);
		
		txtClientComment = new JTextField();
		txtClientComment.setBounds(18, 543, 613, 28);
		Discharge2.add(txtClientComment);
		txtClientComment.setColumns(10);
		
		btnCompleteDischarge = new JButton("Complete Discharge");
		btnCompleteDischarge.setBounds(460, 578, 171, 29);
		Discharge2.add(btnCompleteDischarge);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(18, 578, 117, 29);
		Discharge2.add(btnCancel);
		
		
		
		
		Discharge2.setVisible(true);
	}
	public JComponent getPanel()
	{
		return Discharge2;
	}
}
