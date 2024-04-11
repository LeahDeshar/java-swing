package layoutManager;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame with GridLayout
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create components
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");

        // Create a panel with GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 3)); // 2 rows, 3 columns

        // Add components to the panel
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);

        // Add the panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }
}
