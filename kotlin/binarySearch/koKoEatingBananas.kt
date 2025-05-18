class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var l = 1
        var r = piles.max()
        var res = r
        while (l <= r) {
            val k = (r + l) / 2
            var time = 0L
            for (p in piles) {
                time += ((p + k - 1) / k).toLong()
            }
            if (time > h) {
                l = k + 1
            } else {
                res = k
                r = k - 1
            }
        }
        return res
    }
}
