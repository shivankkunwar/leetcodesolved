class Solution {
    public int count=0;
    public int uniquePathsWithObstacles(int[][] grid) {
     int [][] dp= new int[grid.length][grid[0].length];
        return helper(grid,0,0,grid.length,grid[0].length,dp);

    }
    public  int helper( int [][] arr,int i,int j,int m,int n,int[][]dp){
        if(i<0||j<0||i>=m||j>=n||arr[i][j]==1)return 0;
        if(i==m-1&&j==n-1){

            return 1;
        }
        if(dp[i][j]!=0)return dp[i][j];
        int ans;
        ans=helper(arr,i+1,j,m,n,dp)+helper(arr,i,j+1,m,n,dp);//down+right
      return dp[i][j]=ans;
}
}