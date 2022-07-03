package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyProgramCount {

	public static void main(String[] args) throws Exception {
		FileInputStream fis  =  new FileInputStream("Client.txt");
		int i = 0,word = 0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
			if ((char)i == ' ') {
				word++;
			}
			if ((char)i == '.') {
				word++;
			}
		}
		System.out.println("\nNumbers of word : "+word+1);
		fis.close();

	}

}
