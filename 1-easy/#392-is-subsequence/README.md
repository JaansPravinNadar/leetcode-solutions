# 392. Is Subsequence

**Difficulty:** Easy  
**Link:** [LeetCode Problem #392](https://leetcode.com/problems/is-subsequence/)

---

## 📋 Problem Statement

Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, or `false` otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.

---

## 📝 Examples

**Example 1:**
Input: s = "ace", t = "abcde"
Output: true

Explanation:
a b c d e
↑ ↑ ↑
a c e → found in order! ✅

**Example 2:**
Input: s = "aec", t = "abcde"
Output: false

Explanation:
Need a, then e, then c
But in "abcde", e comes AFTER c
Order doesn't match! ❌


---

## 💡 Approach

**Two Pointer Technique!**

**Algorithm:**
1. Use two pointers `i` for `s` and `j` for `t`
2. Move `j` through `t` always
3. Move `i` only when characters match
4. If `i` reaches end of `s` → all characters found → true!

**Key Insight:**  
We don't need consecutive matches, just same ORDER!

---

## 🔑 Code Explanation

```java
int i = 0;  // pointer for s
int j = 0;  // pointer for t
Two pointers starting at beginning of both strings.

while(s.length() > i && t.length() > j) {
    if(s.charAt(i) == t.charAt(j)) {
        i++;  // match found! move s pointer forward
    }
    j++;  // always move t pointer forward
}
Loop through both strings. When we find a match, move i forward. Always move j forward.

return s.length() == i;
If i equals length of s, we found ALL characters in order → true!

Step-by-Step Trace
s = "ace", t = "abcde"

i	j	s.charAt(i)	t.charAt(j)	Match?	Action
0	0	a	a	✅	i++, j++
1	1	c	b	❌	j++
1	2	c	c	✅	i++, j++
2	3	e	d	❌	j++
2	4	e	e	✅	i++, j++
i = 3 = s.length() → true ✅