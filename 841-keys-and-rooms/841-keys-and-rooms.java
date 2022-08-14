class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[]= new boolean[rooms.size()];
        Queue<Integer> q= new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                int curr=q.poll();
                visited[curr]=true;
                for(int nextNode:rooms.get(curr)){
                    
                    if(!visited[nextNode])q.add(nextNode);
                }
            }
        }
        
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false)return false;
        }
        return true;
    }
}