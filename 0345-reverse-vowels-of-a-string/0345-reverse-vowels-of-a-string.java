class Solution {
    public String reverseVowels(String s) {
        
        char ch[] =s.toCharArray();
        
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(isVowel(ch[start])&&isVowel(ch[end])){
                char mid=ch[start];
                ch[start]=ch[end];
                ch[end]=mid;
                start++;
                end--;
            }
            else if(isVowel(ch[start])){
                end--;
            }else if(isVowel(ch[end])){
                start++;
            }
            else{
                 start++;
            end--;
            }
            
        }
        
        return String.valueOf(ch);
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')return true;
        return false;
    }
}