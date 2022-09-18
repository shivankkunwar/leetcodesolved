class Solution {
    public int trap(int[] height) {
         int left= 0,right= height.length-1,maxLeft= 0,maxRight=0,maxWater=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=maxLeft){
                    maxLeft= height[left];
                }
                else{
                    maxWater+=maxLeft-height[left];
                    
                }
                left++;
            }
            else{
                  if(height[right]>=maxRight){
                    maxRight= height[right];
                }
                else{
                    maxWater+=maxRight-height[right];
                    
                }
                right--;
                
                
            }
        }
        return maxWater;
    }
}