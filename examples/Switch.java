package examples;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=  sc.nextInt();
		int a= sc.nextInt();
		int b= sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("add "+(a+b));
			break;
		case 2:
			System.out.println("sub "+(a-b));
			break;
		case 3:
			System.out.println("multi "+(a*b));
			break;
		case 4:
			System.out.println("div "+(a/b));
			break;
		case 5:
			System.out.println("remender "+(a%b));
			break;		
		default:
			System.out.println("invalid");
		}
	}

}
