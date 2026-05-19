# 2540. Minimum Common Value

**Difficulty:** Easy ⭐  
**Link:** [LeetCode Problem #2540](https://leetcode.com/problems/minimum-common-value/)

---

## 📋 Problem Statement

Given two integer arrays `nums1` and `nums2` sorted in non-decreasing order,  
return the **minimum integer common** to both arrays.

If there is no common integer, return `-1`.

---

## 📝 Examples

**Example 1:**
Input:  nums1 = [1,2,3], nums2 = [2,4]
Output: 2

Example 2:
Input:  nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2

Example 3:
Input:  nums1 = [1,5,7], nums2 = [2,4,6]
Output: -1

💡 Approach

Two Pointer Approach

Key Insight:
Both arrays are already sorted.

So instead of comparing every element with every other element, we can use:

one pointer for nums1
one pointer for nums2

At each step:

If both values are equal → we found the smallest common value
If one value is smaller → move that pointer forward
Because arrays are sorted, smaller value cannot match later with a smaller index

🔑 Code Explanation

int i = 0;
int j = 0;

Two pointers:

i for nums1
j for nums2

while (i < n1 && j < n2)

Loop only while both pointers are inside their array bounds.

We use && because:

if one array finishes,
no common value can be found anymore.

if (nums1[i] == nums2[j]) {
    return nums1[i];
}
If both values are equal, that is the minimum common value because arrays are sorted.

else if (nums2[j] > nums1[i]) {
    i++;
} else {
    j++;
}
If nums1[i] is smaller, move i.
If nums2[j] is smaller, move j.

We always move the pointer with the smaller value.

📊 Step-by-Step Trace
Input:
nums1 = [1,2,3]
nums2 = [2,4]

i = 0, j = 0
nums1[i] = 1, nums2[j] = 2
1 < 2 → move i

i = 1, j = 0
nums1[i] = 2, nums2[j] = 2
Equal → return 2
Result: 2 ✅