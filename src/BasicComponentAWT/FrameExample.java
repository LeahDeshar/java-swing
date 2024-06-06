package BasicComponentAWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BasicAWTFrame extends Frame  {
    private Button button;

    public BasicAWTFrame() {
        // Set the frame properties
        setTitle("Basic AWT Frame");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);

//        close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });



    }

}
public class FrameExample {
    public static void main(String[] args) {
        // Create an instance of the BasicAWTFrame class
        new BasicAWTFrame();
    }
}