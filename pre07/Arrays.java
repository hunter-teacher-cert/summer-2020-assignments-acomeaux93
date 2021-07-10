import java.io.*;
import java.util.*;

public class Arrays {

  //Q1
  public static double[] powArray(double[] a, double raise) {
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) {
        b[i] = Math.pow(a[i], raise);
    }
    return b;
  }

  public static int[] histogram (int[] scores, int upperLimit) {
		int[] tally = new int[upperLimit];
		for (int score : scores) {
			tally[score]++;
		}
		return tally;
	}

  //Q4
  public static int getMax (int[] sample) {
		int max = sample[0];
		int index = 0;
		for (int i = 1; i < sample.length; i++) {
			if (sample[i] > max) {
				max = sample[i];
				index = i;
			}
		}
		return index;
	}

  //Q5, not using the Sieve method
  public static boolean[] isPrime (int n) {
		boolean[] primes = new boolean[n];
		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i < n; i++) {
			primes[i] = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primes[i] = false;
				}
			}
		}
		return primes;
	}

  public static void main(String[] args){

  }

}
