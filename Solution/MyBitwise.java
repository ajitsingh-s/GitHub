package Solution;

public class MyBitwise {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		System.out.println((a & b));
		System.out.println((a | b));
		System.out.println((a ^ b));
		System.out.println(~1);
		System.out.println(a<<1);
		System.out.println(a>>1);
		System.out.println(a<<2);
		System.out.println(a>>2);
		System.out.println(a<<3);
		System.out.println(a<<4);
		System.out.println(a<<4);

	}

}
/*
2 	0010
3	0011
			&	0010	2
			|	0011	3
			^	0001	1
*/