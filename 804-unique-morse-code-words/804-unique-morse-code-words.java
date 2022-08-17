class Solution {
    String[] morse=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        String str=words[0];
        Set<String> sett= new HashSet<>();
        sett.add(getMorse(str));
        for(String stag:words){
            
            String mid=getMorse(stag);
            
            sett.add(mid);
        }
        
        return sett.size();
    }
    public String getMorse(String s){
      StringBuilder sb = new StringBuilder();
        
        for( char ch:s.toCharArray()){
            sb.append(morse[ch-'a']);
        }
        return sb.toString();
    }
}