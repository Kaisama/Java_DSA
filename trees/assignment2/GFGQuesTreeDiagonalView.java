class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
         Queue<Node> q=new LinkedList<>();
      ArrayList<Integer> list=new ArrayList<>();
      q.add(root);
      while(!q.isEmpty()){
          Node curr=q.poll();
          while(curr!=null){
              if(curr.left!=null){
                  q.add(curr.left);
                  
              }
              list.add(curr.data);
                  curr=curr.right;
          }
      }
        
       return list;  
      }
}
