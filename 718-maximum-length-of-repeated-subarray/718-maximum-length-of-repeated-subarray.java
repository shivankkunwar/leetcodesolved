class Solution {
    public int findLength(int[] A, int[] B) {
        int ans = 0;
        int[][] memo = new int[A.length + 1][B.length + 1];
        for (int i = A.length - 1; i >= 0; --i) {
            for (int j = B.length - 1; j >= 0; --j) {
                if (A[i] == B[j]) {
                    memo[i][j] = memo[i+1][j+1] + 1;
                    if (ans < memo[i][j]) ans = memo[i][j];
                }
            }
        }
        return ans; 
        //if equal then 1+ nextElement in both array
        //if not equal nextElement in one and nextElement in Two return maxAns
       // return helper(nums1,nums2,nums1.length-1,nums2.length-1);
        
    }
    
//     public int helper(int [] nums1,int [] nums2,int n,int m){
//         if(n<0||m<0)return 0;
        
//         if(nums1[n]==nums2[m]){
//             return 1+helper(nums1,nums2,n-1,m-1);
//         }
//         else{
//             return Math.max(helper(nums1,nums2,n-1,m),helper(nums1,nums2,n,m-1));
//         }
//     }
    
    
}
//       int maxA=0;
//         int n=nums1.length;
//         int m=nums2.length;
        
//         for( int i=0;i<n;i++){
            
                        
            
//             for(int j=0;j<m;j++){
                    
//                    if(nums1[i]==nums2[j]){
                      
//                        int max=0;
//                        int one=i;
//                        int two=j;
//                        while(one<n&&two<m&&nums1[one++]==nums2[two++]){
//                            max+=1;
//                        }
                    
//                        maxA=Math.max(max,maxA);
//                    } 
                
//             }
//         }
// //         return maxA;
//     }
// }