class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int mis=-1;
        for( int i=0;i<nums.length;i++){
            if(nums[i]!=i)return mis=i;    
        }
       
        
        return (mis==-1)?nums.length:-1;
    }
}