class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if(k==0 )return false;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for( int i=0;i<nums.length;i++){
            int  one=nums[i];
            if(map.containsKey(one)&&i-map.get(one)<=k){
                return true;
            }
            
            map.put(nums[i],i);
             
        }
     return false;   
    }
}