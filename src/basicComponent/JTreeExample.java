package basicComponent;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeExample {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add child nodes to the root node
        rootNode.add(child1);
        rootNode.add(child2);

        // Create a JTree with the root node
        JTree tree = new JTree(rootNode);

        // Add the JTree to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Add the JScrollPane to the frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
