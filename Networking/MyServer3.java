package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class MyServer3 {
	
	ServerSocket ss;
	Socket s;
	ArrayList arrl = new ArrayList();
	
	public MyServer3() {
		try {
			ss = new ServerSocket(2121);
			while(true) {
				s = ss.accept();
				System.out.println("Server and Client connection established");
				arrl.add(s);
				Runnable r = new MyThread(s,arrl);
				Thread t1 = new Thread(r);
				t1.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new MyServer3();
	}
}

class MyThread implements Runnable {
	Socket s;
	ArrayList arrl;
	
	public MyThread(Socket s, ArrayList arrl) {
		this.s = s;
		this.arrl = arrl;
	}
	
	public void run() {
		String s1 = " ";
		try {
			DataInputStream dis = new DataInputStream(s.getInputStream());
			do {
				s1 = dis.readUTF();
				System.out.println("Client: "+s1);
				if(!s1.equals("stop"))
					broadcast(s1);
				else {
					DataOutputStream dos = new DataOutputStream(s.getOutputStream());
					dos.writeUTF(s1);
					dos.flush();
				}		
			}while(!s1.equals("stop"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void broadcast(String s1) throws Exception {
		Iterator i = arrl.iterator();
		while(i.hasNext()) {
			Socket sc = (Socket)i.next();
			DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
			dos.writeUTF(s1);
			dos.flush();
		}
	}
}
