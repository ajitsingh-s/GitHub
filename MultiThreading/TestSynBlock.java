package MultiThreading;

class CstmThread extends Thread{
	TempThread t;
	String n;
	public CstmThread(TempThread obj,String str) {
	super(str);
	this.n = str;
	this.t = obj;
	start();
	}
	
	@Override
	public void run() {
		try {
				t.show(Thread.currentThread().getName());
				
		}catch(Exception e) {
				
		}	
	}
}

class TempThread{
	void show(String str) {
		try {
			synchronized (this) {
				System.out.println(str+" start");
				Thread.sleep(2000);
				System.out.println(str+" 1");
				System.out.println(str+" 2");
				System.out.println(str+" 3");
				System.out.println(str+" end");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
	}
}


public class TestSynBlock {

	public static void main(String[] args) {
		TempThread obj = new TempThread();
		CstmThread t1 = new CstmThread(obj,"One");
		CstmThread t2 = new CstmThread(obj,"Two");
		CstmThread t3 = new CstmThread(obj,"Three");

	}

}
