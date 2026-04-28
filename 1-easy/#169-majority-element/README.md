# 169. Majority Element

**Difficulty:** Easy  
**Link:** [LeetCode Problem #169](https://leetcode.com/problems/majority-element/)

---

## 📋 Problem Statement

Given an array `nums` of size `n`, return the majority element. The majority element is the element that appears more than `⌊ n/2 ⌋` times. You may assume that the majority element always exists in the array.

---

## 📝 Examples

**Example 1:**
```text
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

💡 Approach
HashMap Frequency Counter

Algorithm:

Create a HashMap<Integer, Integer> to store the count of each number.
Traverse the array:
For each number, increment its count in the map using getOrDefault(num, 0) + 1.
Traverse the keys of the HashMap:
Check if the count (value) of any key is greater than n / 2.
If found, return that key.

🔑 Code Explanation
jaans.put(num, jaans.getOrDefault(num, 0) + 1);

This is the core counting logic. It checks if the number is already in the "scoreboard". If not, starts at 0 and adds 1. If yes, takes the current score and adds 1.


if(jaans.get(key) > nums.length / 2) {
    return key;
}
After counting everything, we look for the "Majority" winner.

