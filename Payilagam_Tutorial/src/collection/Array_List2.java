package collection;

import java.util.ArrayList;

public class ArrayList2 {
	/*Make a collection which should allow only String objects.
	with and with out using  generic.*/

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList(); 
	    al1.add(5);
	    al1.add(10);
	    al1.add("abcd");
	    al1.add("pqrs");
	    
	    Mobile m1 = new Mobile("Samsung", 16000);
	    al1.add(m1);
	    
	    
	    ArrayList al2 = new ArrayList(); 
	    for(Object ob: al1)
	    {
	      if(ob.getClass().getSimpleName().contains("String"))
	        al2.add(ob);
	    }
	    System.out.println(al2);

	}

}

