/**
 * Carter Mooring
 * PA2 - Tic Tac Toe
 * Dr. Sprint CPSC 312
 * Sep. 16th, 2019
 *
 * Cell.java - This class gets the user symbols ready to use and converts their row and col into coordinates.
 */

public class Cell {
    private Coordinates coordinates;
    private char symbol;

    //Default Value constructor for Cell
    public Cell(){
        coordinates = new Coordinates();
        symbol = '-';
    }

    public Cell(int row, int col, char symbol){
        this.coordinates = new Coordinates(row, col);
        this.symbol = symbol;
    }


    @Override
    public String toString(){
        String cellSym = "";
        cellSym += symbol;
        return cellSym;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
