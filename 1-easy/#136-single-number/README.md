# 136. Single Number

**Difficulty:** Easy  
**Link:** [LeetCode Problem #136](https://leetcode.com/problems/single-number/)

---

## 📋 Problem Statement

Given a non-empty array of integers `nums`, every element appears **twice** except for one. Find that single one.

You must implement a solution with a linear runtime complexity.

---

## 📝 Examples

**Example 1:**
Input:  [2,2,1]
Output: 1

Example 2:
Input:  [4,1,2,1,2]
Output: 4

Example 3:
Input:  [1]
Output: 1

💡 Approach

Use a HashMap to count the frequency of every number.

Steps:

Traverse the array and store frequency of each element in the map.
Traverse again and return the element whose frequency is 1.

🔑 Code Explanation

map.put(num, map.getOrDefault(num, 0) + 1);
This counts how many times each number appears.

if(map.get(num) == 1) {
    return num;
}
If frequency of current number is 1, that is the single number.

---- METHOD 2 ---- 
# 136. Single Number

**Difficulty:** Easy  
**Link:** [LeetCode Problem #136](https://leetcode.com/problems/single-number/)

---

## 📋 Problem Statement

Given a non-empty array of integers `nums`, every element appears **twice** except for one. Find that single one.

You must implement a solution with linear runtime complexity and use only constant extra space.

---

## 📝 Examples

**Example 1:**
Input:  [2,2,1]
Output: 1

Example 2:
Input:  [4,1,2,1,2]
Output: 4
Example 3:

Input:  [1]
Output: 1

💡 Approach
XOR Bit Manipulation!

Key Properties of XOR:

a XOR a = 0   (same numbers cancel out!)
a XOR 0 = a   (any number XOR 0 = itself)
How it works:
Since every element appears twice except one, all pairs cancel out using XOR. Only the single number remains!

Example:
[4, 1, 2, 1, 2]

4 ^ 1 ^ 2 ^ 1 ^ 2
= 4 ^ (1^1) ^ (2^2)
= 4 ^ 0 ^ 0
= 4 ✅

🔑 Code Explanation


int result = 0;
Start with 0 because 0 XOR anything = anything.

for(int num : nums) {
    result = result ^ num;
}
XOR every number with result.
Pairs cancel out (a ^ a = 0).
Only the single number remains!

return result;
Return the surviving number.

📊 Step-by-Step Trace
Input: [4, 1, 2, 1, 2]

result = 0
result = 0 ^ 4 = 4
result = 4 ^ 1 = 5
result = 5 ^ 2 = 7
result = 7 ^ 1 = 6
result = 6 ^ 2 = 4

Return: 4 ✅

⚠️ First Attempt vs Optimized:
First attempt (HashMap):

HashMap<Integer, Integer> map = new HashMap<>();
for(int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
for(int num : nums) {
    if(map.get(num) == 1) return num;
}
Runtime: 114ms (Beats 7.70%) ❌ Slow!
Space: O(n) - uses extra memory!
Optimized (XOR):

int result = 0;
for(int num : nums) {
    result = result ^ num;
}
return result;
Runtime: 1ms (Beats 99.97%) 🏆