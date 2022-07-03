package Strings;

import java.util.Scanner;

public class SubstringCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int k = sc.nextInt();
		int l = a.length();
		String sm = a.substring( 0,k);
		System.out.println("sm string "+sm);
		String la = sm;
		System.out.println("la string "+la);
		for (int i=1;i<=(l-k);i++) {     //4-2=2
		String subst = a.substring(i, i+k);
		//System.out.println(" sub string i, i+k = "+subst);
			if (sm.compareTo(subst)>0)
				sm = subst;
			if (la.compareTo(subst)<0)
				la = subst;
		}
		System.out.println(sm+"\n"+la);
		}
}




/* ajit  ,	length l =  4,	k=2, n= l-k=2 
 sm = ( 0, 2) aj
 sm = aj; la = aj,  i = 1 , i <= 2, i++
 subst = i, i+k=( 1, 3) ji
 if ( sm compare subst) >  0
 	aj ji -1> 0
 if ( lm compare subst) < 0
 aj ji -1<0, la = ji

subst ( 2, 4) it
aj it >0
ji it <0  
if ( a






*/