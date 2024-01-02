package M8_Arrays;

public class Question3 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;

        for (int price : prices) {
            minprice = Math.min(minprice, price);
            maxprofit = Math.max(maxprofit, price - minprice);
        }

        return maxprofit;
    }

    public int maxProfit2(int[] prices) {
        int n = prices.length, profit = 0;
        int buy = 0, sell = 0;

        for(int i=0; i<n; i++) {
            if(prices[i] < prices[buy]) {
                buy = i;
                sell = i;
            } else if(prices[i] > prices[sell]) {
                sell = i;
                profit = Math.max(profit, prices[sell]-prices[buy]);
            }
        }

        return profit;
    }
}
