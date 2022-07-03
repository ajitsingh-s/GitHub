package Networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	
	public MyServer() {
		try {
			ServerSocket ss  = new ServerSocket(0203);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str="";
			while(!str.equals("stop")){
				str = (String) dis.readUTF();
				System.out.println("Client: "+str);
			}
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new MyServer();
	}
	
}












