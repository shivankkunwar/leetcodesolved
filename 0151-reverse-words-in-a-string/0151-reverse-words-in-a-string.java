class Solution {
    public String reverseWords(String s) {
        String ans="";
        s=s.trim().replaceAll(" +", " ");
        for(String str:s.split(" ")){
            ans=" "+str+ans;
        }
        return ans.substring(1);
    }
}