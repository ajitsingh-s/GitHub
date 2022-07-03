package String;

public class Array2 {

	public static void main(String[] args) {
	int [][] num = {{1,2,3,4,5,6},{7,8,9,10}};
	int i, j;
	//int x = num[1][2];
	//System.out.println(x);
	for (i =0;i<num.length;i++) {
	for (j=0;j<num[i].length;j++) {
	System.out.println(num[i][j]);
	}		
	}
	System.out.println(num[1][1]);
	System.out.println(num[i]);

}
}
