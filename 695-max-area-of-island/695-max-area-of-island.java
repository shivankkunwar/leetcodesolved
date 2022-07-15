class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]  checker=new int [m][n];
        int max=0;
        for( int i=0;i<grid.length;i++){
                for( int j=0;j<grid[i].length;j++){
                    if(grid[i][j]==1&&checker[i][j]!=1) {
                        
                        max=Math.max(max,helper(grid,checker,i,j));
                    }
                    
                }
            }
        return max;
    }
    public int helper(int[][]grid,int[][]checker,int i ,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return 0;    
        }
         if(grid[i][j]==1&&checker[i][j]!=1){
             checker[i][j]=1;
             return 1+helper(grid,checker,i+1,j)+helper(grid,checker,i-1,j)+helper(grid,checker,i,j+1)+helper(grid,checker,i,j-1);
         }
    
    return 0;
    }
    
}