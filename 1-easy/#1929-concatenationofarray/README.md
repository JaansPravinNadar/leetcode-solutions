# 1929. Concatenation of Array

**Difficulty:** Easy  
**Link:** [LeetCode Problem #1929](https://leetcode.com/problems/concatenation-of-array/)

---

## 📋 Problem Statement

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n`.

In other words, `ans` is the concatenation of two `nums` arrays.

---

## 📝 Examples

**Example 1:**
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: ans = [1,2,1] + [1,2,1]

**Example 2:**
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]


---

## 💡 Approach

**Algorithm:**
1. Create new array of size `2 * n`
2. Use single loop to fill both halves
3. First half: `ans[i] = nums[i]`
4. Second half: `ans[i + n] = nums[i]`

**Key Logic:**
```java
for(int i = 0; i < n; i++) {
    ans[i] = nums[i];        // Fill position i
    ans[i + n] = nums[i];    // Fill position i+n (duplicate)
}

Step-by-step for nums = [1, 2, 1]:

i	ans[i]	ans[i+n]	Array State
0	ans[0]=1	ans[3]=1	[1,0,0,1,0,0]
1	ans[1]=2	ans[4]=2	[1,2,0,1,2,0]
2	ans[2]=1	ans[5]=1	[1,2,1,1,2,1] ✅