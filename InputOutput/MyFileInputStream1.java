package InputOutput;

import java.io.File;
import java.io.FileInputStream;

public class MyFileInputStream1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\AJIT SINGH SHEKHAWAT\\Desktop\\abc.txt"));
			int i = 0;
			//System.out.println(i);
			while ((i=fis.read()) != -1 )
			
				System.out.print((char)i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nfile read is done.");
		

	}

}
