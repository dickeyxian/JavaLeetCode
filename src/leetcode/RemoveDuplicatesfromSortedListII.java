package leetcode;

public class RemoveDuplicatesfromSortedListII {
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = new ListNode(0);
		pre.next = head;
		head = pre;
		ListNode p = head;
		while (p.next != null) {
			ListNode cur = p.next;
			while (cur.next != null && cur.val == cur.next.val) {
				cur = cur.next;
			}
			if (p.next != cur) {
				p.next = cur.next;
			} else {
				p = p.next;
			}
		}
		return head.next;
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
		int d[] = { 1,1,2,2,2,2,3};
		ListNode link = MakeLinkedList(d);
		ListNode result = deleteDuplicates(link);
		printLink(result);
	}
}
