class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n= nums.length;
        int[][]dp= new int[n+1][n+1];
        for( int[]a:dp)
        Arrays.fill(a,-1);
        return LisM(nums,0,-1,nums.length,dp);    
        
    }
    
    
    public  int LisM(int[]arr,int ind,int prev,int n,int[][]dp){
        if(ind==n)return 0;

        if(dp[ind][prev+1]!=-1)return dp[ind][prev+1];
        int len=LisM(arr,ind+1,prev,n,dp);
        if(prev==-1||arr[ind]>arr[prev]){
            len=Math.max(len,1+LisM(arr,ind+1,ind,n,dp));
        }
        return dp[ind][prev+1]=len;
    }
        
        
//      public   int Lis(int[] arr, int ind,int prev,int n,int[]dp){
//         if(ind==n)return 0;
//         int len=Lis(arr,ind+1,prev,n);
//         if(prev==-1||arr[ind]>arr[prev]){
//             len=Math.max(len,1+Lis(arr,ind+1,ind,n));
//         }
//         return len;
//     }
// }
}