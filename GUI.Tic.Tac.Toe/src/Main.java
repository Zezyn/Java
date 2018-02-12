/*
* A tic tac toe GUI game
* Created by Martin Hernandez
 */

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {

        //Create Frame
        Frame frame = new Frame();
        //frame.setVisible(true);
        //board.setVisible(true);

        //frame.add(new Board());

        /*char[][] board = getEmptyBoard();
        doTurn(board);
        drawBoard(board);*/
    }


    /*
    public static void drawColumns(char[] cols)
    { System.out.println("| " + cols[0] +" | "+cols[1] + " | " + cols[2] + " |"); }

    public static void drawBoard(char[][] board) {
        System.out.println("-------------");
        drawColumns(board[0]);
        System.out.println("-------------");
        drawColumns(board[1]);
        System.out.println("-------------");
        drawColumns(board[2]);
        System.out.println("-------------");
    }

    public static char[][] getEmptyBoard() {
        char[][] board = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'}
        };
        return board;
    }
    */

    public static char changePlayer(char playerMark) {
        if (playerMark == 'X') {
            playerMark = 'O';
        }
        else {
            playerMark = 'X';
        }
        return playerMark;
    }

    public static int playerLocation(char[][] board) {
        //Get user location
        Scanner in = new Scanner(System.in);
        //drawBoard(board);
        System.out.print("- Pick a spot: ");
        int spot = in.nextInt();
        return spot;
    }

    public static void doTurn(char[][] board) {

        char player = 'X';
        int row = 0, col = 0;
        boolean won = true;
        boolean tie = true;

        do {

            won = isWon(board);
            tie = isBoardFull(board);

            if (isWon(board)) {
                System.out.print("\nPlayer " + player + " dominated! \n ++GAME OVER!++\n");
                break;
            } else if (isBoardFull(board)) {
                System.out.println("\n++TIE GAME!++\n");
                break;
            }

            //Puts in player char in the proper locations
            int spot;
            System.out.print(" -- Player " + player + " \n ");
            spot = playerLocation(board);
            switch (spot) {
                case 1:
                    row = 0;
                    col = 0;
                    break;
                case 2:
                    row = 0;
                    col = 1;
                    break;
                case 3:
                    row = 0;
                    col = 2;
                    break;
                case 4:
                    row = 1;
                    col = 0;
                    break;
                case 5:
                    row = 1;
                    col = 1;
                    break;
                case 6:
                    row = 1;
                    col = 2;
                    break;
                case 7:
                    row = 2;
                    col = 0;
                    break;
                case 8:
                    row = 2;
                    col = 1;
                    break;
                case 9:
                    row = 2;
                    col = 2;
                    break;
                default:
                    System.out.print("Invalid Entry: Try again\n");
                    break;
            }

            if (row >= 0 && row < board.length && col >= 0 && col < board[0].length) {

                if (board[row][col] == 'X' || board[row][col] == 'O') {
                    System.out.println("Invalid\n");
                    doTurn(board);
                } else {
                    board[row][col] = player;
                    player = changePlayer(player);
                }
            }
        } while(!won || !tie);
    }

    public static boolean isBoardFull(char[][] board) {
        boolean isFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'X' && board[i][j] != 'O') {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    public static boolean isWon(char[][] board) {

        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') { //Checks horizontal
            return true;
        } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            return true;
        } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            return true;
        } else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            return true;
        } else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') { //Checks vertical
            return true;
        } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            return true;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            return true;
        } else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            return true;
        } else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            return true;
        } else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') { //Checks diagonal
            return true;
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            return true;
        } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            return true;
        } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            return true;
        } else { return false; }
    }
}