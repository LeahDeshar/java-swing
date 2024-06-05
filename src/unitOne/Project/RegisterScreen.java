package unitOne.Project;

import javax.swing.*;
import java.awt.*;

public class RegisterScreen {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Register Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6, 2));

        // Create labels and text fields for the user to enter their information
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField() ;
        JLabel phoneLabel = new JLabel("Phone:");
        JTextField phoneField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();


        // Create a button to submit the information
        JButton submitButton = new JButton("Submit");

        // Add the labels, text fields, and button to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(submitButton);

        // Display the frame
        frame.setVisible(true);


    }
}
