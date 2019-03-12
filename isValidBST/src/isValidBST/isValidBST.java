package isValidBST;

public class isValidBST {

	public static void main(String[] args) {
		TreeNode n = new TreeNode(5);
		n.left = new TreeNode(1);
		n.right = new TreeNode(4);
		n.right.left = new TreeNode(3);
		n.right.right = new TreeNode(6);
		System.out.println(isValid(n));
	}
	
	private static boolean isValid(TreeNode root) {
		return isValid(root, null, null);
	}


	private static boolean isValid(TreeNode node, Integer min, Integer max) {
		if(node == null) return true;
		if(max!= null && node.val >= max) return false;
        if(min != null && node.val<= min) return false; 
        boolean left = isValid(node.left, node.val, min);
        boolean right = isValid(node.right, max, node.val);
        if(left != true || right != true) return false;
        return true;
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


