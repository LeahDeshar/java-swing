package Excercise;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Button Click Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new button
        JButton button = new JButton("Click Me!");

        // Implement the ActionListener interface
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button was clicked!");
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}