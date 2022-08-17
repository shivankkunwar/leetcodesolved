class Solution {
    String[] morse=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        String str=words[0];
        Set<String> sett= new HashSet<>();
        sett.add(getMorse(str));
        for(String stag:words){
            
            String mid=getMorse(stag);
            System.out.println(mid);
            if(!sett.contains(mid))sett.add(mid);
        }
        System.out.println(sett);
        return sett.size();
    }
    public String getMorse(String s){
        String morsed="";
        for(char ch:s.toCharArray() ){
            morsed+=morse[ch-'a'];
        }
        return morsed;
    }
}