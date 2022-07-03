package Solution;

import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		int a = 19;
		int sum = 0;
		do {
			int y=1, x = 0;
			while (y!=0){
				x = a%10 ;       
				sum = sum + x*x; 
				y = a/10;
			}
			a=sum; 
			System.out.println(sum);
		}while(a!=0);			
		if (a==0)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
