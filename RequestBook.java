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

public class RequestBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequestBook frame = new RequestBook();
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
	public RequestBook() {
		super("requesting...");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRequestForBook = new JLabel("Request for Book");
		lblRequestForBook.setBounds(152, 11, 129, 14);
		contentPane.add(lblRequestForBook);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(10, 46, 87, 14);
		contentPane.add(lblBookName);
		
		textField = new JTextField();
		textField.setBounds(131, 43, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(10, 92, 87, 14);
		contentPane.add(lblSubject);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 89, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(10, 137, 75, 14);
		contentPane.add(lblAuthor);
		
		textField_2 = new JTextField();
		textField_2.setBounds(131, 134, 160, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPublication = new JLabel("Publication");
		lblPublication.setBounds(10, 181, 87, 14);
		contentPane.add(lblPublication);
		
		textField_3 = new JTextField();
		textField_3.setBounds(131, 178, 160, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSend = new JButton("SUBMIT");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{

				String nme=textField.getText();
				String sub=textField_1.getText();
				String authr=textField_2.getText();
				String publi=textField_3.getText();
				String qntity=textField_4.getText();
				if(nme.length()==0||sub.length()==0||authr.length()==0||publi.length()==0||qntity.length()==0)
				{
					JOptionPane.showConfirmDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);	
				}
				else 
				{
					Connection con=DBInfo1.con;
					String query ="insert into request values(?,?,?,?,?)";
					int flag=0;
					try 
					{
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1,nme);
						ps.setString(2,sub);
						ps.setString(3,authr);
						ps.setString(4,publi);
						ps.setString(5,qntity);
					flag=ps.executeUpdate();
					
					} 
					catch (SQLException e1) 
					{
						e1.printStackTrace();
					}
					
					if(flag==0)
					{
						JOptionPane.showConfirmDialog(getParent(),"Request failed","Error",JOptionPane.ERROR_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(getParent(),"Request submitted");	
					}
					
					
							
				}
				
			
			}
		});
		btnSend.setBounds(120, 253, 89, 23);
		contentPane.add(btnSend);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);

			}
		});
		btnReset.setBounds(218, 253, 89, 23);
		contentPane.add(btnReset);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("mybkk.jpg"));
		lblNewLabel.setBounds(301, 11, 129, 189);
		contentPane.add(lblNewLabel);
		
		JButton btnLogout = new JButton("back");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Student obj=new Student();
				obj.setVisible(true);
				dispose();
			}
		});
		btnLogout.setBounds(8, 7, 89, 23);
		contentPane.add(btnLogout);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(10, 223, 75, 14);
		contentPane.add(lblQuantity);
		
		textField_4 = new JTextField();
		textField_4.setBounds(131, 220, 160, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
