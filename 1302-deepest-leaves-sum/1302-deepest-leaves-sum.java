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
//     int sum=0;
    
//     int counter=0;
//     public int deepestLeavesSum(TreeNode root) {
//         int maxD=maxDepth(root);
//        return sum(root,maxD);
//     }
//      public int maxDepth(TreeNode node)
//     {
//         if (node == null)
//             return -1;
//         else
//         {
//             /* compute the depth of each subtree */
//             int lDepth = maxDepth(node.left);
//             int rDepth = maxDepth(node.right);
  
//             /* use the larger one */
//             if (lDepth > rDepth)
//                 return (lDepth + 1);
//              else
//                 return (rDepth + 1);
//         }
//     }
//     public int sum(TreeNode root,int maxD){
//          if(root==null)return 0;
//         counter++;
//         sum(root.left,maxD);
//         if(counter==maxD){
          
//             sum+=root.val;
//         }
        
        
//         sum(root.right,maxD);
        
//         return sum;
//     }
    
    public int deepestLeavesSum(TreeNode root){
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        int level_sum=0;
        while(!queue.isEmpty()){
            level_sum=0;
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current_node=queue.poll();
                level_sum+=current_node.val;
                if(current_node.left!=null)queue.offer(current_node.left);
                if(current_node.right!=null)queue.offer(current_node.right);
            }
        }
        return level_sum;
    }
    
    
    
}