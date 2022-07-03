package Solution;


import java.io.FileOutputStream;

public class MyFileOutputStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos  =  new FileOutputStream("ducat.txt");//write
		String str = "java programimg lanaguage";
		
		byte [] x = str.getBytes(); 
		
		for(int i =0; i<x.length; i++) {
			
			System.out.print(" "+x[i]);
			
			fos.write(x[i]);
		}
			
		
		//fos.write(str.getBytes());// only ASCII value
		
		System.out.println("\nFile created");

	}

}
