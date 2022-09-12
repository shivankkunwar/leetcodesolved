class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int i=0;
        int j=tokens.length-1;

        int points=0;
        int maxPoints=0;
        while(i<=j){
        
            if(tokens[i]<=power){

                points++;
                power-=tokens[i++];
                maxPoints=Math.max(maxPoints,points);
            }else if(points>=1){
                points--;
                power+=tokens[j--];
                
            }else{
                return maxPoints;
                
            }
            
        
        }
        return maxPoints;
    }
}