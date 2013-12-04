package leetcode;

public class RotateList {
	public static ListNode rotateRight(ListNode head, int n) {
		if (head == null || n == 0) {
			return head;
		}
		ListNode cur = head;
		int count = 1;
		while (cur.next != null) {
			++count;
			cur = cur.next;
		}
		n = n % count;
		cur.next = head;
		for (int i = 0; i < count - n; i++) {
			cur = cur.next;
		}
		head = cur.next;
		cur.next = null;
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
		int d[] = { 1, 2, 3, 4, 5, 6 };
		ListNode link = MakeLinkedList(d);
		ListNode result = rotateRight(link, 2);
		printLink(result);
	}

}
