package Excercise;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the panel to hold the components
        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        // Use GroupLayout manager
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Auto gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Create components
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userText = new JTextField(20);
        JPasswordField passText = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        // Set horizontal group
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(userLabel)
                        .addComponent(passLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(userText)
                        .addComponent(passText)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(loginButton)
                                .addComponent(cancelButton)))
        );

        // Set vertical group
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(userLabel)
                        .addComponent(userText))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passLabel)
                        .addComponent(passText))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(loginButton)
                        .addComponent(cancelButton))
        );

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
