package Solution;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        while(count-->=0) {
            String s = sc.nextLine();      
            String[] arr = s.split(" ");
            String[] ans = new String[arr.length];   
     
            ans[0] = arr[0];
            int pos = 1;  
            for(int i=1; i<arr.length; i++){    
                if(!ans[pos-1].equals(arr[i])){  
                    ans[pos] = arr[i];
                    pos++;
                }
            }
 
            for(int i=0; i<ans.length; i++){
                if(ans[i]==null){
                    break;
                }
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    	
    }
}