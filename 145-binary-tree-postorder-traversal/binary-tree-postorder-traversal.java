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

    public void postOrderTraversal(TreeNode root)
    {
       if(root==null)
       {
         return ;
       }

       postOrderTraversal(root.left);
       postOrderTraversal(root.right);
       list.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        list = new ArrayList<Integer>();

        if(root==null)
        {
            return list;
        }
        postOrderTraversal(root);
        return list;
    }
}