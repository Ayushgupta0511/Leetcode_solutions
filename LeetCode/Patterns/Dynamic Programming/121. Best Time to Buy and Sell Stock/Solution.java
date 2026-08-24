class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;
        int profit =0;
        for(int i = 0 ; i <prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
                profit = prices[i] - minprice;
                if(profit > ans){
                    ans = profit;
                }
        }
        if(minprice == prices[0]){
            ans = 0;
        }
        return ans;
    }
}