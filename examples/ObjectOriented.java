package examples;

import java.util.Scanner;

public class ObjectOriented {

	public static void main(String[] args) {
	String rev = "";
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int l = str.length();
	for (int i=l-1;i>=0;i--)
		rev = rev + str.charAt(i);
	if (str.equals(rev))
	System.out.println("Yes");
	else
	System.out.println("No");
	System.out.println(l);
	System.out.println(rev);
	}
}
/*//madam
i = l, i>=0, rev = rev + str.charAt(i);
i = 5-1=4, 	4>=0, rev = - + a
			3>=0, rev = a + d
			2>=0, rev = ad + a
			1>=0, rev =ada + m
madam == adam

*/