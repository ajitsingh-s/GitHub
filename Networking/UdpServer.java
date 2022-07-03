package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
	
	public static void main(String[] args) throws IOException {
	
		DatagramSocket ds = new DatagramSocket(2121);
		byte b[] = new byte[1024];
		DatagramPacket  dp = new DatagramPacket(b, b.length);
		
		String str = " ";
		while(!str.equals("stop")) {
			ds.receive(dp);
			str = new String(dp.getData());
			System.out.println(str);
			
		}
	}
}
