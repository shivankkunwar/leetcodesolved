//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        ArrayList<Integer> ans= new ArrayList<>();
        Map<Integer,Integer> map = new  HashMap<>();
        for(int ar:Arr){
            map.put(ar,map.getOrDefault(ar,0)+1);
        }
        for(int ar:map.keySet()){
            if(map.get(ar)%2!=0){
                ans.add(ar);
            }
        }
        int n=ans.size();
        int [] a= new int [n];
        int i=0;
        Collections.sort(ans, Collections.reverseOrder());
        while(i<n){
            a[i]=ans.get(i++);
        }
        return a;
    }
}