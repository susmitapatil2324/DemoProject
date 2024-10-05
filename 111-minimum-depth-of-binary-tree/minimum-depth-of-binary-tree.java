class Solution {
    
    public int minDepth(TreeNode root) {
      
        if(root==null){
            return 0;
        }  

        int leftDepth  = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        //Skewed Tree
        if(Math.min(leftDepth,rightDepth)==0)
        {
            return 1+Math.max(leftDepth,rightDepth);
        }else
        //Non-Skewed Tree
         return 1+Math.min(leftDepth,rightDepth);
   }
}