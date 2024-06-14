package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Event Example");
        frame.setSize(300, 200);

        // Create a JTextArea to demonstrate key events
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add a KeyListener to handle key events
        textArea.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyReleased(KeyEvent e) {
                System.out.println("Key released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            public void keyTyped(KeyEvent e) {
                System.out.println("Key typed: " + e.getKeyChar());
            }
        });

        // Add the text area to the JFrame
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
