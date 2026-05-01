# 66. Plus One

**Difficulty:** Easy  
**Link:** [LeetCode Problem #66](https://leetcode.com/problems/plus-one/)

---

## 📋 Problem Statement

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the `i`th digit of the integer. Increment the large integer by one and return the resulting array of digits.

---

## 📝 Examples

**Example 1:**
```text
Input:  [1,2,3]
Output: [1,2,4]
Explanation: 123 + 1 = 124

Example 2:

Input:  [1,2,9]
Output: [1,3,0]
Explanation: 129 + 1 = 130
Example 3:



Input:  [9,9,9]
Output: [1,0,0,0]
Explanation: 999 + 1 = 1000
💡 Approach
Work from right to left - like school addition!

Algorithm:

Start from the last digit
If digit is less than 9 → add 1 and return immediately
If digit is 9 → make it 0 and carry 1 to the left
If all digits were 9 → create new array with 1 at front
Key Insight:
Never convert the array to a full integer!
Large arrays will overflow int or long.
Work directly on digits instead!

🔑 Code Explanation


for(int i = digits.length - 1; i >= 0; i--) {
Start from the last digit and move left.



if(digits[i] < 9) {
    digits[i]++;
    return digits;
}
If digit is not 9, simply add 1 and we are done!
No carry needed.



digits[i] = 0;
If digit IS 9, it becomes 0 and we carry 1 to the left.



int[] ans = new int[digits.length + 1];
ans[0] = 1;
return ans;
Only reached if ALL digits were 9.
Java auto-fills new arrays with 0, so we only need to put 1 at position 0!

📊 Step-by-Step Trace
Example: [9,9,9]



i=2: digits[2]=9 → make 0 → [9,9,0]
i=1: digits[1]=9 → make 0 → [9,0,0]
i=0: digits[0]=9 → make 0 → [0,0,0]
Loop ends!
Create: ans = new int[4] → [0,0,0,0]
Set:    ans[0] = 1       → [1,0,0,0] ✅
Example: [1,2,3]



i=2: digits[2]=3, 3 < 9 → digits[2]++ = 4
return [1,2,4] ✅
⚠️ Common Mistake I Made:

// ❌ Wrong - changing old array, returning new one:
int[] ans = new int[digits.length + 1];
digits[0] = 1;   // changing digits, not ans!
return ans;      // returns all zeros!

// ✅ Correct - changing the new array:
int[] ans = new int[digits.length + 1];
ans[0] = 1;      // changing ans!
return ans;      // returns [1,0,0,0]!