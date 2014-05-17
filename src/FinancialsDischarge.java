import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;


public class FinancialsDischarge extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private static JFrame window;
	private JScrollPane spFin;
	private JTextField txtDSM;
	private JTextField textCounselor;
	SQLSetInfo send = new SQLSetInfo();
	SQLRetrieveInfo test = new SQLRetrieveInfo();
	private JComboBox<Object> comboBox;
	private JTextField txtOther;
	private JTextField txtCounty;
	private JButton btnContinue;
	Object[] arcData;
	private MyTableModel passed;
	private JTextField txtDischarge;
	private JTextField txtOwed;
	
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	
	public FinancialsDischarge(Object data[], MyTableModel table)
	{
		passed = table;
		arcData = data;
		window = new JFrame("Financials");
		window.setResizable(false);
		
		JPanel fin = new JPanel();
		fin.setPreferredSize(new Dimension(600, 300));
		
		spFin = new JScrollPane(fin);
		fin.setLayout(null);
		
		JLabel lblIntakeDate = new JLabel("Intake Date:");
		lblIntakeDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIntakeDate.setBounds(46, 22, 84, 17);
		lblIntakeDate.setFont(new Font("Verdana", Font.PLAIN, 13));
		fin.add(lblIntakeDate);
		
		String s = "";
		try {
			s = (String) data[87];
		} catch (Exception e) 
		{
			s = "ERROR";
		}
		
		
		JLabel lblintakedate = new JLabel(s);
		lblintakedate.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblintakedate.setBounds(142, 22, 96, 16);
		fin.add(lblintakedate);
		
		String name = "";
		try {
			name = (String) data[0] + " " + data[1] + " " + data[2];
		} catch (Exception e) 
		{
			name = "ERROR IN NAME";
		}
		
		JLabel lblclientname = new JLabel(name);
		lblclientname.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblclientname.setHorizontalAlignment(SwingConstants.CENTER);
		lblclientname.setBounds(240, 22, 180, 16);
		fin.add(lblclientname);
		
		
		JLabel lblDsmIvCode = new JLabel("DSM IV Code:");
		lblDsmIvCode.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDsmIvCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDsmIvCode.setBounds(33, 66, 96, 16);
		fin.add(lblDsmIvCode);
		
		txtDSM = new JTextField();
		txtDSM.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDSM.setBounds(142, 60, 109, 28);
		fin.add(txtDSM);
		txtDSM.setColumns(10);
		
		JLabel lblPrimaryCounselor = new JLabel("Primary Counselor:");
		lblPrimaryCounselor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrimaryCounselor.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPrimaryCounselor.setBounds(240, 66, 168, 16);
		fin.add(lblPrimaryCounselor);
		
		textCounselor = new JTextField();
		textCounselor.setFont(new Font("Verdana", Font.PLAIN, 13));
		textCounselor.setBounds(420, 60, 212, 28);
		fin.add(textCounselor);
		textCounselor.setColumns(10);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method:");
		lblPaymentMethod.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaymentMethod.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPaymentMethod.setBounds(6, 103, 127, 16);
		fin.add(lblPaymentMethod);
		
		comboBox = new JComboBox<Object>();
		comboBox.addItem(new AnyObject("1", "Private"));
		comboBox.addItem(new AnyObject("2", "Indigent"));
		comboBox.addItem(new AnyObject("3", "Drug Court"));
		comboBox.addItem(new AnyObject("4", "AB109"));
		comboBox.addItem(new AnyObject("5", "CPS"));
		comboBox.addItem(new AnyObject("5", "Other"));
		comboBox.setBounds(142, 100, 134, 27);
		comboBox.addActionListener(this);
		fin.add(comboBox);
		
		txtOther = new JTextField();
		txtOther.setBounds(320, 100, 312, 28);
		fin.add(txtOther);
		txtOther.setColumns(10);
		
		JLabel lblCounty = new JLabel("County:");
		lblCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCounty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCounty.setBounds(165, 146, 145, 16);
		fin.add(lblCounty);
		
		txtCounty = new JTextField();
		txtCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtCounty.setBounds(320, 140, 135, 28);
		fin.add(txtCounty);
		txtCounty.setColumns(10);
		
		btnContinue = new JButton("Continue");
		btnContinue.setBounds(272, 273, 117, 29);
		btnContinue.addActionListener(this);
		fin.add(btnContinue);
		
		JLabel lblDischarge = new JLabel("Discharge Date");
		lblDischarge.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblDischarge.setBounds(420, 23, 109, 16);
		fin.add(lblDischarge);
		
		txtDischarge = new JTextField();
		txtDischarge.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDischarge.setBounds(536, 20, 96, 28);
		fin.add(txtDischarge);
		txtDischarge.setColumns(10);
		
		JLabel lblMoneyOwedAt = new JLabel("Money Owed at Exit:");
		lblMoneyOwedAt.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMoneyOwedAt.setBounds(20, 172, 169, 16);
		fin.add(lblMoneyOwedAt);
		
		txtOwed = new JTextField();
		txtOwed.setBounds(0, 200, 661, 63);
		fin.add(txtOwed);
		txtOwed.setColumns(10);
		txtOther.setVisible(false);
		
		spFin.setBounds(0, 0, 665, 350);
		spFin.setVisible(true);
		
		window.setPreferredSize(new Dimension(665, 350));
		window.setSize(665, 700);
        window.setLocationRelativeTo(null);
		window.getContentPane().setLayout(null);
		window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		window.getContentPane().add(spFin);
		window.pack();
		

			window.dispose();
			sendData();

		
		
		window.setVisible(true);

	}

	private boolean validateInput() 
	{
		Boolean valid = true;
		
		if(!txtStartDate.getText().matches("\\d{2}\\/\\d{2}\\/\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Date must be in numbers in the format DD/MM/YYYY");
		}
		if(!txtEndDate.getText().matches("\\d{2}\\/\\d{2}\\/\\d{4}") && valid == true)
		{
			valid = false;
			JOptionPane.showMessageDialog(null, "The Date must be in numbers in the format DD/MM/YYYY");
		}
		if (comboBox.getSelectedItem().equals("Private")) 
		{
			if (!txtCharges.getText().matches("[0-9 ]+ ") && valid == true) 
			{
				valid = false;
				JOptionPane.showMessageDialog(null, "The Private Charges must be numbers only");
			}
		}
		return valid;
	}
	
	public class AnyObject 
	{

	    private String text;

	    public AnyObject(String value, String text) {
	        this.text = text;
	    }

	    @Override
	    public String toString() {
	        return text;
	    }
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == comboBox)
		{
			Object item = comboBox.getSelectedItem();
			String s = ((AnyObject)item).toString();
			if(s.equals("Private"))
			{
				txtOther.setVisible(false);
				txtCharges.setVisible(true);
				lblPrivateCharges.setVisible(true);
				
			}
			else if(s.equals("Indigent"))
			{
				txtOther.setVisible(false);
				txtCharges.setVisible(false);
				lblPrivateCharges.setVisible(false);
			}
			else if(s.equals("Drug Court"))
			{
				txtOther.setVisible(false);
				txtCharges.setVisible(false);
				lblPrivateCharges.setVisible(false);
			}
			else if(s.equals("AB109"))
			{
				txtOther.setVisible(false);
				txtCharges.setVisible(false);
				lblPrivateCharges.setVisible(false);
			}
			else if(s.equals("CPS"))
			{
				txtOther.setVisible(false);
				txtCharges.setVisible(false);
				lblPrivateCharges.setVisible(false);
			}
			else if(s.equals("Other"))
			{
				txtOther.setVisible(true);
				txtCharges.setVisible(false);
				lblPrivateCharges.setVisible(false);
			}
		}
		if(e.getSource() == btnContinue)
		{
			Boolean cont = validateInput();
			if(cont == true)
				sendData();
			Object[][] datas = getExisting();
			passed.update(datas);
			window.dispose();
			
		}
	}
	
	//This will fill the object array with the data from the the existing users
	public Object[][] getExisting()
	{
		//Object[][] data = {{12342,"Clint Eastwood"},{23423,"Will Clark"},{34454,"Barry Bonds"},{34552,"Derek Jeter"}};
		//return data;
		try {
			int size = test.getSize("Client_Record");

			Object[][] data = new Object[size][2];
			for (int i = 1; i <= size; i++){
				data[i-1] = test.getRows(i - 1, 1);
			}
			System.out.println("rows in client_record: " + test.getSize("Client_Record"));
			return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No database", "Connected"}};
			return data;
		} 
	}
	private void sendData() 
	{
		int i = 86;
		arcData[i] = txtDSM.getText(); i++;
		arcData[i] = textCounselor.getText(); i++;
		
		Object item = comboBox.getSelectedItem();
		String s = ((AnyObject)item).toString();
		arcData[i] = s; i++;
		
		arcData[i] = txtOther.getText(); i++;
		arcData[i] = txtCounty.getText(); i++;i++;i++;i++;
		
		if(arcData[4].equals(""))
			arcData[4] = 0;
		
		
		
		for(int x = 0; x < 86; x++)
		{
			if(arcData[x].equals(""))
				arcData[x] = " ";
		}
		
		//this is wrong, sendToArchive(arcData, type)
		//send.sendNewInfo(arcData, type);
		
		
	}
}