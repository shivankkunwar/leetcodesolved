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
    public boolean isBalanced(TreeNode root) {
      
           return heighter(root)==-1?false:true;

    }
    public int heighter(TreeNode root){
        if(root!=null){
            int left=heighter(root.left);
            if(left==-1)return -1;
            int right= heighter(root.right);
            if(right==-1)return -1;
            
            if(Math.abs(left-right)>1)return -1;
            
            else return 1+Math.max(left,right);
        }
        return 0;
    }
    
}