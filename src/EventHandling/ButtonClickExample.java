package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample extends JFrame {
    public ButtonClickExample() {
        setTitle("Button Click Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Create an ActionListener to handle button clicks
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button click event
                JOptionPane.showMessageDialog(ButtonClickExample.this, "Button clicked!");
            }
        };

        // Register the ActionListener with the JButton
        button.addActionListener(listener);

        // Add the JButton to the content pane
        getContentPane().add(button, BorderLayout.CENTER);

        pack(); // Pack components to fit preferred size
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonClickExample::new);
    }
}
