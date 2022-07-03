package comhackerRank;
import java.io.*;
import java.math.*;
import java.util.*;

public class BInteger {

    public static void main(String[] args) throws IOException {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader bufr = new BufferedReader(isr);
       String x = bufr.readLine();
       String y = bufr.readLine();
       BigInteger a = new BigInteger(x);
       BigInteger b = new BigInteger(y);
      
       System.out.println(a.add(b));
       System.out.println(a.multiply(b));
    }
}