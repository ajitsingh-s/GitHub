package Strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s = sc.next();
	int a=sc.nextInt(),b=sc.nextInt();
	String str = s.substring(a,b);
	System.out.println(str);

	}

}
