# 268. Missing Number

**Difficulty:** Easy  
**Link:** [LeetCode Problem #268](https://leetcode.com/problems/missing-number/)

---

## 📋 Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

---

## 📝 Examples

**Example 1:**
Input:  [3,0,1]
Output: 2

Example 2:
Input:  [0,1]
Output: 2

Example 3:
Input:  [9,6,4,2,3,5,7,0,1]
Output: 8

💡 Three Approaches

Approach 1: HashSet (Easy to think)
Logic:

Store all elements in HashSet
Loop from 0 to n
Return first number not in HashSet

HashSet<Integer> set = new HashSet<>();
for(int num : nums) set.add(num);
for(int i = 0; i <= nums.length; i++) {
    if(!set.contains(i)) return i;
}
return -1;
Time: O(n) | Space: O(n)
Runtime: 5ms (Beats 20.72%) ❌

Approach 2: Sum Formula (Best for beginners)

Logic:
Expected sum from 0 to n = n*(n+1)/2
Missing number = Expected sum - Actual sum


int n = nums.length;
int expectedSum = n * (n + 1) / 2;
int actualSum = 0;
for(int num : nums) actualSum += num;
return expectedSum - actualSum;

Time: O(n) | Space: O(1) ✅
Runtime: 0ms (Beats 100%) 🏆

Approach 3: XOR (Bit Manipulation)

Logic:
XOR same numbers cancel out (a^a=0).
XOR all expected (0 to n) and actual numbers.
Only missing number survives!

int n = nums.length;
int xor = n;
for(int i = 0; i < n; i++) {
    xor = xor ^ i ^ nums[i];
}
return xor;

Time: O(n) | Space: O(1) ✅
Runtime: 0ms (Beats 100%) 🏆