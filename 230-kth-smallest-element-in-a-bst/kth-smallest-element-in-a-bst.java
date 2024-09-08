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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<TreeNode> nodes=new ArrayList<>();
        dfs(root,nodes);
        return(nodes.get(k-1).val); /*
        /* K-1 because indexstart at zero suppose I want 3rd smallest that is present in 2nd 
          place in arraylist that's why we are doing k-1*/  
    }

    public static void dfs(TreeNode root,ArrayList<TreeNode> nodes){
        if(root==null) return;

        dfs(root.left,nodes);
        nodes.add(root);
        dfs(root.right,nodes);
        
    }
}