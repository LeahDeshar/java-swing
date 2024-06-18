package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class PanelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Panel Example");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());

        Label label = new Label("This is a Label on a Panel");
        Button button = new Button("Click Me");

        panel.add(label);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
