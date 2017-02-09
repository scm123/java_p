import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class IssueBookStudent extends JFrame {

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
					IssueBookStudent frame = new IssueBookStudent();
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
	public IssueBookStudent() {
		super("issue and submit Student..");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 336);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setBounds(15, 16, 103, 14);
		contentPane.add(lblStudentName);
		
		textField = new JTextField();
		textField.setBounds(128, 17, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnrollNo = new JLabel("Enroll No");
		lblEnrollNo.setBounds(15, 51, 103, 14);
		contentPane.add(lblEnrollNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 48, 181, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(15, 82, 103, 14);
		contentPane.add(lblBranch);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(128, 79, 181, 20);
		comboBox.addItem("Select");
		comboBox.addItem("Mechanical Enginnering");
		comboBox.addItem("Civil Enginnering");
		comboBox.addItem("Chemical Enginnering");
		comboBox.addItem("Electrical Enginnering");
		comboBox.addItem("Electronics and Communication Enginnering");
		comboBox.addItem("Computer Science Enginnering");
		comboBox.addItem("Information Technology");
		comboBox.addItem("Metalargical Enginnering");
		comboBox.addItem("Mining Enginnering");
		
		contentPane.add(comboBox);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setBounds(15, 113, 103, 14);
		contentPane.add(lblSemester);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(128, 110, 67, 20);
		comboBox_1.addItem("Select");
		comboBox_1.addItem("1");
		comboBox_1.addItem("2");
		comboBox_1.addItem("3");
		comboBox_1.addItem("4");
		comboBox_1.addItem("5");
		comboBox_1.addItem("6");
		comboBox_1.addItem("7");
		comboBox_1.addItem("8");
		contentPane.add(comboBox_1);
		
		JLabel lblBookId = new JLabel("Book  Id");
		lblBookId.setBounds(15, 144, 103, 14);
		contentPane.add(lblBookId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 141, 181, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(15, 175, 103, 14);
		contentPane.add(lblSubject);
		
		textField_3 = new JTextField();
		textField_3.setBounds(128, 172, 181, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(15, 206, 103, 14);
		contentPane.add(lblAuthor);
		
		textField_4 = new JTextField();
		textField_4.setBounds(128, 203, 181, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPublication = new JLabel("Publication");
		lblPublication.setBounds(15, 232, 103, 14);
		contentPane.add(lblPublication);
		
		textField_5 = new JTextField();
		textField_5.setBounds(128, 229, 181, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(199, 113, 32, 14);
		contentPane.add(lblYear);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(230, 110, 79, 20);
		comboBox_2.addItem("Select");
		comboBox_2.addItem("1");
		comboBox_2.addItem("2");
		comboBox_2.addItem("3");
		comboBox_2.addItem("4");
		contentPane.add(comboBox_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(128, 263, 82, 23);
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
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
			}
		});
		contentPane.add(btnReset);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.setBounds(15, 263, 103, 23);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Admin obj=new Admin();
				obj.setVisible(true);
				dispose();
				

			}
		});
		contentPane.add(btnGoBack);
		
		JButton btnIssue = new JButton("ISSUE");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String STUDENT_NAME=textField.getText();
				String ENROLL_NO=textField_1.getText();
				String BOOK_ID=textField_2.getText();
				String SUBJECT=textField_3.getText();
				String AUTHOR=textField_4.getText();
				String PUBLICATION=textField_5.getText();
				String BRANCH=(String)comboBox.getSelectedItem();
				String SEMESTER=(String)comboBox_1.getSelectedItem();
				String YEAR=(String)comboBox_2.getSelectedItem();
				if(STUDENT_NAME.length()==0||ENROLL_NO.length()==0||BOOK_ID.length()==0||SUBJECT.length()==0||AUTHOR.length()==0||PUBLICATION.length()==0||BRANCH.length()==0||SEMESTER.length()==0||YEAR.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					int flag=0;
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
							ps.setString(1,STUDENT_NAME);
							ps.setString(2,ENROLL_NO);
							ps.setString(3,BRANCH);
							ps.setString(4,SEMESTER);
							ps.setString(5,YEAR);
							ps.setString(6,BOOK_ID);
							ps.setString(7,SUBJECT);
							ps.setString(8,AUTHOR);
							ps.setString(9,PUBLICATION);
							ps.setString(10,"student");
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
		btnIssue.setBounds(230, 263, 79, 23);
		contentPane.add(btnIssue);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String STUDENT_NAME=textField.getText();
				String ENROLL_NO=textField_1.getText();
				String BOOK_ID=textField_2.getText();
				String SUBJECT=textField_3.getText();
				String AUTHOR=textField_4.getText();
				String PUBLICATION=textField_5.getText();
				String BRANCH=(String)comboBox.getSelectedItem();
				String SEMESTER=(String)comboBox_1.getSelectedItem();
				String YEAR=(String)comboBox_2.getSelectedItem();
				if(STUDENT_NAME.length()==0||ENROLL_NO.length()==0||BOOK_ID.length()==0||SUBJECT.length()==0||AUTHOR.length()==0||PUBLICATION.length()==0||BRANCH.length()==0||SEMESTER.length()==0||YEAR.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					int flag=0;
				Connection con=DBInfo1.con;
				String Query="delete from issuebook where bookname=? and author=?";
			
				try {
						PreparedStatement ps = con.prepareStatement(Query);
						ps.setString(1,SUBJECT);
						ps.setString(2,AUTHOR);
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
							ps.setString(1,STUDENT_NAME);
							ps.setString(2,ENROLL_NO);
							ps.setString(3,BRANCH);
							ps.setString(4,SEMESTER);
							ps.setString(5,YEAR);
							ps.setString(6,BOOK_ID);
							ps.setString(7,SUBJECT);
							ps.setString(8,AUTHOR);
							ps.setString(9,PUBLICATION);
							ps.setString(10,"student");
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
		btnSubmit.setBounds(329, 263, 89, 23);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("mybk.jpg"));
		lblNewLabel.setBounds(329, 172, 89, 77);
		contentPane.add(lblNewLabel);
	}

}
