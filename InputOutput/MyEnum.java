package InputOutput;


import java.io.*;
import java.util.Enumeration;

public class MyEnum implements Enumeration{
	
	InputStream in[];
	int i =0;
	
	public MyEnum() {
			
		try {
			in = new InputStream[] {new FileInputStream("Client.txt"),new FileInputStream("shweta.txt"), new FileInputStream("abc1.txt"),new FileInputStream("abc2.txt")
			};
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean hasMoreElements() {
		if (i<in.length)
			return true;
		else
			return false;
	}

	@Override
	public Object nextElement() {
		return in[i++];
	}

	
	public static void main(String[] args) throws Exception {
		SequenceInputStream sin=new SequenceInputStream(new MyEnum());//in SequenceInputStream class constructor passes the instance of implemented Enumeration class. 
		DataInputStream din=new DataInputStream(sin);
		String str = din.readLine();
		System.out.println(str);
		din.close();
		
		
		
	}

}

	
	