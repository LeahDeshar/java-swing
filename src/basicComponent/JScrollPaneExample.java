package basicComponent;
import javax.swing.*;
import java.awt.*;
public class JScrollPaneExample {
        public static void main(String[] args) {
            // Create a new JFrame container
            JFrame frame = new JFrame("JScrollPane Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new BorderLayout());

            // Create a JTextArea
            JTextArea textArea = new JTextArea(10, 30);
            textArea.setText("This is an example of JScrollPane with a JTextArea.\n"
                    + "You can add more text here to see the scrolling effect.\n"
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"
                    + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n"
                    + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n"
                    + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n"
                    + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
                    + "You can add more text here to see the scrolling effect.\n"
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"
                    + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n"
                    + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n"
                    + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n"
                    + "You can add more text here to see the scrolling effect.\n"
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"
                    + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n"
                    + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n"
                    + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n"
                    + "You can add more text here to see the scrolling effect.\n"
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"
                    + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n"
                    + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n"
                    + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n"
                    + "You can add more text here to see the scrolling effect.\n"
                    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"
                    + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n"
                    + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n"
                    + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n"

            );

            // Create a JScrollPane containing the JTextArea
            JScrollPane scrollPane = new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

            // Add the JScrollPane to the frame
            frame.add(scrollPane, BorderLayout.CENTER);

            // Display the frame
            frame.setVisible(true);
        }

}
