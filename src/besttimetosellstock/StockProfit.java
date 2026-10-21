package besttimetosellstock;

public class StockProfit {

    /**
     * You are given an array of integers prices, where prices[i] represents the price of a stock on day i.
     *
     * You may buy the stock on one day and sell it on a different day in the future. You may complete at most one transaction (one buy and one sell).
     *
     * Return the maximum profit you can achieve. If no profitable transaction is possible, return 0.
     *
     * @param prices
     * @return maxProfit
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int buyPrice = prices[0];

        // loop through prices starting at 2nd day price[1]
        for (int i = 1; i < prices.length; i++) {
            int profitToday = prices[i] - buyPrice;

            if (profitToday > maxProfit) {
                maxProfit = profitToday;
            }

            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
