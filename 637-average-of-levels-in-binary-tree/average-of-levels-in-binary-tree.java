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

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> list = new ArrayList<>();
         queue.add(root);
         queue.add(null);

        if(root==null)
        {
          return list;
        }

       while(queue.peek()!=null)
       {
         Double sum = 0.0;
         int node = 0;

         while(queue.peek()!=null)
         {
            TreeNode temp = queue.poll();
            sum += temp.val;
            node++;

            if(temp.left!=null)
            {
              queue.add(temp.left);
            }

            if(temp.right!=null)
            {
              queue.add(temp.right);
            }
         }  
         
            queue.add(queue.poll());
            list.add(sum/node);    
       }
       return list;
    }

}