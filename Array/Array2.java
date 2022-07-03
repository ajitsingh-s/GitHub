package Array;

public class Array2 {
	public static void main(String [] args) {
		int x[] = new int[] {1,2,3,4,5};
		for(int i=0; i<x.length;i++) {
			System.out.print(+x[i]);
		}
		System.out.println("\nArray  "+x.length);
		for (Integer obj :x) {
			System.out.println(obj);
		}
	}
}
