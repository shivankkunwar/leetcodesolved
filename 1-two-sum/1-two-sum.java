class Solution {
    public int[] twoSum(int[] arr, int target) {
         HashMap<Integer,Integer> ans= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(ans.containsKey(target-arr[i])){
                return new int[]{ans.get(target-arr[i]),i};
            }else{
                ans.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}