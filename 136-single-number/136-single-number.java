class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for( int i=0;i<nums.length;i+=2){
            if(i==nums.length-1)return nums[nums.length-1];
            if(nums[i]!=nums[i+1])return nums[i];
        }
        return -1;
    }
}