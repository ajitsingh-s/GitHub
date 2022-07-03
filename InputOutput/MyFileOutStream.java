package InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutStream {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("NewFile65.txt");
		String str = "My name is Ajit";
		//byte [] ch = str.getBytes();
		/*System.out.println();
		for(int i = 0; i<ch.length ;i++) {
			System.out.println(ch[i]);*/
			fos.write(65); // in this write method only int/byte(ASCII) value can be passed. 
		//}
		System.out.println("file created sucessfully");
	}

}
