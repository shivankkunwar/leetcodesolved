class Solution {
    public static Boolean isAnagram(String s1,String s2){
       
        if(helper(s1).equals(helper(s2)))return true;
        return false;
    }
    public static HashMap helper(String s){
        HashMap<Character,Integer> ans= new HashMap<>();
        for( char ch:s.toCharArray()){
            if(!ans.containsKey(ch)){
                ans.put(ch,1);
            }else{
                ans.put(ch,ans.get(ch)+1);
            }
        }
        return ans;
    }
}