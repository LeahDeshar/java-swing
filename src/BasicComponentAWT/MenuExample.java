package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class MenuExample {
    public MenuExample() {
        // Create a frame
        Frame frame = new Frame("Menu and MenuItem Example with Sub-Items");

        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create the main "File" menu
        Menu fileMenu = new Menu("File");

        // Create menu items for the "File" menu
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");

        // Create a sub-menu under "File"
        Menu saveMenu = new Menu("Save As");

        // Create menu items for the "Save As" sub-menu
        MenuItem saveAsTextItem = new MenuItem("Text File");
        MenuItem saveAsPdfItem = new MenuItem("PDF File");

        // Add sub-menu items to the "Save As" sub-menu
        saveMenu.add(saveAsTextItem);
        saveMenu.add(saveAsPdfItem);

        // Create a menu item for exiting the application
        MenuItem exitItem = new MenuItem("Exit");

        // Add menu items to the "File" menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveMenu); // Add the "Save As" sub-menu to the "File" menu
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitItem);

        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Create a "Help" menu
        Menu helpMenu = new Menu("Help");

        // Create menu items for the "Help" menu
        MenuItem aboutItem = new MenuItem("About");

        // Add menu items to the "Help" menu
        helpMenu.add(aboutItem);

        // Add the "Help" menu to the menu bar
        menuBar.add(helpMenu);

        // Set the menu bar to the frame
        frame.setMenuBar(menuBar);

        // Add action listeners to the menu items
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("New menu item clicked");
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open menu item clicked");
            }
        });

        saveAsTextItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save as Text File menu item clicked");
            }
        });

        saveAsPdfItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save as PDF File menu item clicked");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit menu item clicked");
                frame.dispose(); // Close the frame
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("About menu item clicked");
            }
        });

        // Set the frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
