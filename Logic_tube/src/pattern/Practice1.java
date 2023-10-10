
package pattern;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Practice1 obj=new Practice1();
		//obj.method1();
		//obj.method2();
		//obj.method3();
		//obj.method4();
		obj.method5();
	
	}

	private void method5() {
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
			
		
		
	}

	private void method4() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the row:");
		 int n=sc.nextInt();
		 System.out.println("start num:");
		 int t=sc.nextInt();
		 System.out.println("Ice/Dec:");
		 int t1=sc.nextInt();
		 for(int row=1;row<=n;row++) {
			 for(int col=1;col<=5;col++) {
				 System.out.print(t+" ");
				 t-=t1;
			 }
			 System.out.println();
		 }
			
		
		
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
			 for(int col=1;col<=5;col++) {
				 System.out.print(t+" ");
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
			 for(int col=1;col<=5;col++) {
				 System.out.print(t);
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
		 for(int col=1;col<=5;col++) {
			 System.out.print(t);
			 t+=t1;
		 }
		 System.out.println();
	 }
		
	}
}
