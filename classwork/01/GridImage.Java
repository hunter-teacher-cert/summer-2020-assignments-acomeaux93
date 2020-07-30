import java.io.*;
import java.util.*;

public class GridImage {

  public static void main(String[] args) {

    int rows = 20;
    int cols = 20;

    int[][] grid = new int[rows][cols];

    print2d(grid);
    System.out.println();
    rowPop(grid, 3, 9);
    print2d(grid);
    System.out.println();
    colPop(grid, 9, 3);
    print2d(grid);
    System.out.println();
    diagonal(grid, 3, 6, 12, 255);
    print2d(grid);
    



  }

  public static void print2d(int[][] d2) {

    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {

        System.out.printf("%03d ", d2[r][c]);
      }//end c for

      System.out.println();
    }//end r for
  }//end print2d

  public static void colPop(int[][] d2, int column, int value) {
  }//end colPop

  public static void rowPop(int[][] d2, int row, int value) {
    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {
        if (r == row) {
          System.out.printf(Integer.toString(value), d2[r][c]);
        } else {
          System.out.printf("%03d ", d2[r][c]);
        }
      }//end c for
      System.out.println();
    }//end r for
  }//end rowPop

  public static void invert(int[][] d2) {
    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {
        if (d2[r][c] == 0) {
          d2[r][c] = 255;
        else {
          d2[r][c] = 0;
        }
      }
    }
  }//end invert

  public static void diagonal(int[][] d2, int r, int c, int direction, int value) {

    int rowGo = -1;
    int columnGo = -1;

    if (direction == 1) {
      columnGo = 1;
    } else if (direction == 2) {
      rowGo = 1;
    } else if (direction == 3) {
      rowGo = 1;
      columnGo = 1;
    }

    //do while you're still in-bounds
    while (r >= 0 && r < d2.length && c >= 0 && c < d2[r].length) {
      d2[r][c] = value;
      r = r + rowGo;
      c = c + columnGo;
    }
  }//end diagonal

}
