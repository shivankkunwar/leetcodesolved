class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans= new ArrayList<>();
        for(String str:words){
            if(helper(str,pattern))ans.add(str);
        }
        return ans;
    }
    public boolean helper(String str,String pattern){
        if(str.length()!=pattern.length())return false;
        HashMap<Character,Character> check= new HashMap<>();
        HashMap<Character,Integer> strcheck= new HashMap<>();
        for( int i=0;i<pattern.length();i++){
           
            if(!check.containsKey(pattern.charAt(i))){
                    if(strcheck.containsKey(str.charAt(i)))return false;
                    check.put(pattern.charAt(i),str.charAt(i));
                    strcheck.put(str.charAt(i),0);
                }
            else{
                if(str.charAt(i)!=check.get(pattern.charAt(i))){
                    return false;    
                }
            }
        }
        return true;
    }
    
}