package basicComponent;

import javax.swing.*;
import java.awt.*;

public class JPanelExample extends JFrame {
    public JPanelExample() {
        setTitle("JPanel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create main JPanel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 2)); // 2x2 grid layout

        // Create nested JPanels with different background colors
        JPanel panel1 = createColoredPanel(Color.RED);
        JPanel panel2 = createColoredPanel(Color.BLUE);
        JPanel panel3 = createColoredPanel(Color.GREEN);
        JPanel panel4 = createColoredPanel(Color.YELLOW);

        // Add nested panels to the main panel
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);

        // Add main panel to the frame
        add(mainPanel);

        pack(); // Pack components to fit preferred size
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    // Helper method to create a colored panel with specified background color
    private JPanel createColoredPanel(Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setPreferredSize(new Dimension(200, 200)); // Set preferred size
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JPanelExample::new);
    }
}
