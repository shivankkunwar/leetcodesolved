class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recurPermute(0,nums.length,nums,ans);
        return ans;
    }
    public void recurPermute(int l,int r, int[] nums, List < List < Integer >> ans) {
        if (l == r) {
     
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            if(ans.contains(ds)){
                return;
            }else{
                ans.add(new ArrayList < > (ds)); 
            }
           
            return;
        }
        for (int i = l; i < nums.length; i++) {
            swap(i, l, nums);
            recurPermute(l + 1,r, nums, ans);
            swap(i, l, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}