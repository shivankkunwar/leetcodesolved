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
    public int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root!=null){
               
           lengther(root);
        }
        return max;
    }
    public int lengther(TreeNode root){
        if(root!=null){
                int left=lengther(root.left);
                int right=lengther(root.right);
                 max=Math.max(max,left+right);
                return 1+Math.max(left,right);
            }
        return 0;
    }
   
    
}