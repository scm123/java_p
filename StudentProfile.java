import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class StudentProfile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentProfile frame = new StudentProfile();
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
	public StudentProfile() {
		super("student profile....");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 309);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(33, 42, 97, 14);
		contentPane.add(lblFullName);
		
		textField = new JTextField();
		textField.setBounds(128, 39, 174, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Student obj= new Student();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnGoBack.setBounds(0, 0, 89, 23);
		contentPane.add(btnGoBack);
		
		JLabel lblFatherName = new JLabel("Enroll  ID");
		lblFatherName.setBounds(33, 82, 82, 14);
		contentPane.add(lblFatherName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 79, 174, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(33, 121, 66, 14);
		contentPane.add(lblSex);
		ButtonGroup g=new ButtonGroup();
		
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.setBounds(128, 117, 90, 23);
		g.add(chckbxMale);
		contentPane.add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		chckbxFemale.setBounds(233, 117, 82, 23);
		g.add(chckbxFemale);
		contentPane.add(chckbxFemale);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(33, 158, 89, 14);
		contentPane.add(lblDateOfBirth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(128, 155, 45, 20);
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
		comboBox_1.setBounds(187, 155, 45, 20);
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
		comboBox_1.addItem("30");
		comboBox_1.addItem("31");

		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(242, 155, 60, 20);
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
		comboBox_2.addItem("1996");
		comboBox_2.addItem("1997");
		comboBox_2.addItem("1998");
		comboBox_2.addItem("1999");
		comboBox_2.addItem("2000");


		contentPane.add(comboBox_2);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(33, 193, 82, 14);
		contentPane.add(lblContact);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 190, 170, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("UserType");
		lblAddress.setBounds(33, 234, 82, 14);
		contentPane.add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setBounds(132, 231, 170, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("login.jpg"));
		lblNewLabel.setBounds(324, 22, 100, 106);
		contentPane.add(lblNewLabel);
		
		JButton btnLogout = new JButton("logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				Login obj=new Login();
				obj.setVisible(true);
				dispose();	
			}
		});
		btnLogout.setBounds(322, 230, 89, 23);
		contentPane.add(btnLogout);
		
		JButton btnSeeProfile = new JButton("See Profile");
		btnSeeProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Connection con=DBInfo1.con;
				String query="select *from registration where username=? ";
				try 
				{
				String uname=Login.strrr;
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,uname);
					ResultSet res=ps.executeQuery();
					while(res.next())
					{
						textField.setText(res.getString(1));
						textField_1.setText(res.getString(2));
						textField_2.setText(res.getString(3));
						textField_4.setText(res.getString(4));
						String s1=res.getString(5);
						if(s1.equals("male"))
						{
							chckbxMale.setSelected(true);
						}
						else
						{
							chckbxFemale.setSelected(true);
						}
						comboBox.setSelectedItem(res.getString(6));
						comboBox_1.setSelectedItem(res.getString(7));
						comboBox_2.setSelectedItem(res.getString(8));
	
						
					}
				} 
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		btnSeeProfile.setBounds(161, 0, 108, 23);
		contentPane.add(btnSeeProfile);
		
		JLabel label = new JLabel("<---Click here for see profile");
		label.setBounds(269, 4, 165, 14);
		contentPane.add(label);
	}
}
