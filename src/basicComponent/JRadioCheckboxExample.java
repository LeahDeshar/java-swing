package basicComponent;

import javax.swing.*;
import java.awt.*;

public class JRadioCheckboxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioCheckbox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        JRadioButton radio1,radio2;
        radio1 = new JRadioButton("Option 1");
        radio2 = new JRadioButton("Option 2");

//        select only one option in radio
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);




        JCheckBox check = new JCheckBox("Check Box");

        // Add the radio button and check box to the panel
        panel.add(radio1);
        panel.add(radio2);

        panel.add(check);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame layout
        frame.setLayout(new FlowLayout());

        // Make the frame visible
        frame.setVisible(true);
    }
}
