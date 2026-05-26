class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int price=prices[0];
        int max=0;
        for(int i=0;i<n;i++){
            int cost=prices[i]-price;
            max=Math.max(cost,max);
            price=Math.min(price,prices[i]);
        }
        return max;
    }
}
