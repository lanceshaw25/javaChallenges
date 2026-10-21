package besttimetosellstock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockProfitTest {

    @Test
    void maxProfitLowestBuyNotFirst() {
        StockProfit stockProfit = new StockProfit();

        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        var expected = 5; // buy at 1, sell at 6.  6-1 = 5

        assertEquals(expected, stockProfit.maxProfit(prices));
    }

    @Test
    void maxProfitNoProfit() {
        StockProfit stockProfit = new StockProfit();

        int[] prices = new int[] { 7, 6, 4, 3, 1 };
        var expected = 0; // no profitable transaction

        assertEquals(expected, stockProfit.maxProfit(prices));
    }

    @Test
    void maxProfit() {
        StockProfit stockProfit = new StockProfit();

        int[] prices = new int[] { 2, 4, 1 };
        var expected = 2; // buy at 2, sell at 4.  4-2 = 2

        assertEquals(expected, stockProfit.maxProfit(prices));
    }

    @Test
    void maxProfitLastDayBest() {
        StockProfit stockProfit = new StockProfit();

        int[] prices = {3, 2, 6, 1, 8};
        assertEquals(7, stockProfit.maxProfit(prices));
    }

    @Test
    void maxProfitNotEnoughPrices() {
        StockProfit stockProfit = new StockProfit();


        int[] prices = new int[] { 2 };
        var expected = 0;

        assertEquals(expected, stockProfit.maxProfit(prices));
        assertEquals(expected, stockProfit.maxProfit(null));
        assertEquals(expected, stockProfit.maxProfit(new int[] {} ));

    }
}