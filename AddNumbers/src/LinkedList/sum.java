package LinkedList;

public class sum {

	public static void main(String[] args) {
		ListNode n1 =  new ListNode(2);
		n1.next = new ListNode(4);
		n1.next.next = new ListNode(3);
		
		ListNode n2 =  new ListNode(5);
		n2.next = new ListNode(6);
		n2.next.next = new ListNode(4);
		
		ListNode res = addNumbers(n1, n2);
		
		res.printNodes();
		
	}

	private static ListNode addNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode res = dummy;
		int ans, carry = 0, l1Val, l2Val;
		while(l1!=null || l2!=null) {
			l1Val = (l1 == null) ? 0 : l1.val;
			l2Val = (l2 == null) ? 0 : l2.val;
			ans = l1Val+l2Val+carry;
			res.next = new ListNode(ans%10);
			carry = ans/10;
			l1 = l1.next;
			l2 = l2.next;
			res = res.next;
		}
		return dummy.next;
		
	}

} 
