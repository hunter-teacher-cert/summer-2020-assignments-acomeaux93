import java.io.*;
import java.util.*;


public class SuperArray {
  private int[] data;
  private int numberElements;

  public SuperArray() {
    this.data = new int[10];
    this.numberElements = 0;

  }

  public SuperArray(int[] data) {
    this.data = data;
    this.numberElements = 0;
  }

  public static void main(String[] args) {
    SuperArray test1 = new SuperArray();
    int testArray[] = new int[5];
    SuperArray test2 = new SuperArray(testArray);

    System.out.println(test1);
    System.out.println(test2);


  }

}
