class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        int count=1;
        Node temp=head;
        while(temp!=null) {
            temp=temp.next;
            count++;
        }
        int ans=0;
        temp=head;
        for(int i=1;i<count-n+1;i++) {
            ans=temp.data;
            temp=temp.next;
        }
        if(ans==0) return -1;
        return ans;
    }
}
