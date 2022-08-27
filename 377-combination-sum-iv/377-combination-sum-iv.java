class Solution {
  private int[] dp;
    int mod=(int)1e9+7;
public int combinationSum4(int[] nums, int n) {
    
    dp = new int[n + 1];
    //Arrays.fill(dp,-1);for hellper1
    Arrays.sort(nums);
   return helper2(nums,n);
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
    public int helper2(int nums[],int n){
        if(n==0)return 1;
        
        dp[0]=1;
        
        for( int i=0;i<=n;i++){
            for( int j=0;j<nums.length;j++){
                if(nums[j]>i)break;
                dp[i]=(dp[i]+dp[i-nums[j]]);
            }
        }
        return dp[n];
    }
}
