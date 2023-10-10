package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args)  {
	ExceptionDemo ex=new ExceptionDemo();
    ex.method1();//handle with try catch //unchecked exception

		
	}

	private void method1() {
		try( Scanner sc=new Scanner(System.in)) { //try with resource
	   Dog dog=null; //int[] ar=null;
	   System.out.println("Enter value of a:");
	   int a=sc.nextInt();
	   System.out.println("Enter value of b:");
	   int b=sc.nextInt();
	   try {
	   System.out.println("The result is:"+a/b);
	   System.out.println(dog.dogName);
	   
	}catch(ArithmeticException ae){ 
		System.out.println("Exception occured");
	}catch(NullPointerException ae) {
		Dog dog1=new Dog();
		System.out.println("The dog name is:" +dog1.dogName);
	}finally {
		System.out.println("Exception handling");
	}
		}
  System.out.println("EXceptionDemo1");
}
}

