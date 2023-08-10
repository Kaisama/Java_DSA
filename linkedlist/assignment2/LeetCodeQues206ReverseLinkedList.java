class Solution {
    public ListNode reverseList(ListNode head) {

// iterative approach
        // ListNode curr = head;
        // ListNode nextt; 
        // ListNode prev = null;

        // while(curr != null){
        //    nextt = curr.next;
        //    curr.next = prev;
        //    prev = curr;
        //    curr = nextt;
        // }

        // return prev;

      
// recursive approach
        if(head==null || head.next==null){
            return head;
        }
        ListNode reverseHead = head.next;
        ListNode smallInput = reverseList(head.next);
        reverseHead.next = head;
        head.next = null;
        return smallInput;
    }
}
