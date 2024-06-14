package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample extends JFrame implements ItemListener {

    JCheckBox java;
    JCheckBox vb;
    JCheckBox c;
    JLabel javaLabel;
    JLabel vbLabel;
    JLabel cLabel;

    public ItemListenerExample() {
        super("ItemListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        java = new JCheckBox("Java");
        vb = new JCheckBox("Visual Basic");
        c = new JCheckBox("C");

        javaLabel = new JLabel("Java: Not Selected");
        vbLabel = new JLabel("Visual Basic: Not Selected");
        cLabel = new JLabel("C: Not Selected");

        setLayout(new GridLayout(4, 1));

        add(java);
        add(vb);
        add(c);
        add(javaLabel);
        add(vbLabel);
        add(cLabel);

        java.addItemListener(this);
        vb.addItemListener(this);
        c.addItemListener(this);

        pack(); // Adjust frame size based on components
        setLocationRelativeTo(null); // Center the frame on the screen
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == java) {
            javaLabel.setText("Java: " + (java.isSelected() ? "Selected" : "Not Selected"));
        } else if (e.getSource() == vb) {
            vbLabel.setText("Visual Basic: " + (vb.isSelected() ? "Selected" : "Not Selected"));
        } else if (e.getSource() == c) {
            cLabel.setText("C: " + (c.isSelected() ? "Selected" : "Not Selected"));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ItemListenerExample frame = new ItemListenerExample();
            frame.setVisible(true);
        });
    }
}
