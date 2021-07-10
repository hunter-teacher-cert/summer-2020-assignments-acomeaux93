import java.io.*;
import java.util.*;

public class Data {
    public static void main(String[] args){
      String day = "Monday";
      int date = 25;
      String month = "January";
      int year = 1993;
      System.out.println("This is the day I was born");
      System.out.println("American format:");
      System.out.println(day + ", " + month + " " + date + ", " + year);
      System.out.println("European format:");
      System.out.println(day + ", " + date + " " + month + " " + year);
    }
}
