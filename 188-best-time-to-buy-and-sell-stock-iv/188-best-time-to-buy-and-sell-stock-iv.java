class Solution {
    public int maxProfit(int k, int[] prices) {
         int n = prices.length;
        if (n < 2 || k <= 0) return 0;
        
        int[][] profit = new int[k+1][n];
        
        for (int t=1; t<=k; t++) { 
            
            int maxDiffSeen = Integer.MIN_VALUE; 
            
            for (int i=1; i<n; i++) { 
                maxDiffSeen = Math.max(profit[t-1][i-1]-prices[i-1], maxDiffSeen);
                profit[t][i] = Math.max(prices[i] + maxDiffSeen, profit[t][i-1]);
            }
        }
        
        return profit[k][n-1]; 
    }
    }
