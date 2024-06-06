package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class TextFieldTextAreaExample extends Frame implements ActionListener {
    TextField textField;
    TextArea textArea;
    Button button;

    public TextFieldTextAreaExample() {
        // Set frame layout
        setLayout(new FlowLayout());

        // Create TextField
        textField = new TextField(20); // 20 columns wide
        add(textField);

        // Create TextArea
        textArea = new TextArea(5, 20); // 5 rows, 20 columns
        add(textArea);

        // Create Button
        button = new Button("Copy Text");
        add(button);

        // Add ActionListener to the button
        button.addActionListener(this);

        // Set Frame properties
        setTitle("TextField and TextArea Example");
        setSize(300, 200);
        setVisible(true);

        // Add WindowListener for close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // On button click, copy text from TextField to TextArea
        String text = textField.getText();
        textArea.setText(text);
    }

    public static void main(String[] args) {
        new TextFieldTextAreaExample();
    }
}
