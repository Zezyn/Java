import javax.swing.*;
import java.awt.*;

/**
 * Martin Hernandez
 * 4/18/17
 * A program to view a moving bug
*/

public class Main {
    public static void main(String[] args) {

        Board board = new Board();

        board.board();

/*
        BugImage gui = new BugImage();

        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("A Test");
*/

        Bug bugsy = new Bug(1);
        bugsy.move(); // Now the position is 11
        bugsy.turn();
        bugsy.move(); // Now the position is 10
        bugsy.getPosition();
    }
}