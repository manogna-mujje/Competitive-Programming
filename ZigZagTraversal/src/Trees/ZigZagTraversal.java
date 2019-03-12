package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ZigZagTraversal {

	public static void main(String[] args) {
//		TreeNode n = null;
		TreeNode n = new TreeNode(1);
		n.left = new TreeNode(2);
		n.right = new TreeNode(3);
		n.left.left = new TreeNode(4);
		n.right.right = new TreeNode(5);
		System.out.println(zigzagLevelOrder(n));

	}
	
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null) return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		TreeNode cur;
		boolean isReverse = false;
		while(!q.isEmpty()) {
			List<Integer> row = new ArrayList<Integer>();
			int n = q.size();
			for(int i=0; i<n; i++) {
				cur = q.poll();
				if(cur.left != null)
					q.offer(cur.left);
				if(cur.right != null)
					q.offer(cur.right);
				row.add(cur.val);
			}
			if(isReverse)
				Collections.reverse(row);
			result.add(row);
			
//			if(isQueue) {
//				int n = q.size();
//				for(int i=0; i<n; i++) {
//					cur = q.poll();
//					System.out.println("q: " + cur.val);
//					isQueue = updateStack(stack,cur);
//					row.add(cur.val);
//				}
//			} else {
//				int m = stack.size();
//				for(int i=0; i<m; i++) {
//					cur = stack.pop();
//					System.out.println("stack: " + cur.val);
//					isQueue = updateQueue(q,cur);
//					row.add(cur.val);
//				}
//			}
//			result.add(row);
		}
		return result;
    }

//	private static boolean updateQueue(Queue<TreeNode> q, TreeNode cur) {
//		if(cur.left != null)
//			q.offer(cur.left);
//		if(cur.right != null)
//			q.offer(cur.right);
//		return true;
//	}
//
//	private static boolean updateStack(Stack<TreeNode> stack, TreeNode cur) {
//		if(cur.left != null)
//			stack.push(cur.left);
//		if(cur.right != null)
//			stack.push(cur.right);
//		return false;
//	}

}
