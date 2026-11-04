
# Day 9: Longest Substring Without Repeating Characters

## Problem

Given a string `s`, return the length of the longest substring that contains no repeated characters.

A **substring** is a contiguous sequence of characters.

## Examples

```text
Input:  s = "abcabcbb"
Output: 3
Explanation: "abc" is the longest substring without repeated characters.
```

```text
Input:  s = "bbbbb"
Output: 1
Explanation: "b" is the longest substring without repeated characters.
```

```text
Input:  s = "pwwkew"
Output: 3
Explanation: "wke" is a longest valid substring.
```

```text
Input:  s = ""
Output: 0
```

## Requirements

- Implement `public int lengthOfLongestSubstring(String s)`.
- Aim for **O(n)** time.
- You may use additional data structures.
- Treat characters as Java `char` values.

## Tests to consider

- Empty string
- One character
- All characters the same
- No repeated characters
- A repeated character that appears again after several other characters
- A string where the longest valid substring is at the end
