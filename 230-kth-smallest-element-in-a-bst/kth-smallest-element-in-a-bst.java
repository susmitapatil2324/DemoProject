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

    Set<Integer> set = new HashSet<Integer>();

    public void getNodeFromTree(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        getNodeFromTree(root.left);
        set.add(root.val);
        getNodeFromTree(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        getNodeFromTree(root);
         List<Integer> list = new ArrayList<>(set);
        int ans = list.get(k-1);
       return ans;
    }
}