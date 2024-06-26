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

    List<Integer> list = new ArrayList<Integer>();
    public void inorder(TreeNode root)
    {
       //Base case
        if(root==null)
        {
            return ;
        } 
      //Using Inorder travel --> left root right
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public boolean findTarget(TreeNode root, int k) {
      inorder(root);
      int n = list.size();
      int i=0;
      int j = n-1;

      while(i<j)
      {
         int sum = list.get(i) + list.get(j);

         if(sum==k)
         {
            return true;
         }

         else if(sum<k)
         {
           i++;
         }
         else if(sum>k)
         {
           j--;
         }
      }
      return false;
    }
}