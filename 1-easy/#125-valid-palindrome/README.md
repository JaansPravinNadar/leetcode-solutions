# 125. Valid Palindrome

**Difficulty:** Easy  
**Link:** [LeetCode Problem #125](https://leetcode.com/problems/valid-palindrome/)

---

## 📋 Problem Statement

A phrase is a **palindrome** if, after converting all uppercase letters to lowercase and removing all non-alphanumeric characters, it reads the same forward and backward.

Alphanumeric characters include letters and digits.

---

## 📝 Examples

**Example 1:**
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome

**Example 2:**
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome

**Example 3:**
Input: s = " "
Output: true
Explanation: After removing non-alphanumeric, empty string is palindrome



---

## 💡 Approach

**Two-pointer technique with character filtering!**

**Algorithm:**
1. Convert string to lowercase
2. Use two pointers (start from both ends)
3. Skip non-alphanumeric characters from both sides
4. Compare characters
5. If mismatch found, return false
6. If all match, return true

**Key Insight:**  
Ignore spaces, punctuation, and special characters - only compare letters and digits!

---

## 🔑 Code Explanation

```java
str = str.toLowerCase();
Convert to lowercase for case-insensitive comparison.

while(start < end && !Character.isLetterOrDigit(str.charAt(start))){
    start++;
}
Skip all non-alphanumeric characters from the left.
Keep moving start forward until we find a letter or digit.

while(start < end && !Character.isLetterOrDigit(str.charAt(end))){
    end--;
}
Skip all non-alphanumeric characters from the right.
Keep moving end backward until we find a letter or digit.

if(str.charAt(start) != str.charAt(end)){
    return false;
}
Compare the valid characters. If they don't match, not a palindrome!

start++;
end--;
Move both pointers toward center for next comparison.