package examples;

import java.util.Scanner;

public class ElecReading {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the previous reading = ");
		int pr = sc.nextInt();
		System.out.print("Enter the current reading = ");
		int cr= sc.nextInt();
		double amt = 0,sch=0;
		int unit = cr - pr;
		if (cr>pr) {
	
			if (unit <=50) {
				amt = unit*0.5;
			}
			else if (unit<=150) {
				amt = unit*0.75;
			}

			else if (unit<=250) {
				amt = unit*1.20;
			}
			else if (unit>250) {
				amt = unit*1.5;			
			}
			sch=amt*0.2;
			double tamt=sch+amt;
			System.out.println("Total unit = "+unit);
			System.out.println("Eletricity consumption amount = "+amt);
			System.out.println("Additional surcharge 20% = "+sch);
			System.out.println("Total eletricity bill amount = "+tamt);
			
			}
		else 
			System.out.println("Invalid Readings! Please check readings.");
	sc.close();	
}
}		
