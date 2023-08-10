class Solution
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             Node one=list.head;
             Node two=list.head;
             Node ptr=list.head;

             int count=1;
             while(one.next!=ptr){
                 one=one.next;
                 count++;
             }

             int n=0;
             if(count%2==0)
                n=count/2;
             else
                n=count/2 + 1;

             for(int i=1;i<n;i++){
                 two=two.next;
             }

             list.head1=ptr;
             list.head2=two.next;
             two.next=list.head1;
             one.next=list.head2;
	 }
}
