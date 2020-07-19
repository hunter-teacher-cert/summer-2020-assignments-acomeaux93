import java.util.*;
import java.io.*;

public class StackFun {

	public static String reverse(String s) {
		return stringIt(stringify(s), " ");
	}

	private static Stack<String> stringify(String s) {
		Stack<String> temp = new Stack<String>();
		String word = "";

		for (int i=0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ') {
				word += c;
			} else {
				temp.push(word);
				word = "";
			}
		}
		temp.push(word);
		return temp;
	}

	private static String stringIt(Stack<String> ls, String use) {
		String result;

		if (ls.empty()) {
			result = "";
		} else {
			result = ls.pop();
		}

		while (!ls.empty()) {
			result += use + ls.pop();
		}

		return result;
	}

	public static boolean palindrome(String s) {

		return stringIt(stringify(s), " ").equals(
				stringIt(stringify(reverse(s)), " ") );
	}

	public static String reverseIt(String s) {
		return stringIt(stringLetters(s), "");
	}

	public static boolean isPalindrome(String s) {
		return s.equals(reverseIt(s));
	}

	private static boolean opps(char s1, char s2) {
		return (s1=='(' && s2==')')
			|| (s1=='[' && s2==']')
			|| (s1=='{' && s2=='}');
	}


	private static boolean isClosing(char c) {
		return c==')' || c==']' || c=='}';
	}

	private static boolean isOpening(char c) {
		return c=='(' || c=='[' || c=='{';
	}


	public static boolean parenCheck(String s) {

		Stack<Character> temp = new Stack<Character>();
		char c1, c2;

		for(int i=0; i < s.length(); i++) {
			c1 = s.charAt(i);

			if (isOpening(c)) {
				temp.push(c);
			} else if (isClosing(c)) {
				try {
					c2 = temp.pop();
				}
				if (!opps(c2, c1)) {
					return false;
				}
			}
		}

		return temp.empty();
	}

	private static Stack<String> stringLetters(String s) {
		Stack<String> ls = new Stack<String>();

		for (int i=0; i < s.length(); i++) {
			ls.push( "" + s.charAt(i) );
		}

		return ls;
	}
}
