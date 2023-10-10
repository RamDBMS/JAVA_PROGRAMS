package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("abc txt");
			FileInputStream fl=new FileInputStream(file);
			
			}

}
