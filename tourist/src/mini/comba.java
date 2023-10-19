package mini;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class comba {

private JFrame frame;

/**
* Launch the application.
*/
public static void comb() {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
comba window = new comba();
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
public comba() {
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

JLabel lblNewLabel_6 = new JLabel("TOP TOURIST PLACES IN COIMBATORE\r\n");
lblNewLabel_6.setFont(new Font("Algerian", Font.BOLD, 24));
lblNewLabel_6.setForeground(new Color(255, 0, 0));
lblNewLabel_6.setBounds(424, 10, 460, 24);
frame.getContentPane().add(lblNewLabel_6);

JLabel lblNewLabel_5_2 = new JLabel("Adiyogi Shiva Statue");
lblNewLabel_5_2.setForeground(new Color(128, 0, 128));
lblNewLabel_5_2.setFont(new Font("Algerian", Font.BOLD, 23));
lblNewLabel_5_2.setBounds(951, 471, 280, 24);
frame.getContentPane().add(lblNewLabel_5_2);

JLabel lblNewLabel_5_1 = new JLabel("Monkey Falls");
lblNewLabel_5_1.setForeground(new Color(128, 0, 128));
lblNewLabel_5_1.setFont(new Font("Algerian", Font.BOLD, 23));
lblNewLabel_5_1.setBounds(784, 249, 193, 24);
frame.getContentPane().add(lblNewLabel_5_1);

JLabel lblNewLabel_5 = new JLabel("Marudhamalai Hill Temple\r\n");
lblNewLabel_5.setForeground(new Color(128, 0, 128));
lblNewLabel_5.setFont(new Font("Algerian", Font.BOLD, 23));
lblNewLabel_5.setBounds(885, 65, 346, 24);
frame.getContentPane().add(lblNewLabel_5);

JLabel lblNewLabel_4_2 = new JLabel("TIMING: 7:00 TO 10:00 PM.\r\n\r\n");
lblNewLabel_4_2.setForeground(new Color(128, 0, 0));
lblNewLabel_4_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
lblNewLabel_4_2.setBounds(285, 471, 346, 24);
frame.getContentPane().add(lblNewLabel_4_2);

JLabel lblNewLabel_4_1 = new JLabel("TIMING: 2:00 TO 4:30 PM.\r\n");
lblNewLabel_4_1.setForeground(new Color(128, 0, 0));
lblNewLabel_4_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
lblNewLabel_4_1.setBounds(23, 247, 346, 24);
frame.getContentPane().add(lblNewLabel_4_1);

JTextPane txtpnSurroundedByVerdant_1 = new JTextPane();
txtpnSurroundedByVerdant_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
txtpnSurroundedByVerdant_1.setText("Surrounded by verdant green farms at the foothills of Velliangiri Mountains in the Western Ghats, Adiyogi Shiva Statue is the world’s biggest bust statue dedicated to the celebrated Hindu deity Shiva, which is carved out of 500 tonnes of steel. Located in the Isha Yoga Complex in Coimbatore, Tamil Nadu, the sculpture stands tall at a height of 112 feet.\r\n");
txtpnSurroundedByVerdant_1.setBounds(285, 497, 973, 121);
frame.getContentPane().add(txtpnSurroundedByVerdant_1);
txtpnSurroundedByVerdant_1.setEditable(false);

JTextPane txtpnTheMonkeyFalls = new JTextPane();
txtpnTheMonkeyFalls.setText("The Monkey falls is an exemplary and archetypal out-of-doors coffee break spot, which is situated some 65 kilometers away from Coimbatore city and it is some 27 kilometer away from Pollachi on Coimbatore-Pollachi-Valparai main road. The water swishes across the rocks joyfully and dives into a pool of water as clear as cellophane.");
txtpnTheMonkeyFalls.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
txtpnTheMonkeyFalls.setBounds(23, 272, 973, 121);

frame.getContentPane().add(txtpnTheMonkeyFalls);
txtpnTheMonkeyFalls.setEditable(false);

JLabel lblNewLabel_4 = new JLabel("TIMING: 7:30 TO 10:00 AM.\r\n");
lblNewLabel_4.setForeground(new Color(128, 0, 0));
lblNewLabel_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
lblNewLabel_4.setBounds(285, 63, 346, 24);
frame.getContentPane().add(lblNewLabel_4);

JLabel lblNewLabel = new JLabel("New label");
lblNewLabel.setToolTipText("Adiyogi Shiva Statue");
lblNewLabel.setIcon(new ImageIcon("D:\\images\\co1.png"));
lblNewLabel.setBounds(23, 471, 224, 147);
frame.getContentPane().add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setToolTipText("Marudhamalai Hill Temple\r\n");
lblNewLabel_1.setIcon(new ImageIcon("D:\\images\\co2.png"));
lblNewLabel_1.setBounds(23, 64, 224, 147);
frame.getContentPane().add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("New label");
lblNewLabel_2.setToolTipText("Monkey Falls");
lblNewLabel_2.setIcon(new ImageIcon("D:\\images\\co33.png"));
lblNewLabel_2.setBounds(1023, 247, 224, 147);
frame.getContentPane().add(lblNewLabel_2);

JTextPane txtpnSurroundedByVerdant = new JTextPane();
txtpnSurroundedByVerdant.setText("The Marudhamalai hill temple is located at a towering height of 500 ft in the highland on the Western Ghats. 15 kms away to north-west of Coimbatore city, the temple has an excellent invigorating atmosphere. Vehicles are allowed to pass through the Marudhamalai temple and the devasthanam has granted three buses from the low slope of the hill to get through the temple on top.\r\n\r\n");
txtpnSurroundedByVerdant.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
txtpnSurroundedByVerdant.setBounds(285, 90, 962, 121);
frame.getContentPane().add(txtpnSurroundedByVerdant);
txtpnSurroundedByVerdant.setEditable(false);

JLabel lblNewLabel_3 = new JLabel("New label");
lblNewLabel_3.setIcon(new ImageIcon("D:\\images\\background1.jpg"));
lblNewLabel_3.setBounds(-25, -16, 1312, 673);
frame.getContentPane().add(lblNewLabel_3);
}
}