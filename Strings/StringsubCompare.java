package Strings;

import java.util.*;

public class StringsubCompare {
        
    String getSmallestAndLargest(String s,int k) {
    	int l = s.length();
    	String small = s.substring(0, k);
        String large = small;
        for (int i=1;i<(l-k+1);i++) {
        String subst = s.substring(i, i+k);
            if (small.compareTo(subst)>0)
                small = subst;
            if (large.compareTo(subst)<0)
                large = subst;
        }
        return small+"\n"+large;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        StringsubCompare obj = new StringsubCompare();
        System.out.println(obj.getSmallestAndLargest(s,k));
   }
}
