package collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("sneka");// return datatype boolean
		al.add("balu");
		al.add(10);
		al.add(true);
		System.out.println(al);
		al.add("Ram");
		System.out.println(al);
		System.out.println(al.contains("sri")); //return datatype boolean
		System.out.println(al.contains("sneka"));
		System.out.println(al.get(0)); // retrun datatype element
		System.out.println(al.indexOf("Ram")); 
		al.add("sneka");
		System.out.println(al);
		System.out.println(al.indexOf("sneka"));
		System.out.println(al.lastIndexOf("sneka")); //return datatype integer
		
		System.out.println(al.isEmpty()); //return type boolean	
		System.out.println(al.remove(2));
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		al2.add("bala");
		al2.add("dharshu");
		System.out.println("al2 contain:"+al2);
		System.out.println(al2.containsAll(al));
		
		al2.retainAll(al);
		System.out.println(al);
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		
		al.set(1, 2.2);
		System.out.println(al);
		
		System.out.println(al.size());
		//method 1 using array
		System.out.println();
		Object[] ar=al.toArray();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		//method 2 //using for each
		System.out.println();
		for(Object obj:ar) {
			System.out.println(obj);
		}
		
		
		
		}

}

