class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val A: IntArray
        val B: IntArray

        if (nums1.size <= nums2.size) {
            A = nums1
            B = nums2
        } else {
            A = nums2
            B = nums1
        }
        val total = A.size + B.size
        val half = (total + 1) / 2
        var l = 0
        var r = A.size
        while (l <= r) {
            val i = (r + l) / 2
            val j = half - i
            val Aleft = if (i > 0) A[i - 1] else Int.MIN_VALUE
            val Aright = if (i < A.size) A[i] else Int.MAX_VALUE
            val Bleft = if (j > 0) B[j - 1] else Int.MIN_VALUE
            val Bright = if (j < B.size) B[j] else Int.MAX_VALUE
            if (Aleft <= Bright && Bleft <= Aright) {
                // odd
                if (total % 2 != 0) {
                    return maxOf(Aleft, Bleft).toDouble()
                } else {
                    return (maxOf(Aleft, Bleft) + minOf(Aright, Bright)).toDouble() / 2
                }
            } else if (Aleft > Bright) {
                r = i - 1
            } else {
                l = i + 1
            }
        }
        return 0.0
    }
}
