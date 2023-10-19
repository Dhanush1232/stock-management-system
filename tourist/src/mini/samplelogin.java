package mini;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class samplelogin {

	private JFrame frame;
	private static JTextField textField;
	private static JPasswordField passwordField;
	final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	final static String DB_URL="jdbc:mysql://localhost/data";
	final static String USER="root";
	final static String PASS="Cse@123";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					samplelogin window = new samplelogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public samplelogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(56, 40, 205, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		final JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(102, 134, 216, 44);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String u=textField.getText();
			    final char[] str=passwordField.getPassword();
                final String p=new String(str);	
                lblNewLabel.setText("hi "+u);
                ResultSet rs;
				try {
					Connection conn=null;
					Statement stmt=null;
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn=DriverManager.getConnection(DB_URL,USER,PASS);
					stmt=conn.createStatement();
					PreparedStatement ps=conn.prepareStatement("select * from tb where name=? and password=?");
					ps.setString(1,u);
					ps.setString(2,p);
					rs=ps.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"login successfully!........");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Incorrect username or password");
					}
					stmt.close();
					conn.close();
							    
				}
				catch(SQLException e1) {
					e1.printStackTrace();
					
				}
				catch(ClassNotFoundException e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(115, 188, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(56, 82, 205, 19);
		frame.getContentPane().add(passwordField);
		
		
	}
}
