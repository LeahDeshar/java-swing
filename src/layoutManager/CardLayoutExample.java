package layoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample {

    private JFrame frame;
    private JPanel cards;
    private CardLayout cardLayout;

    public CardLayoutExample() {
        // Create the JFrame
        frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the JPanel with CardLayout
        cards = new JPanel();
        cardLayout = new CardLayout();
        cards.setLayout(cardLayout);

        // Create multiple panels to be added to the card layout
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));

        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("Panel 3"));

        // Add panels to the card layout
        cards.add(panel1, "Panel 1");
        cards.add(panel2, "Panel 2");
        cards.add(panel3, "Panel 3");

        // Create buttons for navigation
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cards);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cards);
            }
        });

        // Create a JPanel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Add the card layout and button panel to the frame
        frame.add(cards, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the CardLayoutExample class
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CardLayoutExample();
            }
        });
    }
}
