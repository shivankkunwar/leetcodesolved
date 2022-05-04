class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==k){
                count++;
                start++;
                end--;
            }else if(sum>k){
                end--;
            }
            else if(sum<k){
                start++;
            }
        }
        return count;
    }
}