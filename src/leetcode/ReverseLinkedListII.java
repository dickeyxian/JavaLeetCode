package leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class ReverseLinkedListII {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if (m > n) {
			return null;
		}
		if (m == n) {
			return head;
		}
		ListNode node = null;
		int count = 0;
		while (head != null) {
			count++;
			if (count == m) {
				
			}
		}
		return node;
	}

	public static ListNode MakeLinkedList(int d[]) {
		// ListNode tail = new ListNode(d[0]);
		// // ListNode pre = head;
		// ListNode cur = tail;
		// for (int i = 1; i < d.length; i++) {
		// cur = new ListNode(d[i]);
		// cur.next = tail;
		// tail = cur;
		// }
		// return tail;
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
		int d[] = { 1, 9, 3, 4, 5 };
		ListNode link = MakeLinkedList(d);
		printLink(link);
	}

}
