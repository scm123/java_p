import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ChangePassword extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword frame = new ChangePassword();
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
	public ChangePassword() {
		super("edit password....");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChangeYourPassword = new JLabel("Change your Password");
		lblChangeYourPassword.setBounds(135, 11, 141, 14);
		contentPane.add(lblChangeYourPassword);
		
		JLabel lblEnrollId = new JLabel("User  Id");
		lblEnrollId.setBounds(10, 48, 88, 14);
		contentPane.add(lblEnrollId);
		
		textField = new JTextField();
		textField.setBounds(145, 45, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterOldPassword = new JLabel("Enter Old Password");
		lblEnterOldPassword.setBounds(10, 85, 125, 14);
		contentPane.add(lblEnterOldPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 82, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterNewPassword = new JLabel("Enter New Password");
		lblEnterNewPassword.setBounds(10, 121, 134, 14);
		contentPane.add(lblEnterNewPassword);
		
		textField_2 = new JTextField();
		textField_2.setBounds(145, 118, 150, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRetypeNewPassword = new JLabel("Re-type New Password");
		lblRetypeNewPassword.setBounds(10, 160, 134, 14);
		contentPane.add(lblRetypeNewPassword);
		
		textField_3 = new JTextField();
		textField_3.setBounds(145, 157, 150, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Student obj=new Student();
				obj.setVisible(true);
				dispose();
			}
		});
		btnGoBack.setBounds(0, 0, 89, 23);
		contentPane.add(btnGoBack);
		
		JButton btnSaveChange = new JButton("SAVE ");
		btnSaveChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String unme=Login.strrr;
				String psss=Login.passs;
				String uname=textField.getText();
				String pass=textField_1.getText();
				String newpass=textField_2.getText();
				String newrepass=textField_3.getText();
				if(uname.length()==0||pass.length()==0||newpass.length()==0||newrepass.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(!unme.equals(uname))
				{
					JOptionPane.showMessageDialog(getParent(),"username incorrect","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(!psss.equals(pass))
				{
					JOptionPane.showMessageDialog(getParent(),"old password is incorrect","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(!newpass.equals(newrepass))
				{
					JOptionPane.showMessageDialog(getParent(),"new password are not mmatching","Error",JOptionPane.ERROR_MESSAGE);
				}
				int i=0;
				Connection con=DBInfo1.con;
				String query="update login set password=? where username=?";
				try
				{
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,newpass);
					ps.setString(2,uname);
				 i=ps.executeUpdate();
					//System.out.println(i+"row updated");
				}
				catch (SQLException e1) 
				{
					e1.printStackTrace();
				}
				if(i==1)
				{
					JOptionPane.showMessageDialog(getParent()," your password updated");
				}
			}
		});
		btnSaveChange.setBounds(21, 202, 110, 23);
		contentPane.add(btnSaveChange);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);

			}
		});
		btnReset.setBounds(145, 202, 89, 23);
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
		btnLogin.setBounds(258, 202, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("edd.jpg"));
		lblNewLabel.setBounds(305, 41, 119, 115);
		contentPane.add(lblNewLabel);
	}

}
