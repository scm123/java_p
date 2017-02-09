import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		super("Admin Page...");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 585, 466);
		setLocationRelativeTo(this);
		setResizable(false);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnViewProfile = new JMenu("View Profile");
		menuBar.add(mnViewProfile);
		
		JMenuItem mntmViewProfile = new JMenuItem("View Profile");
		mntmViewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ViewProfile obj=new ViewProfile();
				obj.setVisible(true);
				dispose();
			}
		});
		mnViewProfile.add(mntmViewProfile);
		mnViewProfile.addSeparator();
		JMenuItem mntmEditProfile = new JMenuItem("change password");
		mntmEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ChangePasswordAdmin obj=new ChangePasswordAdmin();
				obj.setVisible(true);
				dispose();
			}
		});
		mnViewProfile.add(mntmEditProfile);
		mnViewProfile.addSeparator();
		
		JMenuItem mntmOther = new JMenuItem("other");
		mnViewProfile.add(mntmOther);
		
		JMenu mnRegisterAUser = new JMenu("Search A User");
		menuBar.add(mnRegisterAUser);
		
		JMenuItem mntmUserStudent = new JMenuItem("User Student ");
		mntmUserStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Search	obj=new Search("student");
				obj.setVisible(true);
				dispose();

			}
		});
		mnRegisterAUser.add(mntmUserStudent);
		mnRegisterAUser.addSeparator();
		
		JMenuItem mntmUserFaculty = new JMenuItem("User Faculty");
		mntmUserFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
	
				Search	obj=new Search("faculty");
				obj.setVisible(true);
				dispose();

			}
		});
		mnRegisterAUser.add(mntmUserFaculty);
		mnRegisterAUser.addSeparator();
		
		JMenuItem mntmOther_1 = new JMenuItem("other");
		mnRegisterAUser.add(mntmOther_1);
		
		JMenu mnIssueBook = new JMenu("Issue Book");
		menuBar.add(mnIssueBook);
		
		JMenuItem mntmStudent = new JMenuItem("Student");
		mntmStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				IssueBookStudent ob=new IssueBookStudent();
				ob.setVisible(true);
				dispose();
			}
		});
		mnIssueBook.add(mntmStudent);
		mnIssueBook.addSeparator();
		
		JMenuItem mntmFaculty = new JMenuItem("Faculty");
		mntmFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				IssueBookFaculty ob=new IssueBookFaculty();
				ob.setVisible(true);
				dispose();
			}
		});
		mnIssueBook.add(mntmFaculty);
		mnIssueBook.addSeparator();
		
		JMenuItem mntmOther_2 = new JMenuItem("other");
		mnIssueBook.add(mntmOther_2);
		
		JMenu mnSubmitBook = new JMenu("Submit Book");
		menuBar.add(mnSubmitBook);
		
		JMenuItem mntmStudent1 = new JMenuItem("Student");
		mntmStudent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				IssueBookStudent ob=new IssueBookStudent();
				ob.setVisible(true);
				dispose();

			}
		});
		mnSubmitBook.add(mntmStudent1);
		mnSubmitBook.addSeparator();
		JMenuItem mntmFaculty_1 = new JMenuItem("Faculty");
		mntmFaculty_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				IssueBookFaculty ob=new IssueBookFaculty();
				ob.setVisible(true);
				dispose();


			}
		});
		mnSubmitBook.add(mntmFaculty_1);
		mnSubmitBook.addSeparator();
		JMenuItem mntmOther_3 = new JMenuItem("Other");
		mnSubmitBook.add(mntmOther_3);
		
		JMenu mnAddANotice = new JMenu("Add A Notice");
		menuBar.add(mnAddANotice);
		
		JMenuItem mntmLateFine = new JMenuItem("Late Fine");
		mnAddANotice.add(mntmLateFine);
		mnAddANotice.addSeparator();
		
		JMenuItem mntmIssueBookNotice = new JMenuItem("Issue Book Notice ");
		mnAddANotice.add(mntmIssueBookNotice);
		mnAddANotice.addSeparator();
		
		
		JMenuItem mntmSubmitBookNotice = new JMenuItem("Submit book Notice");
		mnAddANotice.add(mntmSubmitBookNotice);
		mnAddANotice.addSeparator();
		
		JMenuItem mntmOther_4 = new JMenuItem("other");
		mnAddANotice.add(mntmOther_4);
		
		JMenu mnRecieveRequest = new JMenu("Recieve Request");
		menuBar.add(mnRecieveRequest);
		
		JMenuItem mntmSeeRequest = new JMenuItem("See BookRequest");
		mntmSeeRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				RequestAdminbkks obj=new RequestAdminbkks();
				obj.setVisible(true);
				dispose();

			}
		});
		mnRecieveRequest.add(mntmSeeRequest);
		
		JMenuItem mntmSeeEditprofilerequest = new JMenuItem("See EditProfileRequest");
		mntmSeeEditprofilerequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				EditProfileRequest obj=new EditProfileRequest();
				obj.setVisible(true);
				dispose();
			}
		});
		mnRecieveRequest.add(mntmSeeEditprofilerequest);
		
		JMenuItem mntmOther_5 = new JMenuItem("other");
		mnRecieveRequest.add(mntmOther_5);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		
		JMenuItem mntmLogout = new JMenuItem("logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{			

				Login obj=new Login();
				obj.setVisible(true);
				dispose();	
			}
		});
		mnLogout.add(mntmLogout);
		mnLogout.addSeparator();
		JMenuItem mntmHelp = new JMenuItem("help ?");
		mnLogout.add(mntmHelp);
		mnLogout.addSeparator();
		JMenuItem mntmother = new JMenuItem("other");
		mnLogout.add(mntmother);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterBookName = new JLabel("Enter Book Name");
		lblEnterBookName.setBounds(10, 72, 129, 14);
		contentPane.add(lblEnterBookName);
		
		textField = new JTextField();
		textField.setBounds(157, 69, 188, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearchOrAdd = new JLabel("SEARCH OR ADD NEW BOOKS");
		lblSearchOrAdd.setBounds(162, 11, 208, 14);
		contentPane.add(lblSearchOrAdd);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 38, 188, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterSubjectName = new JLabel("Enter Subject Name");
		lblEnterSubjectName.setBounds(10, 132, 129, 14);
		contentPane.add(lblEnterSubjectName);
		
		textField_2 = new JTextField();
		textField_2.setBounds(157, 129, 188, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("search.jpg"));
		lblNewLabel.setBounds(0, 0, 53, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblPublicationName = new JLabel("Publication Name");
		lblPublicationName.setBounds(10, 163, 129, 14);
		contentPane.add(lblPublicationName);
		
		JLabel lblAuthorName = new JLabel("Author Name");
		lblAuthorName.setBounds(10, 194, 129, 14);
		contentPane.add(lblAuthorName);
		
		textField_4 = new JTextField();
		textField_4.setBounds(157, 191, 188, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCatogary = new JLabel("Book Catogary");
		lblCatogary.setBounds(10, 97, 129, 24);
		contentPane.add(lblCatogary);
		
		JLabel lblBookPrice = new JLabel("Book Price");
		lblBookPrice.setBounds(10, 228, 129, 14);
		contentPane.add(lblBookPrice);
		
		textField_6 = new JTextField();
		textField_6.setBounds(157, 225, 188, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(10, 258, 129, 14);
		contentPane.add(lblQuantity);
		
		textField_7 = new JTextField();
		textField_7.setBounds(157, 255, 188, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(36, 298, 92, 71);
		contentPane.add(lblNewLabel_1);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(157, 100, 188, 20);
		comboBox.addItem("Select");
		comboBox.addItem("Language");
		comboBox.addItem("Science");
		comboBox.addItem("Enngineering");
		comboBox.addItem("sport");
		comboBox.addItem("Entertaiment");
		comboBox.addItem("politics");
		comboBox.addItem("E-comerce");
		comboBox.addItem("other");
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(157, 160, 188, 20);
		comboBox_1.addItem("Select");
		comboBox_1.addItem("TMH");
		comboBox_1.addItem("BPB");
		comboBox_1.addItem("CareerMonk");
		comboBox_1.addItem("Arihat");
		comboBox_1.addItem("Kiran");
		comboBox_1.addItem("Indian_politics");
		comboBox_1.addItem("E-india");
		comboBox_1.addItem("other");
		contentPane.add(comboBox_1);
	
		
		
		JButton btnSerch = new JButton("SEARCH");
		btnSerch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String id=textField_1.getText();
				String bkname=textField.getText();
				String bkcatagory=(String) comboBox.getSelectedItem();
				String sub=textField_2.getText();
				String authr=textField_4.getText();
				String publi=(String)comboBox_1.getSelectedItem();
				String pric=textField_6.getText();
				String qntity=textField_7.getText();
				
				if(id.length()==0 && bkname.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);	
				}
				else
				{
					Connection con=DBInfo1.con;	
					String query="select *from addnewbook where bookid=? or bookname=?";
					try
					{
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1,id);
						ps.setString(2,bkname);
						ResultSet res=ps.executeQuery();
						
						while(res.next())
						{
							id=res.getString(1);
							bkname=res.getString(2);
							bkcatagory=res.getString(3);
							sub=res.getString(4);
							authr=res.getString(5);
							publi=res.getString(6);
							pric=res.getString(7);
							qntity=res.getString(8);
						}
						
						textField_1.setText(id);
						textField.setText(bkname);
						comboBox.setSelectedItem(bkcatagory);
						textField_2.setText(sub);
						textField_4.setText(authr);
						comboBox_1.setSelectedItem(publi);
						textField_6.setText(pric);
						textField_7.setText(qntity);
						//con.close();
						//ps.close();
					//	DBInfo1.con.close();
					}
					catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnSerch.setBounds(153, 372, 92, 23);
		contentPane.add(btnSerch);
	
		
		JButton btnAddBook = new JButton("ADD BOOK");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				int flag=0;
				String id=textField_1.getText();
				String bkname=textField.getText();
				String bkcatagory=(String) comboBox.getSelectedItem();
				String sub=textField_2.getText();
				String authr=textField_4.getText();
				String publi=(String)comboBox_1.getSelectedItem();
				String pric=textField_6.getText();
				String qntity=textField_7.getText();
				
	
				if(id.length()==0||bkname.length()==0||bkcatagory.length()==0||sub.length()==0||authr.length()==0||publi.length()==0||pric.length()==0||qntity.length()==0)
				   {
			
			             JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);
			             
				   }
				else if(id.length()!=5)
				{
					  
					    JOptionPane.showMessageDialog(getParent(),"plz id length must be 5","Error",JOptionPane.ERROR_MESSAGE);
				}
			
				 else
				 {
						
						Connection con=DBInfo1.con;
						String Query="insert into addnewbook values(?,?,?,?,?,?,?,?)";
						try 
						{
							PreparedStatement ps=con.prepareStatement(Query);
							
							ps.setString(1,id);
							ps.setString(2,bkname);
							ps.setString(3,bkcatagory);
							ps.setString(4,sub);
							ps.setString(5,authr);
							ps.setString(6,publi);
							ps.setString(7,pric);
							ps.setString(8,qntity);
			
						    flag=ps.executeUpdate();
							System.out.println(id);
							con.close();
							ps.close();
							DBInfo1.con.close();
						} 
						catch (SQLException e1) 
						{
							e1.printStackTrace();
						}
						
						
						
						if(flag==0)
						{
				
							JOptionPane.showMessageDialog(getParent(),"process failed","Error",JOptionPane.ERROR_MESSAGE);
						} 
					   else if(flag!=0)
						{
								JOptionPane.showMessageDialog(getParent(),"process sucessful");
							
					    }
						
				 }
				
			
			}
		});
		btnAddBook.setBounds(256, 372, 101, 23);
		contentPane.add(btnAddBook);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("searr.jpg"));
		lblNewLabel_2.setBounds(153, 286, 82, 71);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(new ImageIcon("ad.jpg"));
		lblNewLabel_3.setBounds(271, 280, 74, 81);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblEnterBookId = new JLabel("Enter Book/Group Id");
		lblEnterBookId.setBounds(10, 41, 129, 14);
		contentPane.add(lblEnterBookId);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);	
				textField_4.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				comboBox_1.setSelectedIndex(0);
				comboBox.setSelectedIndex(0);
			
				
			}
		});
		btnReset.setBounds(39, 372, 89, 23);
		contentPane.add(btnReset);
		
		
		
	}
}
