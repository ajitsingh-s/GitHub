package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyFileCopy {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Client.txt");
		FileOutputStream fos = new FileOutputStream("Clientdoc.doc");
		int i=0;
		while((i=fis.read())!=-1) {
			fos.write(i);
		}
		System.out.println("FILE IS COPIED INTO DOC FORMAT!");
		
	}

}
