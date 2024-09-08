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

    int result = 0;
    int count =0;

    public int kthSmallest(TreeNode root, int k) {
      findKSmallest(root,k);
      return result;
    }

     public void findKSmallest(TreeNode root, int k){
        if(root==null){
         return;
        }
        findKSmallest(root.left,k);
        count++;

        if(count==k){
          result = root.val;
        }

        findKSmallest(root.right,k);
     }
     
}