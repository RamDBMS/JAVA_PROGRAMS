package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		ArrayList marksList = new ArrayList(); 
	    Scanner sc = new Scanner(System.in);
	    

	    while(true)
	    {
	      System.out.println("Enter Mark: ");
	      String mark = sc.next(); 
	      try {
	      Integer i = Integer.parseInt(mark);
	      marksList.add(mark);
	      }
	      catch(ClassCastException | NumberFormatException cce)
	      {
	        break; 
	      }
	      
	    }
	    System.out.println(marksList);

	}

}

