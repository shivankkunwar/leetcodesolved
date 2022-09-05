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
    List<List<Integer>> answer= new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null)return new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int sz= q.size();
             ArrayList<Integer> mid= new ArrayList<>();
            while(sz-->0){
                Node curr=q.poll();
                 mid.add(curr.val);
               for(Node child:curr.children){
                   q.add(child);
                  
               }
            }
            answer.add(mid);
        }
        
        
        
        return answer;
        
    }
}