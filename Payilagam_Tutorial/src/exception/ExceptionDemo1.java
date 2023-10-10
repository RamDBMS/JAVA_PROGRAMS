package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("abc txt"); //checked exception
		
		FileInputStream fs=new FileInputStream(file);
	
		System.out.println("exception");	
		

	}

}

