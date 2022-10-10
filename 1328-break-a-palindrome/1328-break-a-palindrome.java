class Solution {
    public String breakPalindrome(String s) {
        int n=s.length();
        if(s.length()<=1) return "";
        int pos=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                pos=i;
                break;
                }
        }
        boolean flag=false;
        for(int i=0;i<=pos;i++){
            if(s.charAt(i)!='a'){
               s = s.substring(0, i) + 'a'
              + s.substring(i + 1);
                flag=true;
                break;
            }
        }
       if(flag==false)return s=s.substring(0,n-1)+'b'+s.substring(n-1+1) ;
        
        return s;
    }
}