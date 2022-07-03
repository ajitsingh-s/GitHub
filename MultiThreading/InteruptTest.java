package MultiThreading;

class ThreadInterupt1 extends Thread {
	ThreadInterupt1(String str){
		super(str);
	}
	public void run() {
		System.out.println("start "+Thread.currentThread().getName());
		for(int i=0; i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadInterupt2 extends Thread {
	ThreadInterupt1 obj;
	ThreadInterupt2 (String str,ThreadInterupt1 obj) {
		super(str);
		this.obj = obj;
	}
	public void run() {
		System.out.println("start "+Thread.currentThread().getName());
		
		for(int i=0; i<5;i++) {
			obj.interrupt();
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class InteruptTest {

	public static void main(String[] args) {
		ThreadInterupt1 tinterpt1 = new ThreadInterupt1("one");
		ThreadInterupt2 tinterpt2 = new ThreadInterupt2("two",tinterpt1);
		tinterpt1.setPriority(10);
		tinterpt2.setPriority(9);
		
		tinterpt1.start();
		tinterpt2.start();
	}

}
