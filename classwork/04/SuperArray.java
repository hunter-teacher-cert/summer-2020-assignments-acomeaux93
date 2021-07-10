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

  public void append(int n){
    int[] newArray = new int[this.data.length + 1];
    for (int i = 0; i < this.data.length; i++){
      newArray[i] = this.data[i];
    }

    newArray[newArray.length - 1] = n;
    this.data = newArray;
  }

  public void add(int n){
    for (int i = 0; i < this.data.length; i++){
      if (this.data[i] == 0){
        this.data[i] = n;
        return;
      }
    }
  }

  public void printArray(){

    for(int i = 0; i < this.data.length; i++){
      System.out.print(this.data[i]);
      System.out.print(" ");
    }
    System.out.println();
  }

  public int getSize(){
    return this.numberElements;
    
  }

  public static void main(String[] args) {
    SuperArray test1 = new SuperArray();
    int testArray[] = new int[5];
    SuperArray test2 = new SuperArray(testArray);

    System.out.println(test1);
    System.out.println(test2);

  }

}
