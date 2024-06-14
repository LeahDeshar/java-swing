package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import java.awt.*;
//import java.awt.event.*;

public class TextEventExample extends Frame implements TextListener {

    TextField textField;

    public TextEventExample() {
        super("TextEvent Example");

        // Create a TextField
        textField = new TextField(20);
        textField.addTextListener(this); // Register TextListener

        // Add the TextField to the Frame
        setLayout(new FlowLayout());
        add(textField);

        // Set frame properties
        setSize(300, 100);
        setVisible(true);

        // Handle closing of the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new TextEventExample();
    }

    // Implement TextListener method
    public void textValueChanged(TextEvent e) {
        String text = textField.getText();
        System.out.println("Text changed: " + text);
    }
}
