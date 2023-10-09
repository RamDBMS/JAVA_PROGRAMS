package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Collection_demo1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Java"); 
	    al.add("I"); 
	    al.add("love");
	    al.add("India"); //I love Java I love India
	    
	    HashSet hs = new HashSet();
	    
	    for(Object ob: al)
	    {
	      boolean added = hs.add(ob); //for find duplicate element
	      if(added == false)
	      {
	        System.out.println(ob);
	      }
	    }

	}

}

