class Solution {
    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String > ans=new ArrayList<String>();
          int [] check= new int[26];
        for(String s:words2){
            int [] check2=new int[26];
            for(int i=0;i<s.length();i++){
                    check2[s.charAt(i)-'a']++;
                    
            }
            for( int i=0;i<26;i++){
                check[i]=Math.max(check2[i],check[i]);    
            }
        }
        for(String str : words1 ){
       
            for(int i=0;i<str.length();i++){
                check[str.charAt(i)-'a']--;
            }
            
            if(helper(check))ans.add(str);
            for(int i=0;i<str.length();i++){
                check[str.charAt(i)-'a']++;
            }
            
    }
        return ans;
}
    public boolean helper(int[] check){
        for( int i=0;i<26;i++){
               if(check[i]>0)return false;
            
        }
        return true;
    }
}