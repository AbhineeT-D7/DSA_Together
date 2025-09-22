// Problem : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=array
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyAt = Integer.MAX_VALUE;
        
        for(int price : prices){
            buyAt = Math.min(buyAt , price);
            
            profit= Math.max(profit ,price-buyAt);    
        }
        return profit;
    }
}
