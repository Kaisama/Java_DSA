package dsa.linkedlist.assignment1;

public class LeetCode141LinkedListCycle {
	class ListNode {
		     int val;
		      ListNode next;
		     ListNode(int x) {
		         val = x;
		         next = null;
		      }
		 }
	public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // Detect the Cycle
                return true;
            }
        }
        return false;
    }
}
