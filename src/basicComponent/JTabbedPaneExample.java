package basicComponent;

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneExample {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create the first panel and add components to it
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is the first tab"));
        panel1.add(new JButton("Button 1"));

        // Create the second panel and add components to it
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is the second tab"));
        panel2.add(new JCheckBox("Check me"));

        // Create the third panel and add components to it
        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("This is the third tab"));
        panel3.add(new JTextField("Type here", 15));

        // Add the panels to the tabbed pane
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
