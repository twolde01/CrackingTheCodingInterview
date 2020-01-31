import java.util.Stack;

public class Palindrome {
	public boolean isPalindrom2(LinkedList head) {
		LinkedList fast = head;
		LinkedList slow = head;
		Stack<Integer> stack = new Stack<Integer>();
		while(fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			int top = stack.pop().intValue();
			if(top != slow.data)
				return false;
			slow = slow.next;
		}
		
		return true;
	}

	public class LinkedList {
		int data;
		LinkedList next;
	}

}
