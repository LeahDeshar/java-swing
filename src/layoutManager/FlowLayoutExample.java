package layoutManager;


import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame with FlowLayout
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Add buttons to the frame
        for (int i = 1; i <= 5; i++) {
            frame.add(new JButton("Button " + i));
        }

        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
