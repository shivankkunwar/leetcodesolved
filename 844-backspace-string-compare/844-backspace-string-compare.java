class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ans1=stringify(s);
        String ans2=stringify(t);
        if(ans1.compareTo(ans2)==0)return true;
        else return false;
    
    }
    public String stringify(String s){
        Stack<Character> stack= new Stack<Character>();
        String Ans="";
        for(char ch:s.toCharArray()){
           if(ch!='#'){
               stack.push(ch);
           } 
            else{
                if(!stack.empty())stack.pop();
            }
        }
        while(!stack.empty()){
                Ans=Ans+stack.pop();
                    
        }
        return Ans;
    }
    }
