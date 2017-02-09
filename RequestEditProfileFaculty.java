import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RequestEditProfileFaculty extends JFrame {


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequestEditProfileFaculty frame = new RequestEditProfileFaculty();
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
	public RequestEditProfileFaculty() {
		super("requesting......");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 553, 300);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxUserName = new JCheckBox("User Name");
		chckbxUserName.setBounds(6, 42, 97, 23);
		contentPane.add(chckbxUserName);
		chckbxUserName.setSelected(true);
		
		JLabel lblSelect = new JLabel("Update");
		lblSelect.setBounds(10, 11, 97, 14);
		contentPane.add(lblSelect);
		
		JLabel lblEnterPreviousEntry = new JLabel("Enter Previous Entry");
		lblEnterPreviousEntry.setBounds(137, 11, 140, 14);
		contentPane.add(lblEnterPreviousEntry);
		
		JLabel lblEnterNewEntry = new JLabel("Enter New Entry");
		lblEnterNewEntry.setBounds(379, 11, 114, 14);
		contentPane.add(lblEnterNewEntry);
		
		textField = new JTextField();
		textField.setBounds(119, 43, 166, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(342, 43, 170, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxEnrollNo = new JCheckBox("Enroll No");
		chckbxEnrollNo.setBounds(6, 78, 97, 23);
		contentPane.add(chckbxEnrollNo);
		chckbxEnrollNo.setSelected(true);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 79, 166, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(342, 79, 170, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JCheckBox chckbxContact = new JCheckBox("Contact");
		chckbxContact.setBounds(6, 118, 97, 23);
		contentPane.add(chckbxContact);
		chckbxContact.setSelected(true);
		
		textField_4 = new JTextField();
		textField_4.setBounds(119, 119, 166, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(342, 119, 170, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxDob = new JCheckBox("DOB");
		chckbxDob.setBounds(6, 158, 97, 23);
		contentPane.add(chckbxDob);
		chckbxDob.setSelected(true);
		
		JCheckBox chckbxUserType = new JCheckBox("UserType");
		chckbxUserType.setBounds(6, 193, 97, 23);
		contentPane.add(chckbxUserType);
		chckbxUserType.setSelected(true);
		
		textField_8 = new JTextField();
		textField_8.setBounds(119, 194, 166, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(342, 194, 170, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(119, 159, 45, 20);
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
		comboBox_1.setBounds(174, 159, 44, 20);
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
		comboBox_2.setBounds(228, 159, 57, 20);
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
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(342, 159, 44, 20);
		comboBox_3.addItem("01");
		comboBox_3.addItem("02");
		comboBox_3.addItem("03");
		comboBox_3.addItem("04");
		comboBox_3.addItem("05");
		comboBox_3.addItem("06");
		comboBox_3.addItem("07");
		comboBox_3.addItem("08");
		comboBox_3.addItem("09");
		comboBox_3.addItem("10");
		comboBox_3.addItem("11");
		comboBox_3.addItem("12");
		
		
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(401, 159, 44, 20);
		comboBox_4.addItem("01");
		comboBox_4.addItem("02");
		comboBox_4.addItem("03");
		comboBox_4.addItem("04");
		comboBox_4.addItem("05");
		comboBox_4.addItem("06");
		comboBox_4.addItem("07");
		comboBox_4.addItem("08");
		comboBox_4.addItem("09");
		comboBox_4.addItem("10");
		comboBox_4.addItem("11");
		comboBox_4.addItem("12");
		comboBox_4.addItem("13");
		comboBox_4.addItem("14");
		comboBox_4.addItem("15");
		comboBox_4.addItem("16");
		comboBox_4.addItem("17");
		comboBox_4.addItem("18");
		comboBox_4.addItem("19");
		comboBox_4.addItem("20");
		comboBox_4.addItem("21");
		comboBox_4.addItem("22");
		comboBox_4.addItem("23");
		comboBox_4.addItem("24");
		comboBox_4.addItem("25");
		comboBox_4.addItem("26");
		comboBox_4.addItem("27");
		comboBox_4.addItem("28");
		comboBox_4.addItem("29");
		comboBox_4.addItem("30");
		comboBox_4.addItem("31");
		contentPane.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(455, 159, 57, 20);
		comboBox_5.addItem("1970");
		comboBox_5.addItem("1971");
		comboBox_5.addItem("1972");
		comboBox_5.addItem("1973");
		comboBox_5.addItem("1974");
		comboBox_5.addItem("1975");
		comboBox_5.addItem("1976");
		comboBox_5.addItem("1977");
		comboBox_5.addItem("1978");
		comboBox_5.addItem("1979");
		
		comboBox_5.addItem("1980");
		comboBox_5.addItem("1981");
		comboBox_5.addItem("1982");
		comboBox_5.addItem("1983");
		comboBox_5.addItem("1984");
		comboBox_5.addItem("1985");
		comboBox_5.addItem("1986");
		comboBox_5.addItem("1987");
		comboBox_5.addItem("1988");
		comboBox_5.addItem("1989");
		comboBox_5.addItem("1990");
		
		comboBox_5.addItem("1991");
		comboBox_5.addItem("1992");
		comboBox_5.addItem("1993");
		comboBox_5.addItem("1994");
		comboBox_5.addItem("1995");

		contentPane.add(comboBox_5);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				textField_2.setText(null);
				textField_4.setText(null);
				textField_8.setText(null);

				textField_1.setText(null);
				textField_3.setText(null);
				textField_5.setText(null);
				textField_9.setText(null);
				
			    comboBox.setSelectedIndex(0);
			    comboBox_1.setSelectedIndex(0);
			    comboBox_2.setSelectedIndex(0);
			    comboBox_3.setSelectedIndex(0);
			    comboBox_4.setSelectedIndex(0);
			    comboBox_5.setSelectedIndex(0);
			    


			}
		});
		btnReset.setBounds(207, 225, 78, 23);
		contentPane.add(btnReset);
		
		JButton btnSendRequest = new JButton("SEND REQUEST");
		btnSendRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String UNAME=textField.getText();
				String ENROLL_NO=textField_2.getText();
				String CONTACT_NO=textField_4.getText();
				String USERTYPE=textField_8.getText();

				String RE_UNAME=textField_1.getText();
				String RE_ENROLL_NO=textField_3.getText();
				String RE_CONTACT_NO=textField_5.getText();
				String RE_USERTYPE=textField_9.getText();
				
			    String MONTH=(String)comboBox.getSelectedItem();
			    String DATE=(String)comboBox_1.getSelectedItem();
			    String YEAR=(String)comboBox_2.getSelectedItem();
			    
			    String RE_MONTH=(String)comboBox_3.getSelectedItem();
			    String RE_DATE=(String)comboBox_4.getSelectedItem();
			    String RE_YEAR=(String)comboBox_5.getSelectedItem();
			    
			    if(UNAME.length()==0||ENROLL_NO.length()==0||CONTACT_NO.length()==0||USERTYPE.length()==0||RE_UNAME.length()==0||RE_ENROLL_NO.length()==0||RE_CONTACT_NO.length()==0||RE_USERTYPE.length()==0||DATE.length()==0||RE_DATE.length()==0||MONTH.length()==0||RE_MONTH.length()==0||YEAR.length()==0||RE_YEAR.length()==0)
			    {
			    	JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);
			    }
			    
			    int flag=0;
			    Connection con=DBInfo1.con;
			    String query="insert into requestedit values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				    try 
				    {
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1,UNAME);
						ps.setString(2,RE_UNAME);
						ps.setString(3,ENROLL_NO);
						ps.setString(4,RE_ENROLL_NO);
						ps.setString(5,CONTACT_NO);
						ps.setString(6,RE_CONTACT_NO);
						ps.setString(7,USERTYPE);
						ps.setString(8,RE_USERTYPE);
						ps.setString(9,MONTH);
						ps.setString(10,RE_MONTH);
						ps.setString(11,DATE);
						ps.setString(12,RE_DATE);
						ps.setString(13,YEAR);
						ps.setString(14,RE_YEAR);
						flag=ps.executeUpdate();
						
					} 
				    catch (SQLException e1) 
				    {
						e1.printStackTrace();
					} 

			}
		});
		btnSendRequest.setBounds(364, 225, 129, 23);
		contentPane.add(btnSendRequest);
		
		JButton btnGoBack = new JButton(" Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Faculty obj=new Faculty();
				obj.setVisible(true);
				dispose();
			}
		});
	
		btnGoBack.setBounds(119, 225, 69, 23);
		contentPane.add(btnGoBack);
		
	}
}
