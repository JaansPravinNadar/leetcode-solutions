# 136. Single Number

**Difficulty:** Easy  
**Link:** [LeetCode Problem #136](https://leetcode.com/problems/single-number/)

---

## 📋 Problem Statement

Given a non-empty array of integers `nums`, every element appears **twice** except for one. Find that single one.

You must implement a solution with a linear runtime complexity.

---

## 📝 Examples

**Example 1:**
Input:  [2,2,1]
Output: 1

Example 2:
Input:  [4,1,2,1,2]
Output: 4

Example 3:
Input:  [1]
Output: 1

💡 Approach

Use a HashMap to count the frequency of every number.

Steps:

Traverse the array and store frequency of each element in the map.
Traverse again and return the element whose frequency is 1.

🔑 Code Explanation

map.put(num, map.getOrDefault(num, 0) + 1);
This counts how many times each number appears.

if(map.get(num) == 1) {
    return num;
}
If frequency of current number is 1, that is the single number.