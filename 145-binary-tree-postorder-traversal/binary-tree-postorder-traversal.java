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
     
    static List<Integer> list;

    private static void traversePostOrder(TreeNode node)
    {
        if(node==null)
        {
           return;
        }
         traversePostOrder(node.left);
         traversePostOrder(node.right);
         list.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {    
      list = new ArrayList<>();

        if(root==null)
        {
            return list;
        }
      traversePostOrder(root);
      return list;
    }
}