# 1. Two Sum

**Difficulty:** Easy  
**Link:** [LeetCode Problem #1](https://leetcode.com/problems/two-sum/)

---

## 📋 Problem Statement

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

---

## 📝 Examples

**Example 1:**
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9

**Example 2:**
Input: nums = [3,2,4], target = 6
Output: [1,2]
Explanation: nums[1] + nums[2] = 2 + 4 = 6

**Example 3:**
Input: nums = [3,3], target = 6
Output: [0,1]


---

## 💡 Approach

**Brute Force - Check every pair!**

**Algorithm:**
1. Loop through every element with pointer `i`
2. For each `i`, loop through remaining elements with pointer `j`
3. If `nums[i] + nums[j] == target` → return `[i, j]`

---

## 🔑 Code Explanation

```java
for(int i = 0; i < nums.length; i++) {
    for(int j = i+1; j < nums.length; j++) {

Two nested loops checking every possible pair.
j starts from i+1 to avoid using same element twice.

if(nums[i] + nums[j] == target) {
    return new int[]{i, j};
}
If pair found, return their indices immediately.