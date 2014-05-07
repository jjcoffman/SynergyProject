import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

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
	private JTextField txtEmergencyAddress;
	private JTextField txtEmergencyCity;
	private JTextField txtZip;
	private JTextField textRelationship;
	private JTextField textEmergencyPhone;
	private JTextField txtEmergencySecondary;
	private JTextField textEmergencyState;
	private JTextField textEmergencyZip;
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
	private JTextField textField;
	private JLabel lblSecondaryPhone_1;
	private JTable table;
	private MyTableModel model;
	private JTextComponent txtName;
	private JTextField txtSubs1;
	private JTextField txtSubsDate1;
	private JTextField txtSubsFreq1;
	private JTextField txtsubsAmount1;
	private JTextField txtSubsMeth1;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void BuildPanel() 
	{
		Intake = new JPanel();
		Intake.setSize(665, 905);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		btnExit.setBounds(234, 870, 75, 29);
		
		btnSubmit = new JButton("Continue");
		btnSubmit.addActionListener(this);
		btnSubmit.setBounds(339, 870, 101, 29);
		
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
		
		JLabel lblEmergencyContact = new JLabel("EMERGENCY CONTACT");
		lblEmergencyContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmergencyContact.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEmergencyContact.setBounds(0, 270, 665, 16);
		
		txtEmergencyAddress = new JTextField();
		txtEmergencyAddress.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtEmergencyAddress.setBounds(20, 358, 280, 28);
		txtEmergencyAddress.setColumns(10);
		
		txtEmergencyCity = new JTextField();
		txtEmergencyCity.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtEmergencyCity.setBounds(310, 358, 160, 28);
		txtEmergencyCity.setColumns(10);
		
		txtZip = new JTextField();
		txtZip.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtZip.setBounds(570, 130, 75, 28);
		txtZip.setText("95819");
		txtZip.setColumns(10);
		
		textRelationship = new JTextField();
		textRelationship.setFont(new Font("Verdana", Font.PLAIN, 13));
		textRelationship.setBounds(230, 308, 150, 28);
		textRelationship.setColumns(10);
		
		textEmergencyPhone = new JTextField();
		textEmergencyPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		textEmergencyPhone.setBounds(385, 308, 125, 28);
		textEmergencyPhone.setColumns(10);
		
		txtEmergencySecondary = new JTextField();
		txtEmergencySecondary.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtEmergencySecondary.setBounds(520, 308, 125, 28);
		txtEmergencySecondary.setColumns(10);
		
		textEmergencyState = new JTextField();
		textEmergencyState.setFont(new Font("Verdana", Font.PLAIN, 13));
		textEmergencyState.setBounds(480, 358, 80, 28);
		textEmergencyState.setColumns(10);
		
		textEmergencyZip = new JTextField();
		textEmergencyZip.setFont(new Font("Verdana", Font.PLAIN, 13));
		textEmergencyZip.setBounds(570, 358, 75, 28);
		textEmergencyZip.setColumns(10);
		
		JLabel lblAgencyrelationshipcoordinator = new JLabel("AGENCY/RELATIONSHIP/COORDINATOR");
		lblAgencyrelationshipcoordinator.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAgencyrelationshipcoordinator.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencyrelationshipcoordinator.setBounds(0, 398, 665, 16);
		
		txtAgencyName = new JTextField();
		txtAgencyName.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyName.setBounds(20, 446, 200, 28);
		txtAgencyName.setColumns(10);
		
		txtAgencyContact = new JTextField();
		txtAgencyContact.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyContact.setBounds(230, 446, 130, 28);
		txtAgencyContact.setColumns(10);
		
		txtCounty_1 = new JTextField();
		txtCounty_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtCounty_1.setBounds(370, 446, 130, 28);
		txtCounty_1.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtPhoneNumber.setBounds(510, 447, 135, 28);
		txtPhoneNumber.setColumns(10);
		
		txtAddress_2 = new JTextField();
		txtAddress_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAddress_2.setBounds(20, 498, 180, 28);
		txtAddress_2.setColumns(10);
		
		txtCity_2 = new JTextField();
		txtCity_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtCity_2.setBounds(210, 498, 130, 28);
		txtCity_2.setColumns(10);
		
		txtState_1 = new JTextField();
		txtState_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtState_1.setBounds(350, 498, 60, 28);
		txtState_1.setColumns(10);
		
		txtZipCode = new JTextField();
		txtZipCode.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtZipCode.setBounds(420, 499, 80, 28);
		txtZipCode.setColumns(10);
		
		txtCellPhone = new JTextField();
		txtCellPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtCellPhone.setBounds(510, 499, 135, 28);
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
		chckbxJailprobationInLast.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxJailprobationInLast.setBounds(20, 566, 240, 23);
		
		lblLegalInformation = new JLabel("LEGAL INFORMATION");
		lblLegalInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLegalInformation.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblLegalInformation.setBounds(0, 538, 665, 16);
		
		chckbxOnProbation = new JCheckBox("On Probation?");
		chckbxOnProbation.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxOnProbation.setBounds(260, 566, 135, 23);
		
		txtWhy = new JTextField();
		txtWhy.setBounds(400, 566, 245, 28);
		txtWhy.setText("Why:");
		txtWhy.setColumns(10);
		
		txtNameOfOfficer = new JTextField();
		txtNameOfOfficer.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtNameOfOfficer.setBounds(20, 620, 130, 28);
		txtNameOfOfficer.setColumns(10);
		
		txtAddress_3 = new JTextField();
		txtAddress_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAddress_3.setBounds(160, 620, 340, 28);
		txtAddress_3.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtPhone.setBounds(510, 620, 135, 28);
		txtPhone.setColumns(10);
		
		lblPhysicalAndMental = new JLabel("PHYSICAL AND MENTAL HEALTH");
		lblPhysicalAndMental.setBounds(235, 660, 205, 16);
		
		chckbxPhysicalHospitalizationIn = new JCheckBox("Physical Hospitalization in last 30 days?");
		chckbxPhysicalHospitalizationIn.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxPhysicalHospitalizationIn.setBounds(20, 688, 300, 23);
		
		chckbxMentalHospitalizationIn = new JCheckBox("Mental Hospitalization in last 30 days?");
		chckbxMentalHospitalizationIn.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxMentalHospitalizationIn.setBounds(20, 716, 290, 23);
		
		
		
		
		
		
		
		txtWhy_1 = new JTextField();
		txtWhy_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtWhy_1.setBounds(320, 688, 325, 28);
		txtWhy_1.setText("Why:");
		txtWhy_1.setColumns(10);
		
		txtWhy_2 = new JTextField();
		txtWhy_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtWhy_2.setBounds(320, 714, 325, 28);
		txtWhy_2.setText("Why:");
		txtWhy_2.setColumns(10);
		
		JCheckBox chckbxIvUsedIn = new JCheckBox("IV used in last 12 months");
		chckbxIvUsedIn.setBounds(11, 779, 197, 23);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Prior treatment Plans");
		chckbxNewCheckBox.setBounds(210, 779, 162, 23);
		
		txtHowMany = new JTextField();
		txtHowMany.setBounds(379, 777, 266, 28);
		txtHowMany.setText("How Many");
		txtHowMany.setColumns(10);
		
		txtWhereAndWhen = new JTextField();
		txtWhereAndWhen.setBounds(11, 809, 634, 28);
		txtWhereAndWhen.setHorizontalAlignment(SwingConstants.LEFT);
		txtWhereAndWhen.setText("Where and When");
		txtWhereAndWhen.setColumns(10);
		
		JLabel lblCompleteAsamBefore = new JLabel("COMPLETE ASAM BEFORE CONTINUING!!!");
		lblCompleteAsamBefore.setBounds(210, 842, 255, 16);
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
		Intake.add(txtZip);
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
		Intake.add(textRelationship);
		Intake.add(textEmergencyPhone);
		Intake.add(lblEmergencyContact);
		Intake.add(btnSubmit);
		Intake.add(lblCompleteAsamBefore);
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
		Intake.add(txtEmergencyAddress);
		Intake.add(txtEmergencyCity);
		Intake.add(textEmergencyState);
		Intake.add(textEmergencyZip);
		Intake.add(txtEmergencySecondary);
		
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
		
		JLabel lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblName.setBounds(20, 288, 200, 20);
		Intake.add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(20, 308, 200, 28);
		Intake.add(textField);
		
		JLabel lblRelationship = new JLabel("Relationship");
		lblRelationship.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblRelationship.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelationship.setBounds(230, 288, 150, 16);
		Intake.add(lblRelationship);
		
		JLabel lblPrimaryPhone = new JLabel("Primary Phone");
		lblPrimaryPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPrimaryPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimaryPhone.setBounds(385, 288, 110, 16);
		Intake.add(lblPrimaryPhone);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAddress_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_1.setBounds(20, 338, 280, 16);
		Intake.add(lblAddress_1);
		
		JLabel lblCity1 = new JLabel("City");
		lblCity1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCity1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity1.setBounds(309, 338, 161, 16);
		Intake.add(lblCity1);
		
		JLabel lblState_1 = new JLabel("State");
		lblState_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblState_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblState_1.setBounds(480, 338, 80, 16);
		Intake.add(lblState_1);
		
		JLabel lblZipCode_1 = new JLabel("Zip Code");
		lblZipCode_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblZipCode_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblZipCode_1.setBounds(570, 338, 75, 16);
		Intake.add(lblZipCode_1);
		
		lblSecondaryPhone_1 = new JLabel("Secondary Phone");
		lblSecondaryPhone_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSecondaryPhone_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSecondaryPhone_1.setBounds(520, 291, 125, 16);
		Intake.add(lblSecondaryPhone_1);
		
		JLabel lblAgencyName = new JLabel("Agency Name");
		lblAgencyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencyName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAgencyName.setBounds(20, 426, 200, 16);
		Intake.add(lblAgencyName);
		
		JLabel lblAgencyContact = new JLabel("Agency Contact");
		lblAgencyContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencyContact.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAgencyContact.setBounds(230, 426, 130, 16);
		Intake.add(lblAgencyContact);
		
		JLabel lblAgencyCounty = new JLabel("AgencyCounty");
		lblAgencyCounty.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgencyCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAgencyCounty.setBounds(370, 427, 130, 16);
		Intake.add(lblAgencyCounty);
		
		JLabel lblPhoneNumber_1 = new JLabel("Phone Number");
		lblPhoneNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNumber_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPhoneNumber_1.setBounds(510, 427, 135, 16);
		Intake.add(lblPhoneNumber_1);
		
		JLabel lblAddress_2 = new JLabel("Address");
		lblAddress_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAddress_2.setBounds(20, 480, 180, 16);
		Intake.add(lblAddress_2);
		
		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCity_1.setBounds(210, 480, 130, 16);
		Intake.add(lblCity_1);
		
		JLabel lblState_2 = new JLabel("State");
		lblState_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblState_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblState_2.setBounds(350, 481, 60, 16);
		Intake.add(lblState_2);
		
		JLabel lblZipCode_2 = new JLabel("Zip Code");
		lblZipCode_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblZipCode_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblZipCode_2.setBounds(420, 481, 75, 16);
		Intake.add(lblZipCode_2);
		
		JLabel lblCellPhone = new JLabel("Cell Phone");
		lblCellPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblCellPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCellPhone.setBounds(510, 481, 135, 16);
		Intake.add(lblCellPhone);
		
		JLabel lblNameOfOfficer = new JLabel("Name of Officer");
		lblNameOfOfficer.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameOfOfficer.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNameOfOfficer.setBounds(20, 600, 130, 16);
		Intake.add(lblNameOfOfficer);
		
		JLabel lblAddress_3 = new JLabel("Address");
		lblAddress_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAddress_3.setBounds(159, 600, 340, 16);
		Intake.add(lblAddress_3);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPhone.setBounds(510, 600, 135, 16);
		Intake.add(lblPhone);
		
		txtSubs1 = new JTextField();
		txtSubs1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubs1.setText("Subs1");
		txtSubs1.setBounds(20, 751, 125, 28);
		Intake.add(txtSubs1);
		txtSubs1.setColumns(10);
		
		txtSubsDate1 = new JTextField();
		txtSubsDate1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsDate1.setText("Date Last Used");
		txtSubsDate1.setBounds(145, 751, 125, 28);
		Intake.add(txtSubsDate1);
		txtSubsDate1.setColumns(10);
		
		txtSubsFreq1 = new JTextField();
		txtSubsFreq1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsFreq1.setText("Frequency");
		txtSubsFreq1.setBounds(270, 751, 125, 28);
		Intake.add(txtSubsFreq1);
		txtSubsFreq1.setColumns(10);
		
		txtsubsAmount1 = new JTextField();
		txtsubsAmount1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtsubsAmount1.setText("Amount of Use");
		txtsubsAmount1.setBounds(395, 751, 125, 28);
		Intake.add(txtsubsAmount1);
		txtsubsAmount1.setColumns(10);
		
		txtSubsMeth1 = new JTextField();
		txtSubsMeth1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsMeth1.setText("Method");
		txtSubsMeth1.setBounds(520, 751, 125, 28);
		Intake.add(txtSubsMeth1);
		txtSubsMeth1.setColumns(10);
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
		
	}
	
	private boolean validateInput()
	{
		boolean valid = true;
		
		if(!txtDateOfBirth.getText().matches("\\d{4}-\\d{2}-\\d{2}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Date of Birth must be in numbers in the format YYYY-MM-DD");
		}
		if(!txtFirstName.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The First Name must have letters only");
			
		}
		if(!txtLastName.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Last Name must have letters only");
			
		}
		if(!txtAge.getText().matches("[0-9]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The clients age must have numbers only");
		}
		if(!txtVet.getText().matches("[ynYN]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "Vet must be a Y or N");
		}
		
		//not checking address due to high variation in input
		
		if(!txtCity.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The City must have letters only");
		}
		if(!txtState.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The State must have letters only");
		}
		if(!txtCounty.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The County must have letters only");
		}
		if(!txtName.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact Name must have letters only");
		}
		
		//not checking emergency address due to high variation in input
		
		if(!txtEmergencyCity.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact City must have letters only");
		}
		if(!txtZip.getText().matches("\\d{5}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Zip Code must have 5 numbers only");
		}
		if(!textEmergencyState.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact State must have letters only");
		}
		if(!textEmergencyZip.getText().matches("\\d{5}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact zip must have 5 numbers only");
		}
		if(!txtPhoneNumber.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact phone number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtState_1.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Contact State must have letters only");
		}
		if(!txtCity_2.getText().matches("[a-zA-Z ]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Contact city must have letters only");
		}
		if(!txtPhoneNumber.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Contact phone number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtZipCode.getText().matches("\\d{5}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Zip Code must have 5 numbers only");
		}
		if(!txtCellPhone.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Contact Cell Phone must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtPhoneNumber_1.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Contact Phone Number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtPhone.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Probation Contact number must have numbers only in the format XXX-XXX-XXXX");
		}
		

		
		return valid;
	}
}
