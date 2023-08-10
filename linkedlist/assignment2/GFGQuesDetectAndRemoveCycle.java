class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        Node fast = head;
        Node slow = head;
        boolean isCyclic = false;
        Node temp = new Node();
        temp.next = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            temp = temp.next;
            if(fast == slow){
                isCyclic = true;
                break;
            }
        }
        
        if(isCyclic){
            Node p = head;
            if(p == slow){
                temp.next = null;
                return;
            }
            while(true){
                p = p.next;
                slow = slow.next;
                temp = temp.next;
                if(p==slow){
                    temp.next = null;
                    break;
                }
                
            }
        }
    }
}
