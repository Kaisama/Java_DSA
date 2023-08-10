class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
    {
        if(root1==null && root2==null)return true;
        if(root1==null || root2==null||root1.data!=root2.data)return false;
        
        boolean l1=isIdentical(root1.left,root2.left);
        boolean l2=isIdentical(root1.right,root2.right);
        
        if(l1&l2)
        return true;
        
        return false;
    }
	
}
