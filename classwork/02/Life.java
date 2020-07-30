import java.io.*;
import java.util.*;
/*
  2D array
  set up
  change values in it
  a way of applying the GOL rules
 */

class Life{

    /*
      create a new 2D array, fill it with ' '
      representing that the entire board is empty.
     */
    public static char[][] createNewBoard(int rows, int cols){
    	char[][] board = new char[rows][cols];
    	for (int r = 0; r < rows; r++) {
    	    for (int c = 0; c < cols; c++) {
    		      board[r][c] = '$';
    	    }
    	}
    	return board;
    }

    public static char[][] initializeBoard(int rows, int cols){
      char[][] board = new char[rows][cols];
      for (int r = 0; r < rows; r++) {
          for (int c = 0; c < cols; c++) {
            if (r%3 == 1 || c%5== 1) {
              board[r][c] = '$';
            }
          }
      }
      return board;
    }


    public static void printBoard(char[][] board){
    	for (int r = 0; r < board.length; r++) {
    	   for (int c = 0; c < board[r].length; c++) {
    	System.out.printf("%c",board[r][c]);
    	    }
    	    System.out.println();
    	}
    	System.out.println("\n\n------------------\n\n");
    }

    /*
      set the cell (r,c) to value
    */
    public static void setCell(char[][] board, int r, int c, char val){
      //in bounds check
    	if (r>=0 && r<board.length && c>=0 && c<board[r].length){
    	    board[r][c] = val;
    	}
    }


    /*
       Count and return the number of living neigbords around board[r][c]
       approach 1 - lots of if statements
       approach 2 - you can loop over the grid from board[r-1][c-1]
                    to board[r+1][c+1]
    */
    public static int countNeighbours(char[][] board, int r, int c){
	     int count = 0;

       //borders
       int startRow, startCol;
       if (r == 0) {
         startRow = 0;
       } else {
         startRow = r -1;
       }

       if (c == 0) {
         startCol = 0;
       } else {
         startCol = c - 1;
       }

       for (int row = startRow; row >= 0 && row < board.length && row <= r + 1; row++) {
         for (int col = startCol; col >= 0 && col < board.length && col <= c + 1; col++) {
           if(board[row][col] == 'X' && !(col==c && row==r)) {
             count++;
           }
         }
       }
       return count;
    }

    /*
      given a board and a cell, determine, based on the rules for
      Conway's GOL if the cell is alive ('X') or dead (' ') in the
      next generation.

     */
    public static char getNextGenCell(char[][] board,int r, int c){
	// calculate the number of living neighbors around board[r][c]

	// determine if board[r][c] is living or dead
	//    if living and 2 3 neighbors then remain alive
	//    if dead and 3 neighbors then become alive
      int count = countNeighbours(board, r, c);
      if (board[r][c] == 'X') {
        if (count == 2 || count == 3) {
          return 'X';
        } else {
          return ' ';
        }
      } else {
        if (count == 3) {
          return 'X';
        } else {
          return ' ';
        }
      }
    }
    /*
      scan the board to generate a NEW board with the
      next generation
    */
    public static char[][] generateNextBoard(char[][] board){
    	char newBoard[][] = new char[25][25];
    	// fill the new board
      for (int r = 0; r < board.length; r++) {
        for (int c = 0; c < board[r].length; c++) {
          newBoard[r][c] = getNextGenCell(board, r, c);
        }
      }
    	return newBoard;
    }

    public static void main(String[] args) {
    	char[][] board;
    	board = createNewBoard(25,25);
      //board = initializeBoard(25,25);
    	printBoard(board);
      board = generateNextBoard(board);
      printBoard(board);
    }
}
