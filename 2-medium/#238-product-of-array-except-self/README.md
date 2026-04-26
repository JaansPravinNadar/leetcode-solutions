# 238. Product of Array Except Self

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #238](https://leetcode.com/problems/product-of-array-except-self/)

---

## 📋 Problem Statement

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

**Must solve without using division and in O(n) time!**

---

## 📝 Examples

**Example 1:**
Input: [1,2,3,4]
Output: [24,12,8,6]

Explanation:
answer[0] = 2×3×4 = 24
answer[1] = 1×3×4 = 12
answer[2] = 1×2×4 = 8
answer[3] = 1×2×3 = 6

**Example 2:**
Input: [-1,1,0,-3,3]
Output: [0,0,9,0,0]


---

## 💡 Approach

**Prefix × Suffix Products!**

**Key Insight:**  
For each index i:
answer[i] = (product of everything LEFT of i)
× (product of everything RIGHT of i)


**Algorithm:**
1. Build prefix products (left to right)
2. Multiply with suffix products (right to left)
3. No division needed! O(n) time! ✅

---

## 🔑 Code Explanation

```java
answer[0] = 1;
for(int i = 1; i < n; i++) {
    answer[i] = answer[i-1] * nums[i-1];
}

Build prefix products.
answer[i] = product of everything to the LEFT of index i.

int suffix = 1;
for(int i = n-1; i >= 0; i--) {
    answer[i] = answer[i] * suffix;
    suffix *= nums[i];
}
Multiply each position with its right-side product.
suffix keeps track of running product from right side.

📊 Step-by-Step Trace
Input: [1, 2, 3, 4]

After prefix pass:

Index	Calculation	answer[i]
0	1 (empty left)	1
1	nums[0] = 1	1
2	1 × nums[1] = 2	2
3	2 × nums[2] = 6	6
prefix = [1, 1, 2, 6]

After suffix pass:

Index	prefix[i]	suffix	answer[i]
3	6	1	6×1=6
2	2	4	2×4=8
1	1	12	1×12=12
0	1	24	1×24=24
Final: [24, 12, 8, 6] ✅