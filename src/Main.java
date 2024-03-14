import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Title of the main frame");
        frame.setLayout(null);
        frame.setSize(400, 300);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
        frame.setResizable(false);



        JButton button = new JButton("Click Me");
        button.setSize(100, 50);
        button.setToolTipText("Click this button");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        frame.add(button);

        JLabel label1 = new JLabel("");
        label1.setBounds(10,100,100,40);
        frame.add(label1);

        JTextField tf = new JTextField();
        tf.setBounds(10,145,100,40);
        frame.add(tf);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setText("Clicked");
                // Define the actions to be performed when the button is clicked
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });
    }

}