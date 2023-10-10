package learn_array;

import java.util.Scanner;

public class Array_Learning {

	public static void main(String[] args) {
		Array_Learning obj=new Array_Learning();
		//obj.array1();
		obj.array_Odd();
		//obj.array_reverse();
		//obj.array_even();
		//obj.array_add();
		//obj.array_smallest();
		//obj.array();
		//obj.array_1();
		//obj.array_2();
		//obj.array_3();
		//obj.array_4();
		//obj.array_5();
		//obj.array_6();
	}
	public void array1() {
		int[] marks= {90,99,100,98,100};
		for(int i=0;i<marks.length;i++) { //use to calculate the length of digits
			if(marks[i]>=0) 
		System.out.println(marks[i]);
		}
		
	}
	public void array_Odd() {
		int[] marks= {90,99,100,98,100};
		for(int i=0;i<marks.length;i++) { //use to calculate the length of digits
			if(marks[i]%2!=0)             //used to find odd number
		System.out.println(marks[i]);
		
		
		}
	}
	public void array_reverse() {
		int[] marks= {90,99,100,98,100};
		for(int i=4;i>=0;i--) { //use to calculate the length of digits
			if(marks[i]>=0) 
		System.out.println(marks[i]);
		
		
		}
	}
	public void array_even() {
		int[] marks= {90,98,97,88,100};
		for(int i=0;i<marks.length;i++) { 
			if(i%2==0)
		System.out.println(marks[i]);
		}
	}
	public void array_add() {
		int[] marks= {90,98,97,88,100};
		int total=0;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
		}
		System.out.println("The total is:"+total);
		System.out.println("The percentage is:"+total/marks.length);
	}
   public void array_smallest() {
	   int small=Integer.MAX_VALUE;
	   int[] ar= {40,60,20,122,34,50};
	   for(int i=0;i<ar.length;i++) {
		   if(small>ar[i]) {
			   small=ar[i];
		   }
		 
	   }
	   System.out.println(small);	   
   }
   public void array() {
	   
	   Scanner sc=new Scanner(System.in);
	   //System.out.println("enter the subject count:");
	   //int no_of_subject=sc.nextInt():
	   //int[] ar=new int(no_of_subject);
	   
	   int[] ar=new int[5];
	   
	   for(int i=0;i<ar.length;i++) {
		   System.out.println("enter the marks:");
		   ar[i]=sc.nextInt();
	   }
	   System.out.println("enter the marks:");
   }


	public void array_1() 
	{ 
		Scanner sc=new Scanner(System.in); 
		String[] str=new String[5];
  
  for(int i=0;i<str.length;i++) 
  { 
	  System.out.println("enter the name:");
  str[i]=sc.next(); 
  } 
  }
	public void array_2() 
	{ 
		Scanner sc=new Scanner(System.in); 
		short[] sht=new short[5];
  
  for(int i=0;i<sht.length;i++) 
  { 
	  System.out.println("enter the marks:");
      sht[i]=sc.nextShort(); 
  } 
  }
	public void array_3() 
	{ 
		Scanner sc=new Scanner(System.in); 
		byte[] sht=new byte[5];
  
  for(int i=0;i<sht.length;i++) 
  { 
	  System.out.println("enter the marks:");
      sht[i]=sc.nextByte(); 
  } 
  }
	public void array_4() {
		Scanner sc=new Scanner(System.in);
		long[] lng=new long[3];
		for(int i=0;i<lng.length;i++) {
			System.out.println("enter the marks:");
	        lng[i]=sc.nextLong();		
		}
	}
	public void array_5() {
		Scanner sc=new Scanner(System.in);
		double[] lng=new double[3];
		for(int i=0;i<lng.length;i++) {
			System.out.println("enter the marks:");
	        lng[i]=sc.nextDouble();		
		}
	}
	public void array_6() {
		Scanner sc=new Scanner(System.in);
		float[] flt=new float[3];
		for(int i=0;i<flt.length;i++) {
			System.out.println("enter the marks:");
	        flt[i]=sc.nextFloat();		
		}
	}
	}






