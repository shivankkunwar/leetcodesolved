class Solution {
        public  int numberOfSteps(int num){
        return helper(num,0);
    }
    private static int helper(int num,int c){
        if(num ==0){
            return c;
        }
        if(num%2==0){
            c++;
            return helper(num/2,c);
        }
        else{
            c++;
            return helper(num-1,c);
        }
    }
}