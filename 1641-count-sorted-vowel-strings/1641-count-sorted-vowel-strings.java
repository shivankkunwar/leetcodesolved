class Solution {
  public static int count(int idx,int num,int n,int[][] dp){
        if(idx==0 && num==n)
        return 1;
        if(idx<0 || num>n)
        return 0;
        if(dp[idx][num]!=-1)
            return dp[idx][num];
        int pick = count(idx,num+1,n,dp);
        int nopick = count(idx-1,num,n,dp);
        return dp[idx][num] = pick+nopick;
    }

    public static int countVowelStrings(int n) {
        int [][]Dp=new int[5][n+1];
        for(int i=0;i<5;i++){
            for( int j=0;j<n+1;j++){
                Dp[i][j]=-1;
            }
        }
        return count(4,0,n,Dp);
    }
    
}