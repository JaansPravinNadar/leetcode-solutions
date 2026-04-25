# 20. Valid Parentheses

**Difficulty:** Easy  
**Link:** [LeetCode Problem #20](https://leetcode.com/problems/valid-parentheses/)

---

## 📋 Problem Statement

Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

A string is valid if:
- Every opening bracket has a corresponding closing bracket
- Brackets are closed in the correct order

---

## 📝 Examples

**Example 1:**
Input: "()"
Output: true.

**Example 2:**
Input: "()[]{}"
Output: true

**Example 3:**
Input: "(]"
Output: false

**Example 4:**
Input: "{[]}"
Output: true

**Example 5:**
Input: "([)]"
Output: false


---

## 💡 Approach

**Stack - LIFO approach!**

**Key Insight:**  
Every closing bracket MUST match the MOST RECENT opening bracket!

**Algorithm:**
1. Loop through each character
2. If opening bracket `( [ {` → push to stack
3. If closing bracket `) ] }`:
   - If stack is empty → no match possible → false
   - Pop top of stack
   - Check if it matches current closing bracket
   - If not → return false
4. After loop → if stack empty → all matched → true!

---

## 🔑 Code Explanation

```java
if(ch == '(' || ch == '{' || ch == '[') {
    stack.push(ch);
}
Opening bracket found → remember it by pushing to stack.


if(stack.isEmpty()) return false;
Closing bracket found but no opening bracket in memory → invalid!

char top = stack.pop();
Get the LAST opening bracket we remembered.

if(ch == ')' && top != '(') return false;
if(ch == '}' && top != '{') return false;
if(ch == ']' && top != '[') return false;
Check if closing bracket matches its corresponding opening bracket.

return stack.isEmpty();
If stack is empty → all brackets matched → valid!
If stack not empty → some brackets never closed → invalid!

📊 Step-by-Step Trace
Input: "{[]}"

ch	Action	Stack
{	Opening → push	[{]
[	Opening → push	[{, []
]	Closing → top=[ → match! pop	[{]
}	Closing → top={ → match! pop	[]
Stack empty → true ✅

Input: "([)]"

ch	Action	Stack
(	Opening → push	[(]
[	Opening → push	[(, []
)	Closing → top=[ → NO MATCH!	-
return false ❌