import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class SampleGui4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new MyDrawPanel());
		frame.getContentPane().add(BorderLayout.SOUTH,new JButton("Click me"));
		frame.setSize(300,300);
		frame.setVisible(true);
	}
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