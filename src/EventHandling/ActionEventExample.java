package EventHandling;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Example");
        JButton button = new JButton("Click Me");
        frame.setLayout(null);
        button.setBounds(100, 50, 100, 50);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the action event
                System.out.println("Button clicked!");
                System.out.println("Action Command: " + e.getActionCommand());
                System.out.println("Modifiers: " + e.getModifiers());
                System.out.println( "Source " + e.getSource());
                System.out.println("When " + e.getWhen());
                System.out.println("Id " + e.getID());
                System.out.println("get params " + e.paramString());


                if ((e.getModifiers() & ActionEvent.ALT_MASK) != 0) {
                    System.out.println("Alt key pressed.");
                }
                if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
                    System.out.println("Shift key pressed.");
                }
                if ((e.getModifiers() & ActionEvent.CTRL_MASK) != 0) {
                    System.out.println("Control key pressed.");
                }
                if ((e.getModifiers() & ActionEvent.META_MASK) != 0) {
                    System.out.println("Meta key pressed.");
                }
            }
        });



        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
