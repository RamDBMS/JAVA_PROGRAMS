package collection;

import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Sony", 15000);
	    Mobile m2 = new Mobile("Samsung", 18000);
	    Mobile m3 = new Mobile("Apple", 12000);
	    Mobile m4 = new Mobile("Vivo", 25000);
	    
	    ArrayList mobilesList = new ArrayList(); 
	    mobilesList.add(m1);
	    mobilesList.add(m2);
	    mobilesList.add(m3);
	    mobilesList.add(m4);
	    System.out.println( mobilesList);//[Sony 15000, Samsung 18000, Apple 12000, Vivo 25000]
	    
	    for(Object ob:mobilesList){ //for each loop
	    //	System.out.println(ob);//Sony 15000//Samsung 18000//Apple 12000//Vivo 25000
            Mobile mobile=(Mobile)ob; //type casting
            if(mobile.price>15000)
            	System.out.println(ob); 
	    	
	    	
	    	
	    }

	}

}

