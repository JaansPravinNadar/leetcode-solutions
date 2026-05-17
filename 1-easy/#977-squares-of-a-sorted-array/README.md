# 977. Squares of a Sorted Array

**Difficulty:** Easy ⭐  
**Link:** [LeetCode Problem #977](https://leetcode.com/problems/squares-of-a-sorted-array/)

---

## 📋 Problem Statement

Given an integer array `nums` sorted in non-decreasing order,
return an array of the squares of each number,
also sorted in non-decreasing order.

---

## 📝 Examples

**Example 1:**
Input:  [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:

Input:  [-7,-3,2,3,11]
Output: [4,9,9,49,121]

💡 Approach

Two Pointer Approach (Optimal)!

Key Insight:

Since the array is already sorted but contains negative numbers,
the largest squared values will always be at the two ends of the array.
So we use two pointers starting at both ends and fill the result array from back to front.

Algorithm:

Create a new result array of the same size
Use left pointer at index 0 and right pointer at last index
Use k pointer starting at the last index of result array
Compare squares of left and right
Place the larger square at result[k] and move that pointer inward
Move k backwards after each step

🔑 Code Explanation

int n = nums.length;
int[] result = new int[n];
int left = 0;
int right = n - 1;
int k = n - 1;
Three pointers:

left and right scan the input array from both ends
k fills the result array from the back

while(left <= right) {
We use <= (not <) to make sure the last remaining middle element also gets processed.


if(lSquare < rSquare) {
    result[k] = rSquare;
    right--;
} else {
    result[k] = lSquare;
    left++;
}
k--;

Winner (larger square) goes into result[k].
Move the winning pointer inward.
Move k backwards to fill the next position.

🆚 Why Not Just Square and Sort?
Approach	Time	Space
Square + Arrays.sort()	O(n log n)	O(1)
Two Pointer (This solution)	O(n)	O(n)
Two Pointer is faster because it takes advantage of the fact that the input is already sorted.

📊 Step-by-Step Trace

Input: [-4, -1, 0, 3, 10]


Step 1: left=0(-4), right=4(10) → 16 vs 100 → 100 wins → result[4]=100, right--
Step 2: left=0(-4), right=3(3)  → 16 vs 9  → 16 wins  → result[3]=16,  left++
Step 3: left=1(-1), right=3(3)  → 1  vs 9  → 9 wins   → result[2]=9,   right--
Step 4: left=1(-1), right=2(0)  → 1  vs 0  → 1 wins   → result[1]=1,   left++
Step 5: left=2(0),  right=2(0)  → 0  vs 0  → 0 wins   → result[0]=0,   left++

Result: [0, 1, 9, 16, 100] ✅