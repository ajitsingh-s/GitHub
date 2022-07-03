package Solution;

import java.util.*;

public class TwoDArrayMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]  = new int[6][6];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr [i][j] = sc.nextInt();
            }
        }
        int rows = arr.length;
        int column = arr[0].length;
        int max_sum = Integer.MIN_VALUE;
        
        for(int i =0;i<rows-2;i++){
            for(int j=0;j<column-2;j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                max_sum = Math.max(max_sum,sum);
            }
        }
        System.out.println(max_sum);
    }
}