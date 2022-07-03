package Networking;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient3 {
	
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	public MyClient3() {
		try {
			s = new Socket("localhost",2121);
			System.out.println("Client and Server connected");
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			Runnable r = new MyThread1(dis);
			Thread t1 = new Thread(r);
			t1.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = " ";
			do {
				str= br.readLine();
				dos.writeUTF(str);
				dos.flush();
			}while(!str.equals("stop"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		new MyClient3();
	}
	
}

class MyThread1 implements Runnable {
	
	DataInputStream dis;
	
	public MyThread1(DataInputStream dis) {
		this.dis = dis;
	}
	public void run() {
		try {
			String str = " ";
			do {
			str = dis.readUTF();
			System.out.println("Server: "+str);
			}while(!str.equals("stop"));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}