
import java.io.*;
import java.util.*;

public class Loops {

  public static double power(double x, double n){
    double base = x;

  	if (n > 0) {
  		for (int i = 1; i<n; i++) {
  			x = x * base;
      }
  		return x;
  	}	else if (n == 0) {
  		return 1.0;
  	} else {
  		for (int i = 1; i<-n; i++) {
  			x = x * base;
  		}
  	}
  	 return 1/x;
  }

  public static double factorial(double x){
		if (x > 0) {
			for (double i = x-1; i>0; i--) {
				x = x * i;
			}
			return x;
		} else if (x == 0) {
			return 1.0;
		}	else {
			return 0.0;
		}
	}

  public static void main(String[] args){

  }

}
