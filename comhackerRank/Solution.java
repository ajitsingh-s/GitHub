package comhackerRank;
//import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle() {
        return title;
    }
}
class MyBook extends Book {
	public void setTitle(String s){
    title =s;
}
}
 
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();        
        MyBook new_novel=new MyBook();
        new_novel.setTitle(str);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();
    }
}
