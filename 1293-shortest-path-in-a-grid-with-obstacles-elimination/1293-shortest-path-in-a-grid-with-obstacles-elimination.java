class Node{
    int currRow;
    int currCol;
    int currPow;
    
    Node( int a,int b,int c){
        currRow=a;
        currCol=b;
        currPow=c;
    }
}
class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m=grid.length;
        int n= grid[0].length;
        if(m==1&&n==1)return 0;
        int[][] maxPower=new int[m][n];
        for(int inner[]:maxPower){
            Arrays.fill(inner,-1);
        }
        Queue<Node> q= new LinkedList<>();
        q.add(new Node(0,0,k));
        maxPower[0][0]=k;
        int level=0;
        int [][] dir= new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int sz=q.size();
            while(sz-->0){
                
                Node currNode=q.poll();
                for(int i=0;i<dir.length;i++){
                    int nextRow=currNode.currRow+dir[i][0];
                    int nextCol=currNode.currCol+dir[i][1];
                    if(nextRow==m-1&&nextCol==n-1)return level+1;
                    if(nextRow>=0&&nextCol>=0&&nextRow<m&&nextCol<n){
                            
                        if(grid[nextRow][nextCol]==1&&currNode.currPow>0&&maxPower[nextRow][nextCol]<currNode.currPow-1){
                            q.add(new Node(nextRow,nextCol,currNode.currPow-1));
                            maxPower[nextRow][nextCol]=currNode.currPow-1;
                        }
                        else if(grid[nextRow][nextCol]==0&&maxPower[nextRow][nextCol]<currNode.currPow){
                            q.add(new Node(nextRow,nextCol,currNode.currPow));
                            maxPower[nextRow][nextCol]=currNode.currPow;
                        }
                    }
                }
            }
            
            level++;
            
        }
        return -1;
    }
}