# Day 11 – Subarray Sum Equals K

**Difficulty:** Medium  
**Pattern:** Prefix Sum + HashMap

## Problem

Given an array of integers `nums` and an integer `k`, return the total number of continuous subarrays whose elements sum to `k`.

A subarray must be contiguous and contain at least one element.

## Examples

**Example 1**
```java
nums = [1, 1, 1]
k = 2
// Output: 2
// Explanation: [1, 1] occurs twice.
```

**Example 2**
```java
nums = [1, 2, 3]
k = 3
// Output: 2
// Explanation: [1, 2] and [3].
```

**Example 3**
```java
nums = [1, -1, 0]
k = 0
// Output: 3
// Explanation: [1, -1], [0], and [1, -1, 0].
```

## Constraints

- `1 <= nums.length <= 20,000`
- `-1,000 <= nums[i] <= 1,000`
- `-10,000,000 <= k <= 10,000,000`

## Requirements

Implement:

```java
public int subarraySum(int[] nums, int k)
```

- Target O(n) time complexity.
- Additional data structures are allowed.
- Negative numbers are allowed, so a straightforward sliding-window approach won't necessarily work.

## Suggested Tests

- All three examples.
- A single element equal to k.
- No qualifying subarrays.
- Negative numbers.
- Multiple overlapping qualifying subarrays.
- Several zeroes with `k = 0`.
- An array where the entire array sums to k.