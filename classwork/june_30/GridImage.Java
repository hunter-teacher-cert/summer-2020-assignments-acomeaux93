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
    System.out.println();

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
  }//end invert

  /*
    0: up + left
    1: up + right
    2: down + left
    3: down + right
   */
  public static void diagonal(int[][] d2, int r, int c, int direction, int value) {
  }//end diagonal

}
