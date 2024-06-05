import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarExample {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("JProgressBar Example with Loop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Create a JProgressBar
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        // Add the JProgressBar to the frame
        frame.add(progressBar);

        // Create a start button to begin the task
        JButton startButton = new JButton("Start");
        frame.add(startButton);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Disable the start button to prevent multiple clicks
            startButton.setEnabled(false);

            // Create a new thread to update the progress bar
            new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    final int progress = i;
                    // Update the progress bar on the Event Dispatch Thread
                    SwingUtilities.invokeLater(() -> progressBar.setValue(progress));
                    try {
                        // Simulate work with a sleep
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                // Re-enable the start button after the task is completed
                SwingUtilities.invokeLater(() -> startButton.setEnabled(true));
            }).start();
        });

        // Display the frame
        frame.setVisible(true);
    }
}
