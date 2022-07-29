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
        HashSet<Character> strcheck= new HashSet<>();
        for( int i=0;i<pattern.length();i++){
           
            if(!check.containsKey(pattern.charAt(i))){
                    if(strcheck.contains(str.charAt(i)))return false;
                    check.put(pattern.charAt(i),str.charAt(i));
                    strcheck.add(str.charAt(i));
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