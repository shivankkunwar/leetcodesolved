class Solution {
    public boolean backspaceCompare(String s, String t) {
      int s_ptr=s.length()-1;
        int t_ptr=t.length()-1;
        int s_Skips=0;
        int t_skips=0;
        while(s_ptr>=0||t_ptr>=0){
            while(s_ptr>=0){
                if(s.charAt(s_ptr)=='#'){
                    s_Skips+=1;
                    s_ptr--;
                }else if(s_Skips>0){
                    s_ptr--;
                    s_Skips--;
                }else{
                    break;
                }
            }
            while(t_ptr>=0){
                if(t.charAt(t_ptr)=='#'){
                    t_skips+=1;
                    t_ptr--;
                }else if(t_skips>0){
                    t_ptr--;
                    t_skips--;
                }else{
                    break;
                }
            }
            if (s_ptr >= 0 && t_ptr >= 0 && (s.charAt(s_ptr) != t.charAt(t_ptr))){
                return false;
            }
            if((s_ptr>=0)!=(t_ptr>=0))return false;

            s_ptr--;
            t_ptr--;
//            if (s_ptr >= 0 && t_ptr >= 0 && (s.charAt(s_ptr) == s.charAt(t_ptr))) {
//                s_ptr--;
//                t_ptr--;
//            } else {
//                return s_ptr == -1 && t_ptr == -1;
//            }

        }
        return true;
    }
    }
