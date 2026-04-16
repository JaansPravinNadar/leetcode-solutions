# 189. Rotate Array

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #189](https://leetcode.com/problems/rotate-array/)

---

## 📋 Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps.

---

## 📝 Examples

**Example 1:**
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

Explanation:
rotate 1 step: [7,1,2,3,4,5,6]
rotate 2 steps: [6,7,1,2,3,4,5]
rotate 3 steps: [5,6,7,1,2,3,4]

**Example 2:**
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]


---

## 💡 Approach

**Three Reversal Technique!**

**Algorithm:**
1. Handle large k: `k = k % n`
2. Reverse entire array
3. Reverse first k elements
4. Reverse remaining elements

**Card Deck Analogy:**
Original: [1,2,3,4 | 5,6,7] (Part A | Part B)
Goal: [5,6,7 | 1,2,3,4] (Part B | Part A)

Step 1: Flip entire deck → [7,6,5,4,3,2,1]
Step 2: Flip first k(3) → [5,6,7,4,3,2,1] (Part B fixed!)
Step 3: Flip remaining → [5,6,7,1,2,3,4] (Part A fixed!)


---

## 🔑 Code Explanation

```java
k = k % n;
Handle case where k > array length. Rotating by n = no change. Only effective rotation matters.

reverse(nums, 0, n - 1);
Reverse entire array. Puts elements in opposite order.

reverse(nums, 0, k - 1);
Reverse first k elements. Fixes the order of moved elements.

reverse(nums, k, n - 1);
Reverse remaining elements. Fixes the order of rest of the array.

Step-by-Step Trace
Input: [1,2,3,4,5,6,7], k=3

Step	What	Indices	Result
Start	Original	-	[1,2,3,4,5,6,7]
1	Reverse All	(0,6)	[7,6,5,4,3,2,1]
2	Reverse First 3	(0,2)	[5,6,7,4,3,2,1]
3	Reverse Rest	(3,6)	[5,6,7,1,2,3,4] ✅