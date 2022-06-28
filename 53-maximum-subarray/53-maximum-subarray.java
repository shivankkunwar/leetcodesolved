class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=nums[0];//minimum one number exists 
        for( int i=0;i<nums.length;i++){//linearly traverse 
            sum+=nums[i];//add the current to the sum  
            if(sum>maxi)maxi=sum;//if the sum is greater than the intial maximum value
            if(sum<0)sum=0;//if the sum is less than 0 it wont be counted in the maximum answer;
            
        }
    return maxi;
    }
}