class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]= new int [m+1][n+1];
        
        return helper(m,n,0,0,dp);
    }
    public int helper(int m,int n,int i,int j,int [][]dp){
        if(i<0||j<0||i>=m||j>=n)return 0;
        if(i==m-1&&j==n-1)return 1;
        if(dp[i][j]!=0)return dp[i][j];
        return dp[i][j]=helper(m,n,i,j+1,dp)+helper(m,n,i+1,j,dp);
    }
}