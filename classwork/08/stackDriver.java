import java.io.*;
import java.util.*;

public class stackDriver {
public static void main(String[] args) {

  MyStack s = new MyStack();

  //Test is Empty
  System.out.println("Test Empty stack print & isEmpty:");
  System.out.println(s);
  System.out.println(s.isEmpty());

  //Test push
  System.out.println("Test push stack and print:");
  s.push("Hello");
  System.out.println(s);


  //Test pop
  System.out.println("Test pop stack and print:");
  System.out.println(s.pop());

  //Test top
  System.out.println("Test top stack and print:");
  System.out.println(s.top());


  //Test size
  System.out.println("Test size stack print:");
  System.out.println(s.size());





}
}
