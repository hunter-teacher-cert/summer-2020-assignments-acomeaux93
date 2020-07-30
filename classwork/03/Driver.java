import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {

  Time t = new Time();
  Time check = new Time(12,19,12.8);
  System.out.println(check);
  Time.printTime(check);

  check.printTimeAlt();

  String test = check.toString();
  System.out.println(test);
  System.out.println(check);

  Time time1 = new Time(6, 15, 0.0);
  Time time2 = time1;
  Time time3 = new Time(4, 30, 30.0);
  System.out.println("t1 = t3?" + time1.equals(time3));

  Time add = Time.add(time1, time3);
  System.out.println("Added" + add);
  }
}
