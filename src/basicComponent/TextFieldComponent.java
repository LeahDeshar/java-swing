package basicComponent;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldComponent extends JFrame {
    private JTextField textField;
    private JLabel label;

    public TextFieldComponent() {
        setTitle("JTextField Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextField with initial text and 20 columns
        textField = new JTextField("Type here", 20);
        textField.setEditable(true); // Allow editing
        textField.setToolTipText("Enter your name"); // Tooltip text

        // Create a JLabel to display entered text
        label = new JLabel("Entered Text: ");

        // Add action listener to JTextField
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredText = textField.getText(); // Get entered text
                label.setText("Entered Text: " + enteredText); // Update JLabel
            }
        });

        // Set layout to BorderLayout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the content pane
        add(textField);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldComponent();
            }
        });
    }
}
