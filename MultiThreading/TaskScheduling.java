package MultiThreading;

import java.awt.*;
import java.util.*;

class Task extends TimerTask{
	
	int count = 1;
	@Override
	public void run() {
		Frame f = new Frame();
		f.setSize(400, 400);
		f.setVisible(true);
	}
}

public class TaskScheduling {

	public static void main(String[] args) {
		Timer timer = new Timer();
		long delay = 1;
		long period = 10000;
		timer.schedule(new Task(), delay, period);

	}

}
