package Excercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFormTwo {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create the panel to hold the components
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userText = new JTextField(20);
        JPasswordField passText = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        // Set GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding around components

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(userLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.NONE; // Do not resize
        panel.add(userText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panel.add(passLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE; // Do not resize
        panel.add(passText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(cancelButton, gbc);

        // Action listeners for buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login action here
                String username = userText.getText();
                String password = new String(passText.getPassword());
                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + password);
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle cancel action here
                userText.setText("");
                passText.setText("");
            }
        });

        // Display the frame
        frame.setVisible(true);
//        ExampleOne();
    }

    private static void ExampleOne() {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create the panel to hold the components
        JPanel panel = new JPanel();

        frame.add(panel);

        // Set GridLayout with 3 rows and 2 columns
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userText = new JTextField(20);
        JPasswordField passText = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        // Add components to the panel
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passLabel);
        panel.add(passText);
        panel.add(loginButton);
        panel.add(cancelButton);

        // Action listeners for buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login action here
                String username = userText.getText();
                String password = new String(passText.getPassword());
                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + password);
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle cancel action here
                userText.setText("");
                passText.setText("");
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
