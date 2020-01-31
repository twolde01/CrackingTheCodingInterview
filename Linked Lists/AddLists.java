public class AddLists {
	public LinkedList addLists(LinkedList l1, LinkedList l2) {
		return addLists(l1,l2,0);
	}

	private LinkedList addLists(LinkedList l1, LinkedList l2, int carry) {
		if(l1 == null && l2 == null && carry == 0) {
			return null;
		}
		
		LinkedList result = new LinkedList();
		int value = carry;
		if(l1 != null) 
			value += l1.data;
		if(l2 != null) 
			value += l2.data;
		
		result.data = value % 10;
		
		if(l1 != null || l2 != null) {
			LinkedList more = addLists(l1 == null ? null : l1.next, l2 == null ? null : l2.next, 
					carry >= 10 ? 1 : 0);
			result.next = more;
		}
		
		return result;
	}

	public class LinkedList {
		int data;
		LinkedList next;
	}
}
