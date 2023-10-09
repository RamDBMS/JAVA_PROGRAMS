package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionDemo2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap(); 
	    ArrayList<Mobile> al = new ArrayList<Mobile>(); 
	   // LinkedHashSet<Mobile> al = new LinkedHashSet<Mobile>(); 
	    Mobile m1 = new Mobile("Sony", 12);
	    al.add(m1);
	    hm.put(al, 45);
	    hm.put("dhoni", 55);
	    hm.put("rohit", 85);
	    hm.put("dhawan", 50);
	    hm.put("kapil", 100);
	    hm.put("rohit", 87);
	    hm.put("rohit", 91);
	    hm.put("raina", 91);
	    System.out.println(hm.keySet());
	    System.out.println(hm.values());
	    
	    System.out.println(hm);
	    int score = 0;
	    String name = ""; 
	    int big = 0; 
	  Set s  = hm.entrySet();
	  for(Object ob: s)
	  {
	    Entry entry = (Entry) ob; 
	    score = (Integer) entry.getValue();
	    if(score>big)
	    {
	      big = score; 
	      name = (String)entry.getKey(); 
	    }
	  
	  }
	  System.out.println(name + " scored highest " + big);

	}

}

