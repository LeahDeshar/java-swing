package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class AlertExample {
    public AlertExample() {
        // Create a frame
        Frame frame = new Frame("Alert Dialog Example");

        // Create a button to trigger the alert
        Button alertButton = new Button("Show Alert");
        alertButton.setBounds(50, 100, 80, 30);

        // Add button to the frame
        frame.add(alertButton);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Create a method to show an alert dialog
        alertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a dialog
                Dialog alertDialog = new Dialog(frame, "Alert", true);
                alertDialog.setSize(200, 150);
                alertDialog.setLayout(new FlowLayout());

                // Create a label for the message
                Label messageLabel = new Label("This is an alert message!");
                alertDialog.add(messageLabel);

                // Create an OK button to close the dialog
                Button okButton = new Button("OK");
                alertDialog.add(okButton);

                // Add action listener to the OK button
                okButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        alertDialog.setVisible(false); // Hide the dialog
                    }
                });

                // Display the alert dialog
                alertDialog.setVisible(true);
            }
        });

        // Add window listener to close the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AlertExample();
    }
}
