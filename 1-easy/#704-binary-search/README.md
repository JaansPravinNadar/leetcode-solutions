# 704. Binary Search

**Difficulty:** Easy  
**Link:** [LeetCode Problem #704](https://leetcode.com/problems/binary-search/)

---

## 📋 Problem Statement

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, return its index. Otherwise, return `-1`.

---

## 📝 Examples

**Example 1:**
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums at index 4

**Example 2:**
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums


---

## 💡 Approach

**Binary Search - Divide and Conquer!**

**Algorithm:**
1. Start with left=0 and right=last index
2. Find middle element
3. If middle == target → found! Return mid
4. If middle < target → search RIGHT half
5. If middle > target → search LEFT half
6. Repeat until found or left > right
7. Return -1 if not found

**Key Insight:**  
Array is sorted! So we can eliminate HALF the elements in each step!

---

## 🔑 Code Explanation

```java
int mid = left + (right - left) / 2;
Calculate middle index safely (avoids integer overflow).

if(nums[mid] == target) {
    return mid;
}
Found the target! Return its index.

else if(nums[mid] < target) {
    left = mid + 1;
}
Target is in RIGHT half, ignore left half.

else {
    right = mid - 1;
}
Target is in LEFT half, ignore right half.




Max


Markdown

# 704. Binary Search

**Difficulty:** Easy  
**Link:** [LeetCode Problem #704](https://leetcode.com/problems/binary-search/)

---

## 📋 Problem Statement

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, return its index. Otherwise, return `-1`.

---

## 📝 Examples

**Example 1:**
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums at index 4

text


**Example 2:**
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums

text


---

## 💡 Approach

**Binary Search - Divide and Conquer!**

**Algorithm:**
1. Start with left=0 and right=last index
2. Find middle element
3. If middle == target → found! Return mid
4. If middle < target → search RIGHT half
5. If middle > target → search LEFT half
6. Repeat until found or left > right
7. Return -1 if not found

**Key Insight:**  
Array is sorted! So we can eliminate HALF the elements in each step!

---

## 🔑 Code Explanation

```java
int mid = left + (right - left) / 2;
Calculate middle index safely (avoids integer overflow).

Java

if(nums[mid] == target) {
    return mid;
}
Found the target! Return its index.

Java

else if(nums[mid] < target) {
    left = mid + 1;
}
Target is in RIGHT half, ignore left half.

Java

else {
    right = mid - 1;
}
Target is in LEFT half, ignore right half.

📊 Step-by-Step Trace
nums = [-1,0,3,5,9,12], target = 9

Step	left	right	mid	nums[mid]	Action
1	0	5	2	3	3 < 9 → left = 3
2	3	5	4	9	9 == 9 → return 4 ✅
Only 2 steps! vs 5 steps with linear search!

