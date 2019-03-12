package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right.right= new TreeNode(3);
		System.out.println(isSymmetric(root));
	}

	private static boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		return isSymmetric(root, q);
	}

	private static boolean isSymmetric(TreeNode root, Queue<TreeNode> q) {
		TreeNode curr;
		q.offer(root);
		System.out.println("q: " + q);
		boolean flag = true;
		while(!q.isEmpty()) {
			int n = q.size();
			TreeNode dummy = new TreeNode(0);
			List<Integer> row = new ArrayList<Integer>();
			for(int i=0; i<n; i++) {
				
				curr = q.poll();
				if(curr == null) {
					System.out.println("null");
				}
				System.out.println(curr.val);
				row.add(curr.val);
				if(curr != dummy) {
					if(curr.left != null && curr.right == null) 
						q.offer(curr.left);
						q.offer(dummy);
					if(curr.right != null && curr.left == null) 
						q.offer(dummy);
						q.offer(curr.right);
					if(curr.right != null && curr.left != null)
						q.offer(curr.left);
						q.offer(curr.right);
				}
				
			}
			flag = checkSymmetry(row) ? true : false;
		}
		return flag;
	}

	private static boolean checkSymmetry(List<Integer> row) {
		int n = row.size();
		int start = 0, end = n-1;
		while(start <= end) {
			if(row.get(start) != row.get(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

}
