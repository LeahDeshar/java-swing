package basicComponent;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderExample {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("JSlider Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Create a JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Add the JSlider to the frame
        frame.add(slider);

        // Create a JLabel to display the current value of the slider
        JLabel valueLabel = new JLabel("Current Value: 50");
        frame.add(valueLabel);

        // Add a change listener to the slider to update the label
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                valueLabel.setText("Current Value: " + value);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
