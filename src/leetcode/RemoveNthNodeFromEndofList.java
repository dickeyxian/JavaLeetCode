package leetcode;

public class RemoveNthNodeFromEndofList {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode pre = new ListNode(0);
		ListNode end = new ListNode(0);
		pre.next = head;
		end.next = head;
		head = pre;
		head = end;
		for (int i = 0; i < n; i++) {
			pre = pre.next;
		}
		while (pre.next != null) {
			pre = pre.next;
			end = end.next;
		}
		end.next = end.next.next;
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
		int d[] = { 1 };
		ListNode link = MakeLinkedList(d);
		ListNode result = removeNthFromEnd(link, 1);
		printLink(result);
	}

}
