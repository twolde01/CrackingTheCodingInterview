public class Partition {
	public LinkedList partition(LinkedList node, int k) {
		LinkedList before = null;
		LinkedList after = null;
		while(node != null) {
			LinkedList next = node.next;
			if(node.data < k) {
				node.next = before;
				before = node;
			} else {
				node.next = after;
				after = node;
			}
			node = next;
		}
		
		// merge before and after list
		if(before == null)
			return after;
		
		LinkedList head = before;
		while(before.next != null) {
			before = before.next;
		}
		before.next = after;
	
		return head;
	}

	public class LinkedList {
		int data;
		LinkedList next;
	}
}
