# 485. Max Consecutive Ones

**Difficulty:** Easy  
**Link:** [LeetCode Problem #485](https://leetcode.com/problems/max-consecutive-ones/)

---

## 📋 Problem Statement

Given a binary array `nums`, return the maximum number of consecutive 1s in the array.

---

## 📝 Examples

**Example 1:**
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: Maximum consecutive 1s is 3 (last three elements)

**Example 2:**
Input: nums = [1,0,1,1,0,1]
Output: 2

**Example 3:**
Input: nums = [0,0,0]
Output: 0


---

## 💡 Approach

**Algorithm:**
1. Keep track of current streak (`count`)
2. Keep track of maximum streak seen (`max`)
3. When you see 1: increase streak, check if it's a new record
4. When you see 0: reset streak to 0
5. Return the maximum streak

**Key Logic:**
```java
if(num[i] == 1) {
    count++;
    if(count > max) {  // Only update if it beats the record!
        max = count;
    }
}
else {
    count = 0;  // Reset streak
}

Trace for [1,1,0,1,1,1]:

i	num[i]	count	max	Action
0	1	1	1	Found 1, new max
1	1	2	2	Found 1, new max
2	0	0	2	Found 0, reset
3	1	1	2	Found 1, no update
4	1	2	2	Found 1, no update
5	1	3	3	Found 1, new max!
Result: 3 ✅