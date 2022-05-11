class Solution {
   public static int countVowelStrings(int n) {

    int[][] Dp=new int[n+1][5];
        for(int i=0;i<n+1;i++){
            for( int j=0;j<5;j++){
                Dp[i][j]=-1;
            }
        }
      return (count(n,0,Dp));


    }
    public static  int count(int n,int Last,int[][]Dp){
        if(n==0)return 1;
        int ans=0;
        if(Dp[n][Last]!=-1)return Dp[n][Last];
        for( int i=Last;i<5;i++){
            ans+=count(n-1,i,Dp);
        }

        return Dp[n][Last]=ans ;
    }
    
}