# 1678. Goal Parser Interpretation

**Difficulty:** Easy  
**Link:** [LeetCode Problem #1678](https://leetcode.com/problems/goal-parser-interpretation/)

---

## 📋 Problem Statement

You own a **Goal Parser** that interprets a string `command`. The Goal Parser converts the following:
- `"G"` → `"G"`
- `"()"` → `"o"`
- `"(al)"` → `"al"`

Given a string `command`, return the interpreted string.

---

## 📝 Examples

**Example 1:**
Input: command = "G()(al)"
Output: "Goal"

Explanation:
G → G
() → o
(al) → al
Result: "Goal"

**Example 2:**
Input: command = "G()()()()(al)"
Output: "Gooooal"

**Example 3:**
Input: command = "(al)G(al)()()G"
Output: "alGalooG"


---

## 💡 Approach

**Simple string replacement using `.replace()` method!**

**Algorithm:**
1. Replace all occurrences of `"()"` with `"o"`
2. Replace all occurrences of `"(al)"` with `"al"`
3. `"G"` stays as `"G"` (no replacement needed)
4. Return the result

**Key Insight:**  
This is a straightforward string manipulation problem. The `.replace()` method handles all occurrences automatically.

---

## 🔑 Code Explanation

```java
String result = cmd1;
result = result.replace("()", "o");
Replace all "()" with "o".
Important: Strings are immutable! Must reassign the result.
result = result.replace("(al)", "al");
Replace all "(al)" with "al".

return result;
