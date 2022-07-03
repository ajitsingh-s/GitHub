package InputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class MyDataOutputStream {

	public static void main(String[] args) throws Exception {
		
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("Data.txt");
		DataOutputStream dos = new DataOutputStream(fos);// also DataOutputStream use to write by using write method in file
		//PrintStream ps = new PrintStream(fos);  //use PrintStream to write any input in file
		String str = "";
		while (!str.equals("Stop")) {
			str = dis.readLine();
			//dos.writeChars(str);
			//dos.writeUTF(str);
			dos.writeBytes("\n"+str);
			//System.out.println("Str   "+str);
			//ps.println(str);
			dos.flush();
			//ps.flush();
		}
		//dos.close();
		System.out.println("file created");
			
	}
}
