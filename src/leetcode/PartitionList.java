package leetcode;

public class PartitionList {
	public static ListNode partition(ListNode head, int x) {
		ListNode left = new ListNode(0);
		ListNode right = new ListNode(0);
		ListNode left_cur = left;
		ListNode right_cur = right;
		while (head != null) {
			if (head.val < x) {
				left_cur.next = head;
				left_cur = head;
			}else {
				right_cur.next = head;
				right_cur = head;
			}
			head = head.next;
		}
		left_cur.next = right.next;
		right_cur.next = null;
		return left.next;
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
		int d[] = { 2, 1};
		ListNode link = MakeLinkedList(d);
//		printLink(link);
		ListNode result = partition(link, 2);
		printLink(result);
	}

}
