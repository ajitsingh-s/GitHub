package examples;

import java.util.Scanner;

public class ResultMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the masks of Physics = ");
		int ph = sc.nextInt();
		System.out.print("Enter the masks of Chemistry = ");
		int ch = sc.nextInt();
		System.out.print("Enter the masks of Biology = ");
		int bi = sc.nextInt();
		System.out.print("Enter the masks of Mathematics = ");
		int ma = sc.nextInt();
		System.out.print("Enter the masks of Computer = ");
		int co = sc.nextInt();
		float total = ph+ch+bi+ma+co;
		float per = (total/5);
		if (100<ph||100<ch||100<bi||100<ma||100<co)
		{
		 System.out.println("invalid marks");
		}
		else {
			if (per>=90)
			System.out.println("Grade A");
		else if (per>=80)
			System.out.println("Grade B");
		else if (per>=70)
			System.out.println("Grade C");
		else if (per>=60)
			System.out.println("Grade D");
		else if (per>=40)
			System.out.println("Grade E");
		else //if (per>=40)
		System.out.println("Grade F");
	}
		}

}
