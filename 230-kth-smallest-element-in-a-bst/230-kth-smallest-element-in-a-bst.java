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
    ArrayList<Integer> ans= new ArrayList<>();  
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> opt=helper(root);
        for(int i=0;i<opt.size();i++){
            if(i==k-1)return opt.get(i);
        }
      return -1;
    }
    public ArrayList<Integer> helper(TreeNode root){
        if(root== null)return null;
        helper(root.left);
        ans.add(root.val);
        helper(root.right);
        return ans;
    }
}