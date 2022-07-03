package InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutStream2 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("NewFile65.txt");
		String str = "acha aise bhi";
		byte [] ch = str.getBytes();
		fos.write(ch); // in this write method only int/byte(ASCII) value can be passed. 
		
		System.out.println("file created sucessfully");
	}

}
