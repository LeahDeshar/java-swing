package TwoD;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class RectangleExample extends Frame {
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Create a rectangle with coordinates (x, y) = (50, 50) and dimensions width = 100, height = 80
        Rectangle2D rect = new Rectangle2D.Double(50, 50, 100, 80);

        // Draw the outline of the rectangle
        g2d.draw(rect);

        // Fill the rectangle with a color
        g2d.setColor(Color.blue);
        g2d.fill(rect);
    }

    public static void main(String[] args) {
        Frame frame = new RectangleExample();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
