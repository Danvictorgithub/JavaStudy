import javax.swing.*;

public class SampleGui2a {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me!");
		JRadioButton radiobutton = new JRadioButton("Click me");
		// frame.getContentPane().add(button);
		frame.getContentPane().add(radiobutton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}