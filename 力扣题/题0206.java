package 力扣题;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class 题0206 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	public ListNode reverseList(ListNode head) {
		if (head==null||head.next == null) {
			return head;
		}
		ListNode end = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return end;
	}

}
