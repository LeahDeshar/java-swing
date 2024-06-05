package basicComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JCheckBox Example");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JCheckBox checkbox1,checkbox2;
        checkbox1 = new JCheckBox("Option 1");
        checkbox2 = new JCheckBox("Option 2");



        JButton submitButton = new JButton("Submit");

        // Label to display the selected option
        JLabel resultLabel = new JLabel("Selected option will be displayed here");

        panel.add(checkbox1);
        panel.add(checkbox2);
        panel.add(submitButton);
        panel.add(resultLabel);

        frame.add(panel);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = "No option selected";
                if (checkbox1.isSelected() && checkbox2.isSelected()) {
                    selectedOption = "Option 1 and Option 2";
                } else if (checkbox1.isSelected()) {
                    selectedOption = "Option 1";
                } else if (checkbox2.isSelected()) {
                    selectedOption = "Option 2";
                }
                resultLabel.setText("Selected option: " + selectedOption);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
