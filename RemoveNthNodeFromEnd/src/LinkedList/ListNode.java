package LinkedList;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int d){
		val = d;
	}
	
	void printNodes() {
		ListNode n = this;
		while(n != null) {
			System.out.println(n.val);
			n = n.next;
		}
	}
}
