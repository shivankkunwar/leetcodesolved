class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n= nums.length;
        if(n==1)return nums[0];
         dp= new int[n+1];
        dp[0]=0;
        
        dp[1]=nums[0];
        for( int i=2;i<=n;i++){

            int take=dp[i-2]+nums[i-1];
            int drop=dp[i-1];
            dp[i]=Math.max(take,drop);
        
        }
        return dp[n]; 
    }
}