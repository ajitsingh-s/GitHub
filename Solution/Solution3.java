package Solution;
import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {

    static boolean isAnagram(char[] a, char[] b) {
     int lena = a.length;
     int lenb = b.length;
     if (lena==lenb) {
    	 Arrays.sort(a);
    	 Arrays.sort(b);
    		System.out.println(Arrays.toString(a));
        	System.out.println(Arrays.toString(b));
    	 for (int i = 0; i<lena; i++) 
    		 if (a[i] != b[i]) 
       			 return false;
    		 return true;
     
    }
    
	return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        char[] a = scan.next().toLowerCase().toCharArray();
        char[] b = scan.next().toLowerCase().toCharArray();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}