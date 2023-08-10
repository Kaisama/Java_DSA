class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        int carry = 0;

        while(temp1 != null && temp2 != null){
            int sum =0;
            sum = temp1.val + temp2.val + carry;
            dummy.next = new ListNode(sum%10);
            carry = sum/10;
            temp1= temp1.next;
            temp2 = temp2.next;
            dummy = dummy.next;
        }

        while(temp1 != null){
            int sum =0;
            sum = temp1.val + carry;
            dummy.next = new ListNode(sum%10);
            carry = sum/10;
            temp1= temp1.next;
            dummy = dummy.next;
        }
        while(temp2 != null){
            int sum =0;
            sum = temp2.val + carry;
            dummy.next = new ListNode(sum%10);
            carry = sum/10;
            temp2= temp2.next;
            dummy = dummy.next;
        }
        if(carry > 0){
            dummy.next = new ListNode(carry);
            dummy = dummy.next;
        }

        return ans.next;
    }
}
