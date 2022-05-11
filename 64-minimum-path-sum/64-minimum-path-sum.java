class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for( int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return check(grid,m-1,n-1,dp);
        
        
    }
    public int check(int[][]grid,int i,int j,int [][]dp){
        if(dp[i][j]!=-1)return dp[i][j];        
        if(i<0||j<0)return Integer.MAX_VALUE;
        int result;
        if(i==0&&j==0)return grid[i][j];
        else if(i==0){
            result=grid[i][j]+check(grid,i,j-1,dp);
        }
        else if(j==0){
            result=grid[i][j]+check(grid,i-1,j,dp);
            
        }else{
             result=Math.min(check(grid,i-1,j,dp),check(grid,i,j-1,dp))+grid[i][j];
       
        }
        
        return dp[i][j]=result;
    }
}