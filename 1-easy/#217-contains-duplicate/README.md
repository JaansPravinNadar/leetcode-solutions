# 217. Contains Duplicate

**Difficulty:** Easy  
**Link:** [LeetCode Problem #217](https://leetcode.com/problems/contains-duplicate/)

---

## 📋 Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

---

## 📝 Examples

**Example 1:**
```text
Input:  [1,2,3,1]
Output: true

💡 Approach
Use a HashSet to store seen elements.

If current number already exists in the set, return true
Otherwise add it to the set
If loop ends, return false
🔑 Code Explanation
HashSet<Integer> set = new HashSet<>();
Create a set to store unique elements.

if(set.contains(num)) {
    return true;
}
If number is already present, duplicate is found.


set.add(num);
Store the number if it was not seen before.

