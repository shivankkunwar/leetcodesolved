class Solution {
    public int firstUniqChar(String s) {
         int res = s.length();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch))
                res = Math.min(res, index);
        }
        
        return res == s.length() ? -1 : res;
    }
}