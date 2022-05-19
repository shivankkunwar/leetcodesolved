class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int[] prefix= new int [arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int sum=0;
        for( int i=0;i<arr.length;i+=2){
           
            for( int j=i;j<arr.length;j++){
                
                sum+=prefix[j]-((j-i-1>=0)?prefix[j-i-1]:0);
                
            }
        }
      return sum;  
    }
}