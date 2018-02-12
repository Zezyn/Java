/**
 * Created by Wizard on 4/23/2017.
*/

import java.awt.*;
import javax.swing.*;

public class BugImage extends JPanel {
    private ImageIcon img;
    private JLabel label;

    BugImage() {
        setLayout(new FlowLayout());
        img = new ImageIcon(getClass().getResource("/Resources/LadybugGray.gif"));
        label = new JLabel(img);
        add(label);
    }
/*
    public static void printImg() {
        Image gui = new Image();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
    }*/
}