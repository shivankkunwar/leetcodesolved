class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int lar=nums[0];
        for( int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>lar)lar=sum;
            if(sum<0)sum=0;
        }
        return lar;
    }
}