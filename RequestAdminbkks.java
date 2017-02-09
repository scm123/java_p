import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class RequestAdminbkks extends JFrame {
	private JTable table;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RequestAdminbkks frame = new RequestAdminbkks();
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
	public RequestAdminbkks() {
		super("see requests......");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//contentPane.setLayout(null);
		setBounds(100, 100, 768, 348);
		setLocationRelativeTo(this);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JLabel lblCilckHereFor = new JLabel("cilck here for see requests---->");
		contentPane.add(lblCilckHereFor);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int i=0;
				String request_data[][]=new String[100][100];
				String fields[]={"Book Name","Subject","Author","publication","quatity"};
				Connection con=DBInfo1.con;
				String query="select *from request value";
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
							i++;
						}
					}
			catch (SQLException e1)
					{
					e1.printStackTrace();
					}
				
				table = new JTable(request_data,fields);
				table.setBounds(10, 33, 618, 88);
				JScrollPane p=new JScrollPane(table);
				getContentPane().add(p);
		
				
			}
		});
		contentPane.add(btnClick);
	
	}

}
