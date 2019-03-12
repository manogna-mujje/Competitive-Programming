package SwapNodes;

public class SwapNodes {

	public static void main(String[] args) {
		SwapNodes s = new SwapNodes();
		Node head = s.new Node(1);
		head.addNode(2);
		head.addNode(3);
		head.addNode(4);
		Node swapped = swapList(head);
		swapped.printNodes();
	}
	
	private static Node swapList(Node head) {
		Node n = head;
		if(n == null) {
			return null;
		}
		if(n.next == null) {
			return n;
		}
		swapNodes(n, n.next);
		swapList(n.next.next);
		return head;
	}

	private static void swapNodes(Node n, Node next) {
		int temp = n.data;
		n.data = next.data;
		next.data = temp;
	}

	class Node {
		int data;
		Node next;
		
		public Node(int d) {
			this.data = d;
			this.next = null;
		}

		int getData() {
			return this.data;
		}
		
		void addNode(int d) {
			Node n = this;
			Node end = new Node(d);
			while(n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
		
		void printNodes() {
			Node n = this;
			while(n != null) {
				System.out.println(n.data);
				n = n.next;
			}
		}
	}

}
