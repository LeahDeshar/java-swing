package unitOne.Applet;

import javax.swing.*;
import java.awt.*;

public class JavaAppletDemo extends JApplet {
    @Override

        public void init() {
            // Create a label
            JLabel label = new JLabel("Hello, Swing JApplet!");

            // Create a button
            JButton button = new JButton("Click Me");

            // Add an action listener to the button
            button.addActionListener(e -> JOptionPane.showMessageDialog(this, "Button Clicked!"));

            // Add components to the content pane
            getContentPane().setLayout(new FlowLayout());
            getContentPane().add(label);
            getContentPane().add(button);

    }
}
