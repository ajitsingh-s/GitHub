package Solution;

import java.util.*;

public class NumbersOfBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char arr [] = str.toCharArray();
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]=='1') {
				count++;
			}
		}
		System.out.println(count);
	}
}
