/**
 * Carter Mooring
 * PA2 - Tic Tac Toe
 * Dr. Sprint CPSC 312
 * Sep. 16th, 2019
 *
 * TicTacToeBoard.java - this class creates the base board, prints a board with numbers for the user
 *                      and validates their moves while implementing them.
 */

import java.util.Scanner;

public class TicTacToeBoard {
    public Cell[][] grid;                       //makes a 2d array of size NxN of type String
    Scanner kb = new Scanner(System.in);        //Scanner to get user input
    int N = kb.nextInt();                       //store size of board the user wants in N

    //Default Value constructor for TicTacToeBoard to fill array
    TicTacToeBoard(){
        grid = new Cell[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                grid[i][j] = new Cell();
                grid[i][j].setSymbol('-');
            }
        }
    }

    //this function prints the board for the user
    @Override
    public String toString(){
        String board = "  ";

        for(int k = 0; k < N; k++){
            board += k + " ";
        }

        board += "\n";

        for(int i = 0; i < N; i++){
            board += (i) + " ";
            for(int j = 0; j < N; j++){
                board += grid[i][j].getSymbol() + " ";
            }
            board += "\n";
        }
        return board;
    }

    //This function checks to see if the users coordinates are a valid spot
    public boolean isValidMove(Coordinates coordinates){
        int row = coordinates.getRow();
        int col = coordinates.getCol();

        if((grid[row][col]).getSymbol() == '-'){
            return true;
        } else {
            System.out.println("That is not a valid spot. Please try again.");
            return false;
        }
    }

    //This function makes the move after approved
    public void makeMove(Coordinates coordinates, char playerSymbol){
        int row = coordinates.getRow();
        int col = coordinates.getCol();

        if(isValidMove(coordinates) == true){
            (grid[row][col]).setSymbol(playerSymbol);
        }
    }

    //This funciton ends the game if there is a winner
    public boolean isWinner(char playerSymbol){
        int tracker = 0;

        for(int i = 0; i < N; i ++){
            for(int j = 0; j < N; j++){
               if(grid[i][j].getSymbol() == playerSymbol){
                   tracker++;
                   if(tracker == N){
                       System.out.println("Character " + playerSymbol + " wins!");
                       return true;
                   }
               }
            }
            tracker = 0;

            for(int k = 0; k < N; k++){
                if(grid[k][i].getSymbol() ==  playerSymbol){
                    tracker++;
                    if(tracker == N){
                        System.out.println("Character " + playerSymbol + " wins!");
                        return true;
                    }
                }
            }

            tracker = 0;

            for(int l = 0; l < N; l++){
                if(grid[l][l].getSymbol() == playerSymbol){
                    tracker++;
                    if(tracker == N){
                        System.out.println("Character " + playerSymbol + " wins!");
                        return true;
                    }
                }
            }

            tracker = 0;
            int Number = N - 1;

            for(int m = 0; m < N; m++){
                if(grid[m][Number].getSymbol() == playerSymbol){
                    tracker++;
                    if(tracker == N){
                        System.out.println("Character "  + playerSymbol + " wins");
                        return true;
                    }
                }
                Number--;
            }
            tracker = 0;
        }
        return false;
    }
}
