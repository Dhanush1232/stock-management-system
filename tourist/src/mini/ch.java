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

public class ch {

private JFrame frame;

/**
* Launch the application.
*/
public static void che() {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
ch window = new ch();
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
public ch() {
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

JLabel lblNewLabel_6 = new JLabel("TOP TOURIST PLACES IN CHENNAI\r\n\r\n");
lblNewLabel_6.setFont(new Font("Algerian", Font.BOLD, 24));
lblNewLabel_6.setForeground(new Color(255, 0, 0));
lblNewLabel_6.setBounds(468, 10, 460, 24);
frame.getContentPane().add(lblNewLabel_6);

JLabel lblNewLabel_5_2 = new JLabel("Marina Beach\r\n");
lblNewLabel_5_2.setToolTipText("");
lblNewLabel_5_2.setForeground(new Color(128, 0, 128));
lblNewLabel_5_2.setFont(new Font("Algerian", Font.BOLD, 23));
lblNewLabel_5_2.setBounds(1038, 471, 280, 24);
frame.getContentPane().add(lblNewLabel_5_2);

JLabel lblNewLabel_5_1 = new JLabel("Government Museum, Chennai");
lblNewLabel_5_1.setForeground(new Color(128, 0, 128));
lblNewLabel_5_1.setFont(new Font("Algerian", Font.BOLD, 23));
lblNewLabel_5_1.setBounds(598, 249, 398, 24);
frame.getContentPane().add(lblNewLabel_5_1);

JLabel lblNewLabel_5 = new JLabel("Arignar Anna Zoological Park");
lblNewLabel_5.setForeground(new Color(128, 0, 128));
lblNewLabel_5.setFont(new Font("Algerian", Font.BOLD, 23));
lblNewLabel_5.setBounds(810, 67, 398, 24);
frame.getContentPane().add(lblNewLabel_5);

JLabel lblNewLabel_4_2 = new JLabel("TIMING: 4:00 TO 6:00 PM.\r\n\r\n");
lblNewLabel_4_2.setForeground(new Color(128, 0, 0));
lblNewLabel_4_2.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
lblNewLabel_4_2.setBounds(285, 471, 346, 24);
frame.getContentPane().add(lblNewLabel_4_2);

JLabel lblNewLabel_4_1 = new JLabel("TIMING: 12:00 TO 2:00 PM.\r\n");
lblNewLabel_4_1.setForeground(new Color(128, 0, 0));
lblNewLabel_4_1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
lblNewLabel_4_1.setBounds(23, 247, 346, 24);
frame.getContentPane().add(lblNewLabel_4_1);

JTextPane txtpnSurroundedByVerdant_1 = new JTextPane();
txtpnSurroundedByVerdant_1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
txtpnSurroundedByVerdant_1.setText("Marina Beach is a natural urban beach along the Bay of Bengal. The beach is stretched out to a distance of 13 kilometres making it the longest natural urban beach in the country, second largest in the world and also the most crowded beach in India with almost 30,000 visitors a day.  Watching the sun crawl upwards into the sky or even disappear into the ocean from the beach.\r\n");
txtpnSurroundedByVerdant_1.setBounds(285, 497, 973, 121);
frame.getContentPane().add(txtpnSurroundedByVerdant_1);
txtpnSurroundedByVerdant_1.setEditable(false);

JTextPane txtpnTheMonkeyFalls = new JTextPane();
txtpnTheMonkeyFalls.setText("Government Museum was established in 1851 and is the second oldest museum in the country after the Indian Museum in Kolkata. Situated in Egmore suburb of Chennai, it is built in the Indo-Sarcenic style and houses a rich collection of the works of Raja Ravi Varma. Situated in Egmore suburb of Chennai, it is built in the Indo-Sarcenic style and houses a rich collection of the works of Raja Ravi Varma.");
txtpnTheMonkeyFalls.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
txtpnTheMonkeyFalls.setBounds(23, 273, 973, 121);
frame.getContentPane().add(txtpnTheMonkeyFalls);
txtpnTheMonkeyFalls.setEditable(false);

JLabel lblNewLabel_4 = new JLabel("TIMING: 9:00 TO 10:30 AM.\r\n");
lblNewLabel_4.setForeground(new Color(128, 0, 0));
lblNewLabel_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 21));
lblNewLabel_4.setBounds(285, 65, 346, 24);
frame.getContentPane().add(lblNewLabel_4);

JLabel lblNewLabel = new JLabel("New label");
lblNewLabel.setToolTipText("Marina Beach");
lblNewLabel.setIcon(new ImageIcon("D:\\images\\ch111.png"));
lblNewLabel.setBounds(23, 471, 224, 147);
frame.getContentPane().add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("New label");
lblNewLabel_1.setToolTipText("Arignar Anna Zoological Park");
lblNewLabel_1.setIcon(new ImageIcon("D:\\images\\ch222.png"));
lblNewLabel_1.setBounds(23, 64, 224, 147);
frame.getContentPane().add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("New label");
lblNewLabel_2.setToolTipText("Government Museum, Chennai");
lblNewLabel_2.setIcon(new ImageIcon("D:\\images\\ch666.png"));
lblNewLabel_2.setBounds(1023, 247, 224, 147);
frame.getContentPane().add(lblNewLabel_2);

JTextPane txtpnSurroundedByVerdant = new JTextPane();
txtpnSurroundedByVerdant.setText("Arignar Anna Zoological Park aka Vandalur Zoo, is a zoological garden located in Vandalur is spread over an area of 602 hectares, including a rescue and rehabilitation centre. The zoo shelters about 3000 species of flora and fauna across twelve hundred acres including 46 endangered species, in its 160 enclosures.\r\n");
txtpnSurroundedByVerdant.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
txtpnSurroundedByVerdant.setBounds(285, 95, 962, 116);
frame.getContentPane().add(txtpnSurroundedByVerdant);
txtpnSurroundedByVerdant.setEditable(false);

JLabel lblNewLabel_3 = new JLabel("New label");
lblNewLabel_3.setIcon(new ImageIcon("D:\\images\\background1.jpg"));
lblNewLabel_3.setBounds(-25, -16, 1312, 673);
frame.getContentPane().add(lblNewLabel_3);
}
}