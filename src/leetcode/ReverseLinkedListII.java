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
		ListNode p = new ListNode(0);
		ListNode pre = p;
		ListNode middle = null;
		ListNode e = new ListNode(0);
		ListNode end = e;
		ListNode node = null;
		int count = 0;
		while (head != null) {
			count++;
			if (m == n + 1) {
				node = new ListNode(head.val);
				end.next = node;
				end = node;
				m++;
				n++;
				head = head.next;
			} else if (count == m) {
				node = new ListNode(head.val);
				node.next = middle;
				middle = node;
				m++;
				head = head.next;
			} else {
				node = new ListNode(head.val);
				pre.next = node;
				pre = node;
				head = head.next;

			}
		}
		ListNode premiddle = contactlink(p.next, middle);
		ListNode result = contactlink(premiddle, e.next);
		return result;
	}

	public static ListNode contactlink(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode temp = l1;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = l2;
		return l1;
	}

	public static ListNode reverseBetween2(ListNode head, int m, int n) {
		ListNode q = null;
		ListNode p = head;
		for (int i = 0; i < m - 1; i++) {
			q = p;
			p = p.next;
		}
		ListNode end = p;
		ListNode prep = p;
		p = p.next;
		for (int i = m + 1; i <= n; i++) {
			ListNode pnext = p.next;
			p.next = prep;
			prep = p;
			p = pnext;
		
		}

		end.next = p;
		if (q != null) {
			q.next = prep;
		} else {
			head = prep;
		}
		return head;
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
		int d[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		ListNode link = MakeLinkedList(d);
		// printLink(link);
		ListNode result = reverseBetween2(link, 3, 5);
		printLink(result);
	}

}
