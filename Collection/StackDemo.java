package Collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> stc = new Stack<Integer>();
		System.out.println(stc.capacity());
		stc.push(10);
		stc.push(13);
		stc.push(14);
		stc.push(15);
		stc.push(17);
		System.out.println(stc);
		stc.pop();
		System.out.println(stc.pop());
		System.out.println(stc);
		stc.push(15);
		System.out.println(stc);
		System.out.println(stc.peek());
	}
}
