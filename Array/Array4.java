package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array4 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bufr = new BufferedReader(isr);
		int x[] = new int[5];
		for (int i=0; i<x.length;i++) {
			System.out.print("x["+i+"] = ");
			x[i] = Integer.parseInt(bufr.readLine());;
			}
		int max = x[0];
		int sum =0;
		for (int i=0; i<x.length;i++) {
			sum = sum + x[i];
			if (x[i]>x[0])
				max=x[i];
		}			
			System.out.println(max);
			System.out.println(sum);
	}
}
