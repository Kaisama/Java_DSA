class Solution{

    public void toSumTree(Node root){
        solve(root);
    }
    public int solve(Node root){

        if(root==null){

            return 0;

        }
        int left = solve(root.left);

        int right = solve(root.right);

        int x = root.data;

        root.data = left + right;
        return x + left+right;
    }
}
