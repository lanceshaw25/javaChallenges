# Day 8 — Product of Array Except Self

**Pattern:** Prefix and suffix products  
**Difficulty:** Medium

## Problem

Given an integer array `nums`, return an array `answer` such that `answer[i]` equals the product of every element in `nums` except `nums[i]`.

You must solve this **without using division**, in **O(n) time**.

## Examples

**Example 1**

```text
Input:  nums = [1, 2, 3, 4]
Output: [24, 12, 8, 6]
```

**Example 2**

```text
Input:  nums = [-1, 1, 0, -3, 3]
Output: [0, 0, 9, 0, 0]
```

## Constraints

- `2 <= nums.length <= 100,000`
- `-30 <= nums[i] <= 30`
- The product of any prefix or suffix is guaranteed to fit in a 32-bit integer.
- The final answers are guaranteed to fit in a 32-bit integer.

## Method signature

```java
public int[] productExceptSelf(int[] nums)
```

## Your goals

1. Implement the method.
2. Add JUnit tests for both examples and a few edge cases.
3. Aim for O(n) time and O(1) **extra space**, excluding the output array.
4. Explain how your approach works and why it meets the complexity requirements.

## Suggested test cases

- `[1, 2, 3, 4]` → `[24, 12, 8, 6]`
- `[-1, 1, 0, -3, 3]` → `[0, 0, 9, 0, 0]`
- `[2, 3]` → `[3, 2]`
- `[0, 0, 2]` → `[0, 0, 0]`
- `[-2, 3, -4]` → `[-12, 8, -6]`

Have fun! Don't worry about finding the cleverest solution immediately. Get the reasoning right first, and we'll review the implementation together.
