package Excercise;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorUI{
    public CalculatorUI(){
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create the panel to hold the components
        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        // Use GroupLayout manager
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Auto gaps between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Create components
        JLabel userLabel = new JLabel("First number:");
        JLabel passLabel = new JLabel("Second Number:");
        JTextField firstNumText = new JTextField(20);
        JTextField secondNumText = new JTextField(20);
        JButton addButton = new JButton("Add");
        JButton cancelButton = new JButton("reset");

        // Set horizontal group
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(userLabel)
                        .addComponent(passLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(firstNumText)
                        .addComponent(secondNumText)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addComponent(cancelButton)))
        );

        // Set vertical group
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(userLabel)
                        .addComponent(firstNumText))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passLabel)
                        .addComponent(secondNumText))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton)
                        .addComponent(cancelButton))
        );

        // Action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login action here

                Double first,second;

                 first =Double.parseDouble(firstNumText.getText());
                 second =Double.parseDouble(secondNumText.getText());



                    double result = first + second;
                    JOptionPane.showMessageDialog(frame, "Result: " + result);


            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle cancel action here
                firstNumText.setText("");
                secondNumText.setText("");
            }
        });


        frame.setVisible(true);


    }
}
public class Calculator {
    public static void main(String[] args) {
   new CalculatorUI();
    }
}
