package Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
	
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		while(!str.equals("stop")) {
			str = br.readLine();
			byte [] s = str.getBytes();
			DatagramPacket dp = new DatagramPacket(s, s.length,InetAddress.getLocalHost(),2121);
			ds.send(dp);
			br.close();
		}
	}
}
