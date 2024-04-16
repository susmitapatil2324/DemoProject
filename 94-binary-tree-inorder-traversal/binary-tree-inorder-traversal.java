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

    public void travels(TreeNode root)
    {
       if(root==null)
       {
         return;
       }
       //Inorder --> Left --> Root-->Right
       travels(root.left);
       list.add(root.val);
       travels(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();

        if(root==null)
        {
          return list;
        }
        travels(root);
        return list;
    }
}