//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> ans;
    static List<Integer> minPartition(int N)
    {
        ans= new ArrayList<>();
        int po=9;
        MakeMin(N,po);
        return ans;
    }
    static int []arr=new int[]{1,2,5,10,20,50,100,200,500,2000};
    static void MakeMin(int n,int po){
            if(po<0)return;
            
            if(arr[po]<=n){
               ans.add(arr[po]);
               MakeMin(n-arr[po],po);
                
            }else{
                MakeMin(n,po-1);
            }
          
        
    }
    
    
}