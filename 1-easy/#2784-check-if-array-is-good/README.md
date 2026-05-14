# 2784. Check if Array is Good

**Difficulty:** Easy  
**Link:** [LeetCode Problem #2784](https://leetcode.com/problems/check-if-array-is-good/)

---

## 📋 Problem Statement

You are given an integer array `nums`. We consider an array of length `n` to be "Good" if it is a permutation of an array `base[n]` where:
- `base[n] = [1, 2, ..., n - 1, n - 1]`

Return `true` if the given array is Good, otherwise return `false`.

---

## 📝 Examples

**Example 1:**
Input: nums = [2, 1, 3, 3]
Output: true

Explanation: n = 4, base[4] = [1, 2, 3, 3].

Example 2:
Input: nums = [1, 1]
Output: true

Explanation: n = 2, base[2] = [1, 1].

Example 3:
Input: nums = [3, 4, 4, 1, 2]
Output: false

💡 Approach

Sorting and Pattern Matching

Calculate the expected maximum number: max = nums.length - 1.
Sort the input array nums.
Iterate through the array up to the second-to-last element:
Each element at index i must be equal to i + 1.
Check the very last element:
It must be equal to the calculated max.
If all conditions pass, return true.

🔑 Code Explanation

Arrays.sort(nums);
Sorting brings the elements into numerical order, making it easy to check the 1, 2, 3... sequence.


if (nums[index] != index + 1) return false;
Validates that each number appears in the correct position for a base sequence.


if (nums[nums.length - 1] != nums.length - 1) return false;
Ensures that the last number (which is the duplicate) is correct.