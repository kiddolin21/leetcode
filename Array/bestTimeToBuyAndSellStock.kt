class Solution {
    fun maxProfit(prices: IntArray): Int {
        var res = 0
        var min = prices[0]
        for (p in prices) {
            res = maxOf(res, p - min)
            min = minOf(p, min)
        }
        return res
    }
}
