package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class ButtonExample extends Frame implements ActionListener {

    private Button button1;
    private Button button2;

    public ButtonExample() {
        // Set the frame properties
        setTitle("AWT Button Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        // Create buttons
        button1 = new Button("Button 1");
        button2 = new Button("Button 2");

        // Add buttons to the frame
        add(button1);
        add(button2);

        // Add action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Add a window listener to handle window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click events
        if (e.getSource() == button1) {
            System.out.println("Button 1 Clicked!");
        } else if (e.getSource() == button2) {
            System.out.println("Button 2 Clicked!");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the AWTButtonExample class
        new ButtonExample();
    }
}
