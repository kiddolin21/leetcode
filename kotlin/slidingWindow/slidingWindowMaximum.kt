import java.util.ArrayDeque

class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        // my solution - heap of k
        // val res = mutableListOf<Int>()
        // val heap = PriorityQueue<Int>(compareByDescending { it })
        // for (i in 0 until k) {
        //     heap.add(nums[i])
        // }
        // res.add(heap.peek())
        // var l = 0
        // var r = k - 1
        // while (l < nums.size - k) {
        //     heap.remove(nums[l])
        //     l++
        //     r++
        //     heap.add(nums[r])
        //     res.add(heap.peek())
        // }
        // return res.toIntArray()
        // O(n) - deque
        val res = måutableListOf<Int>()
        val deque = ArrayDeque<Int>()
        var l = 0
        var r = 0
        while (r <= nums.size - 1) {
            while (deque.size > 0 && nums[deque.peekLast()] < nums[r]) {
                deque.removeLast()
            }
            deque.addLast(r)

            if (l > deque.peekFirst()) {
                deque.removeFirst()
            }

            if (r + 1 >= k) {
                res.add(nums[deque.peekFirst()])
                l++
            }
            r++
        }
        return res.toIntArray()
    }
}
