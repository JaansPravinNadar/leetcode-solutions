# 11. Container With Most Water

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #11](https://leetcode.com/problems/container-with-most-water/)

---

## 📋 Problem Statement

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `i`th line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

---

## 📝 Examples

**Example 1:**
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49

Explanation:
Lines at index 1 (height=8) and index 8 (height=7)
Width = 8 - 1 = 7
Height = min(8,7) = 7
Area = 7 × 7 = 49

**Example 2:**
Input: height = [1,1]
Output: 1

**Example 3:**
Input: height = [4,3,2,1,4]
Output: 16


---

## 💡 Approach

**Two Pointer Technique!**

**Algorithm:**
1. Start with left pointer at index 0 and right pointer at last index
2. Calculate area with current two pointers
3. Update maxArea if current area is bigger
4. Move the SHORTER line inward
5. Repeat until pointers meet
6. Return maxArea

**Key Insight:**  
Always move the shorter line because:
- Shorter line = the bottleneck limiting water height
- Moving taller line = area will definitely decrease
- Moving shorter line = might find taller line = might increase area!

---

## 🔑 Code Explanation

```java
int width = right - left;
Distance between two walls = how wide the container is.

int h = Math.min(height[left], height[right]);
Water can only fill up to the SHORTER wall.
The shorter wall is always the limiting factor!

int area = width * h;
maxarea = Math.max(maxarea, area);
Calculate area and update maximum if bigger.

if(height[left] < height[right]) {
    left++;
} else {
    right--;
}
Move the shorter wall inward to hopefully find a taller one.

 Step-by-Step Trace
height = [1,8,6,2,5,4,8,3,7]

left	right	h[left]	h[right]	width	h	area	maxArea
0	8	1	7	8	1	8	8
1	8	8	7	7	7	49	49
1	7	8	3	6	3	18	49
1	6	8	8	5	8	40	49
1	5	8	4	4	4	16	49
1	4	8	5	3	5	15	49
1	3	8	2	2	2	4	49
1	2	8	6	1	6	6	49
Final Answer: 49 ✅