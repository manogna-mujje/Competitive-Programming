package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

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
		List<List<Integer>> li = levelOrder(n);
		System.out.println(li);
	}
	
	private static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		return levelOrder(root, li, q);
	}

	private static List<List<Integer>> levelOrder(TreeNode root, List<List<Integer>> result, Queue<TreeNode> q) {
		if(root != null)
			q.offer(root);
		TreeNode curr;
		while(!q.isEmpty()) {
			List<Integer> row = new ArrayList<Integer>();
			int n = q.size();
			for(int i=0; i<n; i++) {
				curr = q.poll();
				if(curr.left != null)
					q.offer(curr.left);
				if(curr.right != null)
					q.offer(curr.right);
				row.add(curr.val);
			}
			result.add(row);
		}
		return result;	
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
