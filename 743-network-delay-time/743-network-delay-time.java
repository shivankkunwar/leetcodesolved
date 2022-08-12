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
      // Adjacency list
    Map<Integer, List<Pair<Integer, Integer>>> adj = new HashMap<>();
    
    private void dijkstra(int[] signalReceivedAt, int source, int n) {
        Queue<Pair<Integer, Integer>> pq = new PriorityQueue<Pair<Integer,Integer>>
            (Comparator.comparing(Pair::getKey));
        pq.add(new Pair(0, source));
        
        // Time for starting node is 0
        signalReceivedAt[source] = 0;
        
        while (!pq.isEmpty()) {
            Pair<Integer, Integer> topPair = pq.remove();
            
            int currNode = topPair.getValue();
            int currNodeTime = topPair.getKey();
            
            if (currNodeTime > signalReceivedAt[currNode]) {
                continue;
            }
            
            if (!adj.containsKey(currNode)) {
                continue;
            }
            
            // Broadcast the signal to adjacent nodes
            for (Pair<Integer, Integer> edge : adj.get(currNode)) {
                int time = edge.getKey();
                int neighborNode = edge.getValue();
                
                // Fastest signal time for neighborNode so far
                // signalReceivedAt[currNode] + time : 
                // time when signal reaches neighborNode
                if (signalReceivedAt[neighborNode] > currNodeTime + time) {
                    signalReceivedAt[neighborNode] = currNodeTime + time;
                    pq.add(new Pair(signalReceivedAt[neighborNode], neighborNode));
                }
            }
        }
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        // Build the adjacency list
        for (int[] time : times) {
            int source = time[0];
            int dest = time[1];
            int travelTime = time[2];
            
            adj.putIfAbsent(source, new ArrayList<>());
            adj.get(source).add(new Pair(travelTime, dest));
        }
        
        int[] signalReceivedAt = new int[n + 1];
        Arrays.fill(signalReceivedAt, Integer.MAX_VALUE);
        
        dijkstra(signalReceivedAt, k, n);
        
        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            answer = Math.max(answer, signalReceivedAt[i]);
        }
        
        // INT_MAX signifies atleat one node is unreachable
        return answer == Integer.MAX_VALUE ? -1 : answer;
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
