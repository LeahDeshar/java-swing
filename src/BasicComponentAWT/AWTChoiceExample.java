package BasicComponentAWT;


import java.awt.*;
        import java.awt.event.*;

public class AWTChoiceExample extends Frame implements ItemListener {

    private Choice choice;

    public AWTChoiceExample() {
        // Set the frame properties
        setTitle("AWT Choice Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        // Create a Choice control
        choice = new Choice();

        // Add items to the choice control
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Add the choice control to the frame
        add(choice);

        // Add item listener to handle item selection events
        choice.addItemListener(this);

        // Add a window listener to handle window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Handle item selection events
        String selectedOption = choice.getSelectedItem();
        System.out.println("Selected Option: " + selectedOption);
    }

    public static void main(String[] args) {
        // Create an instance of the AWTChoiceExample class
        new AWTChoiceExample();
    }
}
