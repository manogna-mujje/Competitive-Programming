package PreOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n = new TreeNode(1);
		n.right = new TreeNode(2);
		n.right.left = new TreeNode(3);
		System.out.println(preOrder(n));
	}
	
	private static List<Integer> preOrder(TreeNode root) {
		List<Integer> li = new ArrayList<Integer>();
		preOrder(root, li);
		return li;
	}

	private static void preOrder(TreeNode root, List<Integer> li) {
		if(root == null) {
			return;
		} 
		li.add(root.val);
		if(root.left != null)
			preOrder(root.left, li);
		if(root.right != null)
			preOrder(root.right, li);
	}

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int d){
			val = d;
			this.left = null;
			this.right = null;
		}
	}

}
