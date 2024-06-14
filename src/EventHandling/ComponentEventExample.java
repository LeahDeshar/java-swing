package EventHandling;

import javax.swing.*;
import java.awt.event.*;

public class ComponentEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Component Event Example");
        frame.setSize(300, 200);

        // Example of handling component events (COMPONENT_MOVED, COMPONENT_RESIZED)
        frame.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Component resized to: " + e.getComponent().getSize());
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("Component moved to: (" + e.getComponent().getX() + ", " + e.getComponent().getY() + ")");

            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("Component shown");

            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Component hidden");

            }
        }

        );



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
