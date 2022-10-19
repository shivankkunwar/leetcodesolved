class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       Map<String, Integer> map = new TreeMap<>();
        for(int i = 0;i<words.length;i++){
            map.put(words[i], map.getOrDefault(words[i], 0)+1);
        }
        List<String> res = new ArrayList<>();
        while(k!=0){
            String temp = "";
            int siz = 0;
            for(String s:map.keySet()){
                if(map.get(s)>siz){
                    siz = map.get(s);
                    temp = s;
                }
            }
            res.add(temp);
            k--;
            map.remove(temp);
            if(map.size()==0) break;
        }
        return res;
        
        
    }
}