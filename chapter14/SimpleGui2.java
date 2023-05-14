import javax.swing.*;
import java.awt.event.*;

public class SimpleGui2 implements ActionListener{
	private JButton button;
	public static void main(String[] args) {
		SimpleGui2 gui = new SimpleGui2();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("Click Me!");
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		button.setText("I am clicked");
	}
}