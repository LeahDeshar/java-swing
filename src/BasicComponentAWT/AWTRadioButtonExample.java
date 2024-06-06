package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class AWTRadioButtonExample extends Frame implements ItemListener {

    private CheckboxGroup checkboxGroup;

    public AWTRadioButtonExample() {
        // Set the frame properties
        setTitle("AWT Radio Button Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        // Create a checkbox group (radio button group)
        checkboxGroup = new CheckboxGroup();

        // Create radio buttons and add them to the frame
        Checkbox radioButton1 = new Checkbox("Option 1", checkboxGroup, true);
        Checkbox radioButton2 = new Checkbox("Option 2", checkboxGroup, false);
        Checkbox radioButton3 = new Checkbox("Option 3", checkboxGroup, false);

        add(radioButton1);
        add(radioButton2);
        add(radioButton3);

        // Add item listeners to the radio buttons
        radioButton1.addItemListener(this);
        radioButton2.addItemListener(this);
        radioButton3.addItemListener(this);

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
        // Handle radio button state change events
        Checkbox selectedRadioButton = checkboxGroup.getSelectedCheckbox();
        if (selectedRadioButton != null) {
            System.out.println("Selected Radio Button: " + selectedRadioButton.getLabel());
        }
    }

    public static void main(String[] args) {
        // Create an instance of the AWTRadioButtonExample class
        new AWTRadioButtonExample();
    }
}
