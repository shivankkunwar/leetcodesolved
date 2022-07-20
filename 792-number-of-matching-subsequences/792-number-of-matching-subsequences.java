class Solution {
   public int numMatchingSubseq(String s, String[] words) {
  //put all the character in string s in a hashmap
        HashMap<Character, Queue<String>> map= new HashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            map.putIfAbsent(s.charAt(i),new LinkedList<>());
        }
        //put all the string from array which starts with the starting character from map
        for(String word:words){
            char start= word.charAt(0);
            if(map.containsKey(start)){
                map.get(start).offer(word);
            }
        }
        // at every traversal character of s and take every strings that start with that character
        // and remove the character from strings in queue and if its empty update ans
        for(int i=0;i<s.length();i++){
            char start=s.charAt(i);
            Queue<String> q= map.get(start);
            int size=q.size();
            for(int k=0;k<size;k++){
                String str=q.poll();
                if(str.substring(1).length()==0){
                    ans++;
                }else{
                    if(map.containsKey(str.charAt(1)))
                    {
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }
        }
       return ans;
}}