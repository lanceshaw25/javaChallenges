# Day 10 – Minimum Size Subarray Sum

**Difficulty:** Medium  
**Pattern:** Sliding Window

## Problem

Given an array of positive integers `nums` and a positive integer `target`, return the **minimum length** of a contiguous subarray whose sum is greater than or equal to `target`.

If no such subarray exists, return `0`.

## Examples

**Example 1**
```java
nums = [2, 3, 1, 2, 4, 3]
target = 7
// Output: 2
// Explanation: [4, 3] has a sum of 7.
```

**Example 2**
```java
nums = [1, 4, 4]
target = 4
// Output: 1
// Explanation: [4] has a sum of 4.
```

**Example 3**
```java
nums = [1, 1, 1, 1, 1, 1, 1, 1]
target = 11
// Output: 0
// Explanation: No qualifying subarray exists.
```

## Constraints

- `1 <= nums.length <= 100,000`
- `1 <= nums[i] <= 10,000`
- `1 <= target <= 1,000,000,000`

## Requirements

- Implement `public int minSubArrayLen(int target, int[] nums)`.
- The subarray must be contiguous.
- Aim for **O(n) time complexity**.
- Try to use **O(1) auxiliary space**.

## Suggested Tests

- The three examples above.
- A single element that meets the target.
- A single element that doesn't meet the target.
- The entire array is needed to reach the target.
- Multiple qualifying windows, where the shortest isn't the first one found.
- A window that becomes valid and then can be repeatedly shortened.

