package 力扣题;

public class 题0876 {

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		题0876 test=new 题0876();
		ListNode head = null;
		test.middleNode(head);
	}
    public ListNode middleNode(ListNode head) {
    	int len=0;
    	while(head.next==null) {
    		len++;
    		head=head.next;
    	}
    	System.out.println(len);
		return head;

    }

}
