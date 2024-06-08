package basicComponent;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Example {
    public static void main(String[] args) throws MalformedURLException {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));
        Container contentPane = frame.getContentPane();


        JPanel panel1 = new JPanel();
        JLabel l1 = new JLabel("Enter Email");
        JTextField tx1 = new JTextField("", 20);
        panel1.add(l1);
        panel1.add(tx1);



        JPanel panel2 = new JPanel();

        JLabel l2 = new JLabel("Enter Password");
        JTextField tx2 = new JTextField("", 20);
        panel2.add(l2);
        panel2.add(tx2);

        JPanel panel3 = new JPanel();
        JButton btn1 = new JButton("Login");
        panel3.add(btn1);

        btn1.addActionListener(e -> {
            String email = tx1.getText();
            String password = tx2.getText();
            DisplayData displayData = new DisplayData(email, password, frame);

        });


        contentPane.add(panel1);
        contentPane.add(panel2);
        contentPane.add(panel3);











        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    private static void TextFieldExample(JPanel panel) {
        JTextField tx1 = new JTextField("Hello, Swing!", 20);
        tx1.setEditable(false);
        tx1.setToolTipText("Enter your name");
        panel.add(tx1);


        JLabel label = new JLabel();

        panel.add(label);


        JButton button = new JButton("Show");
        panel.add(button);
        tx1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                label.setText(tx1.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                label.setText(tx1.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                label.setText(tx1.getText());
            }
        });
    }

    private static void LabelExample(JPanel panel) throws MalformedURLException {
        JLabel textLabel = new JLabel("Hello, Swing!");
        panel.add(textLabel);

        URL imageUrl = new URL("https://img.icons8.com/?size=100&id=47588&format=png&color=000000");
        ImageIcon icon = new ImageIcon(imageUrl);
//        resize the icon
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImage);

        JLabel iconLabel = new JLabel(icon);


        String copyText = "Get the text " + textLabel.getText();


        JLabel textLabel1 = new JLabel(copyText);
        panel.add(textLabel1);

        Icon icon1 = iconLabel.getIcon();

        JLabel copyIcon = new JLabel(icon1);
        copyIcon.setToolTipText("Example of get Icon method");

        panel.add(iconLabel);
        panel.add(copyIcon);
    }
}



 class DisplayData {

    public DisplayData(String email, String password, JFrame mainframe) {
        JFrame frame = new JFrame("Display Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel emailText = new JLabel("Email: " + email);
        JLabel passwordText = new JLabel("Password: " + password);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));
        contentPane.add(emailText);
        contentPane.add(passwordText);

        frame.setLocationRelativeTo(null);
        mainframe.setVisible(false);
        frame.setVisible(true);


    }


 }