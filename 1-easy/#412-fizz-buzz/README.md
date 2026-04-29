# 412. Fizz Buzz

**Difficulty:** Easy  
**Link:** [LeetCode Problem #412](https://leetcode.com/problems/fizz-buzz/)

---

## 📋 Problem Statement

Given an integer `n`, return a string array where:
- `answer[i] == "FizzBuzz"` if `i` is divisible by 3 and 5
- `answer[i] == "Fizz"` if `i` is divisible by 3
- `answer[i] == "Buzz"` if `i` is divisible by 5
- `answer[i] == i` (as a string) if none of the above

---

## 📝 Examples

**Example 1:**
Input: n = 3
Output: ["1","2","Fizz"]

**Example 2:**
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]

**Example 3:**
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8",
"Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


---

## 💡 Approach

**Simple Loop + Conditions!**

**Algorithm:**
1. Loop from 1 to n
2. Check divisibility in correct order:
   - Check `% 15` first (both 3 AND 5)
   - Then `% 3`
   - Then `% 5`
   - Otherwise convert number to String
3. Add result to List

**Key Insight:**  
Check `% 15` BEFORE `% 3` and `% 5`!  
If you check `% 3` first, FizzBuzz numbers will wrongly return "Fizz"!

---

## 🔑 Code Explanation

```java
if(i % 15 == 0) {
    result.add("FizzBuzz");
}
Check divisible by BOTH 3 and 5 first!
15 = 3 × 5 so i % 15 == 0 means divisible by both.



else if(i % 3 == 0) {
    result.add("Fizz");
}
Only divisible by 3.



else if(i % 5 == 0) {
    result.add("Buzz");
}
Only divisible by 5.



else {
    result.add(String.valueOf(i));
}
Convert integer to String using String.valueOf(i).