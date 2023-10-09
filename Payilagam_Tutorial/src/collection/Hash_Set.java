package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hash_Set {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // Array --> Growable Array
	    al.add(50);
	    al.add(56);
	    al.add(40);
	    al.add(100);
	    al.add(60);
	    System.out.println(al);
	    
	    
	    for(Object score: al ) {
	    	Integer sc=(Integer) score;
	    	
	    	if(sc>=50) {
	    		System.out.println(score);
	    	}
	    	}
	    		
	    	
	    
	}

}

