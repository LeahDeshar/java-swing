package Excercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleTextEditor {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        // Create the toolbar
        JToolBar toolBar = new JToolBar();
        JButton boldButton = new JButton("B");
        JButton italicButton = new JButton("I");
        JButton underlineButton = new JButton("U");

        toolBar.add(boldButton);
        toolBar.add(italicButton);
        toolBar.add(underlineButton);

        // Create the text area
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Set up the main layout
        frame.setLayout(new BorderLayout());
        frame.add(menuBar, BorderLayout.WEST);
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Implementing action listeners for menu items
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Display the frame
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}