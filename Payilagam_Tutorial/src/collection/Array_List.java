package collection;

import java.util.HashSet;

public class Array_List {

	public static void main(String[] args) {
		HashSet al = new HashSet(); // Array --> Growable Array
	    al.add("hi");
	    al.add(5);
	    al.add(true);
	    al.add(10.4f);
	    al.add('c');
	    System.out.println(al);
	    
	   // al.add(2, "Kalai");
	   // al.add(2, "Kalai");
	    System.out.println(al);
	    
	    HashSet al2 = new HashSet(); 
	    al2.add(100);
	    al2.add(200); 
	    al2.add(300);
	    al2.addAll(al);
	   // al2.addAll(2,al);
	    System.out.println(al2);
	    
	    System.out.println(al2.size());
	    
	    System.out.println(al2.contains("Harish"));
	    
	    System.out.println(al2.containsAll(al));
	    
	    //System.out.println(al2.get(5)); 
	    
	    //System.out.println(al2.indexOf("Kalai"));
	    
	   // List ll  = al2.subList(3, 7);
	   // System.out.println(ll);
	    al2.remove("Kalai");
	    System.out.println(al2);

	}

}

