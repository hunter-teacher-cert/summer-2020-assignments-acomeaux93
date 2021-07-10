/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Boogle
   A tester class for code analysis and search exploration.
   USAGE:
   Read through at least once.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   Insert comment preceding each method to summarize functionality.
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Boogle_skel
{

  //return index of first occurence of target, or -1 if not found
  public static int linSearch( ArrayList al, int target )
  {
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end linSearch()








  //return index of target, or -1 if not found
  public static int binSearch( ArrayList al, int target )
  {
    // <INSERT YOUR MACHINERY HERE>...
    return -1; //placeholder to get past compiler
  }//end binSearch()



  // subgoal: recognize target found (and take what action?)
  // subgoal: recognize search space exhausted (and take what action?)
  // subgoal: recognize target in lower portion of range (and do what?)
  // subgoal: recognize target in upper portion of range (and do what?)

  //nota bene: A helper method could be very useful.
  // Q: Why?
  // Q: What would the parameters be for such a method?



  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()


  //return ArrayList of random ints, sorted in ascending order
  public static ArrayList prestoSortedArrayListo(int numItems,
                                                 int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    if ( numItems<1 )
      return retArr;

    //populate index 0
    retArr.add( (int)(lo * Math.random()) );

    //populate rest of indices, each one greater than last
    for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
      //System.out.println(retArr.get(i-1));
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    }

    return retArr;
  }//end prestoSortedArrayListo()

  //##################################################
  //##################################################

    // find and return the index of the smallest value in the
    // ArrayList al from index lo to index hi inclusive
  public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
	// assume the first item is the smallest - call it our smallest so far
  if(lo<0 || lo>hi || hi>=al.size()){
    return -1;
  }

  int smallest = (int)al.get(lo);
  int small_index = lo;

  for (int i=lo+1; i<=hi; i++) {
    int temp = (int)al.get(i);
    if(temp < smallest) {
      smallest = temp;
      small_index = i;
    }
  }
	// loop over all the items
	//   if the current item is smaller than the smalleest so far,
	//      then the current item becomes the new smallest so far
  // change this to return the correct answer
	return small_index;
    }


  //##################################################
  //##################################################


  public static void main( String[] args )
  {



      int smallIndex;
      System.out.println("Testing findSmallest");
      ArrayList<Integer>  slist = prestoArrayListo(20,0,200);
      smallIndex = findSmallest(slist,24,slist.size()-1);

      System.out.println(slist);
      System.out.printf("Smallest is at slist[%d] and is %d\n",smallIndex,slist.get(smallIndex));
      /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/

      /**
       ~~~ The RSPB Special Trace-athon ~~~
       YOUR MISSION:
       Form a Dynamic Duo of Destiny or a Trio of Triump. Conjure team name portending greatness (TNPG).
       Copypasta this into main method of your java sourcecode file containing methods linSearch and binSearch
         (Boogle.java for almost all of you)
       Verify it works.
          (If any test calls do not yield expected outputs, there is some tuning to be done...
           Probably best to just grab a working version for now.)
       On KtS, with at least 1 tracing buddy, trace out each binSearch() call.
       NOTA BENE: The second batch of test calls are identical to the first,
                  except that the search space has grown by 1 element...
     **/

    ArrayList salamander = new ArrayList();

    //explicitly fill arraylist with intent to search for
    // present and nonpresent values...
    // generate an arraylist with an odd num of elems...
    salamander.add(4);
    salamander.add(8);
    salamander.add(15);
    salamander.add(16);
    salamander.add(23);
    System.out.println(salamander);

    //search for target in the list
    System.out.println(binSearch(salamander, 8));  // 1
    System.out.println(binSearch(salamander, 15)); // 2
    System.out.println(binSearch(salamander, 16)); // 3

    //search for target not in the list
    System.out.println(binSearch(salamander, 3)); // -1
    System.out.println(binSearch(salamander, 9)); // -1

    //add another element, for an even num of elems
    salamander.add(42);
    System.out.println(salamander);
    //search for target in the list
    System.out.println(binSearch(salamander, 8));  // 1
    System.out.println(binSearch(salamander, 15)); // 2
    System.out.println(binSearch(salamander, 16)); // 3

    //search for target not in the list
    System.out.println(binSearch(salamander, 3)); // -1
    System.out.println(binSearch(salamander, 9)); // -1

}//end main

}//end class
