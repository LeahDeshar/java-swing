package basicComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioCheckbox Example");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JRadioButton radio1,radio2;
        radio1 = new JRadioButton("Option 1");
        radio2 = new JRadioButton("Option 2");

//        select only one option in radio
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);



        JButton submitButton = new JButton("Submit");
        submitButton.setLocation(100, 100);
        frame.add(submitButton);

        // Label to display the selected option
        JLabel resultLabel = new JLabel("Selected option will be displayed here");
        frame.add(resultLabel);

        panel.add(radio1);
        panel.add(radio2);


        frame.add(panel);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = "No option selected";
                if (radio1.isSelected()) {
                    selectedOption = "Option 1";
                } else if (radio2.isSelected()) {
                    selectedOption = "Option 2";
                }
                resultLabel.setText("Selected option: " + selectedOption);
            }
        });


        // Make the frame visible
        frame.setVisible(true);
    }
}
