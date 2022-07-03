package Collection;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		try {
			FileInputStream input1  = new FileInputStream("C:\\Users\\AJIT SINGH SHEKHAWAT\\Desktop\\Java\\first.txt");
			FileInputStream input2 = new FileInputStream("C:\\Users\\AJIT SINGH SHEKHAWAT\\Desktop\\Java\\second.txt");
			FileInputStream input3 = new FileInputStream("C:\\Users\\AJIT SINGH SHEKHAWAT\\Desktop\\Java\\third.txt");
			
			Vector<FileInputStream> v = new Vector<FileInputStream>();
			v.add(input1);
			v.add(input2);
			v.add(input3);
			System.out.println(v.size());
			System.out.println(v);
			Enumeration emu = v.elements();
//			while (emu.hasMoreElements()) {
//				Object object = (Object) emu.nextElement();
//				System.out.println(object);
//			}
			
			SequenceInputStream sis  = new SequenceInputStream(emu);
			int i = 0;
			while((i=sis.read())!=-1) {		
				System.out.print((char)i);
				}
			sis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
