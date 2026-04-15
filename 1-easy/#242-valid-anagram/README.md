# 242. Valid Anagram

**Difficulty:** Easy  
**Link:** [LeetCode Problem #242](https://leetcode.com/problems/valid-anagram/)

---

## 📋 Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

Two strings are anagrams if they contain the same characters with the same frequency.

---

## 📝 Examples

**Example 1:**
Input: s = "anagram", t = "nagaram"
Output: true

**Example 2:**
Input: s = "rat", t = "car"
Output: false


---

## 💡 Approach

**Sort and Compare!**

**Algorithm:**
1. Check if lengths are equal (quick check!)
2. Convert both strings to char arrays
3. Sort both arrays
4. Compare sorted arrays

**Key Insight:**  
If two strings are anagrams, sorting them will produce identical arrays!

---

## 🔑 Code Explanation

```java
if(s.length() != t.length()) return false;
Quick length check - if lengths differ, can't be anagram!

char[] arr1 = s.toCharArray();
char[] arr2 = t.toCharArray();
Convert strings to char arrays (strings are immutable, can't sort directly!)

Arrays.sort(arr1);
Arrays.sort(arr2);
Sort both arrays alphabetically.

return Arrays.equals(arr1, arr2);
Compare sorted arrays - if identical, they're anagrams!