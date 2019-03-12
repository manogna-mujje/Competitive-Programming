package InOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

	public static void main(String[] args) {
		TreeNode n = new TreeNode(1);
		n.right = new TreeNode(2);
		n.right.left = new TreeNode(3);
		System.out.println(inOrder(n));
	}
	
	private static List<Integer> inOrder(TreeNode root) {
		List<Integer> li = new ArrayList<Integer>();
		inOrder(root, li);
		return li;
	}

	private static void inOrder(TreeNode root, List<Integer> li) {
		if(root == null)
			return;
		if(root.left != null)
			inOrder(root.left, li);
		li.add(root.val);
		if(root.right != null)
			inOrder(root.left, li);
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
