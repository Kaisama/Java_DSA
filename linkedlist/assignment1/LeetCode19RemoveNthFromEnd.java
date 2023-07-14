package dsa.linkedlist.assignment1;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
}
public class LeetCode19RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;     

        for(int i = 1; i <= n; ++i)
            fast = fast.next;
    
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return start.next;
    }
}
