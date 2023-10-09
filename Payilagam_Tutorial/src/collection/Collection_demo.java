package collection;

import java.util.ArrayList;

public class Collection_demo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
	    al.add("I"); 
	    al.add("love");
	    al.add("Java"); 
	    for(int i=0; i<al.size(); i++)
	    {
	    //Object ob = al.get(i); //I love Java
	    if(al.get(i).equals("Java"))
	        {
	        al.set(i, "Python"); 
	        }
	    }
	    System.out.println(al);


	}

}

