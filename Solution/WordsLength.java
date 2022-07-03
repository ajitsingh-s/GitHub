package Solution;

import java.util.Set;

public class WordsLength {
	public static void main(String[] args) {
		
	
	    String [] words = String {
	        int result = 0;
	        
	        for(int i=0; i<words.length-1; i++)
	            Set<Character> set1 = new HashSet<>();
	             for(Character ch : words[i].toCharArray()){
	                 set1.add(ch);
	             } 
	            for(int j=i+1; j<words.length; j++){
	                for(Character ch : words[j].toCharArray()){
	                    if(set1.contains(ch)) {
	                    	break;
	                    }
	                }
	                
	            }
	        }
	}
}
	

