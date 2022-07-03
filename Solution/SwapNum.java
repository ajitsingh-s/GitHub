package Solution;

import java.util.Scanner;

public class SwapNum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        
        while(x-->0){                               
        	String str = sc.nextLine();
        	String arr [] = str.split(" ");
        	System.out.print(arr[0]);
        	for(int i =1;i<arr.length; i++) {
            	if(!arr[i].equalsIgnoreCase(arr[i-1]))
            		System.out.print(" "+arr[i]);
        	}
        	
        System.out.println();
        
    }
    }

}

//My My name name name is is Ajit Ajit
//
//My My My name name name is is Ajit Ajit