package unitOne.labelsAndIcons;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class IconAndLabelExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Label with Icon Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JLabel label;
        try {
            URL url = new URL("https://fileinfo.com/img/ss/xl/jpg_44-2.jpg");
            ImageIcon icon = new ImageIcon(url);
            Image resizedImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
            ImageIcon iconresizedImage = new ImageIcon(resizedImage);
             label = new JLabel(iconresizedImage);
            frame.add(label);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }



        // Set frame layout
        frame.setLayout(new FlowLayout());

        // Make the frame visible
        frame.setVisible(true);
    }
}
