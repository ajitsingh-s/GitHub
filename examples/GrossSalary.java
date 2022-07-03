package examples;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Basic Salary is = ");
	int sal = sc.nextInt();
	double tsal=0,hra=0,da=0;
	
	if (sal<=10000) {
		hra = (sal*0.2);
		da = (sal*0.8);
	}
	else if (sal<=20000) {
		hra=(sal*0.25);
		da= (sal*0.9);
		}
	else if (sal>20000) {
		hra=(sal*0.3);
		da= (sal*0.95);
	}
	tsal=sal + hra + da;  
	System.out.println("Basic Salary is = "+sal);
	System.out.println("HRA is = "+hra);
	System.out.println("DA is = "+da);
	System.out.println("Gross Salary is = "+tsal);
	
	}
}
