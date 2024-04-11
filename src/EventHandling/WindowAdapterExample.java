package EventHandling;

import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample extends Frame {
    public WindowAdapterExample() {
        setTitle("Window Adapter Example");

        // Create a label
        Label label = new Label("Close the window to exit.");
        add(label, BorderLayout.CENTER);

        // Add a window listener using WindowAdapter
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Handle window closing event
                dispose(); // Dispose the frame
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowAdapterExample();
    }
}
