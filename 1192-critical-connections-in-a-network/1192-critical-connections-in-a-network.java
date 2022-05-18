class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
    int[] disc = new int[n], low = new int[n];
    List<Integer>[] adjList = new ArrayList[n];
    List<List<Integer>> result = new ArrayList<>();
    Arrays.fill(disc, -1); // use disc to track if visited (disc[i] == -1)
    for (int i = 0; i < n; i++) adjList[i] = new ArrayList<>();    
    for (int i = 0; i < connections.size(); i++) {
      int from = connections.get(i).get(0);
      int to = connections.get(i).get(1);
      adjList[from].add(to);
      adjList[to].add(from);
    }
    for (int i = 0; i < n; i++) {
      if (disc[i] == -1) {
        dfs(i, low, disc, adjList, result, i);
      }
    }
    return result;
  }
  
  int time = 0; // time when discover each vertex

  private void dfs(int u, int[] low, int[] disc, List<Integer>[] adjList, List<List<Integer>> result, int pre) {
    disc[u] = low[u] = ++time; // discover u
    for (int j = 0; j < adjList[u].size(); j++) {
      int v = adjList[u].get(j);
      if (v == pre) continue; // if parent vertex, ignore      
      if (disc[v] == -1) { // if not discovered
        dfs(v, low, disc, adjList, result, u);
        low[u] = Math.min(low[u], low[v]);
        if (low[v] > disc[u]) {
          // u - v is critical, there is no path for v to reach back to u or previous vertices of u
          result.add(Arrays.asList(u, v));
        }
      } else { // if v discovered and is not parent of u, update low[u], cannot use low[v] because u is not subtree of v
        low[u] = Math.min(low[u], disc[v]);
      }
    }
  }
}