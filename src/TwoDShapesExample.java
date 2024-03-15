import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TwoDShapesExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Create and draw a rectangle
        Rectangle2D rect = new Rectangle2D.Double(50, 50, 100, 80);
        g2d.setColor(Color.BLUE);
        g2d.draw(rect); // Outline of the rectangle

        // Create and draw an ellipse
        Ellipse2D ellipse = new Ellipse2D.Double(200, 100, 120, 80);
        g2d.setColor(Color.RED);
        g2d.fill(ellipse); // Filled ellipse

        // Create and draw a line
        Line2D line = new Line2D.Double(50, 200, 250, 200);
        g2d.setColor(Color.GREEN);
        g2d.draw(line); // Line segment
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Shapes Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        TwoDShapesExample panel = new TwoDShapesExample();
        frame.add(panel);

        frame.setVisible(true);
    }
}
