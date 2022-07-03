package InputOutput;

import java.io.FileInputStream;

public class MyFileInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
			int i = 0;
			//System.out.println(i);
			while ((i=fis.read()) != -1 )
			
				System.out.println(i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nfile read is done.");
		

	}

}
