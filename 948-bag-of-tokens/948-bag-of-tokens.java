class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int maxPoints=0;
        int points=0;
        int i=0;
        int j=tokens.length-1;
        
        while(i<=j){
            if(power>=tokens[i]){
                points++;
                power-=tokens[i++];
                maxPoints=Math.max(maxPoints,points);
            
            }else if(points>0){

                points--;
                power+=tokens[j--];
            }else{
                return maxPoints;
            }
            
            
        }
        return maxPoints;
    }
}