# 121. Best Time to Buy and Sell Stock

**Difficulty:** Easy  
**Link:** [LeetCode Problem #121](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

---

## 📋 Problem Statement

You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day.

You want to maximize your profit by choosing a **single day to buy** and choosing a **different day in the future to sell**.

Return the maximum profit you can achieve. If you cannot achieve any profit, return `0`.

---

## 📝 Examples

**Example 1:**
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price=1), sell on day 5 (price=6)
Profit = 6 - 1 = 5

**Example 2:**
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: Prices only decrease, no profit possible


---

## 💡 Approach

**Track minimum price + maximum profit!**

**Key Insight:**  
For each day, ask:
> "If I sell TODAY, what is the best profit I could make by buying on the cheapest day BEFORE today?"

**Algorithm:**
1. Start with minPrice = first price, maxProfit = 0
2. For each price:
   - Update minPrice if current price is lower
   - Calculate profit = currentPrice - minPrice
   - Update maxProfit if profit is higher
3. Return maxProfit

---

## 🔑 Code Explanation

```java
int minPrice = prices[0];
int maxProfit = 0;
Start by assuming first day is cheapest, no profit yet.

if(prices[i] < minPrice) {
    minPrice = prices[i];
}
Found a cheaper buying day? Update it!

int profit = prices[i] - minPrice;
if(profit > maxProfit) {
    maxProfit = profit;
}
Calculate profit if sold today. Update if it's the best so far.

📊 Step-by-Step Trace
Input: [7, 1, 5, 3, 6, 4]

Day	Price	minPrice	Profit	maxProfit
1	7	7	0	0
2	1	1	0	0
3	5	1	4	4
4	3	1	2	4
5	6	1	5	5 ✅
6	4	1	3	5
Answer: 5 ✅