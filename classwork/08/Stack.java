import java.io.*;
import java.util.*;

// Stack class utilizing a LinkedList
public class MyStack{

  // using java built in LinkedList for data structure
  private LinkedList<String> stack;

  public MyStack(){
    stack = new LinkedList<String>();
  }

  public void push(String data){
    stack.addFirst(data);
  }

  public String pop(){
    // add code to remove and return the
    // item on the top of the stack
    String pop = stack.removeFirst();
    return pop;
  }

  public String top(){
    // add code to return but not remove the
    // item on the top of the stack
    return stack.get(0);
  }

  public boolean isEmpty(){
    // return true if the stack has no data, false otherwise
    return stack.isEmpty();
  }

  public int size(){
    // add code to return the number of items currently on the stack
    return stack.size();
  }

}
