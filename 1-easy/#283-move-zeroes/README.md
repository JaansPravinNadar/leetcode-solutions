# 283. Move Zeroes

**Difficulty:** Easy  
**Link:** [LeetCode Problem #283](https://leetcode.com/problems/move-zeroes/)

---

## 📋 Problem Statement

Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements.

**Note:** Must do this in-place without making a copy of the array.

---

## 📝 Examples

**Example 1:**
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

**Example 2:**
Input: [0]
Output: [0]


---

## 💡 Approach

**Two Pointer Technique!**

**Algorithm:**
1. Keep pointer `j` for next non-zero position
2. Traverse array with pointer `i`
3. If `nums[i] != 0` → place at `nums[j]`, move j forward
4. After loop, fill remaining positions with 0

**Key Insight:**  
Don't move zeros - instead collect all non-zeros first, then fill rest with zeros!

---

## 🔑 Code Explanation

```java
int j = 0;
Pointer tracking where next non-zero should go.

for(int i = 0; i < nums.length; i++) {
    if(nums[i] != 0) {
        nums[j] = nums[i];
        j++;
    }
}

Scan array, place every non-zero at position j.

while(j < nums.length) {
    nums[j] = 0;
    j++;
}
Fill remaining positions with zeros.

📊 Step-by-Step Trace
Input: [0, 1, 0, 3, 12]

i	nums[i]	Action	j	Array State
0	0	Skip	0	[0,1,0,3,12]
1	1	Place at j=0	1	[1,1,0,3,12]
2	0	Skip	1	[1,1,0,3,12]
3	3	Place at j=1	2	[1,3,0,3,12]
4	12	Place at j=2	3	[1,3,12,3,12]
Fill from j=3 with zeros:
[1, 3, 12, 0, 0] ✅

