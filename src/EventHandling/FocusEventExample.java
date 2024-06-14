package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocusEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Event Example");
        frame.setSize(300, 200);

        // Create a JTextField to demonstrate focus events
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200, 30));

        // Add a FocusListener to handle focus events
        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                System.out.println("Focus gained on text field");
            }

            public void focusLost(FocusEvent e) {
                System.out.println("Focus lost from text field");
            }
        });

        // Add the text field to the JFrame
        frame.add(textField, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
