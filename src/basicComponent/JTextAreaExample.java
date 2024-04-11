package basicComponent;

import javax.swing.*;
import java.awt.*;

public class JTextAreaExample extends JFrame {
    private JTextArea textArea;
    private JButton button;

    public JTextAreaExample() {
        setTitle("JTextArea Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTextArea with initial text and line wrap enabled
        textArea = new JTextArea("Type here...\n", 5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Create JButton
        button = new JButton("Get Text");

        // Add ActionListener to the JButton
        button.addActionListener(e -> {
            String text = textArea.getText(); // Get text from JTextArea
            JOptionPane.showMessageDialog(this, "Text entered:\n" + text); // Display in JOptionPane
        });

        // Create a JScrollPane to enable scrolling for the JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Set layout to BorderLayout
        setLayout(new BorderLayout());

        // Add components to the content pane
        add(scrollPane, BorderLayout.CENTER); // Add JScrollPane containing JTextArea
        add(button, BorderLayout.SOUTH); // Add JButton at the bottom

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTextAreaExample::new);
    }
}
