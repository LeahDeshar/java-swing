package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvenExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener Example");
        frame.setSize(300, 200);
        JPanel panel = new JPanel();
        frame.add(panel);


        panel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                 System.out.println("Custom Mouse Click Event:");
                System.out.println("Source Component: " + e.getSource());
                System.out.println("Event ID: " + e.getID());
                System.out.println("Timestamp: " + e.getWhen());
                System.out.println("Modifiers: " + e.getModifiersEx());
                System.out.println("Mouse Position: (" + e.getX() + ", " + e.getY() + ")");
                System.out.println("Click Count: " + e.getClickCount());
                System.out.println("Popup Trigger: " + e.isPopupTrigger());
                System.out.println("--------------------------------------");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
