import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		super("Student Page...");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(this);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("View Profile");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAccount = new JMenuItem("Account");
		mntmAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				StudentProfile obj=new StudentProfile();
				obj.setVisible(true);
				dispose();
				
			}
		});
		mnNewMenu.add(mntmAccount);
		mnNewMenu.addSeparator();
		
		JMenuItem mntmOther_1 = new JMenuItem("other");
		mnNewMenu.add(mntmOther_1);
		
		JMenu mnEditProfile = new JMenu("Edit profile");
		menuBar.add(mnEditProfile);
		
		JMenuItem mntmChangePassword_1 = new JMenuItem("change password");
		mntmChangePassword_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				ChangePassword obj=new ChangePassword();
				obj.setVisible(true);
				dispose();
			}
		});
		mnEditProfile.add(mntmChangePassword_1);
		mnEditProfile.addSeparator();
		
		JMenuItem mntmEditProfile = new JMenuItem("Request Edit Info");
		mntmEditProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   
				RequestEditProfile obj=new RequestEditProfile();
				obj.setVisible(true);
				dispose();
			}
		});
		mnEditProfile.add(mntmEditProfile);
		mnEditProfile.addSeparator();
		
		JMenuItem mntmOther_2 = new JMenuItem("other");
		mnEditProfile.add(mntmOther_2);
		
		JMenu mnViewBooks = new JMenu("View Books");
		menuBar.add(mnViewBooks);
		
		JMenuItem mntmViewbooks = new JMenuItem("ViewBooks");
		mntmViewbooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SearchBook obj=new SearchBook();
				obj.setVisible(true);
				dispose();
		
			}
		});
		mnViewBooks.add(mntmViewbooks);
		 mnViewBooks.addSeparator();
		
		JMenuItem mntmOther_3 = new JMenuItem("other");
		mnViewBooks.add(mntmOther_3);
		
		JMenu mnIssueBook = new JMenu("Book Info");
		menuBar.add(mnIssueBook);
		
		JMenuItem mntmRequestBook = new JMenuItem("Request Book");
		mntmRequestBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				RequestBook obj=new RequestBook();
				obj.setVisible(true);
				dispose();
			}
		});
		mnIssueBook.add(mntmRequestBook);
		mnIssueBook.addSeparator();
		
		JMenuItem mntmIssueBook = new JMenuItem("Issue Book");
		mntmIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ViewIssuedBook obj=new ViewIssuedBook();
				obj.setVisible(true);
				dispose();
			}
		});
		mnIssueBook.add(mntmIssueBook);
		mnIssueBook.addSeparator();
		
		JMenuItem mntmSubmitBook = new JMenuItem("Submit Book");
		mntmSubmitBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				ViewSubmittedBookStudet obj=new ViewSubmittedBookStudet();
				obj.setVisible(true);
				dispose();


			}
		});
		mnIssueBook.add(mntmSubmitBook);
		mnIssueBook.addSeparator();
		
		JMenuItem mntmOther_4 = new JMenuItem("Other");
		mnIssueBook.add(mntmOther_4);
		
		JMenu mnViewNotice = new JMenu("View Notice");
		menuBar.add(mnViewNotice);
		
		JMenuItem mntmLateFineNotice = new JMenuItem("Late Fine Notice");
		mnViewNotice.add(mntmLateFineNotice);
		mnViewNotice.addSeparator();
		
		JMenuItem mntmIssueBookNotice = new JMenuItem("Issue Book Notice ");
		mnViewNotice.add(mntmIssueBookNotice);
		mnViewNotice.addSeparator();
		
		JMenuItem mntmSubmitBookNotice = new JMenuItem("Submit Book Notice");
		mnViewNotice.add(mntmSubmitBookNotice);
		mnViewNotice.addSeparator();
		
		JMenuItem mntmOther = new JMenuItem("other");
		mnViewNotice.add(mntmOther);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		
		JMenuItem mntmLogout = new JMenuItem("logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				Login obj=new Login();
				obj.setVisible(true);
				dispose();				}
		});
		mnLogout.add(mntmLogout);
		mnLogout.addSeparator();
		
		JMenuItem mntmHelp = new JMenuItem("help ?");
		mnLogout.add(mntmHelp);
		mnLogout.addSeparator();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblN = new JLabel(new ImageIcon("cmp.jpg"));
		lblN.setBounds(10, 0, 88, 118);
		contentPane.add(lblN);
		
		JLabel lblOnlineFeePayment = new JLabel("Online Fee Payment ");
		lblOnlineFeePayment.setBounds(158, 127, 156, 14);
		contentPane.add(lblOnlineFeePayment);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(158, 11, 71, 14);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(239, 8, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(158, 45, 71, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(239, 42, 156, 20);
		contentPane.add(passwordField);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		btnSave.setBounds(158, 83, 71, 23);
		contentPane.add(btnSave);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(239, 83, 71, 23);
		contentPane.add(btnReset);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnLogin.setBounds(320, 83, 75, 23);
		contentPane.add(btnLogin);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
