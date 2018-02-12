import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;

/**
 * Created by Martin Hernandez on 5/25/2017.
 * Creates the tic tac toe board
 */

public class Board extends JPanel {


    //Creates the 3x3 board
    public Board() {

        //Creates new JPanel
        //JPanel panel = new JPanel();

        //Creates the 3x3 grid for buttons in the panel
        this.setLayout(new GridLayout(3,3));

        //A loop to create the 9 buttons
        for(int i=0; i<=8;i++) {
            JButton buttoni = new JButton();
            buttoni.setEnabled(true);
            this.add(buttoni);

        }
        this.setVisible(true);
    }
}