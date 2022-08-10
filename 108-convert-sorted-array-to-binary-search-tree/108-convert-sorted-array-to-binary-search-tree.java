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
    public TreeNode sortedArrayToBST(int[] nums) {
       int start=0;
        int end=nums.length;
       return GetTree(nums,start,end);
        
        
        
    }
    public TreeNode GetTree(int[] nums,int i,int j){
        if(j<i)return null;
        int mid=i+(j-i)/2;
        if(mid<0||mid>=nums.length)return null;
        TreeNode root=new TreeNode(nums[mid],GetTree(nums,i,mid-1),GetTree(nums,mid+1,j));
       
        return root;
    }
   
}