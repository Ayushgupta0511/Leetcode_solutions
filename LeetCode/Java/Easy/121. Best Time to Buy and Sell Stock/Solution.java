class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int ans = 0;
        for(int i =0;i<prices.length;i++){
            for(int k = i+1;k<prices.length;k++){
                ans = prices[k] - prices[i];
                if(ans > max){
                    max = ans;
                }
                // else { max =0;}
            }
        }
        return max;
    }
}