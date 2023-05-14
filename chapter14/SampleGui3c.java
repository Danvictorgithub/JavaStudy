import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class SampleGui3c {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyDrawPanel());
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
class MyDrawPanel extends JPanel implements ActionListener{
	Color newColor;
	public void paintComponent(Graphics g) {
		Random random = new Random();
		int red = random.nextInt(256);
		int green = random.nextInt(256);
		int blue = random.nextInt(256);
		newColor = new Color(red,green,blue);
		g.setColor(newColor);
		g.fillRect(0,0,this.getWidth()-10,this.getHeight()-10);
	}
	public void actionPerformed(ActionEvent e) {
		newColor = Color.yellow;
	}
}