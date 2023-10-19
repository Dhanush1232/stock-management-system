package mini;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class thanja {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void than() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thanja window = new thanja();
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
	public thanja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1283, 677);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Algerian", Font.BOLD, 26));
		lblNewLabel_5.setBounds(212, 22, 838, 37);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("TIMING: 5:30 TO 7:30 A.M.");
		lblNewLabel_4.setForeground(new Color(139, 0, 0));
		lblNewLabel_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(283, 69, 294, 28);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setToolTipText("BRAGHADESSHWARA TEMPLE");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\images\\TJ1.png"));
		lblNewLabel_1.setBounds(26, 69, 228, 147);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setToolTipText("GANGAIKONDA CHOLAPURAM");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\images\\TJ2.png"));
		lblNewLabel_2.setBounds(1014, 259, 228, 141);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setToolTipText("SEASHORE PILLAR");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\images\\tj3.png"));
		lblNewLabel_3.setBounds(26, 463, 228, 155);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextPane txtpnThisMonumentStands = new JTextPane();
		txtpnThisMonumentStands.setText("'Lord of Rajaraja') and known locally as Thanjai Periya Kovil (\"Thanjavur Big Temple\") and Peruvudaiyar Kovil, is a Shaivite Hindu temple built in a Chola architectural style located on the south bank of the Cauvery river in Thanjavur, Tamil Nadu, India. Called the Big Temple, it lies is in the Thanjavur district of Tamilnadu. Built on the banks of the river Cauvery.");
		txtpnThisMonumentStands.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
		txtpnThisMonumentStands.setBounds(283, 95, 941, 121);
		frame.getContentPane().add(txtpnThisMonumentStands);
		txtpnThisMonumentStands.setEditable(false);
					
					JTextPane txtpnPadmanabhapuramPalaceIs = new JTextPane();
					txtpnPadmanabhapuramPalaceIs.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
					txtpnPadmanabhapuramPalaceIs.setText("Gaṅgaikoṇḍa Chōḻapuram is a village located near to Jayankondam, Ariyalur district, Tamil Nadu, India. It became the capital of the Chola dynasty in c. Ariyalur is best known for the Gangaikondacholisvarar temple in Gangaikondacholapuram, the biggest temple constructed during the reign of Rajendra–I in Ariyalur region.");
					txtpnPadmanabhapuramPalaceIs.setBounds(26, 279, 955, 121);
					frame.getContentPane().add(txtpnPadmanabhapuramPalaceIs);
					txtpnPadmanabhapuramPalaceIs.setEditable(false);
						
						JLabel lblNewLabel_6 = new JLabel("TIMING: 9:30 TO 1:30 P.M.");
						lblNewLabel_6.setForeground(new Color(128, 0, 0));
						lblNewLabel_6.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
						lblNewLabel_6.setBounds(27, 248, 365, 28);
						frame.getContentPane().add(lblNewLabel_6);
						
						JLabel lblNewLabel_7 = new JLabel("                         BRAGHADEESHWARA TEMPLE");
						lblNewLabel_7.setForeground(new Color(139, 0, 139));
						lblNewLabel_7.setFont(new Font("Algerian", Font.BOLD, 23));
						lblNewLabel_7.setBounds(686, 69, 538, 22);
						frame.getContentPane().add(lblNewLabel_7);
							
							JLabel lblNewLabel_8 = new JLabel("             GANGAIKONDA CHOLAPURAM");
							lblNewLabel_8.setForeground(new Color(128, 0, 128));
							lblNewLabel_8.setFont(new Font("Algerian", Font.BOLD, 23));
							lblNewLabel_8.setBounds(555, 256, 426, 16);
							frame.getContentPane().add(lblNewLabel_8);
								
								JTextPane txtpnPadmanabhapuramPalaceIn = new JTextPane();
								txtpnPadmanabhapuramPalaceIn.setEditable(false);
								txtpnPadmanabhapuramPalaceIn.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
								txtpnPadmanabhapuramPalaceIn.setText("Thanjavur has a lot of cultural value and is known for its famous Tanjore paintings, antiques and handicrafts, textiles and saris , its Carnatic music and musical instruments and of course the temples. his is a place where you can constantly witness the magnificent and dynamic cultures of the past and present breathing life into and living in the everyday, giving the area a unique and glorious.");
								txtpnPadmanabhapuramPalaceIn.setBounds(283, 491, 963, 127);
								frame.getContentPane().add(txtpnPadmanabhapuramPalaceIn);
								txtpnPadmanabhapuramPalaceIs.setEditable(false);
									
									JLabel lblNewLabel_9 = new JLabel("TIMING: 3:00 TO 6:00 P.M.");
									lblNewLabel_9.setForeground(new Color(128, 0, 0));
									lblNewLabel_9.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
									lblNewLabel_9.setBounds(286, 463, 326, 28);
									frame.getContentPane().add(lblNewLabel_9);
										
										JLabel lblNewLabel_10 = new JLabel("                                    TOP TOURIST PLACES IN TANJORE");
										lblNewLabel_10.setForeground(new Color(255, 0, 0));
										lblNewLabel_10.setFont(new Font("Algerian", Font.BOLD, 24));
										lblNewLabel_10.setBounds(283, 10, 830, 37);
										frame.getContentPane().add(lblNewLabel_10);
											
											JLabel lblNewLabel_11 = new JLabel("      TANJORE UNIQUE PILLAR NEAR SEASHORE");
											lblNewLabel_11.setForeground(new Color(128, 0, 128));
											lblNewLabel_11.setFont(new Font("Algerian", Font.BOLD, 23));
											lblNewLabel_11.setBounds(719, 463, 523, 22);
											frame.getContentPane().add(lblNewLabel_11);
											
												JLabel lblNewLabel = new JLabel("");
												lblNewLabel.setForeground(new Color(148, 0, 211));
												lblNewLabel.setToolTipText("thiruvalluvar statue near seashore");
												lblNewLabel.setIcon(new ImageIcon("D:\\images\\background1.jpg"));
												lblNewLabel.setBounds(0, 0, 1269, 640);
												frame.getContentPane().add(lblNewLabel);
		
		
		
	}
}
