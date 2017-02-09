import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class IssueBookFaculty extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBookFaculty frame = new IssueBookFaculty();
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
	public IssueBookFaculty() {
		super("Issue  and Submit Faculty Book..");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 327);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFacultyName = new JLabel("Faculty Name");
		lblFacultyName.setBounds(10, 59, 88, 14);
		contentPane.add(lblFacultyName);
		
		textField = new JTextField();
		textField.setBounds(118, 56, 172, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnrollId = new JLabel("Enroll  Id");
		lblEnrollId.setBounds(10, 91, 76, 17);
		contentPane.add(lblEnrollId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 89, 172, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(10, 27, 88, 14);
		contentPane.add(lblDepartment);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(118, 24, 285, 20);
		comboBox.addItem("Select");
		comboBox.addItem("Mathmatics Department");
		comboBox.addItem("Physics Department");
		comboBox.addItem("Social Health and Huminity Department");
		comboBox.addItem("Mechanical Department");
		comboBox.addItem("Civil Department");
		comboBox.addItem("Chemical Department");
		comboBox.addItem("Electrical Department");
		comboBox.addItem("Electronics and Communication Department");
		comboBox.addItem("Computer Science Department");
		comboBox.addItem("Information Technology Department");
		comboBox.addItem("Metalargical Department");
		comboBox.addItem("Mining Department");
		
		
		contentPane.add(comboBox);
		
		JLabel lblBookId = new JLabel("Book  Id");
		lblBookId.setBounds(10, 128, 88, 14);
		contentPane.add(lblBookId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 122, 172, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(10, 163, 76, 14);
		contentPane.add(lblSubject);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 157, 172, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(10, 196, 76, 14);
		contentPane.add(lblAuthor);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 193, 172, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPublication = new JLabel("Publication");
		lblPublication.setBounds(10, 227, 88, 17);
		contentPane.add(lblPublication);
		
		textField_5 = new JTextField();
		textField_5.setBounds(118, 224, 172, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Admin obj=new Admin();
				obj.setVisible(true);
				dispose();

			}
		});
		btnGoBack.setBounds(9, 254, 89, 23);
		contentPane.add(btnGoBack);
		
		JButton btnIssue = new JButton("ISSUE");
		btnIssue.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				String FACULTY_NAME=textField.getText();
				String ENROLL_NO=textField_1.getText();
				String BOOK_ID=textField_2.getText();
				String SUBJECT=textField_3.getText();
				String AUTHOR=textField_4.getText();
				String PUBLICATION=textField_5.getText();
				String DEPARTMENT=(String)comboBox.getSelectedItem();
				int flag=0;
					
				if(FACULTY_NAME.length()==0||ENROLL_NO.length()==0||BOOK_ID.length()==0||SUBJECT.length()==0||AUTHOR.length()==0||PUBLICATION.length()==0||DEPARTMENT.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);
				}
				
						else {
						Connection con=DBInfo1.con;
						String Query="delete from addnewbook where bookname=? and author=?";
					
						try {
							PreparedStatement ps = con.prepareStatement(Query);
							ps.setString(1,SUBJECT);
							ps.setString(2,AUTHOR);
							flag=ps.executeUpdate();
						   }
						catch (SQLException e2)
						{
							e2.printStackTrace();
						}	
						
						if(flag==1)
						{
							     Connection con1=DBInfo1.con;
								String query="insert into issuebook values(?,?,?,?,?,?,?,?,?,?)";
								try 
								{
									PreparedStatement ps=con1.prepareStatement(query);
									ps.setString(1,FACULTY_NAME);
									ps.setString(2,ENROLL_NO);
									ps.setString(3,DEPARTMENT);
									ps.setString(4,"NN");
									ps.setString(5,"NN");
									ps.setString(6,BOOK_ID);
									ps.setString(7,SUBJECT);
									ps.setString(8,AUTHOR);
									ps.setString(9,PUBLICATION);
									ps.setString(10,"faculty");
									ps.executeUpdate();
									JOptionPane.showMessageDialog(getParent(),"Entry submitted to account");
								} 
								catch (SQLException e1) 
								{
									e1.printStackTrace();
								}
		
						}
						else
						{
							JOptionPane.showMessageDialog(getParent(),"book is not available in library","Error",JOptionPane.ERROR_MESSAGE);
						}
						
			  }
			}
		});
		btnIssue.setBounds(117, 255, 68, 23);
		contentPane.add(btnIssue);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

				String FACULTY_NAME=textField.getText();
				String ENROLL_NO=textField_1.getText();
				String BOOK_ID=textField_2.getText();
				String SUBJECT=textField_3.getText();
				String AUTHOR=textField_4.getText();
				String PUBLICATION=textField_5.getText();
				String DEPARTMENT=(String)comboBox.getSelectedItem();
				int flag=0;
					
				if(FACULTY_NAME.length()==0||ENROLL_NO.length()==0||BOOK_ID.length()==0||SUBJECT.length()==0||AUTHOR.length()==0||PUBLICATION.length()==0||DEPARTMENT.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);
				}
				
				else
				{
							Connection con=DBInfo1.con;
							String Query="delete from issuebook where username=? and bookid=?";
						
							try {
								PreparedStatement ps = con.prepareStatement(Query);
								ps.setString(1,FACULTY_NAME);
								ps.setString(2,BOOK_ID);
								flag=ps.executeUpdate();
								if(flag==0)
								{
									String Query1="delete from issuebook where bookname=? and author=?";
									
									try {
											PreparedStatement ps1 = con.prepareStatement(Query1);
											ps1.setString(1,SUBJECT);
											ps1.setString(2,AUTHOR);
											flag=ps1.executeUpdate();
									    }
									catch (SQLException e2)
										{
											e2.printStackTrace();
										}
								 }
							   }
							catch (SQLException e2)
							{
								e2.printStackTrace();
							}	
							
							
							if(flag==1)
							{
								     Connection con1=DBInfo1.con;
									String query="insert into submitbook values(?,?,?,?,?,?,?,?,?,?)";
									try 
									{
										PreparedStatement ps=con1.prepareStatement(query);
										ps.setString(1,FACULTY_NAME);
										ps.setString(2,ENROLL_NO);
										ps.setString(3,DEPARTMENT);
										ps.setString(4,"NN");
										ps.setString(5,"NN");
										ps.setString(6,BOOK_ID);
										ps.setString(7,SUBJECT);
										ps.setString(8,AUTHOR);
										ps.setString(9,PUBLICATION);
										ps.setString(10,"faculty");
										ps.executeUpdate();
										JOptionPane.showMessageDialog(getParent(),"Entry submitted to account");
									} 
									catch (SQLException e1) 
									{
										e1.printStackTrace();
									}
						  }
							else
							{
								JOptionPane.showMessageDialog(getParent(),"book is not available in library","Error",JOptionPane.ERROR_MESSAGE);
							}
			
				}
				
			}
		});
		btnSubmit.setBounds(198, 255, 92, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				comboBox.setSelectedIndex(0);
		
			}
		});
		btnReset.setBounds(314, 254, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("mybk.jpg"));
		lblNewLabel.setBounds(314, 145, 89, 99);
		contentPane.add(lblNewLabel);
	}

}
