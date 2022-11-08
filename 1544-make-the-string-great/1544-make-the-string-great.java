class Solution {
    public String makeGood(String s) {
         StringBuilder str= new StringBuilder(s);
        
        while(str.length()>0){
            
            
            Boolean flag=false;
            
            for(int i=0;i<str.length()-1;i++){
                
                if(Math.abs(str.charAt(i)-str.charAt(i+1))==32){
                    
                    str.deleteCharAt(i);
                    str.deleteCharAt(i);
                    
                    flag=true;
                    break;
                
                }
                
            }
            
            if(!flag)
                break;
            
            
            
        }
        return str.toString();
    }
}