class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        int check=n/2;
        Map<Integer,Integer> map= new HashMap<>();
        
        
        for( int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>check){
                return 1;
            }
        }
        System.out.println(map);
        Integer [] values= new Integer[map.size()];
        int i=0;
        for(int key:map.keySet()){
            values[i++]=map.get(key);
        }
        Arrays.sort(values,Collections.reverseOrder());
        int ans=0;
        for(int val:values){
            if(n<=check){
                return ans;
            }else{
                n-=val;
                ans++;
                }
            
        }
        
        return ans;
    }
}