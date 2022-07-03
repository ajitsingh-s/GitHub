package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MyBufferWriter {

	public static void main(String[] args) throws Exception {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		FileWriter fw = new FileWriter("bufferwrite.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		String str = "";
		while (!str.equals("stop")) {
			str = br.readLine();
			//bw.write(str);
			pw.println(str);
		}
		System.out.println("Created");
		//br.close();
		pw.close();
		
		
	}
			

}


