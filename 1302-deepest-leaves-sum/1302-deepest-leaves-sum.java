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
    int maxHeight=Integer.MIN_VALUE;
    int counter=0;
    int maxSum=0;
   
    public int deepestLeavesSum(TreeNode root) {
        sum(root,counter);
       return maxSum;
    }
   
    public void sum(TreeNode root,int counter){
         if(root==null)return ;
        counter++;
        sum(root.left,counter);
        if(root.left==null&&root.right==null){
            if(maxHeight<counter){
                maxHeight=counter;
                maxSum=root.val;
            } else if(maxHeight == counter){
                maxSum=maxSum+root.val;
            }
        }
        
        
        
        sum(root.right,counter);
        
       
    }
    
  
    
    
}