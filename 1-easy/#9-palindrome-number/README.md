# 9. Palindrome Number

**Difficulty:** Easy  
**Link:** [LeetCode Problem #9](https://leetcode.com/problems/palindrome-number/)

---

## 📋 Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number reads the same backward as forward.

---

## 📝 Examples

**Example 1:**
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

**Example 2:**
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.

**Example 3:**
Input: x = 10
Output: false
Explanation: Reads 01 from right to left.

## 💡 Approach

**Algorithm:**
1. Handle edge case: negative numbers are not palindromes
2. Reverse the number digit by digit
3. Compare reversed number with original
4. Return true if they match, false otherwise

**Key Logic:**
- Use `x % 10` to extract last digit
- Use `x / 10` to remove last digit
- Build reversed number: `rev = (rev * 10) + digit`

---

## 🔑 Code Explanation

```java
if (x < 0) return false;  // Negatives can't be palindromes

Handle edge case first.

int temp = x;  // Save original value
int rev = 0;   // Will store reversed number

Store original because we'll modify x.

while (x > 0) {
    int digit = x % 10;           // Get last digit
    rev = (rev * 10) + digit;     // Add to reversed number
    x = x / 10;                   // Remove last digit
}

Reverse the number digit by digit.

return temp == rev;

Compare and return result.


