# 151. Reverse Words in a String

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #151](https://leetcode.com/problems/reverse-words-in-a-string/)

---

## 📋 Problem Statement

Given an input string `s`, reverse the order of the words.

A word is defined as a sequence of non-space characters. Words are separated by at least one space.

Return a string of the words in reverse order, concatenated by a single space.

**Note:** Input may contain leading/trailing spaces or multiple spaces between words.

---

## 📝 Examples

**Example 1:**
Input: s = "the sky is blue"
Output: "blue is sky the"

**Example 2:**
Input: s = " hello world "
Output: "world hello"
Explanation: Reversed string should not contain leading/trailing spaces

**Example 3:**
Input: s = "a good example"
Output: "example good a"
Explanation: Multiple spaces reduced to single space


---

## 💡 Approach

**Algorithm:**
1. Trim leading/trailing spaces using `.trim()`
2. Split string by one or more spaces using regex `\\s+`
3. Reverse the array using two pointers
4. Join array back with single space

**Key Insight:**  
Using `\\s+` in split handles multiple consecutive spaces!

---

## 🔑 Code Explanation

```java
s = s.trim();
Remove leading and trailing spaces.

String[] words = s.split("\\s+");
Split by ONE OR MORE spaces (\\s+ is regex for "whitespace, one or more times").
Handles multiple spaces between words automatically!

// Reverse array using two pointers
int start = 0;
int end = words.length - 1;
while(start < end) {
    String temp = words[start];
    words[start] = words[end];
    words[end] = temp;
    start++;
    end--;
}
Classic two-pointer array reversal.

return String.join(" ", words);
Join reversed words with single space.