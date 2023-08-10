class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        
        //find middle of the linkedList
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the right half
        slow.next = reverseList(slow.next);

        slow=slow.next;     
        //now,slow is pointing to the first node of right half
        
        while(slow!=null){
            if(head.val!=slow.val)  
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head){
        ListNode next = null;
        ListNode pre = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
