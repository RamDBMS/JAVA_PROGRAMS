package exception;

import java.util.Scanner;

public class Exceptionhandling_Demo {

	public static void main(String[] args) {
		Exceptionhandling_Demo obj=new Exceptionhandling_Demo ();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no1:");
        int no1=sc.nextInt();
        System.out.println("enter the no2:");
        int no2=sc.nextInt();
        
        obj.add(no1,no2);
	}

	private void add(int no1, int no2) {
		try {
		System.out.println("The result is:"+(no1+no2));
		
		int[] ar=new int[no1];
		System.out.println("length:"+ar.length);
		}catch(NegativeArraySizeException nas) {
			System.out.println("check no1");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no1:");
	        int no3=sc.nextInt();
	        int[] ar=new int[no3];
	        System.out.println("length:"+ar.length);	
		}catch(ArithmeticException ae) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no4:");
	        int no4=sc.nextInt();
	        System.out.println("enter the no:");
	        int no5=sc.nextInt();
			System.out.println("The result is:"+(no4/no5));
			System.out.println("check no2");
			System.out.println("enter no2:");
			System.out.println("The result is:"+(no4/no5));
			//int[] ar=new int[no1];
			//System.out.println("length:"+ar.length);
			//ar[ar.length]=65;
		}
		
		
	}

}

