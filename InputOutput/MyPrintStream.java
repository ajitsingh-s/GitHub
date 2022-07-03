package InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MyPrintStream
{
	public static void main(String s[])throws IOException
	{
		FileOutputStream fout=new FileOutputStream("ps.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println("ajit");
	}
}