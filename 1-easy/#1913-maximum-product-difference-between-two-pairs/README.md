# 1913. Maximum Product Difference Between Two Pairs

**Difficulty:** Easy  
**Link:** [LeetCode Problem #1913](https://leetcode.com/problems/maximum-product-difference-between-two-pairs/)

---

## 📋 Problem Statement

The **product difference** between two pairs `(a, b)` and `(c, d)` is defined as `(a * b) - (c * d)`.

Given an integer array `nums`, choose four different indices to maximize the product difference. Return the maximum product difference.

---

## 📝 Examples

**Example 1:**
```text
Input:  [5,6,2,7,4]
Output: 34

Explanation:
Largest pair:  6 × 7 = 42
Smallest pair: 2 × 4 = 8
Difference:    42 - 8 = 34

Example 2:
Input:  [4,2,5,9,7,4,8]
Output: 64

💡 Two Approaches

Approach 1: Sorting (First attempt)

Logic:
Sort the array. Take last two as largest, first two as smallest.

Arrays.sort(nums);
int n = nums.length;
return (nums[n-1] * nums[n-2]) - (nums[0] * nums[1]);
Time: O(n log n)
Runtime: 120ms (Beats 8.48%) ❌
Approach 2: One Pass - Track 4 Values (Optimized)

Logic:
Track largest two and smallest two in a single pass.
No sorting needed!

int max1 = Integer.MIN_VALUE;
int max2 = Integer.MIN_VALUE;
int min1 = Integer.MAX_VALUE;
int min2 = Integer.MAX_VALUE;

for(int num : nums) {
    if(num > max1) { max2 = max1; max1 = num; }
    else if(num > max2) { max2 = num; }

    if(num < min1) { min2 = min1; min1 = num; }
    else if(num < min2) { min2 = num; }
}

return (max1 * max2) - (min1 * min2);

Time: O(n)
Runtime: 2ms (Beats 99.50%) 🏆

📊 Comparison
Approach	Time	Runtime	Beats
Sorting	O(n log n)	120ms	8.48% ❌
One Pass	O(n)	2ms	99.50% 🏆

🔑 Code Explanation

int max1 = Integer.MIN_VALUE;
int max2 = Integer.MIN_VALUE;
Start with the smallest possible value so any real number can replace it.

int min1 = Integer.MAX_VALUE;
int min2 = Integer.MAX_VALUE;
Start with the largest possible value so any real number can replace it.

if(num > max1) {
    max2 = max1;
    max1 = num;
}
Found new biggest! Old biggest becomes second biggest.

else if(num > max2) {
    max2 = num;
}
Found new second biggest!

return (max1 * max2) - (min1 * min2);
Maximum product of two largest minus minimum product of two smallest.

⚠️ Common Mistake I Made:

// ❌ Wrong initialization:
int max1 = nums[0];
int max2 = nums[0]; // Same element used twice!

// This caused min2 to stay wrong
// When 1 and 2 were in array,
// min2 stayed as 1 instead of becoming 2!

// ✅ Correct initialization:

int max1 = Integer.MIN_VALUE;
int max2 = Integer.MIN_VALUE;
Always use Integer.MIN_VALUE and Integer.MAX_VALUE when tracking multiple max/min values!