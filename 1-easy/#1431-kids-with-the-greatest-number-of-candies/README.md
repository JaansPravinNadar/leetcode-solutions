# 1431. Kids With the Greatest Number of Candies

**Difficulty:** Easy  
**Link:** [LeetCode Problem #1431](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

---

## 📋 Problem Statement

Given the array `candies` and an integer `extraCandies`, return a boolean array where each element tells whether that kid can have the greatest number of candies after getting the extra candies.

---

## 📝 Examples

**Example 1:**
```text
Input:  candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]

💡 Approach
Find the maximum value in the candies array.
For each kid, check:
candies[i] + extraCandies >= max
Store true or false in the result list.

🔑 Code Explanation
int max = candies[0];

Start by assuming the first value is maximum.


for (int i = 1; i < candies.length; i++) {
    if (candies[i] > max) {
        max = candies[i];
    }
}
Find the greatest candies count.

result.add(candies[i] + extraCandies >= max);
If after adding extra candies the kid reaches or beats max, store true, otherwise false.

