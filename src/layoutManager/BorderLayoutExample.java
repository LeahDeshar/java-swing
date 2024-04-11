package layoutManager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame with BorderLayout
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create components
        JButton btnNorth = new JButton("North");
        JButton btnSouth = new JButton("South");
        JButton btnEast = new JButton("East");
        JButton btnWest = new JButton("West");
        JButton btnCenter = new JButton("Center");

        // Add components to the frame using BorderLayout
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnCenter, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
