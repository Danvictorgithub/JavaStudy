import javax.swing.*;
import java.awt.*;
public class SampleGui3b {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MyDrawPanel());
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(0,0,this.getWidth()-10,this.getHeight()-10);
	}
}