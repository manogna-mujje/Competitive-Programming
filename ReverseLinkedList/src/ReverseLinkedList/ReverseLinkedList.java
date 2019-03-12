package ReverseLinkedList;

import java.util.Stack;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ReverseLinkedList li = new ReverseLinkedList();
		ListNode head = li.new ListNode(1);
		head.addNode(2);
		head.addNode(3);
		head.addNode(4);
		head.addNode(5);
//		head = revList(head);
		head = recursiveReverseList(head);
		head.printNodes();
	}
	
	
	
	private static ListNode revList(ListNode head) {
		ListNode n = head;
		ListNode prev = null;
		 while(n != null) {
			 ListNode temp = n.next;
			 n.next = prev;
			 prev = n;
			 n = temp;
		 }
		return prev;
	}



	/**
	 * Using space O(k)
	 * @param head
	 * @return
	 */

	private static ListNode reverseList(ListNode head) {
		// TODO Auto-generated method stub
		ReverseLinkedList li = new ReverseLinkedList();
		Stack<Integer> stack = new Stack<Integer>();
		ListNode n = head;
		while(n != null) {
			stack.push(n.val);
			n = n.next;
		}
		
		ListNode rev = head;
		while(!stack.isEmpty()) {
			rev.val = stack.pop() ;
			rev = rev.next;
		}
		return head;
	}
	
	/**
	 * Iterative Solution
	 * @param head
	 * @return
	 */
	
	private static ListNode iterativeReverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while(curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
            	prev = curr;
			curr = temp;
		}
		return prev;
		
	}
	
	/**
	 * Recursive Solution
	 * @author Mango
	 *
	 */
	private static ListNode recursiveReverseList(ListNode head) {
//		if(head == null || head.next == null) 
//			return head;
//		ListNode rev = recursiveReverseList(head.next);
//		head.next.next = head;
//		head.next = null;
//		return rev;
		
		ListNode p = head;
		if(p == null || p.next == null) 
			return p;
		ListNode rev = recursiveReverseList(p.next);
		p.next = null;
		ListNode revp = rev;
		while(revp.next != null) {
			revp = revp.next;
		}
		revp.next = p;
		return rev;
	}

	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { 
	    	  	val = x; 
	    	  }

		void addNode(int d) {
			ListNode n = this;
			ListNode end = new ListNode(d);
			while(n.next != null) {
				n = n.next;
			}
			n.next = end;
	      }
			
	      void printNodes() {
			ListNode n = this;
			while(n != null) {
				System.out.println(n.val);
				n = n.next;
			}
	      }
	 }

}
