class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
       Queue<Integer> queue=new LinkedList<>();
      Set<Integer> visited=new HashSet<>(); 
       
      queue.add(0);
      while(!queue.isEmpty())
      {
        int size=queue.size();
        for(int i=0;i<size;i++)
        {
          int current = queue.poll(); 
          if(visited.contains(current))
            continue;
          
          visited.add(current);
          for(int next:rooms.get(current))
             queue.add(next); 
        }
      }
      
      if(visited.size()==rooms.size())
        return true;
      else 
        return false; 
    }
}