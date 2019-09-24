/**
 * Carter Mooring
 * PA2 - Tic Tac Toe
 * Dr. Sprint CPSC 312
 * Sep. 16th, 2019
 *
 * Coordinates.java - this class gets the users desired row and col to use.
 */

public class Coordinates {
    private int row;
    private int col;

    //Default Value constructor for Coordinates
    public Coordinates(int row, int col){
        this.row = row;             //shadows parameters to keep same name
        this.col = col;
    }

    public Coordinates(){
        row = -1;
        col = -1;
    }

    @Override
    public String toString(){
        //returns a string representation of the invoking object (this.)
        String coordinatesString = "";
        coordinatesString += "( " + row + ", " + col + ")";
        return coordinatesString;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public void setRow(int newRow){
        row = newRow;
    }

    public void setCol(int newCol){
        col = newCol;
    }
}
