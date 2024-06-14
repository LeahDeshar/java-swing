package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdjustmentEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adjustment Event Example");
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);

        // Add AdjustmentListener to handle adjustment events
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Adjustment event type: " + e.getAdjustmentType());
                System.out.println("New value: " + e.getValue());
            }
        });

        panel.add(scrollBar);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
