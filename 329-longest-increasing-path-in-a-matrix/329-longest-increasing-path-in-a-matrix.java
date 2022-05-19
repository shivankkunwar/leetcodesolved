class Solution {
    int count=Integer.MIN_VALUE;

    public int longestIncreasingPath(int[][] matrix) {
       int m=matrix.length;
        int n= matrix[0].length;
        int count=0;
        int[][] dp= new int[m][n];
        for( int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              count=Math.max(helper(matrix,dp,i,j,-1),count);
          }
      }
        return count;
    }
    public int helper(int[][] arr,int[][]dp,int i,int j,int prev){
        if(i<0||i>=arr.length||j<0||j>=arr[0].length||arr[i][j]<=prev){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        
            prev=arr[i][j];
            int down=helper(arr,dp,i+1,j,prev);
            int up=helper(arr,dp,i-1,j,prev);
            int right=helper(arr,dp,i,j+1,prev);
            int left=helper(arr,dp,i,j-1,prev);    
            return dp[i][j]= 1+Math.max(Math.max(up,down),Math.max(left,right));
    
        

        
    }
}