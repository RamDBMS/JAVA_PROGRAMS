package pattern;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Practice obj=new Practice();
		//obj.method();
		/*obj.method1();
		System.out.println();
		obj.method2();
		System.out.println();
		obj.method3();
		System.out.println();
		obj.method4();
		System.out.println();*/
		//obj.method5();
		//System.out.println();
		obj.method6();
		

	}

	private void method6() {
		int n=9;
		int x=1;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if((col<=x)!=false || col>=n-x+1) {
					System.out.print("*");
				} else  {
					System.out.print(" ");
				}
			}if(row<=n/2)
				x++;
			else
				x--;
			System.out.println();
			}
			
		
	}

	private void method5() {
		for(int row=1;row<=9;row++) {
			for(int col=1;col<=row;col++) {
				if(row<=5) {
					System.out.print("*");
				} else if(col<=10-row) {
					System.out.print("*");
				}
			}System.out.println();
			}
			
	}

	private void method4() {
		int n=5;
		for(int row=5;row>=1;row--) {
			for(int space=n-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(" *");	
			}
			System.out.println();
		}
		
		
	}

	private void method3() {
		for(int row=5;row>=1;row--) {
			for(int space=1;space<=row-1;space++) {
				System.out.print(" ");
			}
			for(int col=row;col<=5;col++) {
				System.out.print(" *");	
			}
			System.out.println();
		}
		
	}

	private void method2() {
		int n=5;
		for(int row=5;row>=1;row--) {
			for(int space=n-1;space>=row;space--) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		
	}

	private void method1() {
		for(int row=5;row>=1;row--) {
			for(int space=1;space<=row-1;space++) {
				System.out.print(" ");
			}
			for(int col=row;col<=5;col++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
	}

	private void method() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the n value:");
	   int n=sc.nextInt();
	   System.out.println("enter the k value:");
	   int k=sc.nextInt();
	   System.out.println("enter the k1 value:");
	   int k1=sc.nextInt();
	   for(int row=n;row>=1;row--) {
		   for(int space=n-1;space>=row;space--) {
			   System.out.print("  ");
		   }
		   for(int col=1;col<=row;col++) {
			   System.out.print(k+" ");
		 
	  }
		   k+=k1;
		   System.out.println();
	   }   
		
	}           
}



