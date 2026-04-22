# 26. Remove Duplicates from Sorted Array

**Difficulty:** Easy  
**Link:** [LeetCode Problem #26](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

---

## 📋 Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once.

Return the number of unique elements.

---

## 📝 Examples

**Example 1:**
```text
Input:  [1,1,2]
Output: 2
Array becomes: [1,2,_]

Example 2:
Input:  [0,0,1,1,1,2,2,3,3,4]
Output: 5
Array becomes: [0,1,2,3,4,_,_,_,_,_]

💡 Approach
Two Pointer Technique

Idea:
Since the array is sorted, duplicate values come together.
Use pointer j to track the position of the last unique element.
Traverse with pointer i.
When a new unique value is found, move j forward and store it there.

 Code Explanation: 
 if(nums.length == 0) {
    return 0;
}
If the array is empty, no unique elements exist.

int j = 0;
j points to the last unique element found so far.

for(int i = 1; i < nums.length; i++) {
    if(nums[i] != nums[j]) {
        j++;
        nums[j] = nums[i];
    }
}

If current element is different from the last unique element:

move j forward
place the new unique element there

return j + 1;

Since j is an index, number of unique elements is j + 1.


Step-by-Step Trace
Input:

[1,1,2,2,3]

i	nums[i]	j	nums[j]	Action
1	1	0	1	same, skip
2	2	0	1	different → j=1, nums[1]=2
3	2	1	2	same, skip
4	3	1	2	different → j=2, nums[2]=3

Result:

[1,2,3,2,3]
Valid part is only first j+1 = 3 elements:

[1,2,3]
