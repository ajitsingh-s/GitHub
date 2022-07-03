package Methods;

import java.util.Scanner;

public class IfElseMethod {
	
	static void checkAge(int age) {
		if (age<18)
			System.out.println("under adult");
		else 
			System.out.println("Adult");
	}
public static void main (String []args) {
	Scanner sc=new Scanner(System.in);
	int y = sc.nextInt();
	checkAge(y);
}

}

