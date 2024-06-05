package basicComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenNewFrameExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new FlowLayout());

        // Create a button to open the new frame
        JButton openButton = new JButton("Open New Frame");

        // Add an action listener to the button
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create the new frame
                JFrame newFrame = new JFrame("New Frame");
                newFrame.setSize(300, 150);
                newFrame.setLayout(new FlowLayout());

                // Add a label to the new frame
                JLabel label = new JLabel("This is the new frame");
                newFrame.add(label);

                // Display the new frame
                newFrame.setVisible(true);
            }
        });

        // Add the button to the main frame
        mainFrame.add(openButton);

        // Display the main frame
        mainFrame.setVisible(true);
    }
}
