# 58. Length of Last Word

**Difficulty:** Easy  
**Link:** [LeetCode Problem #58](https://leetcode.com/problems/length-of-last-word/)

---

## 📋 Problem Statement

Given a string `s` consisting of words and spaces, return the length of the **last word** in the string.

A word is a maximal substring consisting of non-space characters only.

---

## 📝 Examples

**Example 1:**

Input:  "Hello World"
Output: 5

Example 2:

Input:  "   fly me   to   the moon  "
Output: 4
Example 3:


Input:  "luffy is still joyboy"
Output: 6

💡 Approach
To solve this problem:

Remove leading and trailing spaces using trim()
Start from the end of the string
Count characters until a space is found
Return the count
Since we only care about the last word, scanning from the end is the simplest approach.

🔑 Code Explanation

s = s.trim();
This removes extra spaces from the beginning and end.


for(int i = s.length() - 1; i >= 0; i--)
Start from the last character and move backward.


if(s.charAt(i) == ' ') {
    break;
}
If a space is found, the last word has ended.


len++;
Count each character of the last word.