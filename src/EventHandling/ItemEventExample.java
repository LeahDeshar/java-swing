package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Item Event Example");
        frame.setSize(300, 200);

        // Create a checkbox to demonstrate item events
        JCheckBox checkBox = new JCheckBox("Enable Feature");
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange());
                System.out.println(e.getItem());
                System.out.println(e.getItemSelectable());

                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Feature enabled");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Feature disabled");
                }
            }
        });

        // Add the checkbox to the JFrame
        frame.add(checkBox, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
