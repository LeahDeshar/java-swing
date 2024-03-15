import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class ImageManipulationExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Manipulation Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        // Load image
        BufferedImage originalImage = null;
        try {
            originalImage = ImageIO.read(new File("src/image.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display original image on JLabel
        ImageIcon originalIcon = new ImageIcon(originalImage);
        JLabel originalLabel = new JLabel(originalIcon);
        panel.add(originalLabel);

        // Scale the image
        int newWidth = originalImage.getWidth() / 2;  // Scale to half width
        int newHeight = originalImage.getHeight() / 2; // Scale to half height
        BufferedImage scaledImage = new BufferedImage(newWidth, newHeight, originalImage.getType());
        Graphics2D g2d = scaledImage.createGraphics();
        AffineTransform transform = AffineTransform.getScaleInstance(0.5, 0.5); // Scale by 0.5
        g2d.drawImage(originalImage, transform, null);
        g2d.dispose();

        // Display scaled image on JLabel
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        JLabel scaledLabel = new JLabel(scaledIcon);
        panel.add(scaledLabel);

        frame.setVisible(true);
    }
}
