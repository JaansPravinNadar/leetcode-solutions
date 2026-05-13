# 28. Find the Index of the First Occurrence in a String

**Difficulty:** Easy  
**Link:** [LeetCode Problem #28](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

---

## 📋 Problem Statement

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

---

## 📝 Examples

**Example 1:**

Input: haystack = "sadbutsad", needle = "sad"

Output: 0

Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"

Output: -1

Explanation: "leeto" did not occur in "leetcode"..

💡 Approach
Optimized Window Sliding using substring()

Edge Case: If the needle is longer than the haystack, it can't possibly exist inside it.
Loop Range: We only need to iterate from 0 up to haystack.length() - needle.length().
Filtering: To save time, we first check if the current character in haystack matches the first character of the needle.
Comparison: If the first characters match, we extract a substring of the haystack (starting from current index with the length of the needle) and compare it to the needle using .equals().
Result: Return the current index i on the first successful match.

🔑 Code Explanation

for (int i = 0; i < haystack.length() - needle.length() + 1; i++)
We stop the loop early because after this point, there aren't enough characters left in the haystack to fit the needle.


if (haystack.charAt(i) == needle.charAt(0))
Optimization: Comparing a single character is much faster than comparing a whole string. We only check the rest if the start matches.


if (haystack.substring(i, i + needle.length()).equals(needle))
We "slice" a piece of the haystack and check if it perfectly matches our needle.

