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
    List<TreeNode> list = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        dfsInOrder(root);
        TreeNode ans = list.get(k-1);
        System.out.println("Value is :"+ans.val);
        return ans.val;
    }

    public void dfsInOrder(TreeNode root){ 
      if(root==null) return ;
      
      dfsInOrder(root.left); 
      list.add(root); 
      dfsInOrder(root.right);

    }

}