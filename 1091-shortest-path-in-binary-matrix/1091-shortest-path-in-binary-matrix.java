class Solution {
   static class Node{
    int x;
    int y;
    int dist;
    Node(int x,int y,int dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}
public int shortestPathBinaryMatrix(int[][] grid) {
     int row=grid.length;
     int cols=grid[0].length;
    if(grid[0][0]==1 || grid[row-1][cols-1]==1)
        return -1;
    int [][] direction={
        {0,1},{1,0},{-1,0},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}   
    };
    Queue<Node> queue=new LinkedList<>();
    queue.add(new Node(0,0,1));
    grid[0][0]=1;
    while(!queue.isEmpty()){
        int size=queue.size();
        for(int i=0;i<size;i++){
            Node temp=queue.poll();
            int x=temp.x;
            int y=temp.y;
            int cost=temp.dist;
            if(x==row-1 && y==cols-1)
                return cost;
            
            for(int [] ways:direction){
                int nextX=x+ways[0];
                int nextY=y+ways[1];
                
                if(nextX>=0 && nextX<row && nextY>=0 && nextY<cols && grid[nextX][nextY]==0){
                    queue.add(new Node(nextX,nextY,cost+1));
                    grid[nextX][nextY]=1;
                }
            }
        }
    }
    return -1;
    
}
}