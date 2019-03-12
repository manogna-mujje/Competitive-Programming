package BinaryTreeMaxDepth;


public class BinaryTreeMaxDepth {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		int n = maxDepth(root);
		System.out.println(n);
	}
	private static int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
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
