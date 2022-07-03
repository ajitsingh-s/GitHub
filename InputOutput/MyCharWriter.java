package InputOutput;

import java.io.CharArrayWriter;
import java.io.FileWriter;


public class MyCharWriter  {

	public static void main(String[] args) throws Exception {
		CharArrayWriter fw = new CharArrayWriter();
		String str = "CharArrayWriter creates a file";
		char [] ch = str.toCharArray();
		for(int i = 0; i<ch.length; i++)
		fw.write(ch[i]);
		fw.writeTo(new FileWriter("chararywrt123.txt"));
		fw.flush();
		fw.close();
		System.out.println("Created");
		

	}

}
