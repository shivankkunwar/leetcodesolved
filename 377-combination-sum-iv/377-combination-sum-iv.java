class Solution {
    public int combinationSum4(int[] nums, int target) {
        int [] dp= new int[target+1];
      
        Arrays.fill(dp,-1);
          dp[0]=1;
        return helper(nums,target,dp);
    }
    public int helper( int [] arr,int tar,int[]dp){
        if(dp[tar]!=-1){
                return dp[tar];
         }
        int res=0;
       for(int i=0;i<arr.length;i++){
            if(arr[i]<=tar){
                res+=helper(arr,tar-arr[i],dp);
            }      
            
       
       }
        
       dp[tar]=res;
      return res;  
        
        
        
    }
}