public class ValidateBST {
	/*
	 * Time Complexity: O(N), where N is the number of nodes in the tree.
	 * Space Complexity: O(logN). There are up to O(logN) recursive calls on the 
	 * 					stack since we may recurse up to the depth of the tree.
	 */
	public boolean checkBST(TreeNode root) {
		return checkBST(root,null,null);
	}
	
	private boolean checkBST(TreeNode n, Integer min, Integer max) {
		if(n == null)	// base case
			return true;
		
		if((min != null && n.data <= min) && (max != null && n.data > max))
			return false;
		
		return checkBST(n.left,min,n.data) && checkBST(n.right,n.data,max);
	}

	public class TreeNode {
		public int data;
		public TreeNode left;
		public TreeNode right;
		
		public TreeNode(int d) {
			this(d,null,null);	
		}
		
		public TreeNode(int d, TreeNode l, TreeNode r) {
			data = d;
			left = l;
			right = r;
		}	
	}
}
