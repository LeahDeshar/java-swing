package basicComponent;

import javax.swing.*;
import java.awt.*;

public class JLabelExample extends JFrame {
    public JLabelExample() {
        setTitle("Label Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JLabel with text
        JLabel textLabel = new JLabel("Hello, Swing!");

        // Create JLabel with HTML-formatted text
        JLabel htmlLabel = new JLabel("<html><b>Hello</b>, <i>Swing</i>!</html>");

        // Create JLabel with icon
        ImageIcon icon = new ImageIcon("src/image.jpg");
        JLabel iconLabel = new JLabel(icon);

        // Set foreground color (text color) for textLabel
        textLabel.setForeground(Color.BLUE);

        // Set horizontal alignment for htmlLabel
        htmlLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Set font for iconLabel
        iconLabel.setFont(new Font("Serif", Font.BOLD, 16));

        // Set layout to BorderLayout
        setLayout(new GridLayout(3, 1));

        // Add labels to the content pane
        add(textLabel);
        add(htmlLabel);
        add(iconLabel);

        pack(); // Pack components to fit preferred size
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JLabelExample::new);
    }
}
