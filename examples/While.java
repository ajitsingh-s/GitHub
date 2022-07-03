package examples;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int s=0;
		while(i != 0)
	    {
	        s = (s * 10) + (i % 10);	// s = 0 * 10 + 12 % 10 = 2	// s = 2*10 + 1 % 10 = 20
	        i = i/10;					// i = 12/10 = 1 // 1/10 = 0
	    }
		
		//System.out.println(s);
		System.out.println(s);
	}

}
/*

			s = s + i
i=1			s = 0 + 1
i=2			s = 1 + 2
i=3
i=4*/