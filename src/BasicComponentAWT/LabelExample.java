package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class LabelExample extends Frame {

    public LabelExample() {
        // Set the frame properties
        setTitle("AWT Label Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        // Create a label and add it to the frame
        Label label = new Label("This is an AWT Label");
        add(label);

        // Add a window listener to handle window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        // Create an instance of the LabelExample class
        new LabelExample();
    }
}
