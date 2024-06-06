package BasicComponentAWT;


import java.awt.*;
        import java.awt.event.*;

public class CheckBoxExample extends Frame implements ItemListener {

    private Checkbox checkbox1;
    private Checkbox checkbox2;
    private Checkbox checkbox3;
    private CheckboxGroup checkboxGroup;
    private Checkbox groupOption1;
    private Checkbox groupOption2;

    public CheckBoxExample() {
        // Set the frame properties
        setTitle("AWT Checkbox Example");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);

        // Create checkboxes
        checkbox1 = new Checkbox("Checkbox 1");
        checkbox2 = new Checkbox("Checkbox 2");
        checkbox3 = new Checkbox("Checkbox 3");

        // Add checkboxes to the frame
        add(checkbox1);
        add(checkbox2);
        add(checkbox3);

        // Add item listeners to the checkboxes
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);

        // Create a checkbox group (radio button group)
        checkboxGroup = new CheckboxGroup();

        // Create group options
        groupOption1 = new Checkbox("Option 1", checkboxGroup, true);
        groupOption2 = new Checkbox("Option 2", checkboxGroup, false);

        // Add group options to the frame
        add(groupOption1);
        add(groupOption2);

        // Add item listeners to the group options
        groupOption1.addItemListener(this);
        groupOption2.addItemListener(this);

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
        // Handle checkbox state change events
        if (e.getSource() == checkbox1) {
            System.out.println("Checkbox 1: " + (checkbox1.getState() ? "Checked" : "Unchecked"));
        } else if (e.getSource() == checkbox2) {
            System.out.println("Checkbox 2: " + (checkbox2.getState() ? "Checked" : "Unchecked"));
        } else if (e.getSource() == checkbox3) {
            System.out.println("Checkbox 3: " + (checkbox3.getState() ? "Checked" : "Unchecked"));
        } else if (e.getSource() == groupOption1) {
            System.out.println("Group Option 1 selected");
        } else if (e.getSource() == groupOption2) {
            System.out.println("Group Option 2 selected");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the AWTCheckboxExample class
        new CheckBoxExample();
    }
}
