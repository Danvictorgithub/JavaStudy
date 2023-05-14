import javax.swing.*;
import java.awt.*;
public class SampleGui3a {
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
		Image cat = new ImageIcon("cat.png").getImage();
		g.drawImage(cat,10,-50,this);
	}
}