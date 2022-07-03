package Solution;

import java.io.FileInputStream;


public class MyFileInputStream {

	public static void main(String[] args) throws Exception {
		FileInputStream fis  =  new FileInputStream("ducat.txt");// read only one file
		int i=0;
		while ((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
		
	}

}
