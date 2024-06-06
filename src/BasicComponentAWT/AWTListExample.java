package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class AWTListExample extends Frame implements ActionListener {

    private List list;
    private Button addButton;
    private Button removeButton;

    public AWTListExample() {
        // Set the frame properties
        setTitle("AWT List Example");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        // Create a List component
        list = new List(4, true); // The second parameter sets multi-selection mode to true
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");

        // Create buttons for adding and removing items
        addButton = new Button("Add Item");
        removeButton = new Button("Remove Selected Item");

        // Add components to the frame
        add(list);
        add(addButton);
        add(removeButton);

        // Add action listeners to the buttons
        addButton.addActionListener(this);
        removeButton.addActionListener(this);

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
        if (e.getSource() == addButton) {
            // Add a new item to the list
            list.add("New Item");
        } else if (e.getSource() == removeButton) {
            // Remove selected items from the list
            String[] selectedItems = list.getSelectedItems();
            for (String selectedItem : selectedItems) {
                list.remove(selectedItem);
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of the AWTListExample class
        new AWTListExample();
    }
}
