class Solution {
    public boolean canConstruct(String R, String M) {
       int[] arr= new int[26];
        for(int i=0;i<R.length();i++){
            arr[R.charAt(i)-'a']++;
            
        }
    
        for(int i=0;i<M.length();i++){
            arr[M.charAt(i)-'a']--;
            
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0)return false;
        }
        return true;
    }
    
}