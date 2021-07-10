import java.io.*;
import java.util.*;

public class Craps {

  //rolling Method
  public static int roll (int n) {
    Random r = new Random();
    return r.nextInt(n) + 1;
  }

  //shooot Method
  public static int shoot (int dice, int max) {
    int sum = 0;
    for (int i = 0; i < dice; i++) {
			int points = roll(max);
			sum += points;
		}
		return sum;
  }

  //round Method
  public static boolean round () {
      int point = shoot(2,6);
      if (point == 2 || point == 3 || point == 12) {
			     return false;
		  } else if (point == 7 || point == 11) {
			     return true;
		  } else {
        int temp = point;
        point = 0;
        while (point != temp || point != 7) {
  	      point = shoot(2, 6);
  				if (point == temp) {
  					return true;
  				} else if (point == 7) {
  					return false;
  				}
  			}
			  return false;
      }
    }

    public static void main (String[] args) {
  		Scanner input = new Scanner(System.in);
  		System.out.print("The Game Is Craps...How Many Rounds Are You Playing?");
  		int rounds = input.nextInt();
  	  input.close();

      System.out.println();
  		int wins = 0;
  		for (int i = 0; i < rounds; i++) {
  			System.out.println("Round " + (i+1));
  			if (round()) {
  				System.out.println("You win!");
  				wins++;
  			} else {
  				System.out.println("You lose");
  			}
  		}
    }

}
