class Solution{
    public static int findMax(Node root){
        //code here
        if(root==null) return Integer.MIN_VALUE;
        int left = findMax(root.left);
        int right =findMax(root.right);
        
        int max = Math.max(root.data,Math.max(left,right));
        return max;
    }
}
