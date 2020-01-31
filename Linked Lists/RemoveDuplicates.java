import java.util.HashSet;

// O(n) time and space complexity
public class RemoveDuplicates {
	public void removeDup(LinkedList head) {
		if(head == null) return;
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedList curr = head;
		if(curr != null)
			set.add(curr.data);
		while(curr.next != null) {
			if(set.contains(curr.next.data)) {
				curr.next = curr.next.next;
			} else {
				set.add(curr.data);
			}
			curr = curr.next;
		}
	}
	
	public class LinkedList {
		int data;
		LinkedList next;
	}
}
