import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.PasswordView;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private JPasswordField passwordField;
	private JButton signUPbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	static String strrr;
	static String passs;
	/**
	 * Create the frame.
	 */
	public Login() {
		super("Login Page....");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 488, 328);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHome = new JLabel(new ImageIcon("login.jpg"));
		lblHome.setBounds(63, 11, 121, 99);
		contentPane.add(lblHome);
		
		JLabel lblEnterUsername = new JLabel("Enter User  Id");
		lblEnterUsername.setBounds(83, 121, 108, 14);
		contentPane.add(lblEnterUsername);
		
		textField = new JTextField();
		textField.setBounds(207, 118, 188, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setBounds(83, 152, 108, 14);
		contentPane.add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(207, 149, 188, 20);
		contentPane.add(passwordField);
		
		signUPbtn = new JButton("Sign Up");
		signUPbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
					Registration obj=new Registration();
					
					obj.setVisible(true);
					dispose();
	
		
			}
		});
		signUPbtn.setBounds(83, 180, 114, 23);
		contentPane.add(signUPbtn);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(207, 180, 89, 23);
		contentPane.add(btnReset);
		
	
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener()   {
			public void actionPerformed(ActionEvent e)
			{
				int flag=0;
				String uname=textField.getText();
				strrr=textField.getText();
				char ch[]=passwordField.getPassword();
				passs=String.copyValueOf(ch);
				
				String pass=String.copyValueOf(ch);
				String utype="";
				Connection con=DBInfo1.con;
				
				String query="select *from login where username=? and password=?";
				
				
				try 
				{
		
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,uname);
					ps.setString(2,pass);
					ResultSet res=ps.executeQuery();
						flag=0;
					while(res.next())
					{
						utype=res.getString(3);
						flag=1;
					}
					//ps.close();

				//	con.close();
				//	DBInfo1.con.close();
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
			//	System.out.println(flag);
			//	System.out.println(utype);
				if(uname.length()==0||pass.length()==0)
				{
					JOptionPane.showMessageDialog(getParent(),"plz enter the username and password","Error",JOptionPane.ERROR_MESSAGE);
				}
			
				else if(flag==0)
				{
				
					JOptionPane.showMessageDialog(getParent(),"your username or password incorrect!","Error",JOptionPane.ERROR_MESSAGE);
				}
			    if(flag==1 && utype.equals("admin"))
			    	{
			    	
			    	Admin obj=new Admin();
			    	obj.setVisible(true);
			    	dispose();
			    	}
			    
			    else  if(flag==1 && utype.equals("faculty"))
			    	{
			    
			    	Faculty obj=new Faculty();
			    	obj.setVisible(true);
			    	dispose();
			    	}
			    
			    else if(flag==1 && utype.equals("student"))
			    	{
			 
			    	Student obj=new Student();
			    	obj.setVisible(true);
			    	dispose();
			    	
			    	}
				
			}				
			
		});

		btnLogin.setBounds(306, 180, 89, 23);
		contentPane.add(btnLogin);
	}
	
}
