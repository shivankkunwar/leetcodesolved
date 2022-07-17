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
   public  boolean Flag=true;
    public boolean isBalanced(TreeNode root) {
        if(root!=null){
            heighter(root);
        }  
       return Flag; 
    }
    public int heighter(TreeNode root){
        if(root!=null){
            int left=heighter(root.left);
            int right= heighter(root.right);
            
            if(Math.abs(left-right)>1)Flag=false;
            
            return 1+Math.max(left,right);
        }
        return 0;
    }
    
}