package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Server {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Client.txt");
		ObjectInputStream rd = new ObjectInputStream(fis);
		Emp eobj = (Emp)rd.readObject();
		System.out.println("instanec  :"+eobj.a);
		System.out.println("Static  :"+eobj.b);
		System.out.println("transient  :"+eobj.c);
		System.out.println("Voletile  :"+eobj.x);
		System.out.println("instanec  :"+eobj.y);
		System.out.println("Instance base class  :"+eobj.z);
		
		
	}
}