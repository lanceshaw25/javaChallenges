# Day 7 — Move Zeroes

**Difficulty:** Easy

**Topics:** Arrays, Two Pointers, In-Place Algorithms

## Problem

Given an integer array `nums`, move all zeroes to the end of the array while maintaining the relative order of all nonzero elements.

You must modify the original array **in place**, without making a copy of the entire array.

## Examples

**Example 1**

Input:
```java
nums = [0, 1, 0, 3, 12]
```

Output:
```java
[1, 3, 12, 0, 0]
```

**Example 2**

Input:
```java
nums = [0]
```

Output:
```java
[0]
```

**Example 3**

Input:
```java
nums = [1, 2, 3]
```

Output:
```java
[1, 2, 3]
```

**Example 4**

Input:
```java
nums = [0, 0, 1, 0, 2, 0, 3]
```

Output:
```java
[1, 2, 3, 0, 0, 0, 0]
```

## Constraints

- `1 <= nums.length <= 10,000`
- `-2^31 <= nums[i] <= 2^31 - 1`
- Preserve the relative order of all nonzero elements.
- Modify the original array rather than returning a new array.

## Required Method

```java
public void moveZeroes(int[] nums)
```

The method should modify `nums` directly.

## Practice Goals

- Develop an in-place array algorithm.
- Explore how two pointers can help avoid unnecessary work.
- Preserve the order of elements while moving zeroes.
- Aim for O(n) time complexity and O(1) auxiliary space.

## After Solving

Be prepared to explain:

- What each pointer represents.
- Why the relative order of nonzero elements is preserved.
- Whether your algorithm processes each element only a constant number of times.
- How your implementation behaves when there are no zeroes or every element is zero.

Try to solve it independently before looking for hints.
