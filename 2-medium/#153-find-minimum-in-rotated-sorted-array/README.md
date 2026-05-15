# 153. Find Minimum in Rotated Sorted Array

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #153](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)

---

## 📋 Problem Statement

Suppose an array of length `n` sorted in ascending order is **rotated** between `1` and `n` times.

Given the sorted rotated array `nums` of **unique** elements, return the **minimum element** of this array.

---

## 📝 Examples

**Example 1:**
Input:  nums = [3,4,5,1,2]
Output: 1
Explanation: Original array was [1,2,3,4,5] rotated 3 times.

Example 2:
Input:  nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: Original array was [0,1,2,4,5,6,7] rotated 4 times.
Example 3:

Input:  nums = [11,13,15,17]
Output: 11
Explanation: Array was not rotated at all.

💡 Approach

Linear Search (Simple Approach)

Since only the minimum is needed, we can scan through the entire array and track the smallest element seen so far.

Algorithm:

Initialize min = Integer.MAX_VALUE
Loop through every element
If current element is smaller than min, update min
Return min

🔑 Code Explanation


int min = Integer.MAX_VALUE;
Start with the largest possible integer so any real element will be smaller.

if(nums[index] < min) {
    min = nums[index];
}

Update minimum whenever a smaller element is found.

return min;
Return the smallest element found.

📊 Step-by-Step Trace

Input: [4,5,6,7,0,1,2]

index=0: nums[0]=4, 4 < MAX → min=4
index=1: nums[1]=5, 5 < 4? NO
index=2: nums[2]=6, 6 < 4? NO
index=3: nums[3]=7, 7 < 4? NO
index=4: nums[4]=0, 0 < 4? YES → min=0
index=5: nums[5]=1, 1 < 0? NO
index=6: nums[6]=2, 2 < 0? NO

Return: 0 ✅

⚠️ Interview Note

While this approach works and beats 100% runtime, in an interview setting, interviewers expect Binary Search O(log n) since the array was originally sorted.

Why Binary Search?

Array has 1,000,000 elements:
Linear Search: 1,000,000 checks ❌
Binary Search: Only ~20 checks ✅

Binary Search approach (to be explored):

int left = 0;
int right = nums.length - 1;

while(left < right) {
    int mid = left + (right - left) / 2;
    
    if(nums[mid] > nums[right]) {
        left = mid + 1;
    } else {
        right = mid;
    }
}

return nums[left];
