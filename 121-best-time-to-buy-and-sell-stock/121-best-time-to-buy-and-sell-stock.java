class Solution {
    public int maxProfit(int[] prices) {
        
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(mini>prices[i])mini=prices[i];
            if(prices[i]-mini>profit)profit=prices[i]-mini;
        }
        return profit;
        
        
        
        
        
        
        
        
        
    //     int maxAns=Integer.MIN_VALUE;
    //     for( int i=0;i<prices.length;i++){
    //         for( int j=i+1;j<prices.length;j++){
    //             int curr=prices[j]-prices[i];
    //             maxAns=Math.max(maxAns,curr);
    //         }
    //     }if(maxAns<0)return 0;
    //     return maxAns;
    // }
}}