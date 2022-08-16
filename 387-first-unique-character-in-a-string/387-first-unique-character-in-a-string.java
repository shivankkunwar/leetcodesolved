class Solution {
    public int firstUniqChar(String s) {
          int[] answer= new int[26];
        for(char ch:s.toCharArray()){
            answer[ch-'a']++;
        }
        ArrayList<Integer> ans= new ArrayList<>();

        for(int i=0;i<26;i++){
            if(answer[i]==1){
                ans.add(i);

            }
        }
        if(ans.size()==0)return -1;
        int first=Integer.MAX_VALUE;
        for(int pos:ans){
            first=Math.min(first,s.indexOf(pos+'a'));
        }
        return first;
    }
}