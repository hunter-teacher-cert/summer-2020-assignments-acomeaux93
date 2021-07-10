
import java.io.*;
import java.util.*;

public class Methods {

  public static boolean isDivisible(int n, int m) {
    if (n % m == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isTriangle(double a, double b, double c) {
    if ((a+b) > c) {
      return true;
    } else if ((b+c) > a) {
      return true;
    } else if ((c+a) > b) {
      return true;
    } else {
      return false;
    }
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

  public static void main(String[] args){
		System.out.println(ackerman(2,2));
	}

}
