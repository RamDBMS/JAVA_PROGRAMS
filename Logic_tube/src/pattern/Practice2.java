
package pattern;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Practice2 obj=new Practice2();
		//obj.method1();
		//obj.method2();
		//obj.method3();
		//obj.method4();
		//obj.method5();
		//obj.method6();
		//obj.method7();
		obj.method8();

	}

	private void method8() {
		 for(int row=1;row<=5;row++) {
			 int num = row%2==0?0:1;
			 System.out.print(num);
			 for(int col=1;col<=5;col++) {
				 num=num==0?1:0;
				 System.out.print(num);
			 }
			 System.out.println();
		 }
			
		
	}

	private void method7() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the row:");
		 int n=sc.nextInt();
		 System.out.println("start num:");
		 int t=sc.nextInt();
		 System.out.println("Ice/Dec:");
		 int t1=sc.nextInt();
		 for(int row=n;row>=1;row--) {
			 for(int col=1;col<=row;col++) {
				 System.out.print(t+" ");
				 t+=t1;
			 }
			 System.out.println();
		 }	
	}

	private void method6() {
		for(int row=1;row<=5;row++) {
			 for(int col=1;col<=row;col++) {
				 if(col%2==0) {
				System.out.print("0");
				 }else
				 System.out.print("1");
			 }
			 System.out.println();
		 }
		
	}

	private void method5() {
		for(int row=1;row<=6;row++) {
			 for(int col=row;col>=1;col--) {
				 System.out.print(col+" ");
			 }
			 System.out.println();
		 }
		
	}

	private void method4() {
		
		 for(int row=8;row>=3;row--) {
			 for(int col=8;col>=row;col--) {
				 System.out.print(col+" ");
			 }
			 System.out.println();
		 }
	}

	private void method3() {
	
		 for(int row=10;row<=14;row++) {
			 for(int col=row;col<=14;col++) {
				 System.out.print(col+" ");
			 }
			 System.out.println();
		 }
			
		
		
		
	}

	private void method2() {
		
		 for(int row=5;row>=1;row--) {
			 for(int col=1;col<=row;col++) {
				 System.out.print(col*10+" ");
				
			 }
			 System.out.println();
		 }	
		
	}

	private void method1() {
		Scanner sc=new Scanner(System.in);
		/* System.out.println("enter the row:");
		 int n=sc.nextInt();
		 System.out.println("start num:");
		 int t=sc.nextInt();
		 System.out.println("Ice/Dec:");
		 int t1=sc.nextInt();*/
		 for(int row=5;row>=1;row--) {
			 for(int col=1;col<=row;col++) {
				 System.out.print(col+" ");
			 }
			 System.out.println();
		 }
			
		
		
		
	}

}
