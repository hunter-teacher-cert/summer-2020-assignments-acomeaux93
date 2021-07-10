import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {

  Time check = new Time(12,19,12.8);

  Time.printTime(check);

  check.printTimeAlt();

  String test = check.toString();
  System.out.println(test);
  System.out.println(check);

  }
}
