import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;


public class SampleGui6 {
	private int xPos = 70;
	private int yPos = 70;



	public static void main(String[] args) {
		SampleGui6 gui = new SampleGui6();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		MyDrawPanel DrawPanel = new MyDrawPanel();
		frame.getContentPane().add(DrawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);

		for (int i = 0; i < 130 ;i++) {
			xPos++;
			yPos++;
			DrawPanel.repaint();
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	class MyDrawPanel extends JPanel {
		public void paintComponent(Graphics g) {
			g.setColor(Color.WHITE);
			g.fillRect(0,0,this.getWidth(),this.getHeight());
			g.setColor(Color.YELLOW);
			g.fillOval(xPos,yPos,50,50);
		}
	}
}