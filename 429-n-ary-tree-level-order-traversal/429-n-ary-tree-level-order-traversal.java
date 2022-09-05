/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public void go(Node root,int level){
        if(root==null) return;
        
        if(result.size()<level){
            List<Integer> temp = new ArrayList<>();
            temp.add(root.val);
            result.add(temp);
        }
        else result.get(level-1).add(root.val);
        
        List<Node> child = root.children;
        for(int i=0;i<child.size();i++){
            go(child.get(i),level+1);
        }
    }
    
    public List<List<Integer>> levelOrder(Node root) {
        go(root,1);
        return result;
    }
}