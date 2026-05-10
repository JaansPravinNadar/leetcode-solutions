# 128. Longest Consecutive Sequence

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #128](https://leetcode.com/problems/longest-consecutive-sequence/)

---

## 📋 Problem Statement

Given an unsorted array of integers `nums`, return the length of the longest consecutive elements sequence.

Must run in O(n) time.

---

## 📝 Examples

**Example 1:**
Input:  [100,4,200,1,3,2]
Output: 4
Explanation: Longest sequence is [1,2,3,4]

Example 2:

Input:  [0,3,7,2,5,8,4,6,0,1]
Output: 9

💡 Approach
HashSet + Sequence Start Detection!

Key Insight:
Only start counting a sequence when num - 1 does NOT exist.
This ensures we count each chain only once from its beginning!

Algorithm:

Put all numbers in a HashSet
For each number, check if it is a sequence start (num - 1 not in set)
If start, count forward until sequence breaks
Track maximum streak

🔑 Code Explanation

HashSet<Integer> set = new HashSet<>();
for(int num : nums) {
    set.add(num);
}
Store all numbers for O(1) lookup.


if(!set.contains(num - 1)) {
Only start counting if this is the BEGINNING of a sequence.
Avoids counting same sequence multiple times.

while(set.contains(c + 1)) {
    c++;
    s++;
}

Count forward while next number exists.
⚠️ Must use c (current) not num here!

l = Math.max(l, s);
Track the maximum streak seen so far.

📊 Step-by-Step Trace

Input: [100,4,200,1,3,2]


Set: {100,4,200,1,3,2}

num=100: 99 not in set → START
         101 not in set → stop
         streak = 1, longest = 1

num=4:   3 in set → SKIP

num=200: 199 not in set → START
         201 not in set → stop
         streak = 1, longest = 1

num=1:   0 not in set → START
         2 in set → c=2, s=2
         3 in set → c=3, s=3
         4 in set → c=4, s=4
         5 not in set → stop
         streak = 4, longest = 4

num=3:   2 in set → SKIP
num=2:   1 in set → SKIP

Return: 4 ✅
⚠️ Bug I Found:


// ❌ Wrong - infinite loop!

while(set.contains(num + 1)) {
    current++;  // num never changes!
    streak++;
}

// ✅ Correct - moves forward properly!

while(set.contains(current + 1)) {
    current++;
    streak++;
}

Always use the moving variable inside the while loop, not the fixed one!