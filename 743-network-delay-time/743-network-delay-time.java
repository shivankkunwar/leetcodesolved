class NodePair{
    int node2;
    int weight;
    
   public NodePair(int n,int w)
   {
        node2=n;
        weight=w;
    }
    
    // @Override
    // public String toString(){
    //     return "("+node2+","+ weight + ")";
    // }
}
class Entry{
    int node ;
    int weight;
    public Entry(int n,int w)
   {
        node=n;
        weight=w;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int src) {
        Map<Integer,List<NodePair>> adj=new HashMap<>();
        for(int [] edge:times){
            adj.computeIfAbsent(edge[0],f->new ArrayList<>()).add(new NodePair(edge[1],edge[2]));
            
            
        }
        
        int dist[]= dikstraPQ(adj,src,n);
        int ans=0;
       for( int i=1;i<dist.length;i++){
            if(dist[i]==Integer.MAX_VALUE)return -1;
            ans=Math.max(ans,dist[i]);
       }
           
        
        return ans;
        
        }
    
        public int[] dikstraPQ(Map<Integer,List<NodePair>> adj,int src ,int n){
            
            int[] distance= new int[n+1];
            Arrays.fill(distance,Integer.MAX_VALUE);
            boolean visited[]= new boolean[n+1];
            distance[src]=0;
            PriorityQueue<Entry> pq= new PriorityQueue<>((e1,e2)->e1.weight-e2.weight);
            pq.add(new Entry(src,0));
            
            while(!pq.isEmpty()){
                Entry currEntry=pq.poll();
                int currNode= currEntry.node;
                if(visited[currNode])continue;
                visited[currNode]=true;
                
                for(NodePair Node2: adj.computeIfAbsent(currNode,f->new ArrayList<NodePair>())){
                    int adjacentNode= Node2.node2;
                    int weight= Node2.weight;
                    
                    if(distance[currNode]+weight<distance[adjacentNode]){
                        distance[adjacentNode]=distance[currNode]+weight;
                        pq.add(new Entry(adjacentNode,distance[adjacentNode]));
                    }
                }
                
                
            }
            
            return distance;
        }
         
    }
//         Map<Integer,List<NodePair>> adj= new HashMap<>();
        
//         for(int [] edge:times){
//             //go over every edge having connection and add the connected node and weight between them
//             adj.computeIfAbsent(edge[0],f->new ArrayList<>()).add(new NodePair(edge[1],edge[2]));
//         }
        
        
       
//         int [] distance = Dijkstra(adj,src,n);
        
//         int ans=Integer.MIN_VALUE;
//         for(int i:distance){
        
//             if(i==Integer.MAX_VALUE)return -1;
//             ans=Math.max(ans,i);
            
//         }
//         return ans;
//     }
//     public int[] Dijkstra (Map<Integer,List<NodePair>> adj, int src,int n){
//         int [] dist= new int[n+1];
//         Arrays.fill(dist,Integer.MAX_VALUE);
//         boolean[] visited= new boolean[n+1];
//         dist[src]=0;
//         dist[0]=-1;
//         for(int i=0;i<=n-1;i++){
            
//             int currNode=getMeUnvistedNodeClosestToMyLevel(dist,visited);
//             if(currNode==-1)return dist;
//             visited[currNode]=true;
//             for(NodePair AdjPair:adj.computeIfAbsent(currNode,f->new ArrayList<>())){
//                 int node2=AdjPair.node2;
//                 int weight =AdjPair.weight;
                
//                 if(dist[currNode]+weight<dist[node2])//if node2 distance from other connection is more than the distance from currNode so update the new Distance 
//                     dist[node2]=dist[currNode]+weight;
//                 }
            
//         }
//         return dist;
//         }
//     public int getMeUnvistedNodeClosestToMyLevel(int [] dist,boolean [] visited){
//             int nextNode=-1,MinDistance=Integer.MAX_VALUE;
//             for( int i=0;i<dist.length;i++){
//                 if(!visited[i]&&dist[i]<MinDistance){
//                     MinDistance=dist[i];
//                     nextNode=i;
//                 }   
//             }
//         return nextNode;
//     }
