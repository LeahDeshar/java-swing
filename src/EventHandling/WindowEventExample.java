package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Event Example");
        frame.setSize(300, 200);

        // Add a WindowListener to handle window events
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
                System.exit(0); // Exit application when window is closed
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }

            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window deiconified");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }
        });

        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Handle closing manually
        frame.setVisible(true);
    }
}
