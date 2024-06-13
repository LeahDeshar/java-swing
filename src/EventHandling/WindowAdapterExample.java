package EventHandling;

import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample extends Frame {
    public WindowAdapterExample() {
        setTitle("Window Adapter Example");


        Label label = new Label("Close the window to exit.");
        add(label, BorderLayout.CENTER);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new WindowAdapterExample();
    }
}
