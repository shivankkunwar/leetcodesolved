class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int max=0;
        int mid=prices[0];
        
        for( int i=1;i<prices.length;i++){
            
            mid=Math.min(mid,prices[i]);
            max=Math.max(max,prices[i]-mid);
            
        }
        return max;
        
        
}}