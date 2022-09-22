class Solution {
    public String reverseWords(String s) {
        String [] str= s.split(" ");
        String ans="";
        ans+=helper(str[0]);
        for(int i=1;i<str.length;i++){
            ans+=" "+helper(str[i]);
        }
        return ans;
    }
    public String helper(String str){
        StringBuilder s= new StringBuilder(str);
        return s.reverse().toString();
    }
}