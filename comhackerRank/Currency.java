package comhackerRank;
import java.text.NumberFormat; 
import java.io.*;
import java.util.*;

public class Currency {

static void numberFormat(Locale locale) {
    double amount = 12324.134;
    NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);
    String currency=formatter.format(amount);
    System.out.println(currency);
}
    public static void main(String[] args) {
    	numberFormat(Locale.UK);
    	numberFormat(Locale.US);
    	numberFormat(Locale.CHINA);
    	numberFormat(Locale.FRANCE);
    
    }
}