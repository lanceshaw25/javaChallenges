# Day 6 — Maximum Average Subarray I

**Difficulty:** Easy  
**Topics:** Arrays, sliding window

## Problem

Given an integer array `nums` consisting of `n` elements, and an integer `k`, find a contiguous subarray of length exactly `k` that has the maximum average value.

Return the maximum average.

Your answer will be accepted if it is within `10^-5` of the correct answer.

## Examples

**Example 1**

- Input: `nums = [1, 12, -5, -6, 50, 3]`, `k = 4`
- Output: `12.75000`
- Explanation: The subarray `[12, -5, -6, 50]` has the maximum average: `(12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75`.

**Example 2**

- Input: `nums = [5]`, `k = 1`
- Output: `5.00000`

## Constraints

- `n == nums.length`
- `1 <= k <= n <= 100,000`
- `-10,000 <= nums[i] <= 10,000`

## Implementation

Implement the following method in Java:

```java
public double findMaxAverage(int[] nums, int k)
```

Create a `MaximumAverageSubarray` class and write JUnit tests for the examples above.

## Practice Goals

- Start with a straightforward solution you can explain.
- Meet the expected O(n) time complexity.
- Avoid recalculating the sum of every element in each window.
- Pay attention to negative numbers and the difference between integer and floating-point division.

## After Solving

Record a few notes about your solution:

- How did you calculate the first window's sum?
- How did you update the sum when the window moved one position?
- What are the time and space complexities?
- Why is a sliding window more efficient than recalculating every window from scratch?

---

*Try spending 10–15 minutes on the problem before asking for a hint. Focus on understanding the pattern rather than memorizing a solution.*