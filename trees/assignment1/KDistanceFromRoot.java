class Tree
{
     // Recursive function to print right view of a binary tree.
     void preorder(Node root,ArrayList<Integer> arr,int k)
     {
         if(root==null)
         {
            
             return;
         }
         if(k==0)arr.add(root.data);
         preorder(root.left,arr,k-1);
         preorder(root.right,arr,k-1);
     }
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
          ArrayList<Integer> arr=new ArrayList<>();
          preorder(root,arr,k);
          return arr;
     }
}
