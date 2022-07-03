package Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Client {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("Client.txt");
		ObjectOutputStream wr = new ObjectOutputStream(fos);
		Emp eobj = new Emp ("ajit",12,13,213,124,363,646);
		System.out.println("Create transient State");
		wr.writeObject(eobj);
		System.out.println("Persist state");
		wr.flush();
		System.out.println("Deattached state");
		
		
	}

}
