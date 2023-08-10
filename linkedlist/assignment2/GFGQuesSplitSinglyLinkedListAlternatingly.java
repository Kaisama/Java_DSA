class Solution {
    public void alternatingSplitList(Node head){
 Node odd = head; Node even = head.next; GFG.a = odd; GFG.b = even; 
     while(even != null && even.next != null){
         odd.next = even.next;
         odd = odd.next;
         even.next = odd.next;
         even = even.next;
     }
     odd.next = null;
    }
}
