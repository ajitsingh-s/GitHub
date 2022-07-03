package InputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Pw {

	public static void main(String[] args) throws Exception {
	PrintWriter pw = new PrintWriter(new FileWriter("pwwriter.txt")); 
	pw.println("hello");
	pw.println("hey");
	pw.close();
	System.out.println("Created");
	}

}
