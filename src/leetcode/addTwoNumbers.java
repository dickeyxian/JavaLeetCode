package leetcode;

//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode(int x) {
//		val = x;
//		next = null;
//	}
//}

public class addTwoNumbers {
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

	public static ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode head = new ListNode(0);
		ListNode cur = head;
		int plus = 0;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + plus;
			plus = sum / 10;
			sum = sum % 10;
			cur.next = new ListNode(sum);
			cur = cur.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			int sum = l1.val + plus;
			plus = sum / 10;
			sum = sum % 10;
			cur.next = new ListNode(sum);
			cur = cur.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			int sum = l2.val + plus;
			plus = sum / 10;
			sum = sum % 10;
			cur.next = new ListNode(sum);
			cur = cur.next;
			l2 = l2.next;
		}
		if (plus == 1) {
			cur.next = new ListNode(1);
		}
		return head.next;
	}

	public static ListNode AddTwoNumbers2(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode head = new ListNode(0);
		ListNode cur = head;
		int plus = 0;
		while (l1 != null || l2 != null || plus != 0) {
			int a = l1 == null ? 0 : l1.val;
			int b = l2 == null ? 0 : l2.val;
			int sum = a + b + plus;
			plus = sum / 10;
			sum = sum % 10;
			cur.next = new ListNode(sum);
			cur = cur.next;
			l1 = l1 == null ? null : l1.next;
			l2 = l2 == null ? null : l2.next;
		}
		return head.next;
	}

	public static void main(String[] args) {
		int d1[] = { 1, 9, 3, 4, 5 };
		int d2[] = { 9};
		ListNode link1 = MakeLinkedList(d1);
		ListNode link2 = MakeLinkedList(d2);
		// printLink(link1);
		// printLink(link2);
		ListNode result = AddTwoNumbers2(link1, link2);
		printLink(result);
	}

}
