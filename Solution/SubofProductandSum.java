package Solution;

public class SubofProductandSum {

	public static void main(String[] args) {
		int a		= 789;
//		int once 	= a%10;		//m		--
//		int ex1 	= a/10;		//d
//		int second  = ex1%10;	//m		--
//		int ex2 	= ex1/10;	//d
//		int third 	= ex2%10;	//m		--
//		int ex3 	= ex2/10;	//d
//		int forth 	= ex3%10;	//m		--
//		int fifth 	= ex3/10;	//d		--
		int sum=0,pro=1;
			
		while(a!=0)	{
			sum = sum + (a%10);
			pro  = pro*(a%10);
			a= a/10;
		
		
		System.out.println("sum "+sum);
		
		System.out.println("pro "+pro);
		}
//		System.out.println(product-sum);
//		System.out.println(once);
//		System.out.println(second);
//		System.out.println(third);
//		System.out.println(forth);
//		System.out.println(fifth);
//		
	}

}
