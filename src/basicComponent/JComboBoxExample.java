package basicComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxExample {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Create a JComboBox with some items
        String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JComboBox<String> comboBox = new JComboBox<>(items);

        // Add the JComboBox to the frame
        frame.add(comboBox);

        // Create a JLabel to display the selected item
        JLabel selectedItemLabel = new JLabel("Selected Item: " + comboBox.getSelectedItem());
        frame.add(selectedItemLabel);

        // Add an action listener to the combo box to update the label
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                selectedItemLabel.setText("Selected Item: " + selectedItem);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
