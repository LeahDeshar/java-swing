package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowFocusListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Focus Listener Example");
        frame.setSize(300, 200);

        // Add a WindowFocusListener to handle window focus events
        frame.addWindowFocusListener(new WindowFocusListener() {
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("Window gained focus");
            }

            public void windowLostFocus(WindowEvent e) {
                System.out.println("Window lost focus");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
