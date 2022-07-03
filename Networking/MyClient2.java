package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient2 {
	public MyClient2() throws Exception, IOException {
		Socket s = new Socket("localhost",1213);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		do{
			str = br.readLine();
			dos.writeUTF(str);
			String str1 = (String)dis.readUTF();
			System.out.println("Server: "+str1);
		
		
		}while(!str.equals("stop"));
		
		
	}
	public static void main(String[] args) throws IOException, Exception {
		new MyClient2();
	}
	
}
