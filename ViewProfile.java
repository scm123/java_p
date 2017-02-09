import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ViewProfile extends JFrame {

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
					ViewProfile frame = new ViewProfile();
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
	public ViewProfile() {
		super("Admin Profile...");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 493, 294);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserProfile = new JLabel("<----click here to see profile");
		lblUserProfile.setBounds(260, 3, 170, 14);
		contentPane.add(lblUserProfile);
		
		JLabel lblName = new JLabel("Full Name");
		lblName.setBounds(24, 44, 78, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(126, 41, 161, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 76, 161, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex");
		lblSex.setBounds(24, 120, 78, 14);
		contentPane.add(lblSex);
		ButtonGroup g=new ButtonGroup();
		
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.setBounds(126, 111, 78, 23);
		g.add(chckbxMale);
		contentPane.add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		chckbxFemale.setBounds(221, 111, 66, 23);
		g.add(chckbxFemale);
		contentPane.add(chckbxFemale);
		
		JLabel lblContact = new JLabel("Contact  ");
		lblContact.setBounds(24, 185, 75, 20);
		contentPane.add(lblContact);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 185, 161, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblUserid = new JLabel("UserId");
		lblUserid.setBounds(24, 79, 78, 14);
		contentPane.add(lblUserid);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("photo.jpg"));
		lblNewLabel.setBounds(335, 25, 89, 85);
		contentPane.add(lblNewLabel);
		
		JLabel lblPhoto = new JLabel("photo");
		lblPhoto.setBounds(367, 115, 57, 14);
		contentPane.add(lblPhoto);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(24, 221, 81, 14);
		contentPane.add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setBounds(126, 218, 161, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnEditInfo = new JButton("Go Back");
		btnEditInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin obj=new Admin();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnEditInfo.setBounds(335, 184, 89, 23);
		contentPane.add(btnEditInfo);
		
		JButton btnNewButton = new JButton(new ImageIcon("back.jpg"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Admin obj=new Admin();
				obj.setVisible(true);
				dispose();
				

			}
		});
		btnNewButton.setBounds(10, 3, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth");
		lblDateOfBirth.setBounds(24, 154, 89, 20);
		contentPane.add(lblDateOfBirth);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(175, 154, 39, 20);
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
		comboBox_2.setBounds(230, 154, 57, 20);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(126, 154, 39, 20);
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
		
		JButton btnLogout = new JButton("logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnLogout.setBounds(335, 221, 89, 23);
		contentPane.add(btnLogout);
		
		JButton btnSeeProfile = new JButton("See Profile");
		btnSeeProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String uname=Login.strrr;
				Connection con=DBInfo1.con;
				String query="select *from registration where username=?";
				try 
					{
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1,uname);
						ResultSet res=ps.executeQuery();
					while(res.next())
					 {
							textField.setText(res.getString(1));
							textField_1.setText(res.getString(2));
							textField_2.setText(res.getString(3));
							textField_4.setText(res.getString(4));
							comboBox.setSelectedItem(res.getString(6));
							comboBox_1.setSelectedItem(res.getString(7));
							comboBox_2.setSelectedItem(res.getString(8));
		
							String s1=res.getString(5);
							if(s1.equals("male"))
							{
								chckbxMale.setSelected(true);
							}
							else
							{
								chckbxFemale.setSelected(true);
							}
					 }
					
					
				  } 
				catch (SQLException e1) 
					{
						e1.printStackTrace();
					}		
	
			}
		});
		btnSeeProfile.setBounds(153, 3, 97, 23);
		contentPane.add(btnSeeProfile);
	}
}
