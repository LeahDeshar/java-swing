package Excercise;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class Example{
    public Example(){
        JFrame frame = new JFrame("Example");
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);



        JPanel mainLoginPanel = new JPanel();
        mainLoginPanel.setLayout(null);
        mainLoginPanel.setBorder(BorderFactory.createTitledBorder("Main Form"));
//        mainLoginPanel.setBackground(Color.GREEN);


        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(2,2));
        loginPanel.setBounds(20,20,400,100);
        loginPanel.setBorder(BorderFactory.createTitledBorder("Login Form"));
//        loginPanel.setBackground(Color.YELLOW);


        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(new JTextField());
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(new JPasswordField());
        mainLoginPanel.add(loginPanel);

        JButton btn = new JButton("Login");
        btn.setSize(30,50);
        btn.setBounds(20,120,140,20);
        mainLoginPanel.add(btn);
        frame.add(mainLoginPanel,BorderLayout.CENTER);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    private static void DisplayPanelExample(JFrame frame) {
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
        p1.setBackground(Color.RED);
//        p1.setBounds(20,20,200,200);
        p1.add(new JButton("Button 1"));
        p1.add(new JButton("Button 2"));
        p1.add(new JButton("Button 3"));

        JPanel p2 = new JPanel();
//        p2.setLayout(new FlowLayout());
        p2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
        p2.setBackground(Color.BLUE);
//        p2.setBounds(240,20,200,200);
        p2.add(new JButton("Button 4"));
        p2.add(new JButton("Button 5"));
        p2.add(new JButton("Button 6"));

        JPanel p3 = new JPanel();
//        p3.setLayout(new FlowLayout());
        p3.setBorder(BorderFactory.createTitledBorder("Panel 3"));
        p3.setBackground(Color.GREEN);
//        p3.setBounds(20,240,420,200);
        p3.add(new JButton("Button 7"));
        p3.add(new JButton("Button 8"));
        p3.add(new JButton("Button 9"));

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
    }
}


public class Test {

    public static void main(String[] args) {
        new Example();
    }
}
