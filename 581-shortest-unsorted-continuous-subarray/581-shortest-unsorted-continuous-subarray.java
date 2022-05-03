class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int [] temp=nums.clone();
        Arrays.sort(nums);
        int start=Integer.MAX_VALUE;
        int end=0;
      for( int i=0;i<nums.length;i++){
          if(nums[i]!=temp[i]){
              start=Math.min(start,i);
              end=Math.max(end,i);
          }
      }
        return (end-start>=0?end-start+1:0);
        
// int start=0;
//         int end=nums.length-1;
//         int temp=1;
//         while(start<end){
//             if(nums[start]>nums[start+1]&&nums[end]<nums[end-1]){
//                 return end-start+temp;
//             }
//             if(nums[start]>nums[start+1]){
//                 if(nums[end]==nums[end-1])temp++;
//                 end--;
//                 continue;
//             }else if(nums[end]<nums[end-1]){
//                 start++;
//                 continue;
//             }

//             if(nums[end]==nums[end-1])temp++;
//             if(nums[start]==nums[start+1])temp++;
//             start++;
//             end--;
//         }
//         return 0;
    }
}