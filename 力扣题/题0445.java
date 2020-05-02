package 力扣题;

import java.util.Stack;

public class 题0445 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		while (l1 != null) {
			stack1.push(l1.val);
			l1 = l1.next;
		}
		while (l2 != null) {
			stack2.push(l2.val);
			l2 = l2.next;
		}

		int carry = 0;
		ListNode head = null;
		while (!stack1.isEmpty() || !stack2.isEmpty() || carry > 0) {
			int sum = carry;
			sum += stack1.isEmpty() ? 0 : stack1.pop();
			sum += stack2.isEmpty() ? 0 : stack2.pop();
			ListNode node = new ListNode(sum % 10);
			node.next = head;
			head = node;
			carry = sum / 10;
		}
		return head;
	}
}
