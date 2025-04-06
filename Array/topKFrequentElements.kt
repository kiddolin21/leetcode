class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        // My solution for initial question
        // val result: MutableMap<Int, Int> = mutableMapOf()
        val frequency: MutableMap<Int,Int> = mutableMapOf()
        // for (n in nums) {
        //     frequency[n] = (frequency[n] ?: 0)+ 1
        //     if (result.size < k || result.containsKey(n)) {
        //         result[n] = frequency[n]!!
        //     } else {
        //          result.minByOrNull { it.value }?.let { minEntry ->
        //             // entry with minimal frequency
        //             if (minEntry.value < frequency[n]!!) {
        //                 result.remove(minEntry.key)
        //                 result[n] = frequency[n]!!
        //             }
        //          }
        //     }
        // }
        // return result.keys.toIntArray()

        // Solution 1 - heap
        // REVIEW: how to use heap
        for (n in nums) {
            frequency[n] = frequency.getOrDefault(n, 0) + 1
        }
        // val minHeap = PriorityQueue(compareBy<Pair<Int, Int>> { it.second })

        // for ((num, freq) in frequency) {
        //     minHeap.add(num to freq)
        //     if (minHeap.size > k) {
        //         minHeap.poll() // remove the least freq element
        //     }
        // }

        // return minHeap.map { it.first }.toIntArray()

        // Solution 2 - bucket sort
        // REVIEW: 可以用在别处吗, 熟练map list
        val bucket: Array<MutableList<Int>> = Array(nums.size + 1) { mutableListOf() }
        for ((num, freq) in frequency) {
            bucket[freq].add(num)
        }

        val result = mutableListOf<Int>()
        for (i in nums.size downTo 1) {
            result.addAll(bucket[i])
            if (result.size == k) break
        }
        return result.toIntArray()
    }

}
