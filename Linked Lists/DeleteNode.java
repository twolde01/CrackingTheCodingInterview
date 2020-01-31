public class DeleteNode {
	public boolean deleteNode(LinkedList n) {
		if(n == null || n.next == null)
			return false;
		
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
	}
	public class LinkedList {
		int data;
		LinkedList next;
	}
}
