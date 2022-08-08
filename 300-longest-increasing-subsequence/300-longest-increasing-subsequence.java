class Solution {
    public int lengthOfLIS(int[] nums) {
     int[] tails = new int[nums.length];
    int size = 0;
    for (int x : nums) {
        int i = 0, j = size;
        while (i != j) {
            int m = (i + j) / 2;
            if (tails[m] < x)
                i = m + 1;
            else
                j = m;
        }
        tails[i] = x;
        if (i == size) ++size;
    }
    return size;
    }
        
        
//      public   int Lis(int[] arr, int ind,int prev,int n,int[]dp){
//         if(ind==n)return 0;
//         int len=Lis(arr,ind+1,prev,n);
//         if(prev==-1||arr[ind]>arr[prev]){
//             len=Math.max(len,1+Lis(arr,ind+1,ind,n));
//         }
//         return len;
//     }
// }
}