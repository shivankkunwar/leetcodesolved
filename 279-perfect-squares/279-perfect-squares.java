class Solution {
    int []dp;
    public int numSquares(int n) {
        dp= new int [n+1];
        Arrays.fill(dp,-1);
        return helper(n);
    }
    
    public int helper(int n){
        if(n==0)return 0;
        if(n<0)return Integer.MAX_VALUE;
        if(dp[n]!=-1)return dp[n];
        int min=Integer.MAX_VALUE;
        for(int j=1;j*j<=n;j++){
            min=Math.min(min,1+helper(n-(j*j)));
        }
        return dp[n]=min;
    }
}