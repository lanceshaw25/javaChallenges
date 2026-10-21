# Day 5 — Search Insert Position

**Difficulty:** Easy  
**Topics:** Arrays, binary search

## Problem

Given a sorted array of distinct integers `nums` and an integer `target`, return the index if `target` is found.

If `target` is not found, return the index where it would be inserted to keep the array sorted.

Your solution must run in **O(log n)** time.

## Examples

**Example 1**

- Input: `nums = [1, 3, 5, 6]`, `target = 5`
- Output: `2`
- Explanation: The target is found at index `2`.

**Example 2**

- Input: `nums = [1, 3, 5, 6]`, `target = 2`
- Output: `1`
- Explanation: Inserting `2` at index `1` keeps the array sorted.

**Example 3**

- Input: `nums = [1, 3, 5, 6]`, `target = 7`
- Output: `4`
- Explanation: The target belongs at the end of the array.

**Example 4**

- Input: `nums = [1, 3, 5, 6]`, `target = 0`
- Output: `0`
- Explanation: The target belongs at the beginning of the array.

**Example 5**

- Input: `nums = [1]`, `target = 0`
- Output: `0`

## Implementation

Implement the following method in Java:

```java
public int searchInsert(int[] nums, int target)
```

Create a `SearchInsertPosition` class and write JUnit tests for the examples above.

## Practice Goals

- Start by understanding how you would find the target in a sorted array.
- Meet the required O(log n) time complexity.
- Handle targets smaller than every element and larger than every element.
- Pay attention to array boundaries and off-by-one errors.
- Be prepared to explain why your algorithm is logarithmic.

## After Solving

Record a few notes about your solution:

- How did you narrow down the search range?
- What caused your search to stop?
- How did you handle a target that wasn't present?
- What are the time and space complexities?

---

*Try spending 10–15 minutes on the problem before asking for a hint. Get your own implementation working before comparing it with alternative approaches.*