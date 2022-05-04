class Solution {
    int mod = 1000000007;
    public int countPairs(int[] deliciousness) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res= 0;
        
        for(int val : deliciousness){
            int power = 1;
            for(int i = 0; i < 22; i++){
                if(map.containsKey(power - val)){
                    res += map.get(power - val);
                    res %= mod;
                }
                power *= 2;
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return (int) res;
    }
}