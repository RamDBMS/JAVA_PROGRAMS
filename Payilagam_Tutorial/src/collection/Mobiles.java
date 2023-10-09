package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Mobiles {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Sony", 20);
	    Mobile m2 = new Mobile("Apple", 25);
	    Mobile m3 = new Mobile("Samsung", 28);
	    Mobile m4 = new Mobile("Vivo", 12);
	    
	    ArrayList<Mobile> mobilesList = new ArrayList<Mobile>(); 
	    mobilesList.add(m1);
	    mobilesList.add(m2);
	    mobilesList.add(m3);
	    mobilesList.add(m4);
	    System.out.println(mobilesList);
	    
	    Collections.sort(mobilesList);

	}

}

