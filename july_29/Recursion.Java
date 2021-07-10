import java.io.*;
import java.util.*;

public class Recursion {

 public static void main(String[] args) {
  System.out.println("Hello World!");
  System.out.println("Good News Everyone!");

  Scanner input = new Scanner(System.in);
  System.out.print("Give a number to Factorial");
  int num = input.nextInt();

  System.out.printf("Here is the recursion result");
  int answer = factorial(num);
  System.out.println(answer);

  System.out.print("Give a number to Fib");
  int fib = input.nextInt();
  int fib_answer = fib(fib);
  System.out.println(fib_answer);

 }

 public static int factorial(int n) {
      int output;
      if(n==1){
        return 1;
      }
      output = factorial(n-1)* n;
      return output;
 }

 public static int fib(int n) {
	     if(n == 0){
		      return 0;
	     }
	     if(n == 1 || n == 2){
			    return 1;
		   }
	     return fib(n-2) + fib(n-1);
	}

  public static int ackerman(int m, int n){
		if (m == 0){
			return n + 1;
		}	else if (m > 0 && n == 0){
			return ackerman(m-1, 1);
		} else if (m > 0 && n > 0){
			return ackerman(m-1, ackerman(m, n-1));
		} else {
			return 0;
		}
	}


}
