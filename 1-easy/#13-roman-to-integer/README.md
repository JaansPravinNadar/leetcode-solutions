# 13. Roman to Integer

**Difficulty:** Easy ⭐  
**Link:** [LeetCode Problem #13](https://leetcode.com/problems/roman-to-integer/)

---

## 📋 Problem Statement

Given a Roman numeral string, convert it to an integer.

Roman numeral values:
| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

**Rule:**
- If a smaller value comes **before** a larger value → **Subtract** it
- If a smaller value comes **after** a larger value → **Add** it

---

## 📝 Examples

**Example 1:**
Input:  "III"
Output: 3
Explanation: I + I + I = 1 + 1 + 1 = 3

Example 2:
Input:  "LVIII"
Output: 58
Explanation: L + V + I + I + I = 50 + 5 + 1 + 1 + 1 = 58

Example 3:
Input:  "MCMXCIV"
Output: 1994
Explanation: M + CM + XC + IV = 1000 + 900 + 90 + 4 = 1994

💡 Approach

HashMap + Compare Current vs Next Character!

Key Insight:

Roman numerals follow a simple rule:

If the current character's value is less than the next character's value → subtract it
Otherwise → add it
This means IV becomes -1 + 5 = 4 and IX becomes -1 + 10 = 9.

Algorithm:

Store all Roman numeral values in a HashMap<Character, Integer>
Loop through the string character by character
At each position, get the current value from the map
If current value < next value → subtract from total
Otherwise → add to total

Use i < s.length() - 1 safety check to prevent index out of bounds

🔑 Code Explanation

HashMap<Character, Integer> map = new HashMap<>();

map.put('I', 1);
map.put('V', 5);
// ... and so on
Store all 7 Roman numeral values for quick O(1) lookup.


int currentValue = map.get(s.charAt(index));
Get the integer value of the current Roman character.



if (index < s.length() - 1 && currentValue < map.get(s.charAt(index + 1))) {
    total -= currentValue;
} else {
    total += currentValue;
}
index < s.length() - 1 → Safety check: only look at the next character if it exists
If current is smaller than next → subtract (like I before V)
Otherwise → add normally

📊 Step-by-Step Trace

Input: "MCMXCIV"

Index 0: M (1000) vs C (100)  → 1000 >= 100 → ADD 1000  → total = 1000
Index 1: C (100)  vs M (1000) → 100 < 1000  → SUB 100   → total = 900
Index 2: M (1000) vs X (10)   → 1000 >= 10  → ADD 1000  → total = 1900
Index 3: X (10)   vs C (100)  → 10 < 100    → SUB 10    → total = 1890
Index 4: C (100)  vs I (1)    → 100 >= 1    → ADD 100   → total = 1990
Index 5: I (1)    vs V (5)    → 1 < 5       → SUB 1     → total = 1989
Index 6: V (5)    → Last char → ADD 5       → total = 1994 ✅