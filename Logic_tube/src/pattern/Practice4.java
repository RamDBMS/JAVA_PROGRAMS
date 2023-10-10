package pattern;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 obj=new Practice4();
		//obj.method();
		//obj.method1();
		//obj.method2();
		//obj.method3();
		obj.method4();
		

	}

	private void method4() {
		
		
	}

	private void method3() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the row:");
		 int n=sc.nextInt();
		 System.out.println("start num:");
		 int t=sc.nextInt();
		 System.out.println("Ice/Dec:");
		 int t1=sc.nextInt();
		 
		 for(int row=1;row<=n;row++) { 
			 for(int space=1;space<=n-row;space++) {
				 System.out.print(" ");
			 }
			 for(int col=1;col<=row;col++) {
				 System.out.print("*"+" ");
				 t+=t1;
			 }
			 System.out.println();
		 }
			for(int row=1;row<=n-1;row++) {
				 for(int space=1;space<=row;space++) {
					 System.out.print(" ");
				 }
				 for(int col=1;col<=n-row;col++) {
				 System.out.print("*"+" ");
				 t+=t1;
			 }
				 System.out.println();
		 }
			
		 
			
		
	}

	private void method2() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the row:");
		 int n=sc.nextInt();
		 System.out.println("start num:");
		 int t=sc.nextInt();
		 System.out.println("Ice/Dec:");
		 int t1=sc.nextInt();
		 
		 for(int row=1;row<=n;row++) { 
			 for(int col=1;col<=row;col++) {
				 System.out.print(row+" ");
				 t+=t1;
			 }
			 System.out.println();
		 }
			 for(int row=n+1;row<=7;row++) {
				 for(int col=row;col<=7;col++) {
				 System.out.print(row+" ");
				 t+=t1;
			 }
				 System.out.println();
		 }
		
	}

	private void method1() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the row:");
		 int n=sc.nextInt();
		 System.out.println("start num:");
		 int t=sc.nextInt();
		 System.out.println("Ice/Dec:");
		 int t1=sc.nextInt();
		 
		 for(int row=1;row<=n;row++) { 
			 for(int col=1;col<=row;col++) {
				 System.out.print(row+" ");
				 t+=t1;
			 }
			 System.out.println();
		 }
			 for(int row=n+1;row<=7;row++) {
				 for(int col=row;col<=7;col++) {
				 System.out.print(row+" ");
				 t+=t1;
			 }
				 System.out.println();
		 }
			
		 
			
		
		
	}

	private void method() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the row:");
		 int n=sc.nextInt();
		 System.out.println("start num:");
		 int t=sc.nextInt();
		 System.out.println("Ice/Dec:");
		 int t1=sc.nextInt();
		 
		 for(int row=1;row<=n;row++) { 
			 for(int col=1;col<=row;col++) {
				 System.out.print(t+" ");
				 t+=t1;
			 }
			 System.out.println();
		 }
			 for(int row=n-1;row>=1;row--) {
				 for(int col=row;col>=1;col--) {
				 System.out.print(t+" ");
				 t+=t1;
			 }
				 System.out.println();
		 }
			
		 }
			
		
		
	}

