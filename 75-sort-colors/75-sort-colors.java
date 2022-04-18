class Solution {
    public void sortColors(int[] nums) {
       int [] arr= new int[3];
        for( int i:nums){
            arr[i]+=1;
        }
        int z=arr[0];
        int o=arr[1];
        int t=arr[2];
        for(int i=0;i<nums.length;i++){
            if((z--)>0)nums[i]=0;
            else if((o--)>0)nums[i]=1;
            else if((t--)>0)nums[i]=2;
        }
    }
}