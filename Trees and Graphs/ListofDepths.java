import java.util.*;
public class ListofDepths {
	
	public List<List<Integer>> listOfDepths(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if(root == null)
			return res;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			List<Integer> level = new LinkedList<>();
			int size = q.size();
			for(int i = 0; i < size; i++) {
				TreeNode n = q.remove();
				level.add(n.data);
				if(n.left != null)
					q.add(n.left);
				if(n.right != null)
					q.add(n.right);
				
			}
			
			res.add(level);
		}
		
		return res;
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
