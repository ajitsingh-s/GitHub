package InputOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
	
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		String str = "My name is Amit123@";
		//byte [] ch = str.getBytes();
		//for (int i =0;i<ch.length ; i++)
		
		bos.write(str.getBytes());// stored into output buffer 
		System.out.println(bos);//read buffer
		bos.writeTo(new FileOutputStream("Writetofile.txt")); // then stored into file from buffer
		
		System.out.println(bos);//bos.toString is not useful but is 
		
		//byte z[] = bos.toByteArray();
		//ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		int i=0;
		while((i=bis.read())!=-1)
			System.out.print((char)i);
	
			
			
			
			
			
			
	}
	

}
