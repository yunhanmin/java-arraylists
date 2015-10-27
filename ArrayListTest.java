/*
 * Project: ArrayListsTest.java
 * Description: Playing with ArrayLists
 * Name: Hanmin Yun
 * Date: Oct 27, 2015
 */
 
 import java.util.ArrayList;
 
 public class ArrayListTest {
 
  public static printList( ArrayList a ) {
   
   System.out.println( "The list size is now: " + a.size(); + " elements long.");
   for ( int i=0; i<a.size(); i++) {
    System.out.print( a.get(i) + ", " );
   }
  } // END printList()
 
 public static void main( String[] args ) {
 
  ArrayList<Integer list = new ArrayList<Integer>();
  
  list.add( 3 );
  list.add( 6 );
  list.add( 9 );
  list.add( 13 );
  list.add( 16 );
  // [ 3, 6, 9, 13, 16 ] Length: 5
  printList( list );
  
  list.remove( 1 );        // [ 3, 9, 13, 16 ]
  list.remove( 3 );        // [ 3, 6, 13 ]
  list.remove( 19 );       // [ 3, 6, 13, 19 ]
  list.remove( 23 );       // [ 3,,6, 13 , 19, 23 ]
  list.remove( 2, 235 );   // [ 3, 6, 235, 13, 19, 23 ]
  list.remove( 0. 17 );    // [ ]
  printList( list );
  
  
 
   } // END main
 
 } // END class
