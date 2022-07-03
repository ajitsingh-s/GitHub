package examples;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = 0;
		int f = num;
			c = num%10;
		while (f >=10) {		
			f /= 10;			
		}
		System.out.println("First = "+f);
		System.out.println("Last = "+c);
	}

}
