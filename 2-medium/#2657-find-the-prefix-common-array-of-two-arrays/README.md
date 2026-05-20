# 2657. Find the Prefix Common Array of Two Arrays

**Difficulty:** Medium ⭐⭐  
**Link:** [LeetCode Problem #2657](https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/)

---

## 📋 Problem Statement

You are given two **0-indexed integer permutations** `A` and `B` of length `n`.

A **prefix common array** of `A` and `B` is an array `C` such that:

- `C[i]` is equal to the number of integers that are present in both
  the prefix `A[0...i]` and the prefix `B[0...i]`

Return the prefix common array of `A` and `B`.

---

## 📝 Examples

**Example 1:**
Input:  A = [1,3,2,4], B = [3,1,2,4]
Output: [0,2,3,4]

Example 2:
Input:  A = [2,3,1], B = [3,1,2]
Output: [0,1,3]

💡 Approach

Frequency Array + Running Count

Key Insight:
Both A and B are permutations of numbers from 1 to n.

That means:
values are in a fixed range
no duplicates inside each array
So instead of checking every prefix again and again using nested loops, we can use a frequency array.

Idea:

Maintain a frequency array freq
When a number appears in A, increase its frequency
When the same number appears in B, its frequency becomes 2
The moment frequency becomes 2, it means that number has now appeared in both prefixes
Increase a running count
Store that count at each index
This avoids recomputing prefix matches from scratch.

🔑 Code Explanation
Step 1: Create result array
result[i] will store the number of common elements up to index i

Step 2: Create frequency array
Since numbers are from 1 to n, use an array of size n + 1

Step 3: Traverse both arrays together
At every index:
mark A[i]
if its frequency becomes 2 → count++
mark B[i]
if its frequency becomes 2 → count++
store count in result
This works because frequency reaching 2 means:
seen once in A and once in B
or
already seen in one prefix and now found in the other prefix

📊 Step-by-Step Trace

Input:
A = [1,3,2,4]
B = [3,1,2,4]

Index 0

A[0] = 1 → freq[1] = 1
B[0] = 3 → freq[3] = 1
count = 0
result[0] = 0

Index 1

A[1] = 3 → freq[3] = 2 → count = 1
B[1] = 1 → freq[1] = 2 → count = 2
result[1] = 2

Index 2

A[2] = 2 → freq[2] = 1
B[2] = 2 → freq[2] = 2 → count = 3
result[2] = 3

Index 3

A[3] = 4 → freq[4] = 1
B[3] = 4 → freq[4] = 2 → count = 4
result[3] = 4

Final Output
[0, 2, 3, 4]