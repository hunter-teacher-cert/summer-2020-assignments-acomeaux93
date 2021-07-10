import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
      int hour = 8;
      int hour_change = 9;
      int minute = 46;
      int minute_change = 4;
      int second = 50;
      int second_change = 20;

      //#3 Calculate the number of seconds since midnight
      int since_midnight = (hour * 60 * 60) + (minute * 60) + second;
      int since_midnight_change = (hour_change * 60 * 60) + (minute_change * 60) + second_change;

      //#4 Calculate the number of seconds remaining in the day
      int seconds_in_day = (24 * 60 * 60);
      int remaining =  seconds_in_day - since_midnight;
      int remaining_change =  seconds_in_day - since_midnight_change;

      //#5 Percentage of day passed
      double percentage_passed = (double) since_midnight/seconds_in_day * 100;
      double percentage_passed_change = (double) since_midnight_change/seconds_in_day * 100;


      System.out.println("Seconds since midnight");
      System.out.println(since_midnight);

      System.out.println("Seconds in a day");
      System.out.println(seconds_in_day);

      System.out.println("Seconds remaining");
      System.out.println(remaining);

      System.out.println("Percentage passed");
      System.out.println(percentage_passed);


      System.out.println("Seconds since midnight change");
      System.out.println(since_midnight_change);

      System.out.println("Seconds in a day");
      System.out.println(seconds_in_day);

      System.out.println("Seconds remaining change");
      System.out.println(remaining_change);

      System.out.println("Percentage passed change");
      System.out.println(percentage_passed_change);
    }
}
