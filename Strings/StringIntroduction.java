package Strings;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			String a = sc.next();
			String b = sc.next();
			int c = a.length();
			int d = b.length();
			int sum = c+d;
			String x = a.substring(0,c);
			String y = a.substring(1,c);
			x = x.toUpperCase();
			String i = b.substring(0,1);
			String j = b.substring(1,d);
			i = i.toUpperCase();
			int len1 = a.compareTo(b);
			int len2 = b.compareTo(a);
			System.out.println(sum);
			if (len1>len2)
				System.out.println("Yes");
			else
				System.out.println("No");
			System.out.print(x+y);
			System.out.print(" "+i+j);
			sc.close();
		}
		}

