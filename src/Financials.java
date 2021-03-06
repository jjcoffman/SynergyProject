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

public class Financials extends JFrame implements ActionListener
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
	private JTextField txtCharges;
	private JTextField txtStartDate;
	private JTextField txtEndDate;
	private JLabel lblPrivateCharges;
	private JButton btnContinue;
	Object[] newData;
	int type;
	private MyTableModel passed;
	
	
	//THIS IS USED FOR WINDOW BUILDER TO KNOW WHERE TO LOOK TO SHOW THE PANEL
	
	public Financials(Object data[], int j, MyTableModel table)
	{
		passed = table;
		newData = data;
		type = j;
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
		lblDsmIvCode.setBounds(34, 57, 96, 16);
		fin.add(lblDsmIvCode);
		
		txtDSM = new JTextField();
		txtDSM.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtDSM.setBounds(142, 51, 109, 28);
		fin.add(txtDSM);
		txtDSM.setColumns(10);
		
		JLabel lblPrimaryCounselor = new JLabel("Primary Counselor:");
		lblPrimaryCounselor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrimaryCounselor.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPrimaryCounselor.setBounds(240, 57, 168, 16);
		fin.add(lblPrimaryCounselor);
		
		textCounselor = new JTextField();
		textCounselor.setFont(new Font("Verdana", Font.PLAIN, 13));
		textCounselor.setBounds(420, 51, 212, 28);
		fin.add(textCounselor);
		textCounselor.setColumns(10);
		
		JLabel lblPaymentMethod = new JLabel("Payment Method:");
		lblPaymentMethod.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPaymentMethod.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPaymentMethod.setBounds(6, 96, 127, 16);
		fin.add(lblPaymentMethod);
		
		comboBox = new JComboBox<Object>();
		comboBox.addItem(new AnyObject("1", "Private"));
		comboBox.addItem(new AnyObject("2", "Indigent"));
		comboBox.addItem(new AnyObject("3", "Drug Court"));
		comboBox.addItem(new AnyObject("4", "AB109"));
		comboBox.addItem(new AnyObject("5", "CPS"));
		comboBox.addItem(new AnyObject("5", "Other"));
		comboBox.setBounds(142, 93, 134, 27);
		comboBox.addActionListener(this);
		fin.add(comboBox);
		
		txtOther = new JTextField();
		txtOther.setBounds(305, 92, 327, 28);
		fin.add(txtOther);
		txtOther.setColumns(10);
		
		JLabel lblCounty = new JLabel("County:");
		lblCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblCounty.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCounty.setBounds(69, 140, 61, 16);
		fin.add(lblCounty);
		
		txtCounty = new JTextField();
		txtCounty.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtCounty.setBounds(142, 134, 134, 28);
		fin.add(txtCounty);
		txtCounty.setColumns(10);
		
		lblPrivateCharges = new JLabel("Private Charges:");
		lblPrivateCharges.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblPrivateCharges.setBounds(305, 140, 116, 16);
		lblPrivateCharges.setVisible(true);
		fin.add(lblPrivateCharges);
		
		txtCharges = new JTextField("$0.00");
		txtCharges.setBounds(425, 134, 207, 28);
		fin.add(txtCharges);
		txtCharges.setColumns(10);
		
		JLabel lblAuthorizationStartDate = new JLabel("Authorization Start Date:");
		lblAuthorizationStartDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAuthorizationStartDate.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAuthorizationStartDate.setBounds(120, 185, 200, 16);
		fin.add(lblAuthorizationStartDate);
		
		JLabel lblEndDate = new JLabel("End Date:");
		lblEndDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndDate.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblEndDate.setBounds(111, 224, 209, 16);
		fin.add(lblEndDate);
		
		txtStartDate = new JTextField();
		txtStartDate.setBounds(330, 180, 134, 28);
		fin.add(txtStartDate);
		txtStartDate.setColumns(10);
		
		txtEndDate = new JTextField();
		txtEndDate.setBounds(330, 219, 134, 28);
		fin.add(txtEndDate);
		txtEndDate.setColumns(10);
		
		btnContinue = new JButton("Continue");
		btnContinue.setBounds(264, 261, 117, 29);
		btnContinue.addActionListener(this);
		fin.add(btnContinue);
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
		
		if(type == 0)
		{
			window.dispose();
			sendData();
		}
		
		
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
	
	private Object[][] getExisting() 
	{
		//Object[][] data = {{12342,"Clint Eastwood"},{23423,"Will Clark"},{34454,"Barry Bonds"},{34552,"Derek Jeter"}};
		//return data;
		try {
			int size = test.getSize("Phone_Intake");
		
		Object[][] data = new Object[size][2];
		for (int i = 1; i <= size; i++){
			data[i-1] = test.getPendingRows(i - 1, 1);
		}
		System.out.println("rows in Phone_Intake: " + test.getSize("Phone_Intake"));
		return data;
		}
		catch(NullPointerException e) {
			System.out.println("No database connected!");
			Object[][] data = {{"No data", "base", "Connected"}};
			return data;
		}
	}
	private void sendData() 
	{
		int i = 86;
		newData[i] = txtDSM.getText(); i++;
		newData[i] = textCounselor.getText(); i++;
		
		Object item = comboBox.getSelectedItem();
		String s = ((AnyObject)item).toString();
		newData[i] = s; i++;
		
		newData[i] = txtOther.getText(); i++;
		newData[i] = txtCounty.getText(); i++;
		newData[i] = txtCharges.getText(); i++;
		newData[i] = txtStartDate.getText(); i++;
		newData[i] = txtEndDate.getText(); i++;
		
		if(newData[4].equals(""))
			newData[4] = 0;
		if(newData[8].equals(""))
			newData[8] = 0;
		if(newData[10].equals(""))
			newData[10] = 0;
		if(newData[25].equals(""))
			newData[25] = "00000";
		if(newData[35].equals(""))
			newData[35] = 0;
		if(newData[36].equals(""))
			newData[36] = 0;
		if(newData[41].equals(""))
			newData[41] = 0;
		if(newData[43].equals(""))
			newData[43] = 0;
		if(newData[60].equals(""))
			newData[60] = 0;
		if(newData[62].equals(""))
			newData[62] = 0;
		if(newData[64].equals(""))
			newData[64] = 0;
		if(newData[66].equals(""))
			newData[66] = 0;
		if(newData[68].equals(""))
			newData[68] = 0;
		if(newData[70].equals(""))
			newData[70] = 0;
		if(newData[72].equals(""))
			newData[72] = 0;
		if(newData[83].equals(""))
			newData[83] = 0;
		if(newData[84].equals(""))
			newData[84] = 0;
		
		
		for(int x = 0; x < 86; x++)
		{
			if(newData[x].equals(""))
				newData[x] = " ";
		}
		
		
		send.sendNewInfo(newData, type);
		
		
	}
		
}