package InputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Pipeout implements Runnable{
	
	PipedOutputStream pout;
	public Pipeout(PipedOutputStream obj) {
		this.pout = obj;
	}
	@Override
	public void run() {
		String str  = "Ajit singh shekhawat";
		try {
			for(int i =65;i<91;i++)
			pout.write(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

class Pipein  implements Runnable{
	PipedInputStream pin;
	public Pipein(PipedInputStream obj) {
		this.pin = obj;
	}
	@Override
	public void run() {
		int z = 0;
		for (int i=65;i<91;i++) {
			try {
				z  = pin.read();
				//System.out.println(z);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print((char)z+"\t");
			
		}
		
	}
}


public class MyPipedOutputInputStream {

	public static void main(String[] args) throws Exception {
		PipedOutputStream pout = new PipedOutputStream();
		PipedInputStream pin = new  PipedInputStream();
		
		pout.connect(pin);
		
		Pipeout po = new Pipeout(pout);
		Pipein pi  = new Pipein(pin);
		
		Thread t1  =  new Thread(po);
		Thread t2 = new Thread(pi);
		
		t1.start();
		t2.start();

	}

}
