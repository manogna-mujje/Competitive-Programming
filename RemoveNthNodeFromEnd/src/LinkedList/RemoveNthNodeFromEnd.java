package LinkedList;

public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		ListNode n = new ListNode(1);
//		n.next = new ListNode(2);
//		n.next.next = new ListNode(3);
//		n.next.next.next = new ListNode(4);
//		n.next.next.next.next = new ListNode(5);
		ListNode res = remove(n, 1);
//		res.printNodes();
		System.out.println(res);
	}

	private static ListNode remove(ListNode head, int n) {
		if(head == null) return null;
		ListNode cur = head;
		int count = 0;
		while(cur != null) {
			cur = cur.next;
			count++;
		}
		int target = count-n+1;
		if(target == 1) return head.next;
		count = 0;
		cur = head;
		while(cur != null) {
			count++;
			if(target == count+1) {
				cur.next = cur.next.next;
				return head;
			}
			cur = cur.next;
		}
		return head;
	}

}
