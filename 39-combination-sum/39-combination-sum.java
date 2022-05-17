class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> Outer= new ArrayList<List<Integer>>();
        List<Integer> inner= new ArrayList<>();
        helper(candidates,target,Outer,inner,0,0);
        return Outer;
 }
    public void helper(int [] arr,int target,List<List<Integer>> outer,List<Integer> inner,int i,int sum){
           if(sum>target)return;
          if(sum==target){
              outer.add(new ArrayList<>(inner));
              return;
          }
       for(int a=i;a<arr.length;a++){
          
           sum+=arr[a];
            inner.add(arr[a]);
           helper(arr,target,outer,inner,a,sum);   
            sum-=arr[a];
           inner.remove(inner.size()-1);
       }
      
    }
    
    
}