package basicComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame {

    public static void main(String[] args) {
        // Method to create the main frame
        createMainFrame();
    }

    public static void createMainFrame() {
        // Create the main frame
        JFrame mainFrame = new JFrame("Main Frame");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);

        // Create a panel for the main frame
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        // Create a button that will act as the clickable link
        JButton openNewFrameButton = new JButton("Open New Frame");

        // Add an ActionListener to the button
        openNewFrameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create the new frame
                JFrame newFrame = new JFrame("New Frame");
                newFrame.setSize(400, 300);
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setLocationRelativeTo(null);

                // Add a label to the new frame
                JLabel newFrameLabel = new JLabel("This is the new frame!");
                newFrameLabel.setHorizontalAlignment(SwingConstants.CENTER);
                newFrame.add(newFrameLabel);

                // Add a window listener to the new frame to reopen the main frame when it is closed
                newFrame.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        createMainFrame();
                    }
                });

                // Show the new frame
                newFrame.setVisible(true);

                // Close the main frame
                mainFrame.dispose();
            }
        });

        // Add the button to the main panel
        mainPanel.add(openNewFrameButton);

        // Add the main panel to the main frame
        mainFrame.add(mainPanel);

        // Show the main frame
        mainFrame.setVisible(true);
    }
}

