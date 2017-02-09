import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static String usertype;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search(usertype);
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
	public Search(String s) {
		super("searching...");
		usertype=s;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 489, 264);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(170, 31, 159, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 75, 159, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
        ButtonGroup rg=new ButtonGroup();
		
		JRadioButton rdbtnUsername = new JRadioButton("Username");
		rdbtnUsername.setBounds(55, 30, 109, 23);
		contentPane.add(rdbtnUsername);
		
		JRadioButton rdbtnEnrollNo = new JRadioButton("Enroll No");
		rdbtnEnrollNo.setBounds(55, 74, 109, 23);
		contentPane.add(rdbtnEnrollNo);
		
		rg.add(rdbtnUsername);
		rg.add(rdbtnEnrollNo);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(194, 194, 216, 20);
		contentPane.add(comboBox);
		
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{   
				textField.setText(null);
				textField_1.setText(null);
				comboBox.addItem(null);
			}
		});
		btnReset.setBounds(56, 142, 82, 23);
		contentPane.add(btnReset);
		
        
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			

				String USERNAME=textField.getText();
				String ENROLL_NO=textField_1.getText();
				if(rdbtnUsername.isSelected()==false && rdbtnEnrollNo.isSelected()==false)
				{
					JOptionPane.showMessageDialog(getParent(),"plz select one","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if((rdbtnUsername.isSelected()==true && USERNAME.length()==0)||(rdbtnEnrollNo.isSelected()==true && ENROLL_NO.length()==0))
				{
					JOptionPane.showMessageDialog(getParent(),"plz fill the right field","Error",JOptionPane.ERROR_MESSAGE);
				}
				else if(rdbtnUsername.isSelected()==true)
				{
				
							Connection con=DBInfo1.con;
							String query="select *from registration where username=? and usertype=?" ;
							try 
							{
								PreparedStatement ps=con.prepareStatement(query);
								ps.setString(1,USERNAME);
								ps.setString(2,usertype);
								ResultSet res=ps.executeQuery();
								while(res.next())
								{
									System.out.println(res.getString(1)+":::"+res.getString(2)+":::"+res.getString(3));
								       comboBox.addItem("Username :"+res.getString(1));
								       comboBox.addItem("Enroll no :"+res.getString(2));
								       comboBox.addItem("Contact :"+res.getString(3));
								       comboBox.addItem("UserType :"+res.getString(4));
								       comboBox.addItem("DOB :"+res.getString(7)+"/"+res.getString(6)+"/"+res.getString(8));
								      
				
								}
							}
							catch (SQLException e1)
							{
								e1.printStackTrace();
							}
				}
				
				else if(rdbtnEnrollNo.isSelected()==true)
				{
							Connection con=DBInfo1.con;
							String query="select *from registration where enroll=? and usertype=?" ;
							try 
							{
								PreparedStatement ps=con.prepareStatement(query);
								ps.setString(1,ENROLL_NO);
								ps.setString(2,usertype);
								ResultSet res=ps.executeQuery();
								while(res.next())
								{
									System.out.println(res.getString(1)+":::"+res.getString(2)+":::"+res.getString(3));
		
								       comboBox.addItem("Username :"+res.getString(1));
								       comboBox.addItem("Enroll no :"+res.getString(2));
								       comboBox.addItem("Contact :"+res.getString(3));
								       comboBox.addItem("UserType :"+res.getString(4));
								       comboBox.addItem("DOB :"+res.getString(7)+"/"+res.getString(6)+"/"+res.getString(8));
								  }
					     }
							catch (SQLException e1)
							{
								e1.printStackTrace();
							}			
				}
				
				else
				{
			
				}

				
			}
		});
		btnSearch.setBounds(156, 142, 88, 23);
		contentPane.add(btnSearch);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Admin obj=new Admin();
				obj.setVisible(true);
				dispose();
				

			}
		});
		btnGoBack.setBounds(262, 142, 82, 23);
		contentPane.add(btnGoBack);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("user.jpg"));
		lblNewLabel.setBounds(339, 31, 95, 112);
		contentPane.add(lblNewLabel);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setBounds(56, 59, 46, 14);
		contentPane.add(lblOr);
		
		
		JLabel lblSeeHereAfter = new JLabel("see here after click search-->");
		lblSeeHereAfter.setBounds(10, 197, 182, 14);
		contentPane.add(lblSeeHereAfter);
		
		
	}
}
