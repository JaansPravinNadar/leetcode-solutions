# 14. Longest Common Prefix

**Difficulty:** Easy  
**Link:** [LeetCode Problem #14](https://leetcode.com/problems/longest-common-prefix/)

---

## 📋 Problem Statement

Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string `""`.

---

## 📝 Examples

**Example 1:**
Input:  ["flower","flow","flight"]
Output: "fl"

Example 2:
Input:  ["dog","racecar","car"]
Output: ""
Example 3:
Input:  ["interview","internet","internal"]
Output: "inte"

💡 Approach
Shrink the prefix until it matches!

Key Insight:
Take the first word as the starting prefix.
Compare it with every other word.
If the word does not start with prefix, keep removing the last character until it does.

Algorithm:

Start with prefix = strs[0]
Loop through remaining words
While current word does NOT start with prefix:
Remove last character from prefix
If prefix becomes empty → return ""
After all words checked → return prefix

🔑 Code Explanation

String prefix = strs[0];
Start by assuming the first word is the full prefix.

while(!strs[i].startsWith(prefix)) {
startsWith() checks if a word begins with the given prefix character by character.

Example:

"flight".startsWith("fl") → true ✅
"flight".startsWith("flo") → false ❌ (3rd char: i ≠ o)

prefix = prefix.substring(0, prefix.length() - 1);
Remove the last character from prefix and try again

if(prefix.isEmpty()) return "";
If prefix becomes empty, no common prefix exists.

📊 Step-by-Step Trace
Input: ["flower", "flow", "flight"]

Start: prefix = "flower"

Compare with "flow":
  "flow".startsWith("flower") → false → shrink → "flowe"
  "flow".startsWith("flowe")  → false → shrink → "flow"
  "flow".startsWith("flow")   → true ✅

Compare with "flight":
  "flight".startsWith("flow") → false → shrink → "flo"
  "flight".startsWith("flo")  → false → shrink → "fl"
  "flight".startsWith("fl")   → true ✅

Return: "fl" ✅
