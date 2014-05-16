import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class Intake implements ActionListener
{
	SQLRetrieveInfo dBase = new SQLRetrieveInfo();
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
	private JTextField textEmergencyRelationship;
	private JTextField textEmergencyPhone;
	private JTextField txtEmergencySecondary;
	private JTextField textEmergencyState;
	private JTextField textEmergencyZip;
	private JTextField txtAgencyName;
	private JTextField txtAgencyContact;
	private JTextField txtAgencyCounty;
	private JTextField txtAgencyPhone;
	private JTextField txtAgencyAddress;
	private JTextField txtAgencyCity;
	private JTextField txtAgencyState;
	private JTextField txtAgencyZip;
	private JTextField txtAgencyCell;
	private JTextField txtYearsInCounty;
	private JTextField txtPhoneNumber_1;
	private JTextField txtSecondaryPhone;
	private JTextField txtSocialSecurityNumber;
	private JTextField txtDriversLicense;
	private JTextField txtDlState;
	private JTextField txtMaritalStatus;
	private JTextField txtSpouseName;
	private JLabel lblLegalInformation;
	private JCheckBox chckbxOnProbation;
	private JTextField txtProbationWhy;
	private JTextField txtNameOfOfficer;
	private JTextField txtOfficerAddress;
	private JTextField txtOfficerPhone;
	private JLabel lblPhysicalAndMental;
	private JCheckBox chckbxPhysicalHospitalizationIn;
	private JCheckBox chckbxMentalHospitalizationIn;
	private JTextField txtPhysicalHosp;
	private JTextField txtMentalHosp;
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
	private JTextField txtEmergencyName;
	private JLabel lblSecondaryPhone_1;
	private JTextField txtSubs1;
	private JTextField txtSubsDate1;
	private JTextField txtSubsFreq1;
	private JTextField txtsubsAmount1;
	private JTextField txtSubsMeth1;
	private JTextField txtSubs2;
	private JTextField txtSubsDate2;
	private JTextField txtSubsFreq2;
	private JTextField txtSubsAmount2;
	private JTextField txtSubsMethod2;
	private JTextField txtSubs3;
	private JTextField txtSubsDate3;
	private JTextField txtSubsFreq3;
	private JTextField txtSubsAmount3;
	private JTextField txtSubsMethod3;
	private JTextField txtActionsTaken;
	private JCheckBox chckbxYesToAsam;
	private JCheckBox chckbxJailprobationInLast;
	private JCheckBox chckbxIvUsedIn;
	private JCheckBox chckbxPriorTPlan;
	private JTextField txtActionsTaken_1;
	private JCheckBox chckbxYesToAsam_1;
	private JCheckBox chckbxYesToAsam_2;
	private JTextField txtActionsTaken_2;
	private JCheckBox chckbxYesToAsam_3;
	private JTextField txtActionsTaken_3;
	private JCheckBox chckbxDoYouHave;
	private JTextField txtDescribe;
	private JTextField txtDiag1;
	private JTextField txtDiag2;
	private JTextField txtDiag3;
	private JTextField txtMedName3;
	private JTextField txtMedName2;
	private JTextField txtMedName1;
	private JTextField txtDosage1;
	private JTextField txtDosage2;
	private JTextField txtDosage3;
	private JTextField txtMI;
	private String strIntakeDate;
	private JCheckBox chckbxHaveYouEver;
	private JCheckBox chckbxHaveYouEver_1;
	private int type;

	/**
	 * @wbp.parser.entryPoint
	 */

	public void BuildPanel(final String s, final int j)
	{
		type = j;
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
		Date date = new Date();
		Intake = new JPanel();
		Intake.setSize(665, 1350);

		btnExit = new JButton("Exit");
		btnExit.addActionListener(this);
		btnExit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnExit.setBounds(234, 1300, 75, 29);

		btnSubmit = new JButton("Continue");
		btnSubmit.addActionListener(this);
		btnSubmit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSubmit.setBounds(339, 1300, 101, 29);



		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtFirstName.setBounds(20, 80, 180, 28);
		txtFirstName.setColumns(10);

		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtLastName.setBounds(250, 80, 180, 28);
		txtLastName.setColumns(10);

		txtDateOfBirth = new JTextField();
		txtDateOfBirth.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) 
			{
				if(j == 0)
					txtDateOfBirth.setText("");
			}
		});
		txtDateOfBirth.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDateOfBirth.setBounds(440, 80, 100, 28);
		txtDateOfBirth.setText("MM/DD/YYYY");
		txtDateOfBirth.setColumns(10);

		txtAge = new JTextField();
		txtAge.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAge.setBounds(550, 80, 40, 28);
		txtAge.setColumns(10);

		txtVet = new JTextField();
		txtVet.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) 
			{
				if(j == 1)
				txtVet.setText("");
			}
		});
		txtVet.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtVet.setBounds(595, 80, 50, 28);
		txtVet.setText("y/n");
		txtVet.setColumns(10);

		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAddress.setBounds(20, 130, 280, 28);
		txtAddress.setColumns(10);

		txtCity = new JTextField();
		txtCity.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtCity.setBounds(310, 130, 160, 28);
		txtCity.setColumns(10);

		txtState = new JTextField();
		txtState.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) 
			{
				if(j == 1)
					txtState.setText("");
			}
		});
		txtState.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtState.setBounds(480, 130, 80, 28);
		txtState.setText("California");
		txtState.setColumns(10);

		txtCounty = new JTextField();
		txtCounty.setBounds(20, 180, 180, 28);
		txtCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
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
		txtZip.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) 
			{
				if(j == 1)
					txtZip.setText("");
			}
		});
		txtZip.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtZip.setBounds(570, 130, 75, 28);
		txtZip.setText("95819");
		txtZip.setColumns(10);

		textEmergencyRelationship = new JTextField();
		textEmergencyRelationship.setFont(new Font("Verdana", Font.PLAIN, 13));
		textEmergencyRelationship.setBounds(230, 308, 150, 28);
		textEmergencyRelationship.setColumns(10);

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

		txtAgencyCounty = new JTextField();
		txtAgencyCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyCounty.setBounds(370, 446, 130, 28);
		txtAgencyCounty.setColumns(10);

		txtAgencyPhone = new JTextField();
		txtAgencyPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyPhone.setBounds(510, 447, 135, 28);
		txtAgencyPhone.setColumns(10);

		txtAgencyAddress = new JTextField();
		txtAgencyAddress.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyAddress.setBounds(20, 498, 180, 28);
		txtAgencyAddress.setColumns(10);

		txtAgencyCity = new JTextField();
		txtAgencyCity.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyCity.setBounds(210, 498, 130, 28);
		txtAgencyCity.setColumns(10);

		txtAgencyState = new JTextField();
		txtAgencyState.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyState.setBounds(350, 498, 60, 28);
		txtAgencyState.setColumns(10);

		txtAgencyZip = new JTextField();
		txtAgencyZip.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyZip.setBounds(420, 499, 80, 28);
		txtAgencyZip.setColumns(10);

		txtAgencyCell = new JTextField();
		txtAgencyCell.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtAgencyCell.setBounds(510, 499, 135, 28);
		txtAgencyCell.setColumns(10);

		JLabel lblPatientInformation = new JLabel("CLIENT INFORMATION");
		lblPatientInformation.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPatientInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatientInformation.setBounds(0, 40, 665, 16);

		txtYearsInCounty = new JTextField();
		txtYearsInCounty.setBounds(210, 180, 110, 28);
		txtYearsInCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtYearsInCounty.setColumns(10);

		txtPhoneNumber_1 = new JTextField();
		txtPhoneNumber_1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) 
			{
				if(j == 1)
					txtPhoneNumber_1.setText("");
			}
		});
		txtPhoneNumber_1.setBounds(330, 180, 150, 28);
		txtPhoneNumber_1.setText("XXX-XXX-XXXX");
		txtPhoneNumber_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtPhoneNumber_1.setColumns(10);

		txtSecondaryPhone = new JTextField();
		txtSecondaryPhone.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {txtSecondaryPhone.setText("");
			}
		});
		txtSecondaryPhone.setBounds(490, 180, 155, 28);
		txtSecondaryPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSecondaryPhone.setColumns(10);

		txtSocialSecurityNumber = new JTextField();
		txtSocialSecurityNumber.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) 
			{
				if(j == 1)
					txtSocialSecurityNumber.setText("");
			}
		});
		txtSocialSecurityNumber.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSocialSecurityNumber.setBounds(20, 230, 140, 28);
		txtSocialSecurityNumber.setText("XXX-XX-XXXX");
		txtSocialSecurityNumber.setColumns(10);

		txtDriversLicense = new JTextField();
		txtDriversLicense.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {txtDriversLicense.setText("");
			}
		});
		txtDriversLicense.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDriversLicense.setBounds(170, 230, 120, 28);
		txtDriversLicense.setColumns(10);

		txtDlState = new JTextField();
		txtDlState.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) 
			{	
				if(j == 1)
					txtDlState.setText("");
			}
		});
		txtDlState.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDlState.setBounds(300, 231, 70, 28);
		txtDlState.setText("CA");
		txtDlState.setColumns(10);

		txtMaritalStatus = new JTextField();
		txtMaritalStatus.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtMaritalStatus.setBounds(380, 230, 110, 28);
		txtMaritalStatus.setColumns(10);

		txtSpouseName = new JTextField();
		txtSpouseName.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSpouseName.setBounds(500, 230, 145, 28);
		txtSpouseName.setColumns(10);

		chckbxJailprobationInLast = new JCheckBox("Jail/Probation in last 30 days?");
		chckbxJailprobationInLast.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{if(chckbxJailprobationInLast.isSelected())
				txtProbationWhy.setVisible(true);
			}
		});
		chckbxJailprobationInLast.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxJailprobationInLast.setBounds(20, 566, 240, 23);

		lblLegalInformation = new JLabel("LEGAL INFORMATION");
		lblLegalInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblLegalInformation.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblLegalInformation.setBounds(0, 538, 665, 16);

		chckbxOnProbation = new JCheckBox("On Probation?");
		chckbxOnProbation.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxOnProbation.setVisible(true);
		chckbxOnProbation.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{if(chckbxJailprobationInLast.isSelected())
				txtProbationWhy.setVisible(true);
			}
		});
		chckbxOnProbation.setBounds(260, 566, 135, 23);

		txtProbationWhy = new JTextField();
		txtProbationWhy.setBounds(400, 566, 245, 28);
		txtProbationWhy.setText("Why:");
		txtProbationWhy.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtProbationWhy.setVisible(false);
		txtProbationWhy.setColumns(10);

		txtNameOfOfficer = new JTextField();
		txtNameOfOfficer.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtNameOfOfficer.setBounds(20, 620, 130, 28);
		txtNameOfOfficer.setColumns(10);

		txtOfficerAddress = new JTextField();
		txtOfficerAddress.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtOfficerAddress.setBounds(160, 620, 340, 28);
		txtOfficerAddress.setColumns(10);

		txtOfficerPhone = new JTextField();
		txtOfficerPhone.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtOfficerPhone.setBounds(510, 620, 135, 28);
		txtOfficerPhone.setColumns(10);

		lblPhysicalAndMental = new JLabel("PHYSICAL AND MENTAL HEALTH");
		lblPhysicalAndMental.setBounds(235, 660, 205, 16);

		chckbxPhysicalHospitalizationIn = new JCheckBox("Physical Hospitalization in last 30 days?");
		chckbxPhysicalHospitalizationIn.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxPhysicalHospitalizationIn.isSelected())
					txtPhysicalHosp.setVisible(true);
				if(!chckbxPhysicalHospitalizationIn.isSelected())
					txtPhysicalHosp.setVisible(false);
			}
		});
		chckbxPhysicalHospitalizationIn.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxPhysicalHospitalizationIn.setBounds(20, 688, 300, 23);

		chckbxMentalHospitalizationIn = new JCheckBox("Mental Hospitalization in last 30 days?");
		chckbxMentalHospitalizationIn.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxMentalHospitalizationIn.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxMentalHospitalizationIn.isSelected())
					txtMentalHosp.setVisible(true);
				if(!chckbxMentalHospitalizationIn.isSelected())
					txtMentalHosp.setVisible(false);
			}
		});
		chckbxMentalHospitalizationIn.setBounds(20, 716, 290, 23);


		txtPhysicalHosp = new JTextField();
		txtPhysicalHosp.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtPhysicalHosp.setBounds(320, 688, 325, 28);
		txtPhysicalHosp.setText("Why:");
		txtPhysicalHosp.setVisible(false);
		txtPhysicalHosp.setColumns(10);

		txtMentalHosp = new JTextField();
		txtMentalHosp.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtMentalHosp.setBounds(320, 714, 325, 28);
		txtMentalHosp.setText("Why:");
		txtMentalHosp.setVisible(false);
		txtMentalHosp.setColumns(10);

		chckbxIvUsedIn = new JCheckBox("IV used in last 12 months");
		chckbxIvUsedIn.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxIvUsedIn.isSelected())
					txtHowMany.setVisible(true);
				if(!chckbxIvUsedIn.isSelected())
					txtHowMany.setVisible(false);
			}
		});
		chckbxIvUsedIn.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxIvUsedIn.setBounds(20, 861, 212, 23);

		chckbxPriorTPlan = new JCheckBox("Prior treatment Plans");
		chckbxPriorTPlan.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxPriorTPlan.isSelected())
					txtWhereAndWhen.setVisible(true);
				if(!chckbxPriorTPlan.isSelected())
					txtWhereAndWhen.setVisible(false);
			}
		});
		chckbxPriorTPlan.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxPriorTPlan.setBounds(20, 890, 180, 23);

		txtHowMany = new JTextField();
		txtHowMany.setBounds(230, 859, 415, 28);
		txtHowMany.setText("How Many");
		txtHowMany.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtHowMany.setVisible(false);
		txtHowMany.setColumns(10);

		txtWhereAndWhen = new JTextField();
		txtWhereAndWhen.setBounds(230, 885, 415, 28);
		txtWhereAndWhen.setHorizontalAlignment(SwingConstants.LEFT);
		txtWhereAndWhen.setText("Where and When");
		txtWhereAndWhen.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtWhereAndWhen.setVisible(false);
		txtWhereAndWhen.setColumns(10);

		JLabel lblCompleteAsamBefore = new JLabel("COMPLETE ASAM BEFORE CONTINUING!!!");
		lblCompleteAsamBefore.setBounds(205, 926, 255, 16);
		lblCompleteAsamBefore.setFont(new Font("Verdana", Font.PLAIN, 13));
		Intake.setLayout(null);
		Intake.add(txtAddress);
		Intake.add(txtFirstName);
		Intake.add(txtLastName);
		Intake.add(txtCounty);
		Intake.add(txtYearsInCounty);
		Intake.add(txtCity);
		Intake.add(txtPhoneNumber_1);
		Intake.add(txtDateOfBirth);
		Intake.add(txtAge);
		Intake.add(txtVet);
		Intake.add(txtSecondaryPhone);
		Intake.add(txtState);
		Intake.add(txtZip);
		Intake.add(txtAgencyAddress);
		Intake.add(txtAgencyCity);
		Intake.add(txtAgencyState);
		Intake.add(txtAgencyZip);
		Intake.add(txtAgencyCell);
		Intake.add(btnExit);
		Intake.add(lblPatientInformation);
		Intake.add(txtSocialSecurityNumber);
		Intake.add(txtDriversLicense);
		Intake.add(txtDlState);
		Intake.add(txtMaritalStatus);
		Intake.add(txtSpouseName);
		Intake.add(textEmergencyRelationship);
		Intake.add(textEmergencyPhone);
		Intake.add(lblEmergencyContact);
		Intake.add(btnSubmit);
		Intake.add(lblCompleteAsamBefore);
		Intake.add(lblPhysicalAndMental);
		Intake.add(txtNameOfOfficer);
		Intake.add(txtOfficerAddress);
		Intake.add(txtOfficerPhone);
		Intake.add(chckbxPhysicalHospitalizationIn);
		Intake.add(txtPhysicalHosp);
		Intake.add(chckbxMentalHospitalizationIn);
		Intake.add(txtMentalHosp);
		Intake.add(chckbxIvUsedIn);
		Intake.add(chckbxPriorTPlan);
		Intake.add(txtHowMany);
		Intake.add(txtWhereAndWhen);
		Intake.add(chckbxJailprobationInLast);
		Intake.add(lblLegalInformation);
		Intake.add(chckbxOnProbation);
		Intake.add(txtProbationWhy);
		Intake.add(txtAgencyName);
		Intake.add(txtAgencyContact);
		Intake.add(txtAgencyCounty);
		Intake.add(txtAgencyPhone);
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
		lblFirstName.setBounds(20, 60, 180, 20);
		Intake.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblLastName.setBounds(250, 60, 180, 20);
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

		txtEmergencyName = new JTextField();
		txtEmergencyName.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtEmergencyName.setColumns(10);
		txtEmergencyName.setBounds(20, 308, 200, 28);
		Intake.add(txtEmergencyName);

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

		JLabel lblAgencyCounty = new JLabel("Agency County");
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
		txtSubs1.setBounds(20, 767, 125, 28);
		Intake.add(txtSubs1);
		txtSubs1.setColumns(10);

		txtSubsDate1 = new JTextField();
		txtSubsDate1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsDate1.setBounds(145, 767, 125, 28);
		Intake.add(txtSubsDate1);
		txtSubsDate1.setColumns(10);

		txtSubsFreq1 = new JTextField();
		txtSubsFreq1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsFreq1.setBounds(270, 767, 125, 28);
		Intake.add(txtSubsFreq1);
		txtSubsFreq1.setColumns(10);

		txtsubsAmount1 = new JTextField();
		txtsubsAmount1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtsubsAmount1.setBounds(395, 767, 125, 28);
		Intake.add(txtsubsAmount1);
		txtsubsAmount1.setColumns(10);

		txtSubsMeth1 = new JTextField();
		txtSubsMeth1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsMeth1.setBounds(520, 767, 125, 28);
		Intake.add(txtSubsMeth1);
		txtSubsMeth1.setColumns(10);

		txtSubs2 = new JTextField();
		txtSubs2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubs2.setColumns(10);
		txtSubs2.setBounds(20, 793, 125, 28);
		Intake.add(txtSubs2);

		txtSubsDate2 = new JTextField();
		txtSubsDate2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsDate2.setColumns(10);
		txtSubsDate2.setBounds(145, 793, 125, 28);
		Intake.add(txtSubsDate2);

		txtSubsFreq2 = new JTextField();
		txtSubsFreq2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsFreq2.setColumns(10);
		txtSubsFreq2.setBounds(270, 793, 125, 28);
		Intake.add(txtSubsFreq2);

		txtSubsAmount2 = new JTextField();
		txtSubsAmount2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsAmount2.setColumns(10);
		txtSubsAmount2.setBounds(395, 793, 125, 28);
		Intake.add(txtSubsAmount2);

		txtSubsMethod2 = new JTextField();
		txtSubsMethod2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsMethod2.setColumns(10);
		txtSubsMethod2.setBounds(520, 793, 125, 28);
		Intake.add(txtSubsMethod2);

		txtSubs3 = new JTextField();
		txtSubs3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubs3.setColumns(10);
		txtSubs3.setBounds(20, 819, 125, 28);
		Intake.add(txtSubs3);

		txtSubsDate3 = new JTextField();
		txtSubsDate3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsDate3.setColumns(10);
		txtSubsDate3.setBounds(145, 819, 125, 28);
		Intake.add(txtSubsDate3);

		txtSubsFreq3 = new JTextField();
		txtSubsFreq3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsFreq3.setColumns(10);
		txtSubsFreq3.setBounds(270, 819, 125, 28);
		Intake.add(txtSubsFreq3);

		txtSubsAmount3 = new JTextField();
		txtSubsAmount3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsAmount3.setColumns(10);
		txtSubsAmount3.setBounds(395, 819, 125, 28);
		Intake.add(txtSubsAmount3);

		txtSubsMethod3 = new JTextField();
		txtSubsMethod3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtSubsMethod3.setColumns(10);
		txtSubsMethod3.setBounds(520, 819, 125, 28);
		Intake.add(txtSubsMethod3);

		JLabel lblSubstance = new JLabel("Substance");
		lblSubstance.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblSubstance.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubstance.setBounds(20, 751, 125, 16);
		Intake.add(lblSubstance);

		JLabel lblDateLastUsed = new JLabel("Date Last Used");
		lblDateLastUsed.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateLastUsed.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDateLastUsed.setBounds(145, 751, 125, 16);
		Intake.add(lblDateLastUsed);

		JLabel lblFrequency = new JLabel("Frequency");
		lblFrequency.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrequency.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblFrequency.setBounds(270, 751, 125, 16);
		Intake.add(lblFrequency);

		JLabel lblAmountOfUse = new JLabel("Amount of Use");
		lblAmountOfUse.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmountOfUse.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAmountOfUse.setBounds(395, 751, 125, 16);
		Intake.add(lblAmountOfUse);

		JLabel lblMethod = new JLabel("Method");
		lblMethod.setHorizontalAlignment(SwingConstants.CENTER);
		lblMethod.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMethod.setBounds(520, 751, 125, 16);
		Intake.add(lblMethod);

		chckbxYesToAsam = new JCheckBox("Yes to ASAM 1a and 1b, or 2, or 3?");
		chckbxYesToAsam.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(chckbxYesToAsam.isSelected())
					txtActionsTaken.setVisible(true);
				if(!chckbxYesToAsam.isSelected())
					txtActionsTaken.setVisible(false);
			}
		});
		chckbxYesToAsam.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxYesToAsam.setAutoscrolls(true);
		chckbxYesToAsam.setBounds(20, 950, 270, 28);
		Intake.add(chckbxYesToAsam);

		txtActionsTaken = new JTextField();
		txtActionsTaken.setText("Actions Taken");
		txtActionsTaken.setBounds(291, 950, 354, 28);
		txtActionsTaken.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtActionsTaken.setVisible(false);
		Intake.add(txtActionsTaken);
		txtActionsTaken.setColumns(10);

		chckbxYesToAsam_1 = new JCheckBox("Yes to ASAM 4a and/or 1b alone?");
		chckbxYesToAsam_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxYesToAsam_1.isSelected())
					txtActionsTaken_1.setVisible(true);
				if(!chckbxYesToAsam_1.isSelected())
					txtActionsTaken_1.setVisible(false);
			}
		});
		chckbxYesToAsam_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxYesToAsam_1.setAutoscrolls(true);
		chckbxYesToAsam_1.setBounds(20, 980, 270, 28);
		Intake.add(chckbxYesToAsam_1);

		txtActionsTaken_1 = new JTextField();
		txtActionsTaken_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtActionsTaken_1.setText("Actions Taken");
		txtActionsTaken_1.setBounds(290, 980, 354, 28);
		txtActionsTaken_1.setVisible(false);
		Intake.add(txtActionsTaken_1);
		txtActionsTaken_1.setColumns(10);

		chckbxYesToAsam_2 = new JCheckBox("Yes to ASAM 5a Alone?");
		chckbxYesToAsam_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxYesToAsam_2.setAutoscrolls(true);
		chckbxYesToAsam_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxYesToAsam_2.isSelected())
					txtActionsTaken_2.setVisible(true);
				if(!chckbxYesToAsam_2.isSelected())
					txtActionsTaken_2.setVisible(false);
			}
		});
		chckbxYesToAsam_2.setBounds(20, 1010, 270, 28);
		Intake.add(chckbxYesToAsam_2);

		txtActionsTaken_2 = new JTextField();
		txtActionsTaken_2.setText("Actions Taken:");
		txtActionsTaken_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtActionsTaken_2.setBounds(290, 1010, 355, 28);
		txtActionsTaken_2.setVisible(false);
		Intake.add(txtActionsTaken_2);

		txtActionsTaken_2.setColumns(10);

		chckbxYesToAsam_3 = new JCheckBox("Yes to ASAM 5b and/or 6, no 1,2,3");
		chckbxYesToAsam_3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxYesToAsam_3.isSelected())
					txtActionsTaken_3.setVisible(true);
				if(!chckbxYesToAsam_3.isSelected())
					txtActionsTaken_3.setVisible(false);
			}
		});
		chckbxYesToAsam_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxYesToAsam_3.setAutoscrolls(true);
		chckbxYesToAsam_3.setBounds(20, 1040, 270, 28);
		Intake.add(chckbxYesToAsam_3);

		txtActionsTaken_3 = new JTextField();
		txtActionsTaken_3.setText("Actions Taken");
		txtActionsTaken_3.setBounds(290, 1040, 335, 28);
		txtActionsTaken_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtActionsTaken_3.setVisible(false);
		Intake.add(txtActionsTaken_3);
		txtActionsTaken_3.setColumns(10);

		chckbxDoYouHave = new JCheckBox("Do you have any Phyiscal limitations that may require assistance?");
		chckbxDoYouHave.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				if(chckbxDoYouHave.isSelected())
					txtDescribe.setVisible(true);
				if(!chckbxDoYouHave.isSelected())
					txtDescribe.setVisible(false);
			}
		});
		chckbxDoYouHave.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxDoYouHave.setBounds(20, 1070, 625, 23);
		Intake.add(chckbxDoYouHave);

		txtDescribe = new JTextField();
		txtDescribe.setText("Describe:");
		txtDescribe.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDescribe.setBounds(20, 1100, 625, 28);
		txtDescribe.setVisible(false);
		Intake.add(txtDescribe);
		txtDescribe.setColumns(10);

		txtDiag1 = new JTextField();
		txtDiag1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDiag1.setColumns(10);
		txtDiag1.setBounds(20, 1173, 200, 28);
		Intake.add(txtDiag1);

		txtDiag2 = new JTextField();
		txtDiag2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDiag2.setColumns(10);
		txtDiag2.setBounds(20, 1199, 200, 28);
		Intake.add(txtDiag2);

		txtDiag3 = new JTextField();
		txtDiag3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDiag3.setColumns(10);
		txtDiag3.setBounds(20, 1225, 200, 28);
		Intake.add(txtDiag3);

		txtMedName3 = new JTextField();
		txtMedName3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtMedName3.setColumns(10);
		txtMedName3.setBounds(234, 1225, 200, 28);
		Intake.add(txtMedName3);

		txtMedName2 = new JTextField();
		txtMedName2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtMedName2.setColumns(10);
		txtMedName2.setBounds(234, 1199, 200, 28);
		Intake.add(txtMedName2);

		txtMedName1 = new JTextField();
		txtMedName1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtMedName1.setColumns(10);
		txtMedName1.setBounds(234, 1173, 200, 28);
		Intake.add(txtMedName1);

		txtDosage1 = new JTextField();
		txtDosage1.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDosage1.setColumns(10);
		txtDosage1.setBounds(445, 1173, 200, 28);
		Intake.add(txtDosage1);

		txtDosage2 = new JTextField();
		txtDosage2.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDosage2.setColumns(10);
		txtDosage2.setBounds(445, 1199, 200, 28);
		Intake.add(txtDosage2);

		txtDosage3 = new JTextField();
		txtDosage3.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDosage3.setColumns(10);
		txtDosage3.setBounds(445, 1225, 200, 28);
		Intake.add(txtDosage3);

		JLabel lblNewLabel_1 = new JLabel("Dosage");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(445, 1145, 200, 16);
		Intake.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Name of Medication");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(234, 1145, 200, 16);
		Intake.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Diagnosis");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(20, 1145, 200, 16);
		Intake.add(lblNewLabel_3);

		txtMI = new JTextField();
		txtMI.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtMI.setBounds(205, 80, 40, 28);
		Intake.add(txtMI);
		txtMI.setColumns(10);

		JLabel lblMi = new JLabel("MI");
		lblMi.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMi.setHorizontalAlignment(SwingConstants.CENTER);
		lblMi.setBounds(205, 60, 40, 20);
		Intake.add(lblMi);

		chckbxHaveYouEver = new JCheckBox("Have you ever been convicted of a sex crime?");
		chckbxHaveYouEver.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) 
			{
				JOptionPane.showMessageDialog(null, "Cannot intake this client");
				if(j == 0)
					IntakeForm.close();
				if(j == 1)
				{
					String t = "Phone_Intake";
					SQLSetInfo.deleteRow(t, s);
				}
				IntakeForm.close();
			}
		});
		chckbxHaveYouEver.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxHaveYouEver.setBounds(20, 1265, 320, 23);
		Intake.add(chckbxHaveYouEver);

		chckbxHaveYouEver_1 = new JCheckBox("Have you ever been convicted of Arson?");
		chckbxHaveYouEver_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		chckbxHaveYouEver_1.setBounds(350, 1265, 295, 23);
		Intake.add(chckbxHaveYouEver_1);

		//here we set todays d
		strIntakeDate = dateFormat.format(date);


		if(j == 1)
			importData(s);
		Intake.setVisible(true);
	}


	private void importData(String s) 
	{
		Object[] data = new Object[90];
		data = dBase.getPendingClient(s);
		int i = 0;


		try 
		{
			txtLastName.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtLastName.setText(""); i++;
		}

		try 
		{
			txtFirstName.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtFirstName.setText(""); i++;
		}
		try 
		{
			txtMI.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtMI.setText(""); i++;
		}

		i++; //Gender

		try 
		{
			txtPhoneNumber_1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtPhoneNumber_1.setText(""); i++;
		}

		try 
		{
			txtSecondaryPhone.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSecondaryPhone.setText(""); i++;
		}
		try 
		{
			txtDateOfBirth.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDateOfBirth.setText(""); i++;
		}
		try 
		{
			txtSocialSecurityNumber.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSocialSecurityNumber.setText(""); i++;
		}
		try 
		{
			txtAddress.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAddress.setText(""); i++;
		}
		try 
		{
			txtCity.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtCity.setText(""); i++;
		}
		try 
		{
			txtState.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtState.setText(""); i++;
		}
		try 
		{
			txtZip.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtZip.setText(""); i++;
		}
		try 
		{
			txtCounty.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtCounty.setText(""); i++;
		}
		try 
		{
			txtYearsInCounty.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtYearsInCounty.setText(""); i++;
		}
		try 
		{
			if((int) data[i] == 1)
				txtVet.setText("Y");
			else
				txtVet.setText("N");
			
			i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtVet.setText(""); i++;
		}
		try 
		{
			txtDriversLicense.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDriversLicense.setText(""); i++;
		}
		try 
		{
			txtDlState.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDlState.setText(""); i++;
		}

		strIntakeDate = (String) data[i];i++;

		try 
		{
			String name = (String) data[i+1] + " " + (String) data[i]; i++; i++;
			txtEmergencyName.setText(name);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtEmergencyName.setText(""); i++;
		}
		try 
		{
			textEmergencyRelationship.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			textEmergencyRelationship.setText(""); i++;
		}
		try 
		{
			textEmergencyPhone.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			textEmergencyPhone.setText(""); i++;
		}
		try 
		{
			txtEmergencySecondary.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtEmergencySecondary.setText(""); i++;
		}
		try 
		{
			txtEmergencyAddress.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtEmergencyAddress.setText(""); i++;
		}
		try 
		{
			txtEmergencyCity.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtEmergencyCity.setText(""); i++;
		}
		try 
		{
			textEmergencyState.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			textEmergencyState.setText(""); i++;
		}
		try 
		{
			textEmergencyZip.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			textEmergencyZip.setText(""); i++;
		}
		try 
		{
			txtAgencyName.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyName.setText(""); i++;
		}
		try 
		{
			String contact = (String) data[i+1] + " " + (String) data[i];
			txtAgencyContact.setText(contact);i++;i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyContact.setText(""); i++;
		}
		try 
		{
			txtAgencyCounty.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyCounty.setText(""); i++;
		}
		try 
		{
			txtAgencyPhone.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyPhone.setText(""); i++;
		}
		try 
		{
			txtAgencyCell.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyCell.setText(""); i++;
		}
		try 
		{
			txtAgencyAddress.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyAddress.setText(""); i++;
		}
		try 
		{
			txtAgencyCity.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyCity.setText(""); i++;
		}
		try 
		{
			txtAgencyState.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyState.setText(""); i++;
		}
		try 
		{
			txtAgencyZip.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtAgencyZip.setText(""); i++;
		}

		//		try 
		//		{
		//			txtMaritalStatus.setText((String) data[i]);i++;
		//		}
		//		catch(NullPointerException e) 
		//		{
		//			System.out.println("Error Retrieving data in object array field " + i);
		//			txtMaritalStatus.setText(""); i++;
		//		}
		//		try 
		//		{
		//			txtSpouseName.setText((String) data[i]);i++;
		//		}
		//		catch(NullPointerException e) 
		//		{
		//			System.out.println("Error Retrieving data in object array field " + i);
		//			txtSpouseName.setText(""); i++;
		//		}
		try 
		{
			if((int) data[i] == 0)
				chckbxOnProbation.setEnabled(false);
			else
				chckbxOnProbation.setEnabled(true);
			i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			chckbxOnProbation.setEnabled(false);; i++;
		}
		try 
		{

			txtProbationWhy.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtProbationWhy.setText(""); i++;
		}
		try 
		{
			txtNameOfOfficer.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtNameOfOfficer.setText(""); i++;
		}
		try 
		{
			String address = (String) data[i++] + " " + (String) data[i++] + " " + (String) data[i++] + " " + (String) data[i];
			txtOfficerAddress.setText(address);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtOfficerAddress.setText(""); i++; 
		}
		try 
		{
			txtOfficerPhone.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtOfficerPhone.setText(""); i++;
		}
		try 
		{
			if((int) data[i] == 0)
				chckbxPhysicalHospitalizationIn.setEnabled(false);
			else
				chckbxPhysicalHospitalizationIn.setEnabled(true);
			i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			chckbxPhysicalHospitalizationIn.setEnabled(false); i++;
		}
		try 
		{

			txtPhysicalHosp.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtPhysicalHosp.setText(""); i++;
		}
		try 
		{
			if((int) data[i] == 0)
				chckbxMentalHospitalizationIn.setEnabled(false);
			else
				chckbxMentalHospitalizationIn.setEnabled(true);
			i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			chckbxMentalHospitalizationIn.setEnabled(false);; i++;
		}
		try 
		{
			txtMentalHosp.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtMentalHosp.setText(""); i++;
		}
		try 
		{
			if((int) data[i] == 0)
				chckbxIvUsedIn.setEnabled(false);
			else
				chckbxIvUsedIn.setEnabled(true);
			i++;			
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			chckbxIvUsedIn.setEnabled(false);; i++;
		}
		try 
		{
			if((int) data[i] == 0)
				chckbxPriorTPlan.setEnabled(false);
			else
				chckbxPriorTPlan.setEnabled(true);
			i++;			
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			chckbxPriorTPlan.setEnabled(false);; i++;
		}
		try 
		{
			txtHowMany.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtHowMany.setText(""); i++;
		}
		try 
		{
			txtWhereAndWhen.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtWhereAndWhen.setText(""); i++;
		}

		try 
		{
			txtSubs1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubs1.setText(""); i++;
		}
		try 
		{
			txtSubsDate1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsDate1.setText(""); i++;
		}
		try 
		{
			txtsubsAmount1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtsubsAmount1.setText(""); i++;
		}
		try 
		{
			txtSubsFreq1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsFreq1.setText(""); i++;
		}
		try 
		{
			txtSubsMeth1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsMeth1.setText(""); i++;
		}
		try 
		{
			txtSubs2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubs2.setText(""); i++;
		}
		try 
		{
			txtSubsDate2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsDate2.setText(""); i++;
		}
		try 
		{
			txtSubsAmount2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsAmount2.setText(""); i++;
		}
		try 
		{
			txtSubsFreq2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsFreq2.setText(""); i++;
		}
		try 
		{
			txtSubsMethod2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsMethod2.setText(""); i++;
		}
		try 
		{
			txtSubs3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubs3.setText(""); i++;
		}
		try 
		{
			txtSubsDate3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsDate3.setText(""); i++;
		}
		try 
		{
			txtSubsAmount3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsAmount3.setText(""); i++;
		}
		try 
		{
			txtSubsFreq3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsFreq3.setText(""); i++;
		}
		try 
		{
			txtSubsMethod3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtSubsMethod3.setText(""); i++;
		}
		try 
		{
			txtDiag1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDiag1.setText(""); i++;
		}
		try 
		{
			txtMedName1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtMedName1.setText(""); i++;
		}
		try 
		{
			txtDosage1.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDosage1.setText(""); i++;
		}
		try 
		{
			txtDiag2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDiag2.setText(""); i++;
		}
		try 
		{
			txtMedName2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtMedName2.setText(""); i++;
		}
		try 
		{
			txtDosage2.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDosage2.setText(""); i++;
		}
		try 
		{
			txtDiag3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDiag3.setText(""); i++;
		}
		try 
		{
			txtMedName3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtMedName3.setText(""); i++;
		}
		try 
		{
			txtDosage3.setText((String) data[i]);i++;
		}
		catch(NullPointerException e) 
		{
			System.out.println("Error Retrieving data in object array field " + i);
			txtDosage3.setText("");
		}
	}
