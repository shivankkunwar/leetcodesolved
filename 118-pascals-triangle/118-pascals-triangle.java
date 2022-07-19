class Solution {
    public List<List<Integer>> generate(int numRows) {
 List<List<Integer>>ans=new ArrayList<List<Integer>>();
        int dp[][]= new int[numRows+1][numRows+1];
        dp[0][0]=1;
        dp[1][0]=1;
        dp[1][1]=1;
        for (int r = 0; r < numRows; r++)
            ans.add(new ArrayList());
        for( int i=2;i<numRows;i++){
            for(int j=0;j<i+1;j++){
                dp[i][j]=((j<=0)?0:dp[i-1][j-1])+dp[i-1][j];
            }
        }
        for( int i=0;i<numRows;i++){
            for( int j=0;j<i+1;j++){
                ans.get(i).add(dp[i][j]);
            }
        }
        return ans;
    }
}