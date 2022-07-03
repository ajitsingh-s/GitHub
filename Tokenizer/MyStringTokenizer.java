package Tokenizer;

import java.util.StringTokenizer;

public class MyStringTokenizer {

	public static void main(String[] args) {
		String str = "Name: Ajit; Name: Shweta; Name: Rahul; Name: Amit; Name: Suved";
		
		StringTokenizer st = new StringTokenizer(str,";"); 
		while(st.hasMoreTokens())
		//System.out.println(st.hasMoreTokens());
		 //System.out.println(st.hasMoreElements());
		 System.out.println(st.nextToken());
	}

}
