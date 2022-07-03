package examples;

import java.util.Scanner;

public class NumCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long count = 0;
		while (num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
