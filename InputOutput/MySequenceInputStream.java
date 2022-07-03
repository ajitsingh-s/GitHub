package InputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.SequenceInputStream;

public class MySequenceInputStream {
	public static void main(String[] args) throws Exception {
		SequenceInputStream sis = new SequenceInputStream(new FileInputStream("Client.txt"),new FileInputStream("shweta.txt"));
		DataInputStream dis = new DataInputStream(sis);
		String str= " ";
		System.out.println(dis.readLine());
		/*while (str!=null) {
			str = dis.readLine();
			if (str!=null)
			System.out.println(str);
		}*/
		dis.close();
		
	}

}
