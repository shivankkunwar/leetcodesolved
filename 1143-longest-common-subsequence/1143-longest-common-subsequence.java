class Solution {
    public int longestCommonSubsequence(String A, String B) {
          int a=A.length();
         int b=B.length();
        dp= new int [a+1][b+1];
         for(int[] arr:dp)
            Arrays.fill(arr,-1);
        return Subseq(A,B,a,b);
        
    
//         int a=A.length();
//         int b=B.length();
//         int [][] arr=new int[a+1][b+1];
//          for (int row = 0; row < arr.length; row++)
//         {
//             for (int col = 0; col < arr[row].length; col++)
//             {
//                 arr[row][col] = 0; 
//             }
//         }
//         for(int i=a-1;i>=0;i--){
//             for(int j=b-1;j>=0;j--){
//                 if(A.charAt(i)==B.charAt(j)){
//                      arr[i][j] =1+ arr[i + 1][j + 1] ;
//                 }
//                 else{
//                     arr[i][j]=Math.max(arr[i+1][j],arr[i][j+1]);
//                 }
//             }
            
//         }
//         return arr[0][0];
   
    
}
    int [][]dp;

public int Subseq(String one,String two,int n,int m){
        
       if(n==0||m==0)return 0;
        if(dp[n][m]!=-1)return dp[n][m];
        if(one.charAt(n-1)==two.charAt(m-1)){
            dp[n][m]= 1+Subseq(one,two,n-1,m-1);

        }else{
            dp[n][m]=Math.max(Subseq(one,two,n-1,m),Subseq(one ,two,n,m-1));
        }
        return dp[n][m];
    }
    
    
    
    }