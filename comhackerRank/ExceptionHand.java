package comhackerRank;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHand {
		   
	public static void main(String[] args){//throws IOException {
	    try {
	  /*  InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br  =  new BufferedReader(isr);
	    
	    int x = Integer.parseInt(br.readLine());
	    int y = Integer.parseInt(br.readLine());
	    */
	    	Scanner sc = new Scanner(System.in);
	    	int x  = sc.nextInt();
	    	int y = sc.nextInt();
	   
	         System.out.println(x/y);
	    }
	    catch(InputMismatchException e) {
	        System.out.println("java.util.InputMismatchException");
	    }
	    catch(Exception e) {
	        System.out.println(e);
	    }
	  }
	}