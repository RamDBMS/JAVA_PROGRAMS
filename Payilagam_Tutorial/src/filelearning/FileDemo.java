package filelearning;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args){
		//FOLDER AND SUB FOLDER CREATION
		/*File file=new File("/home/sneka/Desktop/sne/poon/sne2");
        boolean present=file.exists();
        System.out.println(present);
        if(present==false) {
        	file.mkdir();
        }
		//..............................................................................
		//FILE CREATION INSIDE THE FOLDER
		/*File file=new File("/home/sneka/Desktop/poon/sne2/test.txt");
		boolean present=file.exists();
		if(present==false) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		//...............................................................................
		//FILE DELETION
		/*File file=new File("/home/sneka/Desktop/poon/sne2/test.txt");
		file.delete();*/
		//...............................................................................
	    //RENAME FILE
		/*File file=new File("/home/sneka/Desktop/poon/sne2/test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file1=new File("/home/sneka/Desktop/poon/sne2/method.txt");
		boolean present=file.renameTo(file1);*/
		//..................................................................................
		//LIST OF FOLDER
		/*File file=new File("/home/sneka/Desktop/");
		String[] list=file.list();
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}*/
		//..................................................................................
		//LIST OF FILES
	    /*	File file=new File("/home/sneka/Desktop/");
		File[] filefolder=file.listFiles();
		for(File f:filefolder) {
			if(f.isFile()) {
			System.out.println(f);
			}
		}*/
		//...................................................................................
		//LIST OF FOLDER
		/*File file=new File("/home/sneka/Desktop/");
		File[] filefolder=file.listFiles();
		for(File f:filefolder) {
			if(f.isDirectory()) {
			System.out.println(f);
			}
		}*/
		//..................................................................................
		//LIST OF .TXT FILE
		/*File file=new File("/home/sneka/Desktop/poon");
		File[] filefolder=file.listFiles();
		for(File f:filefolder) {
			if(f.isFile()) {
			String name=f.getName();
			int lastdot=name.lastIndexOf(".");
			String extension=name.substring(lastdot+1);
			if(extension.equals("txt"))
			System.out.println(name);
			
		}
		}*/
		//...................................................................................
		//WRITE A FILE
		/*File file=new File("/home/sneka/Desktop/poon/abc.txt");
		try {
			file.createNewFile();
			FileWriter writer=new FileWriter(file,true);
			String name="ram";
			writer.write(name);
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
       //....................................................................................
		//READ A FILE
		//File file=new File("/home/sneka/Desktop/poon/abc.txt");
		/*try {
			File file=new File("/home/sneka/Desktop/poon/abc.txt");
			FileReader fir=new FileReader(file);
			int data=fir.read();
			while(data!=-1) {
			System.out.println((char)data);
			data=fir.read();
			}
			fir.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//....................................................................................
		//FILEOUTPUTSTREAM(CONVERT STRING TO BYTE)
		/*try {
			FileOutputStream fos=new FileOutputStream("/home/sneka/Desktop/poon/abc.txt");
			String data="hello java world \n Welcome world";
			byte[] arr=data.getBytes();
		    fos.write(arr);
		    fos.flush();
		    fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//...................................................................................
		//FILEINPUTSTREAM(READ BYTE DATA)
		/*try {
			FileInputStream fos=new FileInputStream("/home/sneka/Desktop/poon/abc.txt");
			String data="hello java world \n Welcome world";
			byte[] arr=data.getBytes();
		    System.out.print(fos.read(arr));
		
		    fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//....................................................................................
		//BUFFEREDReader
		/*try {
			FileReader fr=new FileReader("/home/sneka/Desktop/poon/abc.txt");
			BufferedReader reader=new BufferedReader(fr);
			String st=reader.readLine();
			while(st!=null) {
			System.out.println(st);
			st=reader.readLine();
			}
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//....................................................................................
		//BUFFEREDWRITER
		try {
			FileWriter fr=new FileWriter("/home/sneka/Desktop/poon/abc.txt");
			BufferedWriter writer=new BufferedWriter(fr);
			String str="welcome sneka";
			writer.write(str);
			writer.flush();
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

