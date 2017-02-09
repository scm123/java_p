import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class EditProfileRequest extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditProfileRequest frame = new EditProfileRequest();
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
	public EditProfileRequest() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1088, 433);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int i=0;
				String request_data[][]=new String[100][100];
				String fields[]={"Current username","Desired username","Current enroll no","Desired enroll no","Current contact","Desired contact","Current usertype","Desired usertype","Current DOB(MM/DD/YYYY)","Desired DOB(MM/DD/YYYY)"};
				Connection con=DBInfo1.con;
				String query="select *from requestedit value";
				
				PreparedStatement ps;
				try {
					ps = con.prepareStatement(query);
					ResultSet res=ps.executeQuery();
						while(res.next())
						{	
						request_data[i][0]=res.getString(1);
						request_data[i][1]=	res.getString(2);
						request_data[i][2]=res.getString(3);
						request_data[i][3]=res.getString(4);
						request_data[i][4]=res.getString(5);
						request_data[i][5]=res.getString(6);
						request_data[i][6]=	res.getString(7);
						request_data[i][7]=res.getString(8);
						request_data[i][8]=res.getString(9)+"/"+res.getString(10)+"/"+res.getString(11);
						request_data[i][9]=res.getString(12)+"/"+res.getString(1)+"/"+res.getString(11);
						
							i++;
						}
					}
			catch (SQLException e1)
					{
					e1.printStackTrace();
					}
				
				table = new JTable(request_data,fields);
				table.setSize(500,400);
				table.setBounds(10, 33, 1918, 88);
				JScrollPane p=new JScrollPane(table);
				getContentPane().add(p);
		
		
			}
		});
		contentPane.add(btnClick);
		
		JLabel label = new JLabel("<--click here for see the list");
		contentPane.add(label);
		
		table = new JTable();
		
		contentPane.add(table);
	}
}
