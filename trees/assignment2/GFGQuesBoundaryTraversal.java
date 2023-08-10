class Solution
{
    void addLeftNodes(Node node , ArrayList<Integer> ans){
        if(node == null)    return;
        
        if(node.left != null){
            ans.add(node.data);
            addLeftNodes(node.left , ans);
        }
        else if(node.right != null){
            ans.add(node.data);
            addLeftNodes(node.right , ans);
        }
        return ;
    }
    
    void addLeafNodes(Node node , ArrayList<Integer> ans){
        if(node == null)    
            return;
    
        if(node.left ==null && node.right == null){
            ans.add(node.data);
            return;
        }
        
        addLeafNodes(node.left , ans);
        addLeafNodes(node.right , ans);
    }
    
    void addRightNodes(Node node , ArrayList<Integer> ans){
        if(node == null)    return;
        
        if(node.right != null){
            addRightNodes(node.right , ans);
            ans.add(node.data);
        }
        else if(node.left != null){
            addRightNodes(node.left , ans);
            ans.add(node.data);
        }
    }
    
    ArrayList <Integer> boundary(Node node)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(node.left == null  && node.right == null){
            ans.add(node.data);
            return ans;
        }
        ans.add(node.data);
        // left Nodes
        addLeftNodes(node.left , ans);
        // leaf Nodes
        addLeafNodes(node, ans);
        // right Nodes
        addRightNodes(node.right , ans);
        
        return ans;
    }
}
