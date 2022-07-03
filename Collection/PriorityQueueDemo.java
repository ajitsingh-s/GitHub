package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// it is in random order
		pq.add(15);
		pq.add(11);
		pq.add(2);
		pq.add(10);
		pq.add(8);
		pq.add(14);
		pq.add(5);
		pq.add(17);
		pq.add(19);
		pq.add(13);
		System.out.println(pq);
		System.out.println(pq.poll());// Head element is removed First in first out order
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.offer(7));
		System.out.println(pq);
		System.out.println(pq.remove());// Head element is removed First in first out order
		System.out.println(pq.element());
		System.out.println(pq.peek());
		Iterator<Integer> itr = pq.iterator();
		while (itr.hasNext()) {
			System.out.print((Integer)itr.next()+" ");
		}
		
		
	}
}
