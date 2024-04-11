package basicComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldExample extends JFrame {
    private JPasswordField passwordField;
    private JButton loginButton;

    public JPasswordFieldExample() {
        setTitle("Password Field Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JPasswordField
        passwordField = new JPasswordField(20);

        // Create JButton for login
        loginButton = new JButton("Login");

        // Add ActionListener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] password = passwordField.getPassword(); // Get password as character array
                String passwordString = new String(password); // Convert character array to string
                if ("secret".equals(passwordString)) { // Check if password is correct
                    JOptionPane.showMessageDialog(JPasswordFieldExample.this, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(JPasswordFieldExample.this, "Incorrect password. Try again.");
                }
                // Clear the password field after login attempt
                passwordField.setText("");
            }
        });

        // Set layout to BorderLayout
        setLayout(new BorderLayout());

        // Add components to the content pane
        add(passwordField, BorderLayout.CENTER); // Add password field to center
        add(loginButton, BorderLayout.SOUTH); // Add login button to bottom

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JPasswordFieldExample::new);
    }
}
