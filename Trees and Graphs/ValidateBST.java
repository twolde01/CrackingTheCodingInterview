public class ValidateBST {
	
	public boolean checkBST(TreeNode root) {
		return checkBST(root,null,null);
	}
	
	private boolean checkBST(TreeNode n, Integer min, Integer max) {
		if(n == null)
			return true;
		
		if((min != null && n.data <= min) || (max != null && n.data > max)) {
			return false;
		}
		
		if(!checkBST(n.left,min,n.data) || !checkBST(n.right,n.data,max))
			return false;
		
		return true;
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
