class Solution {
    public int dir[][]= new int [][]{{1,0},{0,1}};
    public int dp[][];
    public int uniquePaths(int m, int n) {
        dp= new int [m][n];
        for( int[] arr:dp)
        Arrays.fill(arr,-1);
        
        return helper(m-1, n-1,0,0);
        
        
    }
    public int helper(int m,int n,int s ,int e){
        
        if(s>m||s<0||e>n||e<0)return 0;
        if(s==m&&e==n)return 1;
        
        if(dp[s][e]!=-1)return dp[s][e];
        
        dp[s][e]=0;
        
        for( int i=0;i<dir.length;i++){
            dp[s][e]=dp[s][e]+helper(m,n,s+dir[i][0],e+dir[i][1]);
        }
        return dp[s][e];
        
    }
   
    
}