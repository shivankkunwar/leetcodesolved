class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(i==0&&j==0)dp[i][j]= grid[i][j];
                else{
                    int right=Integer.MAX_VALUE;
                
                int down=Integer.MAX_VALUE;
                if(i>0){
                    right=dp[i-1][j];
                }
                if(j>0){
                    down=dp[i][j-1];
                }
                dp[i][j]=Math.min(right,down)+grid[i][j];
                
                
            }
        }
        }
        return dp[m-1][n-1];
        
    }
}