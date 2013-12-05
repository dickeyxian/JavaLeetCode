package leetcode;

public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (true) {
			if (fast == null || fast.next == null) {
				return false;
			} else {
				slow = slow.next;
				fast = fast.next.next;
				printLink(slow);
				printLink(fast);
			}
			if (fast == slow) {
				return true;
			}
		}
	}
	public static boolean hasCycle2(ListNode head) {
		if (head == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow){
				return true;
			}
		}
		return false;
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
		System.out.println(hasCycle2(link));
	}

}
