import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Intake implements ActionListener
{

	private JPanel Intake;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtDateOfBirth;
	private JTextField txtAge;
	private JTextField txtVet;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtCounty;
	private JTextField txtName;
	private JTextField txtAddress_1;
	private JTextField txtCity_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtAgencyName;
	private JTextField txtAgencyContact;
	private JTextField txtCounty_1;
	private JTextField txtPhoneNumber;
	private JTextField txtAddress_2;
	private JTextField txtCity_2;
	private JTextField txtState_1;
	private JTextField txtZipCode;
	private JTextField txtCellPhone;
	private JTextField txtYears_1;
	private JTextField txtPhoneNumber_1;
	private JTextField txtSecondaryPhone;
	private JTextField txtSocialSecurityNumber;
	private JTextField txtDriversLicense;
	private JTextField txtDlState;
	private JTextField txtMaritalStatus;
	private JTextField txtName_1;
	private JLabel lblLegalInformation;
	private JCheckBox chckbxOnProbation;
	private JTextField txtWhy;
	private JTextField txtNameOfOfficer;
	private JTextField txtAddress_3;
	private JTextField txtPhone;
	private JLabel lblPhysicalAndMental;
	private JCheckBox chckbxPhysicalHospitalizationIn;
	private JCheckBox chckbxMentalHospitalizationIn;
	private JTextField txtWhy_1;
	private JTextField txtWhy_2;
	private JTextField txtHowMany;
	private JTextField txtWhereAndWhen;
	private JLabel label;
	private JLabel lblNewLabel;
	private JButton btnExit;
	private JButton btnSubmit;
	private JButton btnAddSubstances;

	public void BuildPanel() 
	{
		Intake = new JPanel();
		Intake.setSize(665, 905);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		btnExit.setBounds(229, 764, 75, 29);
		
		btnSubmit = new JButton("Continue");
		btnSubmit.addActionListener(this);
		btnSubmit.setBounds(334, 764, 101, 29);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(6, 106, 167, 28);
		txtFirstName.setText("First Name");
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(185, 106, 197, 28);
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setBounds(387, 106, 106, 28);
		txtDateOfBirth.setText("Date of Birth");
		txtDateOfBirth.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(505, 106, 41, 28);
		txtAge.setText("Age");
		txtAge.setColumns(10);
		
		txtVet = new JTextField();
		txtVet.setBounds(558, 106, 82, 28);
		txtVet.setText("VET:");
		txtVet.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(6, 146, 298, 28);
		txtAddress.setText("Address");
		txtAddress.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setBounds(316, 146, 148, 28);
		txtCity.setText("City");
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setBounds(476, 146, 68, 28);
		txtState.setText("State");
		txtState.setColumns(10);
		
		txtCounty = new JTextField();
		txtCounty.setBounds(6, 186, 212, 28);
		txtCounty.setText("County");
		txtCounty.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(6, 288, 240, 28);
		txtName.setText("Name");
		txtName.setColumns(10);
		
		JLabel lblEmergencyContact = new JLabel("EMERGENCY CONTACT");
		lblEmergencyContact.setBounds(261, 266, 143, 16);
		
		txtAddress_1 = new JTextField();
		txtAddress_1.setBounds(6, 328, 183, 28);
		txtAddress_1.setText("Address");
		txtAddress_1.setColumns(10);
		
		txtCity_1 = new JTextField();
		txtCity_1.setBounds(198, 324, 134, 28);
		txtCity_1.setText("City");
		txtCity_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(558, 146, 82, 28);
		textField.setText("Zip Code");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(258, 288, 213, 28);
		textField_1.setText("Relationship");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(476, 288, 164, 28);
		textField_2.setText("Primary Phone");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(476, 324, 164, 28);
		textField_3.setText("Secondary Phone");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(337, 324, 51, 28);
		textField_4.setText("State");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(399, 324, 72, 28);
		textField_5.setText("Zip Code");
		textField_5.setColumns(10);
		
		JLabel lblAgencyrelationshipcoordinator = new JLabel("AGENCY/RELATIONSHIP/COORDINATOR");
		lblAgencyrelationshipcoordinator.setBounds(206, 364, 253, 16);
		
		txtAgencyName = new JTextField();
		txtAgencyName.setBounds(6, 381, 183, 28);
		txtAgencyName.setText("Agency Name");
		txtAgencyName.setColumns(10);
		
		txtAgencyContact = new JTextField();
		txtAgencyContact.setBounds(198, 381, 134, 28);
		txtAgencyContact.setText("Agency Contact");
		txtAgencyContact.setColumns(10);
		
		txtCounty_1 = new JTextField();
		txtCounty_1.setBounds(337, 381, 134, 28);
		txtCounty_1.setText("County");
		txtCounty_1.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(476, 381, 164, 28);
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setColumns(10);
		
		txtAddress_2 = new JTextField();
		txtAddress_2.setBounds(6, 421, 183, 28);
		txtAddress_2.setText("Address");
		txtAddress_2.setColumns(10);
		
		txtCity_2 = new JTextField();
		txtCity_2.setBounds(198, 421, 134, 28);
		txtCity_2.setText("City");
		txtCity_2.setColumns(10);
		
		txtState_1 = new JTextField();
		txtState_1.setBounds(337, 421, 55, 28);
		txtState_1.setText("State");
		txtState_1.setColumns(10);
		
		txtZipCode = new JTextField();
		txtZipCode.setBounds(396, 421, 75, 28);
		txtZipCode.setText("zip code");
		txtZipCode.setColumns(10);
		
		txtCellPhone = new JTextField();
		txtCellPhone.setBounds(476, 421, 164, 28);
		txtCellPhone.setText("Cell Phone");
		txtCellPhone.setColumns(10);
		
		JLabel lblPatientInformation = new JLabel("PATIENT INFORMATION");
		lblPatientInformation.setBounds(255, 78, 148, 16);
		
		txtYears_1 = new JTextField();
		txtYears_1.setBounds(230, 186, 60, 28);
		txtYears_1.setText("Years");
		txtYears_1.setColumns(10);
		
		txtPhoneNumber_1 = new JTextField();
		txtPhoneNumber_1.setBounds(302, 186, 162, 28);
		txtPhoneNumber_1.setText("Phone Number");
		txtPhoneNumber_1.setColumns(10);
		
		txtSecondaryPhone = new JTextField();
		txtSecondaryPhone.setBounds(476, 186, 164, 28);
		txtSecondaryPhone.setText("Secondary Phone");
		txtSecondaryPhone.setColumns(10);
		
		txtSocialSecurityNumber = new JTextField();
		txtSocialSecurityNumber.setBounds(6, 226, 167, 28);
		txtSocialSecurityNumber.setText("Social Security Number");
		txtSocialSecurityNumber.setColumns(10);
		
		txtDriversLicense = new JTextField();
		txtDriversLicense.setBounds(185, 226, 111, 28);
		txtDriversLicense.setText("Drivers License");
		txtDriversLicense.setColumns(10);
		
		txtDlState = new JTextField();
		txtDlState.setBounds(302, 226, 80, 28);
		txtDlState.setText("DL State");
		txtDlState.setColumns(10);
		
		txtMaritalStatus = new JTextField();
		txtMaritalStatus.setBounds(393, 226, 100, 28);
		txtMaritalStatus.setText("Marital Status");
		txtMaritalStatus.setColumns(10);
		
		txtName_1 = new JTextField();
		txtName_1.setBounds(500, 226, 140, 28);
		txtName_1.setText("Name");
		txtName_1.setColumns(10);
		
		JCheckBox chckbxJailprobationInLast = new JCheckBox("Jail/Probation in last 30 days?");
		chckbxJailprobationInLast.setBounds(6, 481, 219, 23);
		
		lblLegalInformation = new JLabel("LEGAL INFORMATION");
		lblLegalInformation.setBounds(265, 461, 134, 16);
		
		chckbxOnProbation = new JCheckBox("On Probation?");
		chckbxOnProbation.setBounds(231, 481, 119, 23);
		
		txtWhy = new JTextField();
		txtWhy.setBounds(356, 479, 284, 28);
		txtWhy.setText("Why:");
		txtWhy.setColumns(10);
		
		txtNameOfOfficer = new JTextField();
		txtNameOfOfficer.setBounds(6, 519, 134, 28);
		txtNameOfOfficer.setText("Name of Officer");
		txtNameOfOfficer.setColumns(10);
		
		txtAddress_3 = new JTextField();
		txtAddress_3.setBounds(146, 519, 336, 28);
		txtAddress_3.setText("Address");
		txtAddress_3.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(494, 519, 146, 28);
		txtPhone.setText("Phone");
		txtPhone.setColumns(10);
		
		lblPhysicalAndMental = new JLabel("PHYSICAL AND MENTAL HEALTH");
		lblPhysicalAndMental.setBounds(230, 553, 205, 16);
		
		chckbxPhysicalHospitalizationIn = new JCheckBox("Physical Hospitalization in last 30 days?");
		chckbxPhysicalHospitalizationIn.setBounds(6, 575, 284, 23);
		
		chckbxMentalHospitalizationIn = new JCheckBox("Mental Hospitalization in last 30 days?");
		chckbxMentalHospitalizationIn.setBounds(6, 610, 284, 23);
		
		txtWhy_1 = new JTextField();
		txtWhy_1.setBounds(296, 573, 344, 28);
		txtWhy_1.setText("Why");
		txtWhy_1.setColumns(10);
		
		txtWhy_2 = new JTextField();
		txtWhy_2.setBounds(293, 608, 347, 28);
		txtWhy_2.setText("Why?");
		txtWhy_2.setColumns(10);
		
		btnAddSubstances = new JButton("ADD SUBSTANCES");
		btnAddSubstances.setBounds(253, 639, 157, 29);
		btnAddSubstances.addActionListener(this);
		
		JCheckBox chckbxIvUsedIn = new JCheckBox("IV used in last 12 months");
		chckbxIvUsedIn.setBounds(6, 673, 197, 23);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Prior treatment Plans");
		chckbxNewCheckBox.setBounds(205, 673, 162, 23);
		
		txtHowMany = new JTextField();
		txtHowMany.setBounds(374, 671, 266, 28);
		txtHowMany.setText("How Many");
		txtHowMany.setColumns(10);
		
		txtWhereAndWhen = new JTextField();
		txtWhereAndWhen.setBounds(6, 703, 634, 28);
		txtWhereAndWhen.setHorizontalAlignment(SwingConstants.LEFT);
		txtWhereAndWhen.setText("Where and When");
		txtWhereAndWhen.setColumns(10);
		
		JLabel lblCompleteAsamBefore = new JLabel("COMPLETE ASAM BEFORE CONTINUING!!!");
		lblCompleteAsamBefore.setBounds(205, 736, 255, 16);
		Intake.setLayout(null);
		Intake.add(txtAddress);
		Intake.add(txtFirstName);
		Intake.add(txtLastName);
		Intake.add(txtCounty);
		Intake.add(txtYears_1);
		Intake.add(txtCity);
		Intake.add(txtPhoneNumber_1);
		Intake.add(txtDateOfBirth);
		Intake.add(txtAge);
		Intake.add(txtVet);
		Intake.add(txtSecondaryPhone);
		Intake.add(txtState);
		Intake.add(textField);
		Intake.add(txtAddress_2);
		Intake.add(txtCity_2);
		Intake.add(txtState_1);
		Intake.add(txtZipCode);
		Intake.add(txtCellPhone);
		Intake.add(btnExit);
		Intake.add(lblPatientInformation);
		Intake.add(txtSocialSecurityNumber);
		Intake.add(txtDriversLicense);
		Intake.add(txtDlState);
		Intake.add(txtMaritalStatus);
		Intake.add(txtName_1);
		Intake.add(txtName);
		Intake.add(textField_1);
		Intake.add(textField_2);
		Intake.add(lblEmergencyContact);
		Intake.add(btnSubmit);
		Intake.add(lblCompleteAsamBefore);
		Intake.add(btnAddSubstances);
		Intake.add(lblPhysicalAndMental);
		Intake.add(txtNameOfOfficer);
		Intake.add(txtAddress_3);
		Intake.add(txtPhone);
		Intake.add(chckbxPhysicalHospitalizationIn);
		Intake.add(txtWhy_1);
		Intake.add(chckbxMentalHospitalizationIn);
		Intake.add(txtWhy_2);
		Intake.add(chckbxIvUsedIn);
		Intake.add(chckbxNewCheckBox);
		Intake.add(txtHowMany);
		Intake.add(txtWhereAndWhen);
		Intake.add(chckbxJailprobationInLast);
		Intake.add(lblLegalInformation);
		Intake.add(chckbxOnProbation);
		Intake.add(txtWhy);
		Intake.add(txtAgencyName);
		Intake.add(txtAgencyContact);
		Intake.add(txtCounty_1);
		Intake.add(txtPhoneNumber);
		Intake.add(lblAgencyrelationshipcoordinator);
		Intake.add(txtAddress_1);
		Intake.add(txtCity_1);
		Intake.add(textField_4);
		Intake.add(textField_5);
		Intake.add(textField_3);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("src//westSlopeImagesmall.jpg"));
		label.setBounds(0, 0, 94, 66);
		Intake.add(label);
		
		lblNewLabel = new JLabel("WEST SLOPE RECOVERY PATIENT MANAGEMENT");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(101, 0, 562, 66);
		Intake.add(lblNewLabel);
		Intake.setVisible(true);
	}
	
	public JComponent getPanel()
	{
		return Intake;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnExit)
		{
			
		}
		if(e.getSource()==btnSubmit)
		{
			
			new Admin();
		}
		if(e.getSource()==btnAddSubstances)
		{
			new SubstanceIntake();
		}
		
	}
}
