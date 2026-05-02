# 344. Reverse String

**Difficulty:** Easy  
**Link:** [LeetCode Problem #344](https://leetcode.com/problems/reverse-string/)

---

## 📋 Problem Statement

Write a function that reverses a character array `s` **in-place**.

You must do this by modifying the input array directly with O(1) extra memory.

---

## 📝 Examples

**Example 1:**
Input:  ['h','e','l','l','o']
Output: ['o','l','l','e','h']

Example 2:
Input:  ['H','a','n','n','a','h']
Output: ['h','a','n','n','a','H']
💡 Approach

Two Pointer Technique - In Place Swap!

My Thinking Process:

First idea: create a new array and fill from back
Improved idea: swap characters inside the SAME array
No extra space needed! ✅

Algorithm:

Set left pointer at start (index 0)
Set right pointer at end (index length-1)
Swap characters at left and right
Move left forward, right backward
Stop when pointers meet

🔑 Code Explanation

int left = 0;
int right = s.length - 1;
Two pointers at opposite ends.
Important: use length - 1 not length!
length = total count, length - 1 = last valid index.

while(left < right) {
Keep swapping until pointers meet in the middle.

temp = s[left];
s[left] = s[right];
s[right] = temp;
Classic swap using temp variable.

left++;
right--;
Move pointers toward center.

📊 Step-by-Step Trace
Input: ['h','e','l','l','o']


left=0, right=4
swap 'h' and 'o' → ['o','e','l','l','h']

left=1, right=3
swap 'e' and 'l' → ['o','l','l','e','h']

left=2, right=2
left >= right → STOP!

Result: ['o','l','l','e','h'] ✅
⚠️ Common Mistake I Almost Made:

int right = s.length;    // ❌ causes ArrayIndexOutOfBoundsException!
int right = s.length - 1; // ✅ correct last index