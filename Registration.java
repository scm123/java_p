import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JCheckBox chckbxAdmin;
	JCheckBox chckbxFaculty;
	JCheckBox chckbxStudent;
	String sex=null;
	//String selected_month;
	//String selected_date;
//	String selected_year;
	ButtonGroup g,g1;
	int count=0;
	private JLabel lblSex;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		super("Registration Page...");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 666, 303);
		setLocationRelativeTo(this);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterName = new JLabel("Enter Name*");
		lblEnterName.setBounds(163, 46, 118, 14);
		contentPane.add(lblEnterName);
		
		textField = new JTextField();
		textField.setBounds(318, 40, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterEmail = new JLabel("Enroll Number*");
		lblEnterEmail.setBounds(163, 77, 118, 14);
		contentPane.add(lblEnterEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(318, 71, 156, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContactNumber = new JLabel("Contact Number*");
		lblContactNumber.setBounds(163, 108, 118, 14);
		contentPane.add(lblContactNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(318, 102, 156, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password*");
		lblEnterPassword.setBounds(163, 139, 118, 14);
		contentPane.add(lblEnterPassword);
		
		textField_3 = new JTextField();
		textField_3.setBounds(318, 133, 156, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password*");
		lblReenterPassword.setBounds(163, 167, 118, 14);
		contentPane.add(lblReenterPassword);
		
		textField_4 = new JTextField();
		textField_4.setBounds(318, 164, 156, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		String uname=textField.getText();
		String enroll=textField_1.getText();
		String contct=textField_2.getText();
		System.out.println(contct);
		String pass=textField_3.getText();
		String  repass=textField_4.getText();
	
		
				JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				
				textField_1.setText(null);
				textField_2.setText(null);	
				textField_3.setText(null);
				textField_4.setText(null);
				g.clearSelection();
				count=0;
				dispose();
	
			}
		});
		btnReset.setBounds(274, 227, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Login obj=new Login();
				obj.setVisible(true);
				dispose();	
			}
		});
		btnLogin.setBounds(385, 227, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNew = new JLabel(new ImageIcon("reg.jpg"));
		lblNew.setBounds(21, 43, 118, 152);
		contentPane.add(lblNew);
		g=new ButtonGroup();
		
		chckbxStudent = new JCheckBox("Student");
		chckbxStudent.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				count=1;
			}
		});
		g.add(chckbxStudent);
		chckbxStudent.setBounds(163, 197, 97, 23);
		contentPane.add(chckbxStudent);
		
		chckbxFaculty = new JCheckBox("Faculty");
		chckbxFaculty.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				count=2;
			}
		});
		g.add(chckbxFaculty);
		chckbxFaculty.setBounds(274, 197, 97, 23);
		contentPane.add(chckbxFaculty);
		
		chckbxAdmin = new JCheckBox("Admin");
		chckbxAdmin.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				count=3;
			}
		});
		g.add(chckbxAdmin);
		chckbxAdmin.setBounds(377, 197, 97, 23);
		contentPane.add(chckbxAdmin);
		
		lblSex = new JLabel("Sex*");
		lblSex.setBounds(524, 40, 46, 14);
		contentPane.add(lblSex);
		g1=new ButtonGroup();
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				sex="male";
			}
		});
		chckbxMale.setBounds(524, 68, 97, 23);
		contentPane.add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		chckbxFemale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				sex="female";
			}
		});
		chckbxFemale.setBounds(524, 101, 97, 23);
		contentPane.add(chckbxFemale);
		
		g1.add(chckbxMale);
		g1.add(chckbxFemale);
		
		JLabel lblDob = new JLabel("DOB *");
		lblDob.setBounds(524, 139, 46, 14);
		contentPane.add(lblDob);
		
		JLabel lblMm = new JLabel("MM");
		lblMm.setBounds(524, 167, 30, 14);
		contentPane.add(lblMm);
		
		JLabel lblDd = new JLabel("DD");
		lblDd.setBounds(524, 197, 30, 14);
		contentPane.add(lblDd);
		
		JLabel lblYyyy = new JLabel("YYYY");
		lblYyyy.setBounds(524, 231, 46, 14);
		contentPane.add(lblYyyy);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				//selected_month=(String)comboBox.getSelectedItem();
			//	System.out.println(selected_month);
			}
		});
		comboBox.setBounds(575, 164, 65, 20);
		comboBox.addItem("select");
		comboBox.addItem("01");
		comboBox.addItem("02");
		comboBox.addItem("03");
		comboBox.addItem("04");
		comboBox.addItem("05");
		comboBox.addItem("06");
		comboBox.addItem("07");
		comboBox.addItem("08");
		comboBox.addItem("09");
		comboBox.addItem("10");
		comboBox.addItem("11");
		comboBox.addItem("12");
		
		contentPane.add(comboBox);
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				//selected_date=(String)comboBox_1.getSelectedItem();
			}
		});

		comboBox_1.addItem("select");
		comboBox_1.addItem("01");
		comboBox_1.addItem("02");
		comboBox_1.addItem("03");
		comboBox_1.addItem("04");
		comboBox_1.addItem("05");
		comboBox_1.addItem("06");
		comboBox_1.addItem("07");
		comboBox_1.addItem("08");
		comboBox_1.addItem("09");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		comboBox_1.addItem("12");
		comboBox_1.addItem("13");
		comboBox_1.addItem("14");
		comboBox_1.addItem("15");
		comboBox_1.addItem("16");
		comboBox_1.addItem("17");
		comboBox_1.addItem("18");
		comboBox_1.addItem("19");
		comboBox_1.addItem("20");
		comboBox_1.addItem("21");
		comboBox_1.addItem("22");
		comboBox_1.addItem("23");
		comboBox_1.addItem("24");
		comboBox_1.addItem("25");
		comboBox_1.addItem("26");
		comboBox_1.addItem("27");
		comboBox_1.addItem("28");
		comboBox_1.addItem("29");
		
		comboBox_1.setBounds(575, 194, 65, 20);
		
				comboBox_1.addItem("30");
				comboBox_1.addItem("31");
		
		

		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			{
				//selected_year=(String)comboBox_2.getSelectedItem();
			}
		});
		comboBox_2.setBounds(575, 228, 65, 20);
		comboBox_2.addItem("select");
		comboBox_2.addItem("1970");
		comboBox_2.addItem("1971");
		comboBox_2.addItem("1972");
		comboBox_2.addItem("1973");
		comboBox_2.addItem("1974");
		comboBox_2.addItem("1975");
		comboBox_2.addItem("1976");
		comboBox_2.addItem("1977");
		comboBox_2.addItem("1978");
		comboBox_2.addItem("1979");
		
		comboBox_2.addItem("1980");
		comboBox_2.addItem("1981");
		comboBox_2.addItem("1982");
		comboBox_2.addItem("1983");
		comboBox_2.addItem("1984");
		comboBox_2.addItem("1985");
		comboBox_2.addItem("1986");
		comboBox_2.addItem("1987");
		comboBox_2.addItem("1988");
		comboBox_2.addItem("1989");
		comboBox_2.addItem("1990");
		
		comboBox_2.addItem("1991");
		comboBox_2.addItem("1992");
		comboBox_2.addItem("1993");
		comboBox_2.addItem("1994");
		comboBox_2.addItem("1995");

		contentPane.add(comboBox_2);
		
		JLabel label = new JLabel("*");
		label.setBounds(141, 201, 16, 14);
		contentPane.add(label);
	
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int flag=0;
				int flag1=0;
				String	selected_month=(String)comboBox.getSelectedItem();
				String  selected_date=(String)comboBox_1.getSelectedItem();
				String  selected_year=(String)comboBox_2.getSelectedItem();
				String uname=textField.getText();
				String enroll=textField_1.getText();
				String contct=textField_2.getText();
				System.out.println(contct);
				String pass=textField_3.getText();
				String  repass=textField_4.getText();
					if(uname.length()==0||enroll.length()==0||contct.length()==0||pass.length()==0||repass.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill all query","Error",JOptionPane.ERROR_MESSAGE);
					
				}
				else if(selected_month.equals("select")||selected_date.equals("select")||selected_year.equals("select"))
				{
					JOptionPane.showMessageDialog(getParent(),"plz select your DOB","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(sex==null)
				{
					JOptionPane.showMessageDialog(getParent(),"plz select your sex","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(count==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz select any usertype","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(!pass.equals(repass))
				{
					JOptionPane.showMessageDialog(getParent(),"passwords are not matching","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(contct.length()!=10 )
				{
					JOptionPane.showMessageDialog(getParent(),"wrong contact number","Error",JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					
				String query1="insert into login values (?,?,?)";
				Connection con1=DBInfo1.con;
				
				
				try
				{	
						PreparedStatement ps=con1.prepareStatement(query1);		
						ps.setString(1,uname);
						ps.setString(2,pass);
						String str="";
								if(count==1)
									{
									str="student";
									}
								else if(count==2)
									{
									str="faculty";
									}
								else if(count==3)
									{
									str="admin";
									}
						ps.setString(3,str);	
						
						flag1=ps.executeUpdate();
						
						//con1.close();
						//ps.close();
					//	DBInfo1.con.close();				
				}
				catch(Exception ea)
				{
					ea.printStackTrace();
				}
			}
	//---------------------------------------------------------------------------------------------------------------------------------------	
			
					
					String darling="insert into registration values(?,?,?,?,?,?,?,?)";
					
					
					Connection con=DBInfo1.con;
					try
					{	
						
							PreparedStatement ps1=con.prepareStatement(darling);
							
							ps1.setString(1,uname);
							ps1.setString(2,enroll);
							ps1.setString(3,contct);
							ps1.setString(4,pass);
							ps1.setString(5,sex);
							ps1.setString(6,selected_date);
							ps1.setString(7,selected_month);
							ps1.setString(8,selected_year);
						
							flag=ps1.executeUpdate();
							System.out.println(flag1+"------------------------------------");
						
					}
					catch(Exception ea)
					{
						ea.printStackTrace();
					}
		//-----------------------------------------------------------------------------------------------------------------------------
				 if(flag==0||flag1==0)
				    {
					JOptionPane.showMessageDialog(getParent(),"Registration Failed","Error",JOptionPane.ERROR_MESSAGE);
				    } 
				 
				 if(flag!=0 && flag1!=0)
					 {
					 JOptionPane.showMessageDialog(getParent(),"registration sucessful");
					 }	
					
				
			}
		
		});
		btnSave.setBounds(163, 227, 89, 23);
		contentPane.add(btnSave);
		

	}
}
