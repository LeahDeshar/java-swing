import javax.swing.*;
import java.awt.*;

public class FontExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Font Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        frame.add(panel);

        // Create a JLabel with text
        JLabel label = new JLabel("Hello, World!");

        // Create a Font object with desired font family, style, and size
        Font font = new Font("Times New Roman", Font.ITALIC, 30);

        // Set the font of the label
        label.setFont(font);

        // Add the label to the panel
        panel.add(label);

        frame.setVisible(true);
    }
}
