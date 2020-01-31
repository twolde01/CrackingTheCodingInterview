public class KthToLast {
	public LinkedList kthToLastIterative(LinkedList head, int k) {
		if(head == null) return null;
		
		LinkedList p1 = head, p2 = head;
		for(int i = 0; i < k; i++) {
			if(p1 == null) return null;
			p1 = p1.next;
		}
		
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p2;
	}

	public class LinkedList {
		int data;
		LinkedList next;
	}
}
