import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class SampleGui3e {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyDrawPanel());
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		Random random = new Random();
		int red = random.nextInt(256);
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		Color endColor = new Color(red,green,blue);
		g2d.setPaint(endColor);
		g2d.drawOval(70,70,100,100);
	}
}