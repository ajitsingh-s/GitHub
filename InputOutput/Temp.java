package InputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Temp {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout = new FileOutputStream("abctemp.txt");
		PrintStream ps=new PrintStream(fout);
		//PrintStream ps = new PrintStream(new FileOutputStream("abctemp.txt"));
		//System.setOut(new PrintStream(new FileOutputStream("abctemp.txt")));
		System.setOut(ps);
		System.out.println("Hello");
		System.setErr(new PrintStream(new FileOutputStream("abctemp1.txt")));
		System.err.println("Hey");

	}

}
