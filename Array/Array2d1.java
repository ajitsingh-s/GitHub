package Array;

import java.util.Scanner;

public class Array2d1 {

	public static void main(String[] args) {
		int x[][]  = new int [2][3];
		Scanner sc = new Scanner(System.in);
	
		for (int i=0;i<x.length;i++ ) {
			System.out.println("Enter the elements");
			for (int j=0;j<x[i].length;j++) {
			
				x[i][j]= sc.nextInt();
			}
		
	}
		for (int i=0;i<x.length;i++ ) {
			for (int j=0;j<x[i].length;j++) {
				
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
	}
}
}