package leetcode;

public class ReverseNodesinkGroup {
	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode p = new ListNode(0);
		p.next = head;
		return p.next;
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
		int d[] = { 1, 2, 3, 4, 5, 6, 7 };
		ListNode link = MakeLinkedList(d);
		ListNode result = reverseKGroup(link, 2);
		printLink(result);
	}

}
