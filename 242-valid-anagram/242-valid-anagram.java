class Solution {
    public static Boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int[] vow=new int[26];
        for(int i=0;i<s1.length();i++){
            vow[s1.charAt(i)-'a']++;
            vow[s2.charAt(i)-'a']--;
        }
        for(int a:vow){

            if(a!=0)return false;
        }
        return true;
    }
}