class Solution {
   
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> adj= new HashMap<>();
        
        for(int i=0;i<edges.length;i++){
                makeAd(adj,edges[i][0],edges[i][1]);
        }
        boolean[] visited= new boolean[n];
        Queue<Integer> q= new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                 int currNode=q.poll();
                if(currNode==destination)return true;
                 for(int nextNode: adj.get(currNode)){
                     
                     if(!visited[nextNode]){
                            q.add(nextNode);
                            visited[nextNode]=true;
                    }
                 }
            }
          
            
        }
        return false;
    }
    public static void makeAd(Map<Integer,List<Integer>> ad,int u,int v){
        ad.computeIfAbsent(u,f->new ArrayList<>()).add(v);
        ad.computeIfAbsent(v,f->new ArrayList<>()).add(u);
      
    }
}