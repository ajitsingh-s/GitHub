package comhackerRank;
import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufr = new BufferedReader(isr);
        String n = bufr.readLine();
        BigInteger a = new BigInteger(n);
        boolean result = a.isProbablePrime(1);
        if (result==true)
        System.out.println("prime");
        else 
        System.out.println("not prime");
        bufr.close();
    }
}
