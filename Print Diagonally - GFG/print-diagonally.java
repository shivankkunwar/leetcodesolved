//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
       
      ArrayList<Integer> ans= new ArrayList<>();

        ans.add(A[0][0]);

        for( int i=1;i<N;i++){
            int row=0;
            int col=i;
            while(col>=0&&row<N){

                ans.add(A[row][col]);
                row++;
                col--;
            }
        }
        for( int i=1;i<N;i++){
            int row=i;
            int col=N-1;
            while(col>=0&&row<N){

                ans.add(A[row][col]);
                row++;
                col--;
            }
        }
     return ans;
    }
}
