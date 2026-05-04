# 387. First Unique Character in a String

**Difficulty:** Easy  
**Link:** [LeetCode Problem #387](https://leetcode.com/problems/first-unique-character-in-a-string/)

---

## 📋 Problem Statement

Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return `-1`.

---

## 📝 Examples

**Example 1:**
Input:  "leetcode"
Output: 0
Explanation: 'l' appears only once and is the first unique character

Example 2:

Input:  "loveleetcode"
Output: 2
Explanation: 'v' is the first character that appears only once
Example 3:

Input:  "aabb"
Output: -1
Explanation: No unique character exists
💡 Approach
Two Pass HashMap approach!

Algorithm:

First pass: count frequency of every character using HashMap
Second pass: scan from left to right and return index of first character with count 1
If nothing found, return -1
Why two passes?

First pass collects information
Second pass uses that information
🔑 Code Explanation

map.put(ch, map.getOrDefault(ch, 0) + 1);
Count frequency of each character.
getOrDefault(ch, 0) returns current count or 0 if not seen yet.

if(map.get(ch) == 1) {
    return i;
}
First character whose count is exactly 1 is our answer.
Return its index immediately.

return -1;

If no unique character found after checking all, return -1.

📊 Step-by-Step Trace
Input: "loveleetcode"

Pass 1: Count frequency

l → 2
o → 2
v → 1
e → 4
t → 1
c → 1
d → 1
Pass 2: Find first unique

index 0: 'l' → count 2 ❌
index 1: 'o' → count 2 ❌
index 2: 'v' → count 1 ✅ return 2
Answer: 2 ✅

