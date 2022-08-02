class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int  n=matrix[0].length;
        
        
        int lo=matrix[0][0],hi=matrix[m-1][n-1];
        while(lo!=hi){
            int mid= lo+(hi-lo)/2;
            int curr=binaryRank(matrix,mid);
            if(curr<k){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
        
        
    }
    public int binaryRank(int[][] arr,int target){
        int m=arr.length;
        int n= arr[0].length;
        
        int i=0;
        int j=n-1;
        int count=0;
        while(i<m&&j>=0){
           if(target>=arr[i][j]){
               count+=j+1;
               i++;
           }else{
               j--;
           }
        }
        return count;
    }
}