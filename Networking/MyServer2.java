package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer2 {
	
	public MyServer2() throws Exception {
		ServerSocket ss = new ServerSocket(1213);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos  = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		while(!str.equals("stop")) {
			str = (String) dis.readUTF();
			System.out.println("Client: "+str);
			String str1 = br.readLine();
			dos.writeUTF(str1);
		}
		
	}
		
	public static void main(String[] args) throws Exception {
		new MyServer2();
	}
		
		
		
}
	
	