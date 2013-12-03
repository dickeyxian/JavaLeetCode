package leetcode;

public class RemoveDuplicatesfromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode cur = head;
		while (cur != null) {
			ListNode node = cur.next;
			if (node != null && cur.val == node.val) {
				if (node.next != null) {
					cur.next = node.next;
				} else {
					cur.next = null;
				}
			} else {
				cur = cur.next;
			}
		}
		return head;
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
		int d[] = { 1, 1, 2, 2 };
		ListNode link = MakeLinkedList(d);
		ListNode result = deleteDuplicates(link);
		printLink(link);
	}

}
