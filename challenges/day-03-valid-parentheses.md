# Day 3 — Valid Parentheses

**Difficulty:** Easy
**Topic:** Stack

## Problem

Given a string `s` containing only the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`, determine whether the input string is valid.

A string is valid if:

1. Every opening bracket is closed by the same type of bracket.
2. Opening brackets are closed in the correct order.
3. Every closing bracket has a corresponding opening bracket.

## Examples

**Example 1**

* Input: `s = "()"`
* Output: `true`

**Example 2**

* Input: `s = "()[]{}"`
* Output: `true`

**Example 3**

* Input: `s = "(]"`
* Output: `false`

**Example 4**

* Input: `s = "([)]"`
* Output: `false`

**Example 5**

* Input: `s = "{[]}"`
* Output: `true`

## Implementation

Implement the following method in Java:

```java
public boolean isValid(String s)
```

Create a `ValidParentheses` class and write JUnit tests for the examples above.

## Practice Goals

* Solve the problem independently before looking for hints.
* Get a working solution before worrying about optimization.
* Consider edge cases, including an empty string, a single bracket, and mismatched brackets.
* Be prepared to explain your approach and its time and space complexity.

## After Solving

Record a few notes about your solution:

* What approach did you use?
* What data structure, if any, helped you solve the problem?
* What are the time and space complexity?
* What would you improve after reviewing the solution?

---

*Try spending 10–15 minutes on the problem before asking for a hint. The goal is to build confidence through practice, not to memorize solutions.*
