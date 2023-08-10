class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class Pair{
        Node node;
        int hd;
        Pair(Node n,int h){
            node=n;
            hd=h;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null)
        return arr;
        Map<Integer,Integer> m=new TreeMap<Integer,Integer>();
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it=q.poll();
            int hd=it.hd;
            Node temp=it.node;
            if(m.get(hd)==null){
            m.put(hd,temp.data);
            }
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,hd+1));
            }
            
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            arr.add(entry.getValue());
        }
        return arr;

    }
}
