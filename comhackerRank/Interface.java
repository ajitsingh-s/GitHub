package comhackerRank;

import java.util.Scanner;

interface AdvancedArithmetic {
    public int divisor_sum(int n);
          
}
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
       int i = 1,sum=0;
        while (i<=n) {
            if (n%i==0) 
            sum += i;
            i++;
        }
            return sum;
    }
  }

public class Interface {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	MyCalculator obj = new MyCalculator();
    	System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(obj.divisor_sum(n)); 
        sc.close();
        }
    }

/*  i=1
// n = 6 ,  while i<=n , if (n/i==0), sum = i + i, i++
 * n = 6		1<=6,	6/1==0	sum = sum +1 ,  i=2
 				2<=6, 	6/2==0,  sum = 1 + 2 , i = 3
		 		3<=6,	6/3==0, sum = 1 + 2 + 3, i=4
		 		4<=6,	6/4==0, f ,i = 5,
		 		5<=6,	6/5==0, f, i = 6,
		 		6<=6,	6/6==0, sum = 1 + 2 + 3 + 6, i = 7
		 		7<=6, 	f
 
		 		
*/