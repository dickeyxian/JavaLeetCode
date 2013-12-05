package leetcode;

public class SwapNodesinPairs {
	public static ListNode swapPairs(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode p = new ListNode(0);
		p.next = head;
		ListNode cur = p;
		while (cur.next != null && cur.next.next != null) {
			ListNode q1 = cur.next;
			ListNode q2 = cur.next.next;
			q1.next = q2.next;
			q2.next = q1;
			cur.next = q2;
			cur = q1;
		}
		return p.next;
	}
	public static ListNode reverseList(ListNode headerNode){
		ListNode currNode = headerNode;
		ListNode prevNode = null;
		ListNode nextNode = null;
		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		return prevNode;
	}

	public static ListNode MakeLinkedList(int d[]) {
		ListNode head = new ListNode(d[0]);
		ListNode pre = head;
		ListNode cur = head;
		for (int i = 1; i < d.length; i++) {
			cur = new ListNode(d[i]);
			pre.next = cur;
			pre = cur;
		}
		return head;
	}

	public static void printLink(ListNode link) {
		while (link != null) {
			System.out.print(link.val + "-->");
			link = link.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int d[] = {1,2,3,4,5,6};
		ListNode link = MakeLinkedList(d);
		ListNode result = reverseList(link);
		printLink(result);
		//ListNode result = swapPairs(link);
		//printLink(result);
	}

}