//
	public JComponent getPanel()
	{
		return Intake;
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnExit)
		{
			IntakeForm.close(); //This exits the form and doesnt save anything
		}
		if(e.getSource()==btnSubmit)
		{
			sendData(type); //this sends the data to the database
		}

	}

	private void sendData(int j) 
	{
		Object[] data;
		boolean cont = validateInput();
		if(cont == true)
		{
			data = new Object[95];
			int i = 0;
			data[i] = txtFirstName.getText();i++;
			data[i] = txtMI.getText();i++;
			data[i] = txtLastName.getText();i++;
			data[i] = txtDateOfBirth.getText();i++;
			
			if(txtVet.getText().matches("[yY]"))
					data[i] = 1;
			else
				data[i] = 0;
			i++;
					
			data[i] = txtAddress.getText();i++;
			data[i] = txtCity.getText();i++;
			data[i] = txtState.getText();i++;
			data[i] = txtZip.getText();i++;
			data[i] = txtCounty.getText();i++;
			data[i] = txtYearsInCounty.getText();i++;
			data[i] = txtPhoneNumber_1.getText();i++;
			data[i] = txtSecondaryPhone.getText();i++;
			data[i] = txtSocialSecurityNumber.getText();i++;
			data[i] = txtDriversLicense.getText();i++;
			data[i] = txtDlState.getText();i++;
			data[i] = txtMaritalStatus.getText();i++;
			data[i] = txtSpouseName.getText();i++;
			data[i] = txtEmergencyName.getText();i++;
			data[i] = textEmergencyRelationship.getText();i++;
			data[i] = textEmergencyPhone.getText();i++;
			data[i] = txtEmergencySecondary.getText();i++;
			data[i] = txtEmergencyAddress.getText();i++;
			data[i] = txtEmergencyCity.getText();i++;
			data[i] = textEmergencyState.getText();i++;
			data[i] = textEmergencyZip.getText();i++;
			data[i] = txtAgencyName.getText();i++;
			data[i] = txtAgencyContact.getText();i++;
			data[i] = txtAgencyCounty.getText();i++;
			data[i] = txtAgencyPhone.getText();i++;
			data[i] = txtAgencyAddress.getText();i++;
			data[i] = txtAgencyCity.getText();i++;
			data[i] = txtAgencyState.getText();i++;
			data[i] = txtAgencyZip.getText();i++;
			data[i] = txtAgencyCell.getText();i++;
			if(chckbxJailprobationInLast.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;

			if(chckbxOnProbation.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtProbationWhy.getText();i++;
			data[i] = txtNameOfOfficer.getText();i++;
			data[i] = txtOfficerAddress.getText();i++;
			data[i] = txtOfficerPhone.getText();i++;
			if(chckbxPhysicalHospitalizationIn.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtPhysicalHosp.getText();i++;
			if(chckbxMentalHospitalizationIn.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtMentalHosp.getText();i++;
			data[i] = txtSubs1.getText();i++;
			data[i] = txtSubsDate1.getText();i++;
			data[i] = txtSubsFreq1.getText();i++;
			data[i] = txtsubsAmount1.getText();i++;
			data[i] = txtSubsMeth1.getText();i++;
			data[i] = txtSubs2.getText();i++;
			data[i] = txtSubsDate2.getText();i++;
			data[i] = txtSubsFreq2.getText();i++;
			data[i] = txtSubsAmount2.getText();i++;
			data[i] = txtSubsMethod2.getText();i++;
			data[i] = txtSubs3.getText();i++;
			data[i] = txtSubsDate3.getText();i++;
			data[i] = txtSubsFreq3.getText();i++;
			data[i] = txtSubsAmount3.getText();i++;
			data[i] = txtSubsMethod3.getText();i++;
			if(chckbxIvUsedIn.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtHowMany.getText();i++;
			if(chckbxPriorTPlan.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtWhereAndWhen.getText();i++;
			if(chckbxYesToAsam.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtActionsTaken.getText();i++;
			if(chckbxYesToAsam_1.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtActionsTaken_1.getText();i++;
			if(chckbxYesToAsam_2.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtActionsTaken_2.getText();i++;
			if(chckbxYesToAsam_3.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtActionsTaken_3.getText();i++;
			if(chckbxDoYouHave.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = txtDescribe.getText();i++;
			data[i] = txtDiag1.getText();i++;
			data[i] = txtMedName1.getText();i++;
			data[i] = txtDosage1.getText();i++;
			data[i] = txtDiag2.getText();i++;
			data[i] = txtMedName2.getText();i++;
			data[i] = txtDosage2.getText();i++;
			data[i] = txtDiag3.getText();i++;
			data[i] = txtMedName3.getText();i++;
			data[i] = txtDosage3.getText();i++;
			if(chckbxHaveYouEver.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			if(chckbxHaveYouEver_1.isSelected())
			{
				data[i] = 1;
			}
			else
				data[i] = 0;
			i++;
			data[i] = strIntakeDate;i++;
			
			new Financials(data, j);
			IntakeForm.close();
			
		}
		
		
		
	}


	private boolean validateInput()
	{
		boolean valid = true;

		if(!txtFirstName.getText().matches("[a-zA-Z ]+ ") && valid == true && !txtLastName.getText().matches("[a-zA-Z ]+")
				&& !txtAddress.getText().matches("[a-zA-Z0-9 ]+") && !txtCity.getText().matches("[a-zA-Z0-9 ]+")
				&& !txtCity.getText().matches("[a-zA-Z0-9 ]+")&& !txtCounty.getText().matches("[a-zA-Z0-9 ]+")
				&& !txtDriversLicense.getText().matches("[a-zA-Z0-9 ]+")&& !txtMaritalStatus.getText().matches("[a-zA-Z0-9 ]+")
				&& !txtSpouseName.getText().matches("[a-zA-Z0-9 ]+") && !txtEmergencyName.getText().matches("[a-zA-Z0-9 ]+")
				&& !textEmergencyRelationship.getText().matches("[a-zA-Z0-9 ]+")&& !txtEmergencyAddress.getText().matches("[a-zA-Z0-9 ]+")
				&& !txtEmergencyCity.getText().matches("[a-zA-Z0-9 ]+") && !txtAgencyName.getText().matches("[a-zA-Z0-9 ]+")
				&& !txtAgencyAddress.getText().matches("[a-zA-Z0-9 ]+")&& !txtAgencyCity.getText().matches("[a-zA-Z0-9 ]+"))
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "Client, Emergency Contact and Agency are required fields!");
		}
		
		
		
		if(!txtMI.getText().matches("[a-zA-Z]{1}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "Middle initial must be 1 letter only");
		}
		
		if(!txtDateOfBirth.getText().matches("\\d{2}\\/\\d{2}\\/\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Date of Birth must be in numbers in the format MM/DD/YYYY");
		}
		if(!txtAge.getText().matches("[0-9]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The clients age must have numbers only");
		}
		if(!txtVet.getText().matches("[ynYN]") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "Vet must be a Y or N");
		}
		if(!txtZip.getText().matches("\\d{5}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Zip Code must have 5 numbers only");
		}
		if(!txtYearsInCounty.getText().matches("[0-9]+") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Years in county must be a number");
		}
		if(!txtPhoneNumber_1.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Phone Number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtSecondaryPhone.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Secondary Phone Number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtSocialSecurityNumber.getText().matches("\\d{3}-\\d{2}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Social Security Number must have numbers only in the format XXX-XX-XXXX");
		}
		if(!txtDlState.getText().matches("[A-Za-z]{2}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The DL State must have two letters only");
		}
		if(!textEmergencyPhone.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Phone Number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtEmergencySecondary.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Phone Number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!textEmergencyState.getText().matches("[A-Za-z]{2}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact's State must have two letters only");
		}
		if(!textEmergencyZip.getText().matches("\\d{5}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact's Zip Code must have 5 numbers only");
		}
		if(!txtAgencyPhone.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Emergency Contact phone number must have numbers only in the format XXX-XXX-XXXX");
		}
		if(!txtAgencyState.getText().matches("[A-Za-z]{2}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Contact State must have letters only");
		}
		if(!txtAgencyZip.getText().matches("\\d{5}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Zip Code must have 5 numbers only");
		}
		
		if(!txtAgencyCell.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Agency Contact Cell Phone must have numbers only in the format XXX-XXX-XXXX");
		}

		if (chckbxJailprobationInLast.isSelected() || chckbxOnProbation.isSelected()) 
		{
			if (!txtOfficerPhone.getText().matches("\\d{3}-\\d{3}-\\d{4}") && valid == true) 
			{
				valid = false;
				JOptionPane
						.showMessageDialog(
								null,
								"The Probation Contact number must have numbers only in the format XXX-XXX-XXXX");
			}
		}
		return valid;
	}
}
