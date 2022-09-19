class Solution {
    
    public int lastStoneWeightII(int[] arr) {
            int n=arr.length;
          int range=0;
	    for(int i=0;i<arr.length;i++){
	        range+=arr[i];
	    }
	    
	    boolean dp[][]= new boolean[n+1][range+1];
	    
	    for(int i=0;i<n+1;i++){
	        dp[i][0]=true;
	    }
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=range;j++){
	            if(arr[i-1]<=j){
	                dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
	            }
	            else{
	                dp[i][j]=dp[i-1][j];
	            }
	        }
	    }
	    
	    int max=0;
	    for(int j=0;j<=range/2;j++){
	        if(dp[n][j]){
	            max=j;
	            }
	        
	    }
	    
	    return range-2*max;
    }
}