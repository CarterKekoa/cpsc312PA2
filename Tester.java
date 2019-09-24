/**
 * Carter Mooring
 * PA2 - Tic Tac Toe
 * Dr. Sprint CPSC 312
 * Sep. 16th, 2019
 *
 * Tester.java - this class runs the game for the user in a order that makes sense and makes use of all the
 *                 necessary methods and classes.
 */

import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe! There are two players, player 'X' and player 'O'. " +
                "A player wins the game when they are able to fill a ");
        System.out.println("whole row, column, or diagonal " +
                "line with their symbol. Otherwise the game will end in a tie!");

        System.out.println();
        System.out.println("Please enter the dimension, N, of the NxN Tic Tac Toe board (an integer" +
                " in [3, 9]): ");

        Random random = new Random();               //Now able to use random
        int whosFirst = random.nextInt(2);   //[0, bound) [0, 2)
        char whosF = 'X';                          //This boolean value will track who's turn it is.

        if (whosFirst == 1) {
            System.out.println("Player X is going first.");
        } else {
            System.out.println("Player O is going first.");
            whosF = 'O';
        }

        System.out.println();
        TicTacToeBoard board = new TicTacToeBoard();
        System.out.println(board.toString());
        boolean turn = false;
        char whosUp;
        Scanner kb = new Scanner(System.in);        //Scanner to get user input
        Coordinates coordinates = new Coordinates();

        do{
            if(whosF == 'X'){
                turn = true;
            }

            whosUp = whosTurn(turn);
            System.out.println("Player " + whosUp + " please enter the row of your placement: ");
            int row = kb.nextInt();
            coordinates.setRow(row);
            kb.nextLine();
            System.out.println("Now please enter the column of your placement: ");
            int  col = kb.nextInt();
            coordinates.setCol(col);
            kb.nextLine();

            board.makeMove(coordinates, whosUp);
            System.out.println(board.toString());
            turn = !turn;

        }while(board.isWinner(whosUp) != true);
    }

    //This function is here to help switch between which player is up.
    public static char whosTurn(boolean turn){
        char player;

        if(turn == true){
            return player = 'X';
        } else {
            return player = 'O';
        }
    }
}
