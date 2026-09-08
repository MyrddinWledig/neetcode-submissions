class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0

        for i in range(len(prices)):
            j = i+1
            while j < len(prices):
                buy = prices[i]
                sell = prices[j]
                if(sell-buy > profit):
                    profit = sell-buy
                j += 1
        return profit
