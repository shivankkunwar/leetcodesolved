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
    Boolean flag=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null)return p==q;  
        else{
            if(p==null&&q!=null)return flag=false;
            if(q==null&&p!=null)return flag=false;
             if(p.val!=q.val)return flag=false;
            isSameTree(p.left,q.left);
            isSameTree(p.right,q.right);
        }
           
        
       return flag;
    }
}