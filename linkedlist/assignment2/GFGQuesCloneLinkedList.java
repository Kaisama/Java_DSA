class Solution {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
    
        Node temp = head;
        // create node in front of every node.
        while(temp!=null){
        Node node = new Node(temp.data);
        node.next = temp.next;
        temp.next = node;
        temp = node.next;
        }
        
        Node head2 = head.next;
        
        temp = head;
        
        //map temp also in new linked list.
        while(temp!=null){
            
            if(temp.arb != null){
              temp.next.arb = temp.arb.next;  
            }
            else{
                temp.next.arb = null;
            }
            
            temp = temp.next.next;
        }
        
         temp = head;
         Node temp2 = head2; 
         
        //seprate new linked list and temparary linked list.
        while(temp2!=null && temp2.next!=null){
            
            temp.next = temp2.next;
            temp = temp.next;
            
            temp2.next = temp.next;
            temp2 = temp2.next;
            
        }
        
        //seprating last node of orignal and cloned linked list.
         temp.next = null;
         temp2.next = null;
        
        
        return head2;
    }
}
