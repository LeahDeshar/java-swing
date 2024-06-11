package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class FileDialogExample {
    public FileDialogExample() {
        // Create a frame
        Frame frame = new Frame("File Dialog Example");

        // Create buttons to open and save files
        Button openButton = new Button("Open File");
        Button saveButton = new Button("Save File");

        // Set frame layout
        frame.setLayout(new FlowLayout());

        // Add buttons to the frame
        frame.add(openButton);
        frame.add(saveButton);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Create a label to display the selected file
        Label selectedFileLabel = new Label("No file selected");
        frame.add(selectedFileLabel);

        // Add action listener to the open button
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a FileDialog for opening a file
                FileDialog fileDialog = new FileDialog(frame, "Open File", FileDialog.LOAD);
                fileDialog.setVisible(true);

                // Get the selected file
                String directory = fileDialog.getDirectory();
                String file = fileDialog.getFile();

                if (directory != null && file != null) {
                    selectedFileLabel.setText("Selected file: " + directory + file);
                } else {
                    selectedFileLabel.setText("No file selected");
                }
            }
        });

        // Add action listener to the save button
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a FileDialog for saving a file
                FileDialog fileDialog = new FileDialog(frame, "Save File", FileDialog.SAVE);
                fileDialog.setVisible(true);

                // Get the selected file
                String directory = fileDialog.getDirectory();
                String file = fileDialog.getFile();

                if (directory != null && file != null) {
                    selectedFileLabel.setText("File to save: " + directory + file);
                } else {
                    selectedFileLabel.setText("No file selected");
                }
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
        new FileDialogExample();
    }
}
