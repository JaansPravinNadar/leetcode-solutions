# 49. Group Anagrams

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #49](https://leetcode.com/problems/group-anagrams/)

---

## 📋 Problem Statement

Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

---

## 📝 Examples

**Example 1:**
Input: ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

**Example 2:**
Input: [""]
Output: [[""]]

**Example 3:**
Input: ["a"]
Output: [["a"]]


---

## 💡 Approach

**HashMap with Sorted Key!**

**Key Insight:**  
Anagrams when sorted become the SAME word!
"eat" → sorted → "aet"
"tea" → sorted → "aet" ← Same key! They're anagrams!
"ate" → sorted → "aet" ← Same key! They're anagrams!

"tan" → sorted → "ant"
"nat" → sorted → "ant" ← Same key! They're anagrams!

"bat" → sorted → "abt" ← Unique! No anagram group!


**Algorithm:**
1. For each word, sort its characters to get a KEY
2. Use HashMap where KEY = sorted word, VALUE = list of anagrams
3. Add each word to its group
4. Return all groups

---

## 🔑 Code Explanation

```java
HashMap<String, List<String>> map = new HashMap<>();
KEY = sorted word, VALUE = list of words that are anagrams of each other.

char[] chars = str.toCharArray();
Arrays.sort(chars);
String key = new String(chars);

Convert word to char array → sort it → convert back to String.
This gives us the "group key" for this word.

if(!map.containsKey(key)) {
    map.put(key, new ArrayList<>());
}
If this key doesn't exist yet, create a new empty list for it.

map.get(key).add(str);
Add the current word to its group.

return new ArrayList<>(map.values());
Return all the groups as a List.

📊 Step-by-Step Trace
Input: ["eat","tea","tan","ate","nat","bat"]

Word	Sorted Key	Map State
"eat"	"aet"	{"aet":["eat"]}
"tea"	"aet"	{"aet":["eat","tea"]}
"tan"	"ant"	{"aet":["eat","tea"], "ant":["tan"]}
"ate"	"aet"	{"aet":["eat","tea","ate"], "ant":["tan"]}
"nat"	"ant"	{"aet":["eat","tea","ate"], "ant":["tan","nat"]}
"bat"	"abt"	{"aet":["eat","tea","ate"], "ant":["tan","nat"], "abt":["bat"]}
Output: [["eat","tea","ate"],["tan","nat"],["bat"]] ✅