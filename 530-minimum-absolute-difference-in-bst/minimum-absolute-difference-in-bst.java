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

    int prev =-1;
    int min_diff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
         return min_diff;
        }
      
      getMinimumDifference(root.left);
      if(prev>=0){
        min_diff = Math.min(min_diff,root.val-prev);
      }
      prev = root.val;
      getMinimumDifference(root.right);
      return min_diff;
    }
}