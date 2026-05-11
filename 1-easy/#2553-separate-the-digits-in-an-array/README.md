# 2553. Separate the Digits in an Array

**Difficulty:** Easy  
**Link:** [LeetCode Problem #2553](https://leetcode.com/problems/separate-the-digits-in-an-array/)

---

## 📋 Problem Statement

Given an array of positive integers `nums`, return an array of the digits of each integer in `nums` in the same order they appear.

---

## 📝 Examples

**Example 1:**
Input:  [13,25,83,77]
Output: [1,3,2,5,8,3,7,7]

Example 2:
Input:  [7,1,3,9]
Output: [7,1,3,9]

💡 Approach
Convert each number to String, extract digits one by one!

Algorithm:

Create dynamic ArrayList
For each number in nums:
Convert to String using String.valueOf(num)
Loop through each character
Convert char to digit using ch - '0'
Add to list
Convert list to int array
Return array

🔑 Code Explanation


String str = String.valueOf(num);
Convert integer to String so we can access digits one by one.

char ch = str.charAt(i);
list.add(ch - '0');
ch - '0' converts character digit to integer digit.

Example: '7' - '0' = 7


int[] answer = new int[list.size()];

for(int i = 0; i < list.size(); i++) {
    answer[i] = list.get(i);
}

Convert ArrayList to int array for the return type.

Milestone: First Daily Challenge Completed! 🎉