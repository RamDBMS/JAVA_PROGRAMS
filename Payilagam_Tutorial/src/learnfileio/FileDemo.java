package learnfileio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		File note=new File("/home/sneka/Videos/sneka.txt");
		
		note.createNewFile();
		System.out.println(note.canRead());
		System.out.println(note.canWrite());
		System.out.println(note.getName());
		System.out.println(note.isFile());
		
		System.out.println(note.isDirectory());
		//System.out.println(note.delete());
		FileWriter pen=new FileWriter(note);
		BufferedWriter bw=new BufferedWriter(pen);
	   /*	pen.write('b');
		pen.write('c');
		pen.flush();
		pen.close();*/
		bw.write("sneka ");
		bw.write("sri");
		bw.flush();
		bw.close();
		
		FileReader reader=new FileReader(note);
		/*int ch=reader.read();
		while(ch!=-1) {
			System.out.println((char)ch);
			ch=reader.read();
		}*/
		BufferedReader br=new BufferedReader(reader);
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
        
	}

}

