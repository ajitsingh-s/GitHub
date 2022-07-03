package Solution;
//import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] arrayofstr = str.split("[! ,?._'@]+"); 
    
    System.out.println(arrayofstr.length);
    for (String a : arrayofstr) 
    System.out.println(a);
   
    sc.close();
    }
}
