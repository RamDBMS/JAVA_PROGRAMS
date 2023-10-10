package pattern;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Practice3 obj=new Practice3();
       // obj.method1();
        //obj.method2();
        //obj.method3();
		//obj.method4();
		//obj.method5();
	}

	private void method5() {
		int n=8;
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print("1");
			}for(int col=1;col<=row;col++) {
				System.out.print(row);
			}
			//n-=1;
			System.out.println();
		}
		
	}

	private void method4() {
		
		 for(int row=1;row<=7;row++) {
			 for(int space=1;space<row;space++) {
				 System.out.print(" ");
			 }
			 for(int col=row;col<=7;col++) {
				 System.out.print(col);
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
			 for(int space=1;space<row;space++) {
				 System.out.print(" ");
			 }
			 for(int col=0;col<=n-row;col++) {
				 System.out.print(t+" ");
				
			 }
			 t-=t1;
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
		 for(int row=5;row>=1;row--) {
			 for(int space=1;space<=n-row;space++) {
				 System.out.print(" ");
			 }
			 for(int col=1;col<=row;col++) {
				 System.out.print(t+" ");
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
			 for(int space=1;space<=n-row;space++) {
				 System.out.print(" ");
			 }
			 for(int col=1;col<=row;col++) {
				 System.out.print(t);
				 t+=t1;
			 }
			 System.out.println();
		 }
			
		
		
		
	}

}

