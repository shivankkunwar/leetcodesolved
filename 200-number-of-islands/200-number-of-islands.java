class Solution {
   public int numIslands(char[][] grid) {
        if(grid.length==0)return 0;
        int islands=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean [][] visited= new boolean[m][n];
        for( int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if( grid[i][j]=='1'&&!visited[i][j] ){
                    dfs(grid,i,j,visited);
                    islands++;
                }
            }
        }
        return islands;
    
    }
    public void dfs(char[][] arr,int i,int j ,boolean[][] visited){
        if(i<0||i>=visited.length||j<0||j>=visited[i].length||visited[i][j]==true||arr[i][j]=='0')return;
        if(arr[i][j]=='1')visited[i][j]=true;
        dfs(arr,i+1,j,visited);
        dfs(arr,i-1,j,visited);
        dfs(arr,i,j+1,visited);
        dfs(arr,i,j-1,visited);
    }}
