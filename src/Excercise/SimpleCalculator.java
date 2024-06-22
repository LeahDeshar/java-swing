package Excercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        // Create components
        JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField();
        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        // Add components to the frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(new JLabel()); // empty cell
        frame.add(resultLabel);
        frame.add(resultField);

        // Implement the action listener for the button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Retrieve the numbers from the text fields
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());

                    // Perform addition
                    double result = num1 + num2;

                    // Display the result
                    resultField.setText(Double.toString(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}