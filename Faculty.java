import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Faculty extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty frame = new Faculty();
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
	public Faculty() {
		super("Faculty Profile...");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setLocationRelativeTo(this);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		getContentPane().add(menuBar);
		
		JMenu mnViewProfile = new JMenu("View Profile");
		menuBar.add(mnViewProfile);
		
		JMenuItem mntmViewProfile = new JMenuItem("View Profile");
		mntmViewProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ViewProfileFaculty obj=new ViewProfileFaculty();
				obj.setVisible(true);
				dispose();

			}
		});
		mnViewProfile.add(mntmViewProfile);
		mnViewProfile.addSeparator();
		
		JMenuItem mntmChangePassword = new JMenuItem("Change Password ");
		mntmChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ChangePasswordFaculty obj=new ChangePasswordFaculty();
				obj.setVisible(true);
				dispose();

			}
		});
		mnViewProfile.add(mntmChangePassword);
		mnViewProfile.addSeparator();
		
		JMenuItem mntmOther = new JMenuItem("other");
		mnViewProfile.add(mntmOther);
		
		JMenu mnEditProfile = new JMenu("Edit Profile");
		menuBar.add(mnEditProfile);
		
		JMenuItem mntmEditProfile = new JMenuItem("Request Edit Profile");
		mntmEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{	
				RequestEditProfileFaculty obj=new RequestEditProfileFaculty();
				obj.setVisible(true);
				dispose();

			}
		});
		mnEditProfile.add(mntmEditProfile);
		mnEditProfile.addSeparator();
		
		JMenuItem mntmChangePassword_1 = new JMenuItem("Change Password");
		mntmChangePassword_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ChangePasswordFaculty obj=new ChangePasswordFaculty();
				obj.setVisible(true);
				dispose();

			}
		});
		mnEditProfile.add(mntmChangePassword_1);
		mnEditProfile.addSeparator();
		
		JMenuItem mntmOther_1 = new JMenuItem("other");
		mnEditProfile.add(mntmOther_1);
		
		JMenu mnNewMenu = new JMenu("View Books");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmViewBooks = new JMenuItem("View Books");
		mntmViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchBookFaculty obj=new SearchBookFaculty();
				obj.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmViewBooks);
		mnNewMenu.addSeparator();
		
		JMenuItem mntmOther_2 = new JMenuItem("other");
		mnNewMenu.add(mntmOther_2);
		
		JMenu mnBookInfo = new JMenu("Book Info");
		menuBar.add(mnBookInfo);
		
		JMenuItem mntmRequestBook = new JMenuItem("Request Book");
		mntmRequestBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				RequestBookFaculty obj=new RequestBookFaculty();
				obj.setVisible(true);
				dispose();
			}
		});
		mnBookInfo.add(mntmRequestBook);
		mnBookInfo.addSeparator();
		JMenuItem mntmIssueBook = new JMenuItem("Issue Book");
		mntmIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ViewIssuedBookFaculty obj=new ViewIssuedBookFaculty();
				obj.setVisible(true);
				dispose();

			}
		});
		mnBookInfo.add(mntmIssueBook);
		mnBookInfo.addSeparator();
		
		JMenuItem mntmSubmitBook = new JMenuItem("Submit Book");
		mntmSubmitBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ViewSubmittedBookFaculty obj=new ViewSubmittedBookFaculty();
				obj.setVisible(true);
				dispose();

	
			}
		});
		mnBookInfo.add(mntmSubmitBook);
		mnBookInfo.addSeparator();
		
		JMenuItem mntmOther_3 = new JMenuItem("other");
		mnBookInfo.add(mntmOther_3);
		
		JMenu mnNotice = new JMenu("Notice");
		menuBar.add(mnNotice);
		
		JMenuItem mntmAddNotice = new JMenuItem("Add Notice ");
		mnNotice.add(mntmAddNotice);
		mnNotice.addSeparator();
		
		JMenuItem mntmViewNotice = new JMenuItem("View Notice");
		mnNotice.add(mntmViewNotice);
		mnNotice.addSeparator();
		
		JMenuItem mntmOther_4 = new JMenuItem("other");
		mnNotice.add(mntmOther_4);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		
		JMenuItem mntmLogout = new JMenuItem("logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

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
		
		JMenuItem mntmOther_5 = new JMenuItem("other");
		mnLogout.add(mntmOther_5);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("cmp.jpg"));
		lblNewLabel.setBounds(10, 32, 107, 123);
		getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(151, 44, 71, 14);
		getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(238, 41, 141, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(151, 82, 71, 14);
		getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(238, 79, 141, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(151, 132, 71, 23);
		getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setBounds(226, 132, 77, 23);
		getContentPane().add(btnReset);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(308, 132, 71, 23);
		getContentPane().add(btnLogin);
		
		JLabel lblOnlineFeePayment = new JLabel("Online Fee Payment");
		lblOnlineFeePayment.setBounds(151, 175, 152, 14);
		getContentPane().add(lblOnlineFeePayment);
	}
}
