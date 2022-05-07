class Solution {
    public String removeDuplicates(String s, int k) {
    Stack<charCounter> stack =new Stack<>();

        for( int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(!stack.isEmpty()&&ch==stack.peek().c){
                if (!stack.isEmpty()&&stack.peek().count == k-1)
                    stack.pop();
                else
                    stack.peek().count++;

            }

             else {
                stack.push(new charCounter(ch));

            }

        }
        StringBuilder res = new StringBuilder();
        for (charCounter charCount : stack) {
            res.append(charCount);
        }
        return res.toString();
    }
   
  
    
 public static  class charCounter{
        char c;
        int count;
        charCounter(char c){
            this.c=c;
            this.count=1;
        }
     public String toString() {
        return Character.toString(c).repeat(count);
    }
    }    
        
}