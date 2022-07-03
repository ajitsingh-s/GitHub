package Array;

import java.util.Scanner;

public class Array2d2 {

	public static void main(String[] args) {
	int x[][] = new int [2][2];
	int y[][] = new int [2][2];
	int z[][] = new int [2][2];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the matrix ");
	for (int i=0; i< x.length;i++) {
		for (int j=0;j<x[i].length;j++)
			x[i][j] = sc.nextInt();
	}
	for (int i=0; i<y.length;i++) {
		for (int j=0;j<y[i].length;j++)
			y[i][j] = sc.nextInt();
	}
	for (int i=0; i<x.length;i++) {
		for(int j=0; j<x[i].length;j++) {
			z[i][j]=0;
			for (int k=0; k<x[i].length;k++) {
				z[i][j] = z[i][j] + (x[i][k]*y[k][j]);
			}
		System.out.print(z[i][j]+" ");
		}
		System.out.println();
	}
	}
}

















