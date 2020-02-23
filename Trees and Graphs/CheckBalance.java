public class CheckBalance {
	/*
	 * Time Complexity: O(NlogN)
	 * Space Complexity: O(NlogN)
	 */
	public boolean isBalanced(TreeNode root) {
		if(root == null) // base case
			return true;
		
		// get the height diff of left and right subtree
		int heightDiff = getHeight(root.left) - getHeight(root.right);
		if(Math.abs(heightDiff) > 1)
			return false;
		else // recursive case
			return isBalanced(root.left) && isBalanced(root.right);
	}
	
	private int getHeight(TreeNode root) {
		if(root == null) // base case
			return -1;
		
		// recursive case
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
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