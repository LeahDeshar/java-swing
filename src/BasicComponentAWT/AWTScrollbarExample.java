package BasicComponentAWT;

import java.awt.*;
import java.awt.event.*;

public class AWTScrollbarExample extends Frame implements AdjustmentListener {

    private Scrollbar scrollbar;
    private TextArea textArea;

    public AWTScrollbarExample() {
        // Set the frame properties
        setTitle("AWT Scrollbar Example");
        setSize(300, 200);
        setLayout(new BorderLayout());
        setVisible(true);

        // Create a Scrollbar
        scrollbar = new Scrollbar(Scrollbar.VERTICAL);
        scrollbar.addAdjustmentListener(this);

        // Create a TextArea to display content
        textArea = new TextArea();

        // Add the Scrollbar and TextArea to the frame
        add(scrollbar, BorderLayout.EAST);
        add(textArea, BorderLayout.CENTER);

        // Add a window listener to handle window closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // Adjust the scroll position of the TextArea based on the Scrollbar's value
        textArea.setCaretPosition(e.getValue());
    }

    public static void main(String[] args) {
        // Create an instance of the AWTScrollbarExample class
        new AWTScrollbarExample();
    }
}
