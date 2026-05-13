# 36. Valid Sudoku

**Difficulty:** Medium ⭐  
**Link:** [LeetCode Problem #36](https://leetcode.com/problems/valid-sudoku/)

---

## 📋 Problem Statement

Determine if a `9 x 9` Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

1. Each **row** must contain the digits `1-9` without repetition.
2. Each **column** must contain the digits `1-9` without repetition.
3. Each of the nine **3x3 sub-boxes** must contain the digits `1-9` without repetition.

Empty cells are represented by `'.'`.

---

## 📝 Example

**Valid Board:**
```text
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9

Output: true

💡 Approach
9 HashSets for rows + 9 for columns + 9 for boxes!

Algorithm:

Create 9 HashSets each for rows, columns and boxes
Loop through every cell
Skip empty cells ('.')
For each value, check if it already exists in:
Its row HashSet
Its column HashSet
Its 3x3 box HashSet
If duplicate found → return false
Otherwise add to all 3 HashSets
If all cells pass → return true

🔑 Code Explanation

HashSet<Character>[] rows  = new HashSet[9];
HashSet<Character>[] cols  = new HashSet[9];
HashSet<Character>[] boxes = new HashSet[9];
Create arrays of 9 HashSets each.
One HashSet per row, column and box.


for(int i = 0; i < 9; i++) {
    rows[i]  = new HashSet<>();
    cols[i]  = new HashSet<>();
    boxes[i] = new HashSet<>();
}
Initialize each HashSet.
Without this, each slot is null and will throw NullPointerException.


if(val == '.') continue;
Skip empty cells. No validation needed for empty cells.


int boxIndex = (i / 3) * 3 + (j / 3);
Calculate which 3x3 box the current cell belongs to.

Box layout:
Box0 Box1 Box2
Box3 Box4 Box5
Box6 Box7 Box8
Example: position (4, 7) → (4/3)*3 + (7/3) = 1*3+2 = 5 → Box 5

if(rows[i].contains(val)) return false;
rows[i].add(val);
If value already seen in this row → invalid!
Otherwise remember it.

📊 Step-by-Step Trace

Cell (0,0) = '5':

val = '5'
boxIndex = 0

rows[0].contains('5')? NO → add '5' → rows[0] = {'5'}
cols[0].contains('5')? NO → add '5' → cols[0] = {'5'}
boxes[0].contains('5')? NO → add '5' → boxes[0] = {'5'}
If later cell (0,5) = '5' again:


rows[0].contains('5')? YES → return false ❌