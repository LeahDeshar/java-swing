import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

public class Main {
    public static void Test(){
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
    public static void Calculator(){
        JFrame frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(400, 300);


        JLabel flabel = new JLabel("Enter the First Number: ");
        JTextField Fname = new JTextField();
        Fname.setBounds(10,40,150,20);
        flabel.setBounds(10,10,150,20);

        frame.add(flabel);
        frame.add(Fname);

        JLabel llabel = new JLabel("Enter the Second Number: ");
        JTextField Lname = new JTextField();
        Lname.setBounds(170,40,150,20);
        llabel.setBounds(170,10,150,20);

        frame.add(Lname);
        frame.add(llabel);

        JButton button = new JButton("+");
        button.setBounds(20,60,50,20);
        frame.add(button);

        JButton sub = new JButton("-");
        sub.setBounds(70,60,50,20);
        frame.add(sub);

        JButton div = new JButton("/");
        div.setBounds(120,60,50,20);
        frame.add(div);

        JButton mul = new JButton("*");
        mul.setBounds(170,60,50,20);
        frame.add(mul);

        JLabel result = new JLabel("");
        result.setBounds(20,90,400,80);
        frame.add(result);
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        button.addActionListener(e->{
            System.out.println(e);
            int fname =Integer.parseInt(Fname.getText());
            int lname =Integer.parseInt(Lname.getText());
            int res =  fname + lname;
            result.setText("You've addition is : " + res );
        });

        sub.addActionListener(e->{
            int fname =Integer.parseInt(Fname.getText());
            int lname =Integer.parseInt(Lname.getText());
            int res =  fname - lname;
            result.setText("You've addition is : " + res );
        });
    }
    public static void main(String[] args) {
//        JFrame frame = new JFrame("Calculator");
//        frame.setLayout(null);
//        frame.setSize(400, 300);
//
////       Calculator();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }

}