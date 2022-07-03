package Collection;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("abc.properties");
			Properties p  = new Properties();
			p.setProperty("Ajit", "12354654");
			p.setProperty("Aman", "9651321");
			p.setProperty("Raja", "54654321");
			p.setProperty("Sumit", "8465121");
			p.setProperty("Ajay", "513213243");
			p.setProperty("Ankit", "67898432");
			p.store(fos, "abc.properties");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
