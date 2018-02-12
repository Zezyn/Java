/**
 * Created by Wizard on 4/22/2017.
 * A class to create a GUI grid of rectangles to hold the BUG
 */

import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Board extends JPanel {

    //Windows size
    private int windowWidth = 800;
    private int windowHeight = 100;

    //Square size
    private int squareWidth = 50;
    private int squareHeight = 25;

    BufferedImage image;

    //Create frame
    public void board() {
        JFrame f = new JFrame();
        f.setSize(windowWidth, windowHeight);
        f.add(new Board());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    //Draw rectangles
    public void paint(Graphics g) {

        //Coordinates for position
        int x = 5;
        int y = 15;

        BugImage bug = new BugImage();
        this.add(bug);
        super.paint(g);

        g.drawImage(image,x,y,this);

        //Draw 15 rectangles
        for(int i = 0; i<15; i++) { g.drawRect(x, y, squareWidth, squareHeight); x = x+50; }
    }
}
