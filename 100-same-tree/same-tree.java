/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //If both are null that means they are idential
        if(p==null && q==null)
        {
            return true;
        }

        //If only one tree is null that means they are not Idential
        if(p==null || q==null)
        {
          return false;
        }

        if(p.val!=q.val)
        {
            return false;
        }
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}