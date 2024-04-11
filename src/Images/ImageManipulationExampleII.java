package Images;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageManipulationExampleII extends JFrame {
    public ImageManipulationExampleII() {
        setTitle("Image Manipulation Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load image from file
        ImageIcon originalIcon = new ImageIcon("src/image.jpg");
        Image originalImage = originalIcon.getImage();

        // Create grayscale version of the image
        Image grayscaleImage = createGrayscaleImage(originalImage);

        // Create JLabels for original and grayscale images
        JLabel originalLabel = new JLabel(originalIcon);
        JLabel grayscaleLabel = new JLabel(new ImageIcon(grayscaleImage));

        // Set layout to FlowLayout
        setLayout(new FlowLayout());

        // Add labels to the content pane
        add(originalLabel);
        add(grayscaleLabel);

        pack(); // Pack components to fit preferred size
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    // Method to create grayscale version of an image
    private Image createGrayscaleImage(Image originalImage) {
        int width = originalImage.getWidth(null);
        int height = originalImage.getHeight(null);
        BufferedImage grayscaleImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        Graphics2D g2d = grayscaleImage.createGraphics();
        g2d.drawImage(originalImage, 0, 0, null);
        g2d.dispose();

        return grayscaleImage;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageManipulationExampleII::new);
    }
}
