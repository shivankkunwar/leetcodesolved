//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int N){
        // code here
        if(N==4)return "Yes";
        if(N%2!=0){
            if(isPrime(N-2))return "Yes";
            return "No";
        }
        for(int i=3;i<=N/2;i+=2){
            
            if(isPrime(i)&&isPrime(N-i))
                return "Yes";
        }
        
        
        
        return "No";
    }
    
    static Boolean isPrime(int num){
        
         for (int i = 2; i*i<=num; i++) {
              if (num % i == 0) {
                return false;
                }
            }
        
        return true;
    }
}