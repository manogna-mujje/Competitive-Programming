package MergeSortedLists;

public class MergeSortedLists {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);	
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode res = mergeTwoLists(l1, l2);
		res.printNodes();
	}
	
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode res = dummy;
		return merge(l1,l2, res, dummy);
	}

	private static ListNode merge(ListNode l1, ListNode l2, ListNode res, ListNode dummy) {
		ListNode r = res;
		if(l1==null && l2==null) {
			return dummy.next;
		}
		else if(l1!=null && l2==null) {
			r.next = new ListNode(l1.val);
			l1 = l1.next;
			r = r.next;
			return merge(l1,l2,r, dummy);
		}
		else if(l1==null && l2!=null) {
			r.next = new ListNode(l2.val);
			l2 = l2.next;
			r = r.next;
			return merge(l1,l2,r, dummy);
		} else {
			if(l1.val < l2.val) {
				r.next = new ListNode(l1.val);
				l1 = l1.next;
			} else if (l1.val == l2.val){
				r.next = new ListNode(l1.val);
				r.next.next = new ListNode(l2.val);
				l1 = l1.next;
				l2 = l2.next;
				r = r.next;
			} else {
				r.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			r = r.next;
			return merge(l1,l2,r, dummy);	
		}
	}

	static class ListNode {
		int val;
		ListNode next;
		ListNode(int d){
			val = d;
			next = null;
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
