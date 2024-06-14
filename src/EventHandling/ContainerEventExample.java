package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContainerEventExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dynamic ContainerEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.CENTER);

        // ContainerListener to track added/removed components
        panel.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                Component c = e.getChild();
                if (c instanceof JButton) {
                    JButton b = (JButton) c;
                    System.out.println("Button added: " + b.getText());
                }
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                Component c = e.getChild();
                if (c instanceof JButton) {
                    JButton b = (JButton) c;
                    System.out.println("Button removed: " + b.getText());
                }
            }
        });

        // Button to add a new button to the panel
        JButton addButton = new JButton("Add Button");
        addButton.addActionListener(new ActionListener() {
            private int counter = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton newButton = new JButton("Button " + counter++);
                newButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton) e.getSource()).getText() + " clicked!");
                    }
                });
                panel.add(newButton);
                panel.revalidate();
                panel.repaint();
            }
        });

        // Button to remove the last button from the panel
        JButton removeButton = new JButton("Remove Button");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (panel.getComponentCount() > 0) {
                    panel.remove(panel.getComponentCount() - 1);
                    panel.revalidate();
                    panel.repaint();
                }
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(addButton);
        controlPanel.add(removeButton);

        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
