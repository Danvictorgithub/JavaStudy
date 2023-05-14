import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
public class SampleGui5a {
	private JFrame frame;
	private JLabel label;
	public static void main(String[] args) {
		SampleGui5a gui = new SampleGui5a();
		gui.go();
	}
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("I am Label");
		JButton b1 = new JButton("Change Label");
		b1.addActionListener(event -> label.setText("Ouch!"));
		JButton b2 = new JButton("Change Color");
		b2.addActionListener(event -> frame.repaint());
		frame.getContentPane().add(BorderLayout.WEST,label);
		frame.getContentPane().add(BorderLayout.EAST,b1);
		frame.getContentPane().add(BorderLayout.SOUTH,b2);
		frame.getContentPane().add(BorderLayout.CENTER,new MyDrawPanel());
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	// class buttonListener implements ActionListener {
	// 	public void actionPerformed(ActionEvent e) {
	// 		label.setText("I am clicked!");
	// 	}
	// }
	// class otherButtonListener implements ActionListener {
	// 	public void actionPerformed(ActionEvent e) {
	// 		frame.repaint();
	// 	}
	// }
}
class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		Random random = new Random();
		int red = random.nextInt(256);
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		Color color = new Color(red,green,blue);
		g.setColor(color);
		g.fillOval(70,70,100,100);
	}
}