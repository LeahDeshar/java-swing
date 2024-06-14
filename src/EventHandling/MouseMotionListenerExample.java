package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Motion Listener Example");
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        frame.add(panel);

        // Add a MouseMotionListener to handle mouse motion events
        panel.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse dragged to (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
