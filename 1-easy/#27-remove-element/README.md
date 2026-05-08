# 27. Remove Element

**Difficulty:** Easy  
**Link:** [LeetCode Problem #27](https://leetcode.com/problems/remove-element/)

---

## 📋 Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place. Return the number of elements not equal to `val`.

---

## 📝 Examples

**Example 1:**
Input:  nums = [3,2,2,3], val = 3
Output: 2
Array:  [2,2]

Example 2:

Input:  nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5
Array:  [0,1,3,0,4]

💡 Approach
Two Pointer Technique!

Algorithm:

Keep pointer j for next valid position
Loop through every element with i
If nums[i] != val → place it at nums[j] and increment j
Skip elements equal to val
Return j as new length

🔑 Code Explanation

int j = 0;
Pointer tracking next position for valid elements.

if(nums[i] != val) {
    nums[j] = nums[i];
    j++;
}
Only keep elements that are NOT equal to val.
Place them at the front of the array.

return j;
j = count of valid elements = new length.

📊 Step-by-Step Trace
Input: [3,2,2,3], val = 3

i=0: nums[0]=3 == val → skip
i=1: nums[1]=2 != val → nums[0]=2, j=1
i=2: nums[2]=2 != val → nums[1]=2, j=2
i=3: nums[3]=3 == val → skip

Array: [2,2,_,_]
Return: 2 ✅