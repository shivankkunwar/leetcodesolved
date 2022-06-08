class Solution {
    public int removePalindromeSub(String s) {
         if(s.isEmpty()) return 0;
        
    int n = s.length();
    for(int i = 0; i < n / 2; i++)
        if(s.charAt(i) != s.charAt(n - i - 1))//if it isn't palindrome
            return 2;
        
    return 1;//it surely is palindrome
    }
}