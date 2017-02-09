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
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class SearchBook extends JFrame {

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
					SearchBook frame = new SearchBook();
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
	public SearchBook() {
		super("searching.....");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 348);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeachBooks = new JLabel("Seach Books");
		lblSeachBooks.setBounds(178, 11, 93, 14);
		contentPane.add(lblSeachBooks);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(27, 38, 86, 14);
		contentPane.add(lblBookName);
		
		textField = new JTextField();
		textField.setBounds(140, 36, 160, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setBounds(27, 74, 86, 14);
		contentPane.add(lblBookId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 71, 160, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setBounds(27, 111, 86, 14);
		contentPane.add(lblSubject);
		
		textField_2 = new JTextField();
		textField_2.setBounds(140, 108, 160, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setBounds(27, 149, 86, 14);
		contentPane.add(lblAuthor);
		
		textField_3 = new JTextField();
		textField_3.setBounds(140, 146, 160, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPublication = new JLabel("Publication");
		lblPublication.setBounds(27, 186, 86, 14);
		contentPane.add(lblPublication);
		
		textField_4 = new JTextField();
		textField_4.setBounds(140, 183, 160, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Student obj=new Student();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnGoBack.setBounds(10, 7, 89, 23);
		contentPane.add(btnGoBack);
		
		JLabel lblAmout = new JLabel("Quantity");
		lblAmout.setBounds(27, 225, 72, 14);
		contentPane.add(lblAmout);
		
		textField_5 = new JTextField();
		textField_5.setBounds(140, 222, 160, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		String bkname=textField.getText();
		String id=textField_1.getText();
		String sub=textField_2.getText();
		String authr=textField_3.getText();
		String publi=textField_4.getText();
		String qntity=textField_5.getText();
		
		
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

			}
		});
		btnReset.setBounds(126, 261, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String bkname=textField.getText();
			String id=textField_1.getText();
			String sub=textField_2.getText();
			String authr=textField_3.getText();
			String publi=textField_4.getText();
			String qntity=textField_5.getText();
			if(id.length()==0 && bkname.length()==0)
			{
				JOptionPane.showConfirmDialog(getParent(),"plz fill required fields","Error",JOptionPane.ERROR_MESSAGE);	
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
						sub=res.getString(4);
						authr=res.getString(5);
						publi=res.getString(6);
						qntity=res.getString(8);
					
					}
					
					textField.setText(bkname);
					textField_1.setText(id);
					textField_2.setText(sub);
					textField_3.setText(authr);
					textField_4.setText(publi);
					textField_5.setText(qntity);
				}	
				//con.close();
					//ps.close();
				//	DBInfo1.con.close();
				catch(Exception e2)
				{}
				}

			}
		});
		btnSearch.setBounds(239, 261, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("searr.jpg"));
		lblNewLabel.setBounds(323, 11, 101, 116);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("nm.jpg"));
		lblNewLabel_1.setBounds(333, 119, 86, 109);
		contentPane.add(lblNewLabel_1);
	}
}
