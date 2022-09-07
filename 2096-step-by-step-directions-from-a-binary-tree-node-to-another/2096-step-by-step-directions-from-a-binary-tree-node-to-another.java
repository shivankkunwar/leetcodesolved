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
     public String getDirections(TreeNode root, int startValue, int destValue) {
       StringBuilder startPath = new StringBuilder();
       StringBuilder destPath = new StringBuilder();
       StringBuilder res = new StringBuilder();
        
       dfs(root,startPath,startValue);
       dfs(root,destPath,destValue);
       startPath.reverse(); destPath.reverse(); 
       
        int minLen = Math.min(startPath.length(), destPath.length());
        
        int i = 0;
        while(i<minLen) {
            if(startPath.charAt(i)!=destPath.charAt(i))
                break;
            i++;
        }
        
        for(int j=i;j<startPath.length();j++)
            res.append("U");
        
        res.append(destPath.substring(i,destPath.length()));
        
        return res.toString();
        
    }  
    
    
    public boolean dfs(TreeNode root, StringBuilder sb, int target) {
        
        if(root==null)
            return false;
        
        if(root.val==target)
            return true;
        
        if(dfs(root.left,sb,target)) {
            sb.append("L");
            return true;
        }
        
        if(dfs(root.right,sb,target)) {
            sb.append("R");
            return true;
        }
        
        return false;
    }}