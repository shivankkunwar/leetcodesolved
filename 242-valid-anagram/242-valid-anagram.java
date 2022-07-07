class Solution {
    public static Boolean isAnagram(String s1,String s2){
     if(s1.length()!=s2.length())return false;
        int [] helper= new int[26];

        for(int i=0;i<s1.length();i++){
            
            helper[s1.charAt(i)-'a']++;
            helper[s2.charAt(i)-'a']--;

        }
        for(int n:helper){
            if(n!=0)return false;
        }
        return true;}
}