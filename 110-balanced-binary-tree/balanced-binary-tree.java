class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }

        if(heightOfBinaryTree(root)==-1){
          return false;
        }
        return true;
    }

    public int heightOfBinaryTree(TreeNode root){
       if(root==null){
        return 0;
       }

       int leftHeight  = heightOfBinaryTree(root.left);
       int rightHeight = heightOfBinaryTree(root.right);

       if(leftHeight==-1 || rightHeight==-1 ){
        return -1;
       }

       if(Math.abs(leftHeight-rightHeight)>1){
        return -1;
       }

       return Math.max(leftHeight,rightHeight)+1;
    }
}