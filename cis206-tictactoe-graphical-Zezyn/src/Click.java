/**
 * Created by Martin on 5/29/2017.
 * This class controls the click events on the TIC TAC TOE Board
 */
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Click implements ActionListener {

    JButton button;
    Game game;

    public Click(JButton button, Game game) { this.button = button; this.game = game; }

    public void actionPerformed(ActionEvent e) {

        //Changes the player from x to o and vice versa
        this.button.setText(game.changePlayer());

        //Displays the player char in console
        System.out.println(this.button.getText() + " ");

        //Disables the button so it can only be clicked once
        this.button.setEnabled(false);

        //An attempt to check for a winner
        game.checkWinner((e.getActionCommand()));
    }
}
