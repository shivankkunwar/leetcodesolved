class Solution {
    public List<String> topKFrequent(String[] words, int k) {
          Map<String,Integer> map = new HashMap<>();
        for( String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        PriorityQueue<String> pq= new PriorityQueue<>(new Comparator<String>(){


            public int compare(String word1,String word2){
                int freq1=map.get(word1);
                int freq2=map.get(word2);

                if(freq1==freq2)return word2.compareTo(word1);

                return freq1-freq2;
            }
        });

        for(String str:map.keySet()){
            pq.add(str);
            if(pq.size()>k)pq.poll();

        }
        List<String> ans= new ArrayList<>();
        while(!pq.isEmpty())ans.add(pq.poll());
        Collections.reverse(ans);
        return ans;
        
    }
}