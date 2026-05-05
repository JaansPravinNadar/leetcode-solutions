# 35. Search Insert Position

**Difficulty:** Easy  
**Link:** [LeetCode Problem #35](https://leetcode.com/problems/search-insert-position/)

---

## 📋 Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be inserted in order.

Must have `O(log n)` runtime complexity.


## 📝 Examples

**Example 1:**
Input:  nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input:  nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input:  nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input:  nums = [1,3,5,6], target = 0
Output: 0
💡 Approach
Binary Search!

Algorithm:

Set left = 0, right = last index
Find mid
If nums[mid] == target → found! return mid
If nums[mid] > target → search LEFT half → right = mid - 1
If nums[mid] < target → search RIGHT half → left = mid + 1
If loop ends → return left (insert position!)
Key Insight:
When the loop ends without finding the target, left naturally points to the correct insert position!

🔑 Code Explanation

int mid = left + (right - left) / 2;
Safe mid calculation. Avoids integer overflow.

if(nums[mid] == target) {
    return mid;
}
Target found! Return its index.

else if(nums[mid] > target) {
    right = mid - 1;
}
Mid value is too big. Target must be in LEFT half.

else {
    left = mid + 1;
}
Mid value is too small. Target must be in RIGHT half.

return left;
Loop ended without finding target.
left is now pointing at the correct insert position!

📊 Step-by-Step Trace
Input: [1,3,5,6], target = 2

left=0, right=3
mid=1 → nums[1]=3
3 > 2 → right = mid-1 = 0

left=0, right=0
mid=0 → nums[0]=1
1 < 2 → left = mid+1 = 1

left(1) > right(0) → loop stops!
return left = 1 ✅
🔑 Why left is the Insert Position:

left tracks the first element NOT smaller than target.
When loop ends:
- Everything left of left is SMALLER than target
- Everything right of left is BIGGER than target
- So left is the perfect insert spot!