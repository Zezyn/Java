/**
 * Created by Martin Hernandez
 * 4/18/2017.
 * Creating a Bug object
 */

import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.Image;

public class Bug {
    //Create the bug
    private int bug;

    //Variable to hold movement
    private int moveDirection;

    //Constructor to set the bug to 0
    public Bug(int initialPosition) {
        this.bug = initialPosition;
    }

    //Setter to change the bug direction
    public void turn() {
        if(moveDirection < bug) { moveDirection++; }
        else { moveDirection--; }
    }

    //Setter to move the bug
    public void move() {
        bug = moveDirection;
    }

    //Getter to send the bug to output
    public int getPosition() {
        int position = 0;
        return position;
    }


}