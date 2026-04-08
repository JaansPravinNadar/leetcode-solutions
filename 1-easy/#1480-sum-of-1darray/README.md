# 1480. Running Sum of 1d Array

**Difficulty:** Easy  
**Link:** [LeetCode Problem #1480](https://leetcode.com/problems/running-sum-of-1d-array/)

---

## 📋 Problem Statement

Given an array `nums`, return the running sum of the array.

The running sum is calculated as: `runningSum[i] = sum(nums[0]…nums[i])`

---

## 📝 Examples

**Example 1:**
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is [1, 1+2, 1+2+3, 1+2+3+4]

**Example 2:**
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]

**Example 3:**
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]


---

## 💡 Approach

**Algorithm:**
1. Start from index 1 (first element stays the same)
2. Add previous element to current element
3. Store the result in current position
4. Continue for all elements

**Key Insight:**  
We can modify the array in-place by adding `nums[i-1]` to `nums[i]`

---

## 🔑 Code Explanation

```java
for(int i = 1; i < nums.length; i++) {
    nums[i] = nums[i] + nums[i-1];
}
Example walkthrough for [1, 2, 3, 4]:

i=1: nums[1] = 2 + 1 = 3 → [1, 3, 3, 4]
i=2: nums[2] = 3 + 3 = 6 → [1, 3, 6, 4]
i=3: nums[3] = 4 + 6 = 10 → [1, 3, 6, 10] ✅