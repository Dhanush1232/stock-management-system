package mini;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;

public class tp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void ttf(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tp window = new tp();
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
	public tp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1283, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnc = new JButton("CHENNAI");
		btnc.setFont(new Font("Algerian", Font.BOLD, 17));
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ch c=new ch();
				c.che();
			}
		});
		
		JTextPane txtpnDhanushS = new JTextPane();
		txtpnDhanushS.setForeground(new Color(255, 0, 0));
		txtpnDhanushS.setText("DHANUSH S");
		txtpnDhanushS.setFont(new Font("Times New Roman", Font.BOLD, 19));
		txtpnDhanushS.setBounds(1011, 565, 220, 29);
		frame.getContentPane().add(txtpnDhanushS);
		
		JTextPane txtpnDharunPrasanthS = new JTextPane();
		txtpnDharunPrasanthS.setForeground(new Color(255, 0, 0));
		txtpnDharunPrasanthS.setText("DHARUN PRASANTH S");
		txtpnDharunPrasanthS.setFont(new Font("Times New Roman", Font.BOLD, 19));
		txtpnDharunPrasanthS.setBounds(1011, 527, 220, 28);
		frame.getContentPane().add(txtpnDharunPrasanthS);
		
		JTextPane txtpnBy = new JTextPane();
		txtpnBy.setForeground(new Color(0, 204, 204));
		txtpnBy.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnBy.setText("BY:");
		txtpnBy.setBounds(1011, 487, 41, 30);
		frame.getContentPane().add(txtpnBy);
		
		JTextPane txtpnTouristPlaceGenerator = new JTextPane();
		txtpnTouristPlaceGenerator.setEditable(false);
		txtpnTouristPlaceGenerator.setForeground(new Color(0, 204, 153));
		txtpnTouristPlaceGenerator.setFont(new Font("Algerian", Font.BOLD, 26));
		txtpnTouristPlaceGenerator.setText("    TOURIST PLACE GENERATOR ");
		txtpnTouristPlaceGenerator.setBounds(35, 39, 414, 48);
		frame.getContentPane().add(txtpnTouristPlaceGenerator);
		btnc.setBounds(105, 138, 160, 48);
		frame.getContentPane().add(btnc);
		
		JButton btnco = new JButton("COIMBATORE");
		btnco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comba co=new comba();
				co.comb();
			}
		});
		btnco.setFont(new Font("Algerian", Font.BOLD, 17));
		btnco.setBounds(105, 231, 160, 48);
		frame.getContentPane().add(btnco);
		
		JButton btnt = new JButton("TANJORE");
		btnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thanja th=new thanja();
				th.than();
			}
		});
		btnt.setFont(new Font("Algerian", Font.BOLD, 17));
		btnt.setBounds(105, 323, 160, 48);
		frame.getContentPane().add(btnt);
		
		JButton btnk = new JButton("KANYAKUMARI");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 kanya ka=new kanya();
			 ka.kan();
			}
		});
		btnk.setFont(new Font("Algerian", Font.BOLD, 17));
		btnk.setBounds(105, 426, 160, 48);
		frame.getContentPane().add(btnk);
		
		JButton btnm = new JButton("MADURAI");
		btnm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				madu ma=new madu();
				ma.mad();
			}
		});
		btnm.setFont(new Font("Algerian", Font.BOLD, 17));
		btnm.setBounds(105, 515, 160, 48);
		frame.getContentPane().add(btnm);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("D:\\images\\dk.png"));
		lblNewLabel.setBounds(0, 0, 1269, 640);
		frame.getContentPane().add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(735, 575, 7, 19);
		frame.getContentPane().add(textPane);
	}
}
