package Solution;

import java.util.Scanner;

public class Zoos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		int zcount=0,ocount = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='z') {
				zcount++;
			}
			if(arr[i]=='o') {
				ocount++;
			}
		}
		if((2*zcount)==ocount) {
			System.out.println(true);
		}
		else
			System.out.println(false);
	}
}
