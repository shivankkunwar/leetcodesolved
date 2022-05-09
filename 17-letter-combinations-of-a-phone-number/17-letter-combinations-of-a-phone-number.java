class Solution {
   
        public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList();
        }
        String ans="";
        String[] n={"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return letter(digits,ans,n);
        
    }
    
    public List<String> letter(String a,String ans,String[] n){
        
        if(a.isEmpty()){
             List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        List<String> list = new ArrayList<>();
        int s= a.charAt(0) -'0';
        for(int i=0;i<n[s].length();i++){
            list.addAll(letter(a.substring(1),ans+n[s].charAt(i),n));
        }
        return list;  
    }
}