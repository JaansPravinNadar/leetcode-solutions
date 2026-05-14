# 75. Sort Colors

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #75](https://leetcode.com/problems/sort-colors/)

---

## 📋 Problem Statement

Given an array `nums` with values `0`, `1`, and `2`, sort them **in-place** so that:
- All `0`s come first
- Then all `1`s  
- Then all `2`s

---

## 📝 Examples

**Example 1:**
Input:  [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input:  [2,0,1]
Output: [0,1,2]

💡 Approach

Counting Approach!

Key Insight:

Since the array contains only 3 fixed values (0, 1, 2), we don't need a complex sorting algorithm.
Just count how many of each value exist, then rewrite the array in order!

Algorithm:

Count occurrences of 0, 1, and 2
Overwrite the array:
First zeroCount positions with 0
Next oneCount positions with 1
Remaining positions with 2

🔑 Code Explanation


int zeroCount = 0;
int oneCount = 0;
int twoCount = 0;
Three simple counters instead of HashMap.
Works because values are fixed (only 0, 1, 2).


for(int num : nums) {
    if(num == 0) zeroCount++;
    else if(num == 1) oneCount++;
    else twoCount++;
}
Count occurrences of each value in one pass.

for(int i = 0; i < zeroCount; i++) nums[i] = 0;
for(int i = zeroCount; i < zeroCount + oneCount; i++) nums[i] = 1;
for(int i = zeroCount + oneCount; i < nums.length; i++) nums[i] = 2;
Rewrite the array in order.
Each loop starts exactly where the previous one ended.

📊 Step-by-Step Trace

Input: [2,0,2,1,1,0]

Pass 1: Count

zeroCount = 2
oneCount  = 2
twoCount  = 2

Pass 2: Rewrite

Loop 1: nums[0]=0, nums[1]=0
Loop 2: nums[2]=1, nums[3]=1
Loop 3: nums[4]=2, nums[5]=2

Result: [0,0,1,1,2,2] ✅