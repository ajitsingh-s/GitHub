package InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutStream1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("NewFile65.txt",true);
		String str = " or kaise hain aap log";
		fos.write(str.getBytes());  
		System.out.println("file created sucessfully");
	}

}
