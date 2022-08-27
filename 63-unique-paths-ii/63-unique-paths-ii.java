class Solution {
    public int [][] dp;
    public int [][]dir=new int [][]{{1,0},{0,1}};
    public int uniquePathsWithObstacles(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        dp= new int [m][n];
    
        return helper(grid,0,0,m,n);
        
        
    }
    public int helper(int [][] arr,int s,int e,int m,int n){
        
        if(s>m-1||e>n-1)return 0;
       
        if(s==(m-1) && e==(n-1)&& arr[s][e]==0)return 1;
        
        if(dp[s][e]!=0)return dp[s][e];
        
       
         if(arr[s][e]==1)
             return 0;
        else{
             for( int i=0;i<dir.length;i++){
            dp[s][e]=dp[s][e]+helper(arr,s+dir[i][0],e+dir[i][1],m,n);
        }
        }
       
        return dp[s][e];
    }
}