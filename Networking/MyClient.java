package Networking;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {
	
	
	public MyClient() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Socket s = new Socket("localhost",0203);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		String str = " ";
		while(!str.equals("stop")){
			str = br.readLine();
			dos.writeUTF(str);
			System.out.println("You: "+str);
			dos.flush();
		}
		dos.close();
	}
	
	public static void main(String[] args) throws Exception, IOException {
		new MyClient();
		
	}

}


















