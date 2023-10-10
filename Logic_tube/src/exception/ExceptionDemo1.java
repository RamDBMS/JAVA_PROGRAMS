package exception;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	 ExceptionDemo1 obj=new ExceptionDemo1();
	 obj.method();

	}

	private void method() {
	 try(Scanner sc=new Scanner(System.in)){
		 System.out.println("enter value of a:");
		 int a=sc.nextInt();
		 System.out.println("enter value of b:");
		 int b=sc.nextInt();
		 try {
		 System.out.println(a/b);
		 Dog dog=null;
		 System.out.println(dog.dogName);
	 }
	     catch(ArithmeticException ae) {
		 System.out.println("enter correct value:");
		 int c=sc.nextInt();
		 System.out.println(a/c);
		 }catch(NullPointerException ae) {
		 Dog dog1=new Dog();
			System.out.println(dog1.dogName);
		 }
		 catch(Exception e) {
				 System.out.println("error");
			 }
	
	}
	}

}

