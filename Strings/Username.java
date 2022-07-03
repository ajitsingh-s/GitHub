package Strings;


import java.util.Scanner;
import java.util.regex.*;
class UsernameValidator {
       
    public static final String regularExpression = "^[A-Za-z][A-za-z0-9_]{7,29}";
}


public class Username {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}