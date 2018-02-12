/**
 * Created by Martin Hernandez on 5/24/2017.
 * This creates the JFrame used with the Tic Tac Toe GUI
 */

import javax.swing.JFrame;

public class Frame extends JFrame {

    //Create frame size
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 400;

    public Frame() {
        //Create JFrame
        JFrame frame = new JFrame();

        //Set frame Size
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        //Set frame title
        frame.setTitle("Tic Tac Toe");
        //Set frame close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set frame visible
        frame.setVisible(true);

        // Create board object

        Board board = new Board();
        frame.getContentPane().add(board);

        this.setResizable(false);

    }
}
