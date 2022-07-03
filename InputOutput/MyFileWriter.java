package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;

public class MyFileWriter {

	public static void main(String[] args) throws Exception{
		FileWriter fw = new FileWriter("writefile.txt");
		String str = "File writer is write directly";
		fw.write(str.toCharArray());
		fw.close();
		System.out.println(" file created");
		
	}

}

class MyFileReader {
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("writefile.txt");
		int i =0 ;
		while ((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
	
	
	
}
