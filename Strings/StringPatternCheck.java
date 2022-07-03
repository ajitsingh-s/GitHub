package Strings;

import java.util.Scanner;
import java.util.regex.*;

public class StringPatternCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Pattern p =  Pattern.compile("^[A-Za-z]\\w{7,29}");
		System.out.println("p = "+p);
		Matcher m = p.matcher(str);
		System.out.println("m = "+m);
		System.out.println(m.find());
	}

}
