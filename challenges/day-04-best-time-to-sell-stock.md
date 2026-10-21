# Day 4 — Best Time to Buy and Sell Stock

**Difficulty:** Easy  
**Topics:** Arrays, one-pass algorithms

## Problem

You are given an array of integers `prices`, where `prices[i]` represents the price of a stock on day `i`.

You may buy the stock on one day and sell it on a **different day in the future**. You may complete at most one transaction (one buy and one sell).

Return the maximum profit you can achieve. If no profitable transaction is possible, return `0`.

## Examples

**Example 1**

- Input: `prices = [7, 1, 5, 3, 6, 4]`
- Output: `5`
- Explanation: Buy at `1` and sell later at `6`. The profit is `6 - 1 = 5`.

**Example 2**

- Input: `prices = [7, 6, 4, 3, 1]`
- Output: `0`
- Explanation: The price continually decreases, so no profitable transaction is possible.

**Example 3**

- Input: `prices = [2, 4, 1]`
- Output: `2`
- Explanation: Buy at `2` and sell later at `4`.

## Implementation

Implement this method in Java:

```java
public int maxProfit(int[] prices)
```

Create a `StockProfit` class and write JUnit tests for the examples above.

## Practice Goals

- Start with a solution you can explain.
- Make sure the buy day always comes before the sell day.
- Consider what happens when prices continually decrease.
- Try to improve your solution without using nested loops.
- Be prepared to explain the time and space complexity.

## After Solving

Record a few notes about your solution:

- What approach did you use?
- How did you keep track of the best opportunity to buy?
- What are the time and space complexity?
- Could you solve it in a single pass?

---

*Try spending 10–15 minutes on the problem before asking for a hint. Focus on your own reasoning before looking for a more efficient approach.*