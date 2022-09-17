class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp= new int[nums.length+1];
       Arrays.fill(dp,-1);
        dp[0]=0;
        return helper(nums,nums.length);
    }
    
    public int helper( int nums[],int i){
        if(i<0)return 0;
        if(dp[i]!=-1)return dp[i];
        
        dp[i]= Math.max( nums[i-1]+helper(nums,i-2),helper(nums,i-1));
    
        return dp[i];
    }
}