package Solution;
import java.lang.Math;
//import java.io.*;
import java.util.*;



public class Solution2 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
        int line = sc.nextInt();
          while (line>0) {
        int a=sc.nextInt(), b=sc.nextInt(),n=sc.nextInt();
        int ser = a+b, i=1;
        System.out.print(ser);
        while (i<n){
        ser = (int) (ser + ((Math.pow(2,i)*b)));
        System.out.print(" "+ser);
        i++;
        } 
        System.out.println();
        line--;
        }
          sc.close();
    }
}
