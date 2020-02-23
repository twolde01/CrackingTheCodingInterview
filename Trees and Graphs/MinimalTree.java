public class MinimalTree {
	/*
	 * Time Complexity: O(N). N is the length of the array.
	 * Space Complexity: O(H). H is the height of the tree.
	 */
	public TreeNode minimalBST(int[] a) {
		return minimalBST(a,0,a.length-1);
	}
	
	private TreeNode minimalBST(int[] a, int lo, int hi) {
		if(hi < lo)
			return null;
		int mid = lo + (hi-lo)/2;
		TreeNode n = new TreeNode(a[mid]);
		n.left = minimalBST(a,lo,mid-1);
		n.right = minimalBST(a,mid+1,hi);
		return n;
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
