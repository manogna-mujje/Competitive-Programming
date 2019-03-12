package Trees;

public class CountUniValueSubTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(1);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(5);
		System.out.println(countSubTrees(root));
	}

	private static int countSubTrees(TreeNode root) {
		return countSubTrees(0, root);
	}

	private static int countSubTrees(int count, TreeNode root) {
		if(root == null)
			return count;
		if(root.left == null && root.right == null)
			return count+1;
		if(root.left != null && root.right == null)
			return (root.val == root.left.val) ? count+1 : count;
		if(root.left == null && root.right != null)
			return (root.val == root.right.val) ? count+1 : count;
		if(root.val == root.left.val && root.val == root.right.val)
			return count++;
		return countSubTrees(count, root.left) + countSubTrees(count, root.right);
	}

}
