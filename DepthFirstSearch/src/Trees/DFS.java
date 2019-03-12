package Trees;

import java.util.List;

public class DFS {

	public static void main(String[] args) {
		TreeNode n = new TreeNode(20);
		n.left = new TreeNode(10);
		n.right = new TreeNode(24);
		n.left.left = new TreeNode(8);
		n.left.right = new TreeNode(12);
		n.left.right.left = new TreeNode(11);
		n.left.right.right = new TreeNode(15);
		n.right.right = new TreeNode(26);
		n.right.right.left = new TreeNode(25);
		List<List<Integer>> li = depthOrder(n);
		System.out.println(li);
	}

	private static List<List<Integer>> depthOrder(TreeNode root) {
		
		return null;
	}

}
