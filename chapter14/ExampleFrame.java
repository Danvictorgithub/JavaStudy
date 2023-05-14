import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExampleFrame extends JFrame implements ActionListener {
    private JPanel cardPanel;
    private CardLayout cardLayout;
    
    public ExampleFrame() {
        // Set up the frame
        setTitle("Example Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the card panel and card layout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);
        add(cardPanel);
        
        // Create the first card
        JPanel firstCard = new JPanel();
        JLabel firstLabel = new JLabel("This is the first card.");
        firstCard.add(firstLabel);
        JButton firstButton = new JButton("Switch to Second Card");
        firstButton.addActionListener(this);
        firstCard.add(firstButton);
        cardPanel.add(firstCard, "first");
        
        // Create the second card
        JPanel secondCard = new JPanel();
        JLabel secondLabel = new JLabel("This is the second card.");
        secondCard.add(secondLabel);
        JButton secondButton = new JButton("Switch to First Card");
        secondButton.addActionListener(this);
        secondCard.add(secondButton);
        cardPanel.add(secondCard, "second");
        
        // Show the first card
        cardLayout.show(cardPanel, "first");
        setVisible(true);
    }
    
    // Handle button click events
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Switch to Second Card")) {
            // Switch to the second card
            cardLayout.show(cardPanel, "second");
        } else if (e.getActionCommand().equals("Switch to First Card")) {
            // Switch to the first card
            cardLayout.show(cardPanel, "first");
        }
    }
    
    public static void main(String[] args) {
        ExampleFrame exampleFrame = new ExampleFrame();
    }
}