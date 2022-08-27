class Solution {
  private int[] dp;
    int mod=(int)1e9+7;
public int combinationSum4(int[] nums, int n) {
    
    dp = new int[n + 1];
    Arrays.fill(dp,-1);
   return helper(nums,n);
}
    public int helper(int [] nums,int n){
        
    if(n<0)return 0;
    if(n==0)return 1;
    if(dp[n]!=-1)return dp[n];
    
    dp[n]=0;
    for( int i=0;i<nums.length;i++){
        dp[n]=dp[n]+helper(nums,n-nums[i])%mod;
    }
    return dp[n];
    }
}
