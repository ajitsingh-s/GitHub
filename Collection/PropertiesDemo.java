package Collection;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fis  = new FileInputStream("abc.properties");
			Properties p = new Properties();
			p.load(fis);
			
			Set<Entry<Object, Object>> set=p.entrySet();
			Iterator<Entry<Object, Object>> itr = set.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("By using keyset");
			Set<Object> set1 = p.keySet();
			Iterator<Object> itr1 = set1.iterator();
			while (itr1.hasNext()) {
				Object obj =  itr1.next();
				System.out.println(obj+" = "+p.get(obj)+" "+p.getProperty((String)obj));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
