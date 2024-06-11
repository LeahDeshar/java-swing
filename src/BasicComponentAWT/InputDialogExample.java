package BasicComponentAWT;
import java.awt.*;
import java.awt.event.*;


public class InputDialogExample {
    public InputDialogExample() {
        // Create a frame
        Frame frame = new Frame("Input Dialog Example");

        // Create a button to open the dialog
        Button showDialogButton = new Button("Show Dialog");

        // Set frame layout
        frame.setLayout(new FlowLayout());

        // Add button to the frame
        frame.add(showDialogButton);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Create a dialog
        Dialog dialog = new Dialog(frame, "Input Dialog", true);
        dialog.setSize(300, 200);
        dialog.setLayout(new FlowLayout());

        // Create components for the dialog
        Label nameLabel = new Label("Enter your name:");
        TextField nameTextField = new TextField(20);
        Button okButton = new Button("OK");

        // Add components to the dialog
        dialog.add(nameLabel);
        dialog.add(nameTextField);
        dialog.add(okButton);

        // Create a label to display the entered name
        Label myName = new Label("");
        frame.add(myName);

        // Add action listener to the OK button
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                myName.setText("Name entered: " + name);
                dialog.setVisible(false); // Hide the dialog
            }
        });

        // Add action listener to the show dialog button
        showDialogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameTextField.setText(""); // Clear the text field
                dialog.setVisible(true); // Show the dialog
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
        new InputDialogExample();
    }
}
