package Solution;

import java.util.Scanner;

public class Divisibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		if ( (arr[arr.length-1]%10)==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
