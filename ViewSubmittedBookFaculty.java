import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewSubmittedBookFaculty extends JFrame 
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSubmittedBookFaculty frame = new ViewSubmittedBookFaculty();
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
	public ViewSubmittedBookFaculty() {
		super("View submitted books");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 817, 323);
		setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewIssuedBooks = new JLabel("View  Submitted Books");
		lblViewIssuedBooks.setBounds(333, 0, 175, 14);
		contentPane.add(lblViewIssuedBooks);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setBounds(57, 43, 94, 14);
		contentPane.add(lblBookName);
		
		JLabel lblSubject = new JLabel("Book ID");
		lblSubject.setBounds(216, 43, 74, 14);
		contentPane.add(lblSubject);
		
		JLabel lblSubject_1 = new JLabel("Subject");
		lblSubject_1.setBounds(391, 43, 84, 14);
		contentPane.add(lblSubject_1);
		
		JLabel lblAurhor = new JLabel("Aurhor");
		lblAurhor.setBounds(557, 43, 63, 14);
		contentPane.add(lblAurhor);
		
		JLabel lblPublication = new JLabel("Publication");
		lblPublication.setBounds(697, 43, 94, 14);
		contentPane.add(lblPublication);
		
		textField = new JTextField();
		textField.setBounds(35, 82, 116, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 82, 116, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(346, 82, 129, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("1.");
		label.setBounds(0, 85, 29, 14);
		contentPane.add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(509, 82, 129, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(666, 82, 125, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setBounds(0, 131, 29, 14);
		contentPane.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(35, 128, 116, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(189, 128, 116, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(346, 128, 129, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(509, 128, 129, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(666, 128, 125, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setBounds(0, 171, 22, 14);
		contentPane.add(label_2);
		
		textField_10 = new JTextField();
		textField_10.setBounds(35, 168, 116, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(189, 168, 116, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(346, 168, 129, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(509, 168, 129, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(666, 165, 125, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel label_3 = new JLabel("4.");
		label_3.setBounds(0, 211, 22, 14);
		contentPane.add(label_3);
		
		textField_15 = new JTextField();
		textField_15.setBounds(35, 208, 116, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(189, 208, 116, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(346, 208, 129, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(509, 208, 129, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(666, 208, 125, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel label_4 = new JLabel("5.");
		label_4.setBounds(0, 246, 22, 14);
		contentPane.add(label_4);
		
		textField_20 = new JTextField();
		textField_20.setBounds(35, 243, 116, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(189, 243, 116, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(346, 243, 129, 20);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(509, 243, 129, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setBounds(666, 243, 125, 20);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Faculty obj=new Faculty();
				obj.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(0, 7, 89, 23);
		contentPane.add(btnBack);
	}



}
