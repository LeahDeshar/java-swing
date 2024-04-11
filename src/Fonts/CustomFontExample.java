package Fonts;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomFontExample extends JFrame {
    public CustomFontExample() {
        setTitle("Custom Font Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load custom font from file
        Font customFont = loadCustomFont("MyCustomFont.ttf");
        if (customFont != null) {
            // Create JLabel with custom font
            JLabel label = new JLabel("Hello, Custom Font!");
            label.setFont(customFont);

            // Add label to the content pane
            add(label);
        } else {
            System.err.println("Failed to load custom font.");
        }

        pack(); // Pack components to fit preferred size
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    // Method to load custom font from file
    private Font loadCustomFont(String fontFileName) {
        try {
            // Load font file
            File fontFile = new File(fontFileName);
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
            return font.deriveFont(Font.PLAIN, 24); // Derive font with desired size and style
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CustomFontExample::new);
    }
}
