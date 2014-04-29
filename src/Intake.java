import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Component;


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
	private JLabel lblNewLabel;
	private JButton btnExit;
	private JButton btnSubmit;
	private JButton btnAddSubstances;
	private JLabel lblCity;
	private JLabel lblState;
	private JLabel lblZipCode;
	private JLabel lblCounty;
	private JLabel lblYearsInCounty;
	private JLabel lblPhoneNumber;
	private JLabel lblSecondaryPhone;
	private JLabel lblSocialSecurityNumber;
	private JLabel lblDriversLicense;
	private JLabel lblDlState;
	private JLabel lblMaritalStatus;
	private JLabel lblSpouseName;

	/**
	 * @wbp.parser.entryPoint
	 */
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
		txtFirstName.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtFirstName.setBounds(20, 80, 200, 28);
		txtFirstName.setText("John");
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtLastName.setBounds(230, 80, 200, 28);
		txtLastName.setText("Doe");
		txtLastName.setColumns(10);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDateOfBirth.setBounds(440, 80, 100, 28);
		txtDateOfBirth.setText("1960-03-25");
		txtDateOfBirth.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAge.setBounds(550, 80, 40, 28);
		txtAge.setText("54");
		txtAge.setColumns(10);
		
		txtVet = new JTextField();
		txtVet.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtVet.setBounds(595, 80, 50, 28);
		txtVet.setText("y/n?");
		txtVet.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAddress.setBounds(20, 130, 280, 28);
		txtAddress.setText("123 Default Ave");
		txtAddress.setColumns(10);
		
		txtCity = new JTextField();
		txtCity.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtCity.setBounds(310, 130, 160, 28);
		txtCity.setText("Sacramento");
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtState.setBounds(480, 130, 80, 28);
		txtState.setText("California");
		txtState.setColumns(10);
		
		txtCounty = new JTextField();
		txtCounty.setBounds(20, 180, 180, 28);
		txtCounty.setText("Sacramento");
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
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setBounds(570, 130, 75, 28);
		textField.setText("95819");
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
		
		JLabel lblPatientInformation = new JLabel("CLIENT INFORMATION");
		lblPatientInformation.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPatientInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatientInformation.setBounds(0, 40, 665, 16);
		
		txtYears_1 = new JTextField();
		txtYears_1.setBounds(210, 180, 110, 28);
		txtYears_1.setText("2");
		txtYears_1.setColumns(10);
		
		txtPhoneNumber_1 = new JTextField();
		txtPhoneNumber_1.setBounds(330, 180, 150, 28);
		txtPhoneNumber_1.setText("916-555-5555");
		txtPhoneNumber_1.setColumns(10);
		
		txtSecondaryPhone = new JTextField();
		txtSecondaryPhone.setBounds(490, 180, 155, 28);
		txtSecondaryPhone.setText("916-555-5556");
		txtSecondaryPhone.setColumns(10);
		
		txtSocialSecurityNumber = new JTextField();
		txtSocialSecurityNumber.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSocialSecurityNumber.setBounds(20, 230, 140, 28);
		txtSocialSecurityNumber.setText("111-11-1111");
		txtSocialSecurityNumber.setColumns(10);
		
		txtDriversLicense = new JTextField();
		txtDriversLicense.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDriversLicense.setBounds(170, 230, 120, 28);
		txtDriversLicense.setText("D1234567");
		txtDriversLicense.setColumns(10);
		
		txtDlState = new JTextField();
		txtDlState.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDlState.setBounds(300, 231, 70, 28);
		txtDlState.setText("CA");
		txtDlState.setColumns(10);
		
		txtMaritalStatus = new JTextField();
		txtMaritalStatus.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtMaritalStatus.setBounds(380, 230, 110, 28);
		txtMaritalStatus.setText("Married");
		txtMaritalStatus.setColumns(10);
		
		txtName_1 = new JTextField();
		txtName_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtName_1.setBounds(500, 230, 145, 28);
		txtName_1.setText("Jane Doe");
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
		
		lblNewLabel = new JLabel("WEST SLOPE RECOVERY NEW CLIENT INTAKE");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 665, 30);
		Intake.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFirstName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblFirstName.setBounds(20, 60, 200, 20);
		Intake.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblLastName.setBounds(230, 60, 200, 20);
		Intake.add(lblLastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfBirth.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDateOfBirth.setBounds(440, 60, 100, 20);
		Intake.add(lblDateOfBirth);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAge.setBounds(550, 60, 40, 20);
		Intake.add(lblAge);
		
		JLabel lblVet = new JLabel("Vet?");
		lblVet.setHorizontalAlignment(SwingConstants.CENTER);
		lblVet.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblVet.setAlignmentX(0.5f);
		lblVet.setBounds(595, 60, 50, 20);
		Intake.add(lblVet);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAddress.setBounds(20, 110, 280, 20);
		Intake.add(lblAddress);
		
		lblCity = new JLabel("City");
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCity.setBounds(310, 110, 160, 20);
		Intake.add(lblCity);
		
		lblState = new JLabel("State");
		lblState.setHorizontalAlignment(SwingConstants.CENTER);
		lblState.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblState.setBounds(480, 110, 80, 20);
		Intake.add(lblState);
		
		lblZipCode = new JLabel("Zip Code");
		lblZipCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblZipCode.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblZipCode.setBounds(570, 110, 75, 20);
		Intake.add(lblZipCode);
		
		lblCounty = new JLabel("County");
		lblCounty.setHorizontalAlignment(SwingConstants.CENTER);
		lblCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCounty.setBounds(20, 160, 180, 20);
		Intake.add(lblCounty);
		
		lblYearsInCounty = new JLabel("Years in County");
		lblYearsInCounty.setHorizontalAlignment(SwingConstants.CENTER);
		lblYearsInCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblYearsInCounty.setBounds(210, 160, 110, 20);
		Intake.add(lblYearsInCounty);
		
		lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNumber.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPhoneNumber.setBounds(330, 160, 150, 20);
		Intake.add(lblPhoneNumber);
		
		lblSecondaryPhone = new JLabel("Secondary Phone");
		lblSecondaryPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondaryPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSecondaryPhone.setBounds(490, 160, 155, 20);
		Intake.add(lblSecondaryPhone);
		
		lblSocialSecurityNumber = new JLabel("Social Security #");
		lblSocialSecurityNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSocialSecurityNumber.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSocialSecurityNumber.setBounds(20, 210, 140, 20);
		Intake.add(lblSocialSecurityNumber);
		
		lblDriversLicense = new JLabel("Drivers License #");
		lblDriversLicense.setHorizontalAlignment(SwingConstants.CENTER);
		lblDriversLicense.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDriversLicense.setBounds(170, 210, 120, 20);
		Intake.add(lblDriversLicense);
		
		lblDlState = new JLabel("DL State");
		lblDlState.setHorizontalAlignment(SwingConstants.CENTER);
		lblDlState.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDlState.setBounds(300, 210, 70, 20);
		Intake.add(lblDlState);
		
		lblMaritalStatus = new JLabel("Marital Status");
		lblMaritalStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaritalStatus.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMaritalStatus.setBounds(380, 210, 110, 20);
		Intake.add(lblMaritalStatus);
		
		lblSpouseName = new JLabel("Spouse Name");
		lblSpouseName.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpouseName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSpouseName.setBounds(500, 210, 145, 20);
		Intake.add(lblSpouseName);
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
